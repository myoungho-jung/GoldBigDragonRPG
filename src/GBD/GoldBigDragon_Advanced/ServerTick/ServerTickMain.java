package GBD.GoldBigDragon_Advanced.ServerTick;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitScheduler;

import GBD.GoldBigDragon_Advanced.Main.Main;
import GBD.GoldBigDragon_Advanced.Util.YamlController;
import GBD.GoldBigDragon_Advanced.Util.YamlManager;

public class ServerTickMain
{
	public static ArrayList<String> MobSpawningAreaList = new ArrayList<String>();
	public static ArrayList<String> NaviUsingList = new ArrayList<String>();
	public static HashMap<Long, ServerTickScheduleObject> Schedule = new HashMap<Long, ServerTickScheduleObject>();
	long nowUTC = 0;
	int BroadCastMessageTime =0;
  	int BroadCastMessageCool = 0;
  	public static int SafeLine = 50;
  	//�ʴ� �ִ� ���� ������ ���� ����
  	//(���� Ŭ���� �ʴ� ���� �۾��� ������, �׸�ŭ ������ �δ��� �ȴ�.)
  	
	public ServerTickMain(Main plugin)
	{
	  	BukkitScheduler scheduler1 = Bukkit.getServer().getScheduler();
	  	scheduler1.scheduleSyncRepeatingTask(plugin,  new Runnable()
        {
            @Override
            public void run() 
            {
        		BroadCastMessage();
            	CheckShcedule();
        	  	//Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA +"1"+"�� ���");
            }
        }, 10, 20);
	}
	
	public void BroadCastMessage()
	{
		YamlController Scheduler_YC = GBD.GoldBigDragon_Advanced.Main.Main.Scheduler_YC;
		YamlManager Config = Scheduler_YC.getNewConfig("config.yml");
		BroadCastMessageTime = Config.getInt("Server.BroadCastSecond");
    	if(BroadCastMessageTime!=0)
		if(BroadCastMessageCool>=BroadCastMessageTime)
		{
			BroadCastMessageCool=0;
			YamlController GUI_YC = GBD.GoldBigDragon_Advanced.Main.Main.GUI_YC;
			YamlManager BroadCast =GUI_YC.getNewConfig("BroadCast.yml");
			if(BroadCast.contains("0"))
				if(BroadCast.getConfigurationSection("").getKeys(false).toArray().length != 0)
					Bukkit.broadcastMessage(BroadCast.getString(BroadCast.getConfigurationSection("").getKeys(false).toArray()[new GBD.GoldBigDragon_Advanced.Util.Number().RandomNum(0, BroadCast.getConfigurationSection("").getKeys(false).toArray().length-1)].toString()));
		}
		else
			BroadCastMessageCool=BroadCastMessageCool+1;
	}
	
	public void CheckShcedule()
	{
		nowUTC=new GBD.GoldBigDragon_Advanced.Util.ETC().getNowUTC();
		Object[] ScheduleList = Schedule.keySet().toArray();
		long scheduleUTC = 0;
		int SafeLineCounter = SafeLine;
		for(int count = 0; count<ScheduleList.length;count++)
		{
			if(SafeLineCounter <= 0) break;
			scheduleUTC=Long.parseLong(ScheduleList[count].toString());
			if(scheduleUTC <= nowUTC)
			{
				ExcuteSchedule(scheduleUTC);
				SafeLineCounter = SafeLineCounter-1;
				Schedule.remove(Long.parseLong(ScheduleList[count].toString()));
			}
		}
	}

	public void ExcuteSchedule(Long UTC)
	{
		String Type = Schedule.get(UTC).getType();
		switch(Type)
		{
		case "A_MS"://Area_MonsterSpawn
			new ServerTask_Area().AreaMobSpawn(UTC);
			return;
		case "NV"://Navigation
			new ServerTask_Navigation().Navigation(UTC);
			return;
		default:
			return;
		}
	}
}
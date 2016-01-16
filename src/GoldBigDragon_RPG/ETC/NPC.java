package GoldBigDragon_RPG.ETC;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryCloseEvent;

import GoldBigDragon_RPG.Main.Main;
import GoldBigDragon_RPG.Main.UserDataObject;
import GoldBigDragon_RPG.Util.YamlController;
import GoldBigDragon_RPG.Util.YamlManager;

public class NPC
{
	public String[] getScript(Player player, char ScriptType)
	{
		UserDataObject u = new UserDataObject();
		if(ScriptType == -1)
		{
			String[] script = new String[1];
			script[0] = "a";
			return script;
		}
		YamlController GUI_YC = GoldBigDragon_RPG.Main.Main.YC_1;
		String TalkSubject = "NatureTalk";
		int randomScript = 0;

		GoldBigDragon_RPG.Config.NPCconfig NPCconfig = new GoldBigDragon_RPG.Config.NPCconfig();
		NPCconfig.PlayerNPCconfig(player, u.getNPCuuid(player));
		NPCconfig.NPCNPCconfig(u.getNPCuuid(player));

		YamlManager PlayerNPC = GUI_YC.getNewConfig("NPC/PlayerData/" + player.getUniqueId() +".yml");
		YamlManager NPCscript = GUI_YC.getNewConfig("NPC/NPCData/"+ u.getNPCuuid(player) +".yml");

	  	if(ScriptType == 2)
	  		TalkSubject = "NatureTalk";
	  	if(ScriptType == 4)
	  		TalkSubject = "NearByNEWS";
	  	if(ScriptType == 6)
	  		TalkSubject = "AboutSkills";

	  	Object[] arealist = NPCscript.getConfigurationSection(TalkSubject).getKeys(false).toArray();
		
		if(arealist.length <= 0)
		{
			String[] script = new String[1];
			randomScript  = (char) new GoldBigDragon_RPG.Util.Number().RandomNum(0, 2);
			if(randomScript == 0)
				script[0] = ChatColor.GRAY + "....";
			if(randomScript == 1)
				script[0] = ChatColor.GRAY + "(�� ���� ���°� ����.)";
			if(randomScript == 2)
				script[0] = ChatColor.GRAY + "....?";
			return script;
		}

		boolean scriptget = false;
		String scriptString = "";
		
		for(int counter = 1; counter < 125; counter++)
		{
			randomScript  = new GoldBigDragon_RPG.Util.Number().RandomNum(1, arealist.length);
			if(PlayerNPC.getInt(u.getNPCuuid(player)+".love") >= NPCscript.getInt(TalkSubject + "."+randomScript+".love"))
			{
				scriptString = NPCscript.getString(TalkSubject + "."+randomScript+".Script");
				scriptget = true;
				YamlManager SkillList = GUI_YC.getNewConfig("Skill/SkillList.yml");
				String Skillname = NPCscript.getString(TalkSubject + "."+randomScript+".giveSkill");
				if(ScriptType == 6&&SkillList.contains(NPCscript.getString(TalkSubject + "."+randomScript+".giveSkill"))==true)
				{
					YamlManager JobList = GUI_YC.getNewConfig("Skill/JobList.yml");
					YamlManager PlayerSkill = GUI_YC.getNewConfig("Skill/PlayerData/" + player.getUniqueId() +".yml");
					String Categori = JobList.getString("Mabinogi.Added."+NPCscript.getString(TalkSubject + "."+randomScript+".giveSkill"));
					if(PlayerSkill.contains("Mabinogi."+Categori+"."+NPCscript.getString(TalkSubject + "."+randomScript+".giveSkill"))==false)
					{
						GoldBigDragon_RPG.Effect.Sound s = new GoldBigDragon_RPG.Effect.Sound();
						PlayerSkill.set("Mabinogi."+Categori+"."+Skillname, 1);
						PlayerSkill.saveConfig();
						s.SP(player, Sound.LEVEL_UP, 1.0F, 1.8F);
						player.sendMessage(ChatColor.LIGHT_PURPLE+""+ChatColor.BOLD+"[���ο� ��ų�� ȹ�� �Ͽ����ϴ�!] "+ChatColor.YELLOW+""+ChatColor.BOLD+""+ChatColor.UNDERLINE+Skillname);
						break;
					}
					else
					{
						scriptString = NPCscript.getString(TalkSubject + "."+randomScript+".AlreadyGetScript");
						break;
					}
				}
				break;
			}
		}
		if(scriptget == false)
		{
			String[] script = new String[1];
			randomScript  = (char) new GoldBigDragon_RPG.Util.Number().RandomNum(0, 2);
			if(randomScript == 0)
				script[0] = ChatColor.GRAY + "....";
			if(randomScript == 1)
				script[0] = ChatColor.GRAY + "(�� ���� ���°� ����.)";
			if(randomScript == 2)
				script[0] = ChatColor.GRAY + "....?";
			return script;
		}

		String[] script = scriptString.split("%enter%");
		for(int count=0;count < script.length; count++)
		{
			script[count] = script[count].replace("%player%", player.getName());
		}
		return script;
	}

	public void InventoryClose_NPC(InventoryCloseEvent event)
	{
		if(event.getInventory().getItem(13)!=null)
			event.getPlayer().getInventory().addItem(event.getInventory().getItem(13));
		return;
	}
}
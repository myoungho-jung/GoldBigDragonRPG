package GBD_RPG.Corpse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.util.EulerAngle;

import GBD_RPG.Util.YamlController;
import GBD_RPG.Util.YamlManager;

public class Corpse_Main
{
    public static HashMap<String, ArrayList<ArmorStand>> Corpses = new HashMap<String, ArrayList<ArmorStand>>();
	public boolean DeathCapture(Player player, boolean isJoin)
	{
		if(player.getGameMode()==GameMode.SPECTATOR)
		{
		  	if(GBD_RPG.Main_Main.Main_ServerOption.PlayerList.get(player.getUniqueId().toString()).isDeath()==true)
		  	{
	  			Location l = GBD_RPG.Main_Main.Main_ServerOption.PlayerList.get(player.getUniqueId().toString()).getLastDeathPoint();
		  		if(l.getBlockY() < 0)
		  			l.setY(0);
		  		if(l.getBlockX()!=player.getLocation().getBlockX()||l.getBlockY()!=player.getLocation().getBlockY()||l.getBlockZ()!=player.getLocation().getBlockZ())
		  			player.teleport(l);
		  		if(isJoin==false)
		  			new Corpse_GUI().OpenReviveSelectGUI(player);
		  		else if(GBD_RPG.Main_Main.Main_ServerOption.PlayerList.get(player.getUniqueId().toString()).isBgmOn())
		  		{
	  	    		new OtherPlugins.NoteBlockAPIMain().Stop(player);
	  			  	YamlController YC = new YamlController(GBD_RPG.Main_Main.Main_Main.plugin);
	  				YamlManager Config = YC.getNewConfig("config.yml");
	  				if(Config.getInt("Death.Track")!=-1)
	  					new OtherPlugins.NoteBlockAPIMain().Play(player, Config.getInt("Death.Track"));
		  		}
		  		if(Corpses.containsKey(player.getName())==false)
		  			CreateCorpse(player);
		  		return true;
		  	}
		}
		return false;
	}
	
	public void asyncDeathCapture(final Player player)
	{
		if(player.getGameMode()==GameMode.SPECTATOR)
		{
		  	if(GBD_RPG.Main_Main.Main_ServerOption.PlayerList.get(player.getUniqueId().toString()).isDeath()==true)
		  	{
	  			Location l = GBD_RPG.Main_Main.Main_ServerOption.PlayerList.get(player.getUniqueId().toString()).getLastDeathPoint();
		  		if(l.getBlockY() < 0)
		  			l.setY(0);
		  		if(l.getBlockX()!=player.getLocation().getBlockX()||l.getBlockY()!=player.getLocation().getBlockY()||l.getBlockZ()!=player.getLocation().getBlockZ())
		  		{
		  			final Location loc = l.clone();
		  			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(GBD_RPG.Main_Main.Main_Main.plugin, new Runnable()
		  	        {
		  	            @Override
		  	            public void run() 
		  	            {
				  			player.teleport(loc);
		  	            }
		  	        }, 0);
		  		}
				new Corpse_GUI().OpenReviveSelectGUI(player);
		  		if(Corpses.containsKey(player.getName())==false)
		  		{
		  			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(GBD_RPG.Main_Main.Main_Main.plugin, new Runnable()
		  	        {
		  	            @Override
		  	            public void run() 
		  	            {
				  			CreateCorpse(player);
		  	            }
		  	        }, 0);
		  		}
		  	}
		}
	}
	
	public void CreateCorpse(Player player)
	{
		if(Corpses.containsKey(player.getName()))
			return;
		else
		{
			RemoveCorpse(player.getName());
			int CorpseStyle = new Random().nextInt((int) (11)); //(0 ~ 10 까�??�� ?��)
			String name = player.getName();
			ArrayList<ArmorStand> AL = new ArrayList<ArmorStand>();
	        player.setGameMode(GameMode.SPECTATOR);
	        int playerRandom = new Random().nextInt((int) (91))-45;
	        Location playerLoc = player.getLocation();
			//if(CorpseStyle == 0)
			{
				Location loc = new Location(player.getLocation().getWorld(), player.getLocation().getX(), player.getLocation().getY()-0.1, player.getLocation().getZ());
		        loc.setDirection(loc.getDirection());
		        ArmorStand stand = loc.getWorld().spawn(loc, ArmorStand.class);
		        stand.setBasePlate(false);
		        stand.setVisible(false);
		        stand.setRemoveWhenFarAway(false);
		        stand.setGravity(false);
		        stand.setArms(true);
		        stand.setCustomName(ChatColor.RED+""+ChatColor.BLACK+"h");
		        ItemStack head = new ItemStack(Material.SKULL_ITEM, 1, (short)SkullType.PLAYER.ordinal());
		        SkullMeta meta = (SkullMeta) head.getItemMeta();
		        meta.setDisplayName(name);
		        meta.setOwner(name);
		        head.setItemMeta(meta);
		        stand.setHelmet(head);
		        stand.setHeadPose(new EulerAngle(0.75d, playerRandom, 0));
		        player.teleport(stand.getLocation());
		        //player.setSpectatorTarget(stand);
		        AL.add(stand);
		        
		        loc.add(0.41,-0.5,-0.6);
		        ItemStack item = new ItemStack(Material.STICK);
		        ItemMeta itemMeta = item.getItemMeta();
		        itemMeta.setDisplayName(name);
		        item.setItemMeta(itemMeta);
		        stand = loc.getWorld().spawn(loc, ArmorStand.class);
		        stand.setBasePlate(false);
		        stand.setVisible(false);
		        stand.setRemoveWhenFarAway(false);
		        stand.setGravity(false);
		        stand.setArms(true);
		        stand.setCustomName(ChatColor.RED+""+ChatColor.BLACK+"b");
		        stand.setItemInHand(item);
		        stand.setRightArmPose(new EulerAngle(55f,0,0));
		        AL.add(stand);
		        
		        loc.add(0,-0.8,-0.155);
		        stand = loc.getWorld().spawn(loc, ArmorStand.class);
		        stand.setBasePlate(false);
		        stand.setVisible(false);
		        stand.setRemoveWhenFarAway(false);
		        stand.setGravity(false);
		        stand.setArms(true);
		        stand.setCustomName(ChatColor.RED+""+ChatColor.BLACK+"b");
		        stand.setItemInHand(item);
		        stand.setRightArmPose(new EulerAngle(55f,0,0));
		        AL.add(stand);
		        
		        loc.add(0.42,1.45,0.7);
		        stand = loc.getWorld().spawn(loc, ArmorStand.class);
		        stand.setBasePlate(false);
		        stand.setVisible(false);
		        stand.setRemoveWhenFarAway(false);
		        stand.setGravity(false);
		        stand.setArms(true);
		        stand.setCustomName(ChatColor.RED+""+ChatColor.BLACK+"b");
		        stand.setItemInHand(item);
		        stand.setRightArmPose(new EulerAngle(0 ,1.5d, 0.2d));
		        AL.add(stand);

		        Corpses.put(name, AL);
		        
		        //?���? ?��?��?��?�� ?��?�� ?�� ?��?��?�� ?��름에 모두 ?��?��?��?�� ?���? ?���?
		        //?��?�� ?�� ?���? ?��?��?�� ?��름을 보고, h�? 머리 ?��?��?��?��, b�? ?�� ?��?��?��?��
		        //?��름에 ?��?�� ?��?��?��?�� ?��름을 보고 ?��?���? ?��리고 ?���? ?��.
			}
		}
	}

	public void RemoveCorpse(String player)
	{
		if(Corpses.containsKey(player))
		{
			for(int count = 0; count < Corpses.get(player).size(); count ++)
				Corpses.get(player).get(count).remove();
			Corpses.remove(player);
		}
	}
	
	public void RemoveAllCorpse()
	{
		Object[] Players = Corpses.keySet().toArray();
		for(int count = 0; count < Corpses.size(); count++)
			if(Corpses.containsKey(Players[count].toString()))
				for(int count2 = 0; count2 < Corpses.get(Players[count].toString()).size(); count2 ++)
					Corpses.get(Players[count].toString()).get(count2).remove();
    	Corpses.clear();
	}
}

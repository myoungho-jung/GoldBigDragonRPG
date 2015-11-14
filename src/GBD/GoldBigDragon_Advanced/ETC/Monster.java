package GBD.GoldBigDragon_Advanced.ETC;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftMonster;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.entity.Skeleton.SkeletonType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.potion.PotionEffectType;

import GBD.GoldBigDragon_Advanced.Main.Main;
import GBD.GoldBigDragon_Advanced.Monster.Custom.AI_Animal;
import GBD.GoldBigDragon_Advanced.Monster.Custom.AI_CombatMonster;
import GBD.GoldBigDragon_Advanced.Monster.Custom.AI_Elite_Hunter;
import GBD.GoldBigDragon_Advanced.Monster.Custom.AI_Hunter;
import GBD.GoldBigDragon_Advanced.Monster.Custom.AI_KamiKaze;
import GBD.GoldBigDragon_Advanced.Monster.Custom.AI_NoBrain;
import GBD.GoldBigDragon_Advanced.Monster.Custom.AI_Spector;
import GBD.GoldBigDragon_Advanced.Monster.Custom.NMSUtils;
import GBD.GoldBigDragon_Advanced.Util.YamlController;
import GBD.GoldBigDragon_Advanced.Util.YamlManager;
import net.minecraft.server.v1_8_R3.EntityCreeper;
import net.minecraft.server.v1_8_R3.EntitySheep;
import net.minecraft.server.v1_8_R3.EntitySkeleton;
import net.minecraft.server.v1_8_R3.EntityZombie;

public class Monster
{
	private GBD.GoldBigDragon_Advanced.Effect.Sound s = new GBD.GoldBigDragon_Advanced.Effect.Sound();
	private GBD.GoldBigDragon_Advanced.Effect.Particle p = new GBD.GoldBigDragon_Advanced.Effect.Particle();
	//NameList//
	public void CreateMonster(String MonsterName)
	{
		ItemStack Item = new ItemStack(Material.AIR);
		YamlController Monster_YC = GBD.GoldBigDragon_Advanced.Main.Main.Monster_YC;
		YamlManager Monster  = Monster_YC.getNewConfig("Monster/MonsterList.yml");
		
		Monster.set(MonsterName+".Name", MonsterName);
		Monster.set(MonsterName+".Type", "����");
		Monster.set(MonsterName+".AI", "�Ϲ� �ൿ");
		Monster.set(MonsterName+".EXP", 15);
		Monster.set(MonsterName+".Biome", "NULL");
		Monster.set(MonsterName+".HP", 20);
		Monster.set(MonsterName+".MIN_Money", 1);
		Monster.set(MonsterName+".MAX_Money", 10);
		Monster.set(MonsterName+".STR", 10);
		Monster.set(MonsterName+".DEX", 10);
		Monster.set(MonsterName+".INT", 10);
		Monster.set(MonsterName+".WILL", 10);
		Monster.set(MonsterName+".LUK", 10);
		Monster.set(MonsterName+".DEF", 0);
		Monster.set(MonsterName+".Protect", 0);
		Monster.set(MonsterName+".Magic_DEF", 0);
		Monster.set(MonsterName+".Magic_Protect", 0);
		Monster.set(MonsterName+".Head.DropChance", 0);
		Monster.set(MonsterName+".Head.Item", Item);
		Monster.set(MonsterName+".Chest.DropChance", 0);
		Monster.set(MonsterName+".Chest.Item", Item);
		Monster.set(MonsterName+".Leggings.DropChance", 0);
		Monster.set(MonsterName+".Leggings.Item", Item);
		Monster.set(MonsterName+".Boots.DropChance", 0);
		Monster.set(MonsterName+".Boots.Item", Item);
		Monster.set(MonsterName+".Hand.DropChance", 0);
		Monster.set(MonsterName+".Hand.Item", Item);
		Monster.saveConfig();
	}

	public void SpawnMob(Location loc, String mob)
	{
		YamlController Monster_YC = GBD.GoldBigDragon_Advanced.Main.Main.Monster_YC;
		if(GBD.GoldBigDragon_Advanced.Main.Main.spawntime == true)
		{
			GBD.GoldBigDragon_Advanced.Main.Main.spawntime=false;
			loc.add(0.5, 1, 0.5);
			YamlManager Monster  = Monster_YC.getNewConfig("Monster/MonsterList.yml");

			if(Monster.getString(mob + ".AI").equals("�Ϲ� �ൿ")==false)
			{
				Main.SpawnMobName = mob;
				String CustomMobName = "CUSTOMZOMBIE";
				int CustomMobID = getMonsterID(Monster.getString(mob + ".Type"));
				String AI = Monster.getString(mob + ".AI");
				if(CustomMobID != -60)
				{
					if(CustomMobID == -50)
					{
						EnderCrystal EC = (EnderCrystal) loc.getWorld().spawn(loc, EnderCrystal.class);EC = getEnderCrystal(EC,mob);
					}
					else
					{
						if(AI.contains("����"))
						{
				  			new NMSUtils().registerEntity(CustomMobName, CustomMobID+ (Byte.MAX_VALUE + 1) * 2, EntityZombie.class, AI_CombatMonster.class);
				  			CraftMonster sh = AI_CombatMonster.spawn(loc);
				  			sh = (CraftMonster) getEntity(sh,mob);
						}
						else if(AI.contains("����"))
						{
							if((Monster.getString(mob + ".Type").equals("������")
							||Monster.getString(mob + ".Type").equals("��ȣ��")
							||Monster.getString(mob + ".Type").equals("��")
							||Monster.getString(mob + ".Type").equals("����"))==false)
							{
					  			new NMSUtils().registerEntity(CustomMobName, CustomMobID+ (Byte.MAX_VALUE + 1) * 2, EntityCreeper.class, AI_KamiKaze.class);
					  			Creeper sh = AI_KamiKaze.spawn(loc);
					  			sh = (Creeper) getEntity((Creeper)sh,mob);
							}
						}
						else if(AI.contains("���Ÿ�"))
						{
							if(AI.contains("����Ʈ"))
							{
					  			new NMSUtils().registerEntity(CustomMobName, CustomMobID+ (Byte.MAX_VALUE + 1) * 2, EntitySkeleton.class, AI_Elite_Hunter.class);
					  			Skeleton sh = AI_Elite_Hunter.spawn(loc);
					  			sh = (Skeleton) getEntity((Skeleton)sh,mob);
							}
							else
							{
					  			new NMSUtils().registerEntity(CustomMobName, CustomMobID+ (Byte.MAX_VALUE + 1) * 2, EntitySkeleton.class, AI_Hunter.class);
					  			Skeleton sh = AI_Hunter.spawn(loc);
					  			sh = (Skeleton) getEntity((Skeleton)sh,mob);
							}
						}
						else if(AI.contains("����"))
						{
				  			new NMSUtils().registerEntity(CustomMobName, CustomMobID+ (Byte.MAX_VALUE + 1) * 2, EntitySheep.class, AI_Animal.class);
				  			CraftMonster sh = AI_Animal.spawn(loc);
				  			sh = (CraftMonster) getEntity(sh,mob);
						}
						else if(AI.contains("������"))
						{
				  			new NMSUtils().registerEntity(CustomMobName, CustomMobID+ (Byte.MAX_VALUE + 1) * 2, EntitySheep.class, AI_NoBrain.class);
				  			CraftMonster sh = AI_NoBrain.spawn(loc);
				  			sh = (CraftMonster) getEntity(sh,mob);
						}
						else if(AI.contains("����"))
						{
							if((Monster.getString(mob + ".Type").equals("������")
							||Monster.getString(mob + ".Type").equals("��ȣ��")
							||Monster.getString(mob + ".Type").equals("��"))==false)
							{
					  			new NMSUtils().registerEntity(CustomMobName, CustomMobID+ (Byte.MAX_VALUE + 1) * 2, EntitySheep.class, AI_Spector.class);
					  			Bat sh = AI_Spector.spawn(loc);
					  			sh = (Bat) getEntity(sh,mob);
							}
						}
					}
				}
			}
			else
			switch(Monster.getString(mob + ".Type"))
			{
				case "����": Zombie zombie = (Zombie) loc.getWorld().spawn(loc, Zombie.class);zombie = (Zombie) getEntity(zombie,mob); break;
				case "���̾�Ʈ": Giant giant = (Giant) loc.getWorld().spawn(loc, Giant.class);giant = (Giant) getEntity(giant,mob); break;
				case "���̷���": case "�״����̷���": Skeleton skeleton = (Skeleton) loc.getWorld().spawn(loc, Skeleton.class);skeleton = (Skeleton) getEntity(skeleton,mob); break;
				case "������": Enderman enderman = (Enderman) loc.getWorld().spawn(loc, Enderman.class);enderman = (Enderman) getEntity(enderman,mob); break;
				case "ũ����": Creeper creeper = (Creeper) loc.getWorld().spawn(loc, Creeper.class);creeper = (Creeper) getEntity(creeper,mob); break;
				case "����ũ����": Creeper Lcreeper = (Creeper) loc.getWorld().spawn(loc, Creeper.class);Lcreeper = (Creeper) getEntity(Lcreeper,mob); break;
				case "�Ź�": Spider spider = (Spider) loc.getWorld().spawn(loc, Spider.class);spider = (Spider) getEntity(spider,mob); break;
				case "�����Ź�": CaveSpider cavespider = (CaveSpider) loc.getWorld().spawn(loc, CaveSpider.class);cavespider = (CaveSpider) getEntity(cavespider,mob); break;
				case "������": Silverfish silverfish = (Silverfish) loc.getWorld().spawn(loc, Silverfish.class);silverfish = (Silverfish) getEntity(silverfish,mob); break;
				case "���������": Endermite endermite = (Endermite) loc.getWorld().spawn(loc, Endermite.class);endermite = (Endermite) getEntity(endermite,mob); break;
				case "�ʴ���������": case "Ư�뽽����": case "ū������": case "���뽽����": case "����������": Slime Sslime = (Slime) loc.getWorld().spawn(loc, Slime.class);Sslime = (Slime) getEntity(Sslime,mob); break;
				case "Ư�븶�׸�ť��": case "ū���׸�ť��": case "���븶�׸�ť��": case "�������׸�ť��": MagmaCube Smagmacube = (MagmaCube) loc.getWorld().spawn(loc, MagmaCube.class);Sslime = (MagmaCube) getEntity(Smagmacube,mob); break;
				case "��������": Blaze blaze = (Blaze) loc.getWorld().spawn(loc, Blaze.class);blaze = (Blaze) getEntity(blaze,mob); break;
				case "����Ʈ": Ghast ghast = (Ghast) loc.getWorld().spawn(loc, Ghast.class);ghast = (Ghast) getEntity(ghast,mob); break;
				case "�����Ǳ׸�": PigZombie pigzombie = (PigZombie) loc.getWorld().spawn(loc, PigZombie.class);pigzombie = (PigZombie) getEntity(pigzombie,mob); break;
				case "����": Witch witch = (Witch) loc.getWorld().spawn(loc, Witch.class);witch = (Witch) getEntity(witch,mob); break;
				case "����": Wither wither = (Wither) loc.getWorld().spawn(loc, Wither.class);wither = (Wither) getEntity(wither,mob); break;
				case "�����巡��": EnderDragon ED = (EnderDragon) loc.getWorld().spawn(loc, EnderDragon.class);ED = (EnderDragon) getEntity(ED,mob); break;
				case "����ũ����Ż": EnderCrystal EC = (EnderCrystal) loc.getWorld().spawn(loc, EnderCrystal.class);EC = getEnderCrystal(EC,mob); break;
				case "��ȣ��": Guardian guardian = (Guardian) loc.getWorld().spawn(loc, Guardian.class);guardian = (Guardian) getEntity(guardian,mob); break;
				case "��": Sheep sheep = (Sheep) loc.getWorld().spawn(loc, Sheep.class);sheep = (Sheep) getEntity(sheep,mob); break;
				case "��": Cow cow = (Cow) loc.getWorld().spawn(loc, Cow.class);cow = (Cow) getEntity(cow,mob); break;
				case "����": Pig pig = (Pig) loc.getWorld().spawn(loc, Pig.class);pig = (Pig) getEntity(pig,mob); break;
				case "��": Horse horse = (Horse) loc.getWorld().spawn(loc, Horse.class);horse = (Horse) getEntity(horse,mob); break;
				case "�䳢": Rabbit rabbit = (Rabbit) loc.getWorld().spawn(loc, Rabbit.class);rabbit = (Rabbit) getEntity(rabbit,mob); break;
				case "������": Ocelot oceleot = (Ocelot) loc.getWorld().spawn(loc, Ocelot.class);oceleot = (Ocelot) getEntity(oceleot,mob); break;
				case "����": Wolf wolf = (Wolf) loc.getWorld().spawn(loc, Wolf.class);wolf = (Wolf) getEntity(wolf,mob); break;
				case "��": Chicken chicken = (Chicken) loc.getWorld().spawn(loc, Chicken.class);chicken = (Chicken) getEntity(chicken,mob); break;
				case "������": MushroomCow Mcow = (MushroomCow) loc.getWorld().spawn(loc, MushroomCow.class);Mcow = (MushroomCow) getEntity(Mcow,mob); break;
				case "����": Bat bat = (Bat) loc.getWorld().spawn(loc, Bat.class);bat = (Bat) getEntity(bat,mob); break;
				case "��¡��": Squid squid = (Squid) loc.getWorld().spawn(loc, Squid.class);squid = (Squid) getEntity(squid,mob); break;
				case "�ֹ�": Villager villager = (Villager) loc.getWorld().spawn(loc, Villager.class);villager = (Villager) getEntity(villager,mob); break;
				case "�����": Snowman snowman = (Snowman) loc.getWorld().spawn(loc, Snowman.class);snowman = (Snowman) getEntity(snowman,mob); break;
				case "��": IronGolem golem = (IronGolem) loc.getWorld().spawn(loc, IronGolem.class);golem = (IronGolem) getEntity(golem,mob); break;
			}
			GBD.GoldBigDragon_Advanced.Main.Main.spawntime=true;
		}
	}

	private LivingEntity getEntity(LivingEntity Monster, String mob)
	{
		YamlController Monster_YC = GBD.GoldBigDragon_Advanced.Main.Main.Monster_YC;
		YamlManager MobList  = Monster_YC.getNewConfig("Monster/MonsterList.yml");
		Monster.setCustomName(MobList.getString(mob + ".Name").replace("&", "��"));
		Monster.setCustomNameVisible(true);
		ItemStack Equip = MobList.getItemStack(mob+".Head.Item");
		if(Equip == null)
			Monster.getEquipment().setHelmet(null);
		else
			Monster.getEquipment().setHelmet(Equip);
		if(Equip.hasItemMeta()==true)
			if(Equip.getItemMeta().hasLore()==true)
				if(ChatColor.stripColor(Equip.getItemMeta().getLore().get(0)).equals("�̰��� �������� �־� �ּ���."))
					Monster.getEquipment().setHelmet(null);
		Equip = MobList.getItemStack(mob+".Chest.Item");
		if(Equip == null)
			Monster.getEquipment().setChestplate(null);
		else
			Monster.getEquipment().setChestplate(Equip);
		if(Equip.hasItemMeta()==true)
			if(Equip.getItemMeta().hasLore()==true)
				if(ChatColor.stripColor(Equip.getItemMeta().getLore().get(0)).equals("�̰��� �������� �־� �ּ���."))
					Monster.getEquipment().setChestplate(null);
		Equip = MobList.getItemStack(mob+".Leggings.Item");
		if(Equip == null)
			Monster.getEquipment().setLeggings(null);
		else
			Monster.getEquipment().setLeggings(Equip);
		if(Equip.hasItemMeta()==true)
			if(Equip.getItemMeta().hasLore()==true)
				if(ChatColor.stripColor(Equip.getItemMeta().getLore().get(0)).equals("�̰��� �������� �־� �ּ���."))
					Monster.getEquipment().setLeggings(null);
		Equip = MobList.getItemStack(mob+".Boots.Item");
		if(Equip == null)
			Monster.getEquipment().setBoots(null);
		else
			Monster.getEquipment().setBoots(Equip);
		if(Equip.hasItemMeta()==true)
			if(Equip.getItemMeta().hasLore()==true)
				if(ChatColor.stripColor(Equip.getItemMeta().getLore().get(0)).equals("�̰��� �������� �־� �ּ���."))
					Monster.getEquipment().setBoots(null);
		Equip = MobList.getItemStack(mob+".Hand.Item");
		if(Equip == null)
			Monster.getEquipment().setItemInHand(null);
		else
			Monster.getEquipment().setItemInHand(Equip);
		if(Equip.hasItemMeta()==true)
			if(Equip.getItemMeta().hasLore()==true)
				if(ChatColor.stripColor(Equip.getItemMeta().getLore().get(0)).equals("�̰��� �������� �־� �ּ���."))
					Monster.getEquipment().setItemInHand(null);
	    YamlManager Config =  Monster_YC.getNewConfig("config.yml");
		Monster.getEquipment().setHelmetDropChance((float)(MobList.getInt(mob+".Head.DropChance")*Config.getInt("Event.DropChance")/1000.0));
		Monster.getEquipment().setChestplateDropChance((float)(MobList.getInt(mob+".Chest.DropChance")*Config.getInt("Event.DropChance")/1000.0));
		Monster.getEquipment().setLeggingsDropChance((float)(MobList.getInt(mob+".Leggings.DropChance")*Config.getInt("Event.DropChance")/1000.0));
		Monster.getEquipment().setBootsDropChance((float)(MobList.getInt(mob+".Boots.DropChance")*Config.getInt("Event.DropChance")/1000.0));
		Monster.getEquipment().setItemInHandDropChance((float)(MobList.getInt(mob+".Hand.DropChance")*Config.getInt("Event.DropChance")/1000.0));
		if(Monster.getType() == EntityType.SKELETON)
		{
			if(MobList.getString(mob+".Type").equalsIgnoreCase("�״����̷���") == true)
			{
				((Skeleton) Monster).setSkeletonType(SkeletonType.WITHER);
			}
		}
		else if(Monster.getType() == EntityType.CREEPER)
		{
			if(MobList.getString(mob+".Type").equalsIgnoreCase("����ũ����") == true)
			{
				  ((Creeper) Monster).setPowered(true);
			}
		}
		else if(Monster.getType() == EntityType.SLIME)
		{
			switch(MobList.getString(mob + ".Type"))
			{
				case "����������" : ((Slime) Monster).setSize(1);break;
				case "���뽽����" : ((Slime) Monster).setSize(2);break;
				case "ū������" : ((Slime) Monster).setSize(4);break;
				case "Ư�뽽����" : ((Slime) Monster).setSize(16);break;
				case "�ʴ���������" : ((Slime) Monster).setSize(64);break;
			}
		}
		else if(Monster.getType() == EntityType.MAGMA_CUBE)
		{
			switch(MobList.getString(mob + ".Type"))
			{
				case "�������׸�ť��" : ((MagmaCube) Monster).setSize(1);break;
				case "���븶�׸�ť��" : ((MagmaCube) Monster).setSize(2);break;
				case "ū���׸�ť��" : ((MagmaCube) Monster).setSize(4);break;
				case "Ư�븶�׸�ť��" : ((MagmaCube) Monster).setSize(16);break;
				case "�ʴ������׸�ť��" : ((MagmaCube) Monster).setSize(64);break;
			}
		}
		if(MobList.contains(mob+".Potion"))
		{
			GBD.GoldBigDragon_Advanced.Effect.Potion P = new GBD.GoldBigDragon_Advanced.Effect.Potion();
			if(MobList.getInt(mob+".Potion.Regenerate")!=0)
			Monster.addPotionEffect(P.getPotionEffect(PotionEffectType.REGENERATION, 50000, MobList.getInt(mob+".Potion.Regenerate")));
			if(MobList.getInt(mob+".Potion.Poison")!=0)
			Monster.addPotionEffect(P.getPotionEffect(PotionEffectType.POISON, 50000, MobList.getInt(mob+".Potion.Poison")));
			if(MobList.getInt(mob+".Potion.Speed")!=0)
			Monster.addPotionEffect(P.getPotionEffect(PotionEffectType.SPEED, 50000, MobList.getInt(mob+".Potion.Speed")));
			if(MobList.getInt(mob+".Potion.Slow")!=0)
			Monster.addPotionEffect(P.getPotionEffect(PotionEffectType.SLOW, 50000, MobList.getInt(mob+".Potion.Slow")));
			if(MobList.getInt(mob+".Potion.Strength")!=0)
			Monster.addPotionEffect(P.getPotionEffect(PotionEffectType.INCREASE_DAMAGE, 50000, MobList.getInt(mob+".Potion.Strength")));
			if(MobList.getInt(mob+".Potion.Weak")!=0)
			Monster.addPotionEffect(P.getPotionEffect(PotionEffectType.WEAKNESS, 50000, MobList.getInt(mob+".Potion.Weak")));
			if(MobList.getInt(mob+".Potion.JumpBoost")!=0)
			Monster.addPotionEffect(P.getPotionEffect(PotionEffectType.JUMP, 50000, MobList.getInt(mob+".Potion.JumpBoost")));
			if(MobList.getInt(mob+".Potion.FireRegistance")!=0)
				Monster.addPotionEffect(P.getPotionEffect(PotionEffectType.FIRE_RESISTANCE, 50000, MobList.getInt(mob+".Potion.FireRegistance")));
			if(MobList.getInt(mob+".Potion.WaterBreath")!=0)
			Monster.addPotionEffect(P.getPotionEffect(PotionEffectType.WATER_BREATHING, 50000, MobList.getInt(mob+".Potion.WaterBreath")));
			if(MobList.getInt(mob+".Potion.Invisible")!=0)
			Monster.addPotionEffect(P.getPotionEffect(PotionEffectType.INVISIBILITY, 50000, MobList.getInt(mob+".Potion.Invisible")));
		}
		Damageable m = Monster;
		m.setMaxHealth(MobList.getInt(mob + ".HP")+0.5);
		m.setHealth(m.getMaxHealth());
		return Monster;
	}
	
	private EnderCrystal getEnderCrystal(EnderCrystal Monster, String mob)
	{
		YamlController Monster_YC = GBD.GoldBigDragon_Advanced.Main.Main.Monster_YC;
		YamlManager MobList  = Monster_YC.getNewConfig("Monster/MonsterList.yml");
		Monster.setCustomName(MobList.getString(mob + ".Name").replace("&", "��"));
		Monster.setCustomNameVisible(true);
		return Monster;
	}
	
	private static void Stack(String Display, int ID, int DATA, int STACK, List<String> Lore, int Loc, Inventory inventory)
	{
		ItemStack Icon = new MaterialData(ID, (byte) DATA).toItemStack(STACK);
		ItemMeta Icon_Meta = Icon.getItemMeta();
		Icon_Meta.setDisplayName(Display);
		Icon_Meta.setLore(Lore);
		Icon.setItemMeta(Icon_Meta);
		inventory.setItem(Loc, Icon);
	}
	
	public void ArmorGUI(Player player, String mob)
	{
		YamlController Monster_YC = GBD.GoldBigDragon_Advanced.Main.Main.Monster_YC;
		Inventory inv = Bukkit.createInventory(null, 9, ChatColor.BLACK + "���� ��� ����");
		YamlManager MobList  = Monster_YC.getNewConfig("Monster/MonsterList.yml");

		if(MobList.contains(mob + ".Head.Item")==true&&
			MobList.getItemStack(mob + ".Head.Item").equals(new ItemStack(Material.AIR))==false)
			inv.setItem(0, MobList.getItemStack(mob + ".Head.Item"));
		else
			Stack(ChatColor.WHITE + "�Ӹ�", 302,0,1,Arrays.asList(ChatColor.GRAY + "�̰��� �������� �־� �ּ���."), 0, inv);

		if(MobList.contains(mob + ".Chest.Item")==true&&
				MobList.getItemStack(mob + ".Chest.Item").equals(new ItemStack(Material.AIR))==false)
			inv.setItem(1, MobList.getItemStack(mob + ".Chest.Item"));
		else
			Stack(ChatColor.WHITE + "����", 303,0,1,Arrays.asList(ChatColor.GRAY + "�̰��� �������� �־� �ּ���."), 1, inv);

		if(MobList.contains(mob + ".Leggings.Item")==true&&
				MobList.getItemStack(mob + ".Leggings.Item").equals(new ItemStack(Material.AIR))==false)
			inv.setItem(2, MobList.getItemStack(mob + ".Leggings.Item"));
		else
			Stack(ChatColor.WHITE + "����", 304,0,1,Arrays.asList(ChatColor.GRAY + "�̰��� �������� �־� �ּ���."), 2, inv);

		if(MobList.contains(mob + ".Boots.Item")==true&&
		MobList.getItemStack(mob + ".Boots.Item").equals(new ItemStack(Material.AIR))==false)
			inv.setItem(3, MobList.getItemStack(mob + ".Boots.Item"));
		else
			Stack(ChatColor.WHITE + "����", 305,0,1,Arrays.asList(ChatColor.GRAY + "�̰��� �������� �־� �ּ���."), 3, inv);

		if(MobList.contains(mob + ".Hand.Item")==true&&
		MobList.getItemStack(mob + ".Hand.Item").equals(new ItemStack(Material.AIR))==false)
			inv.setItem(4, MobList.getItemStack(mob + ".Hand.Item"));
		else
			Stack(ChatColor.WHITE + "����", 267,0,1,Arrays.asList(ChatColor.GRAY + "�̰��� �������� �־� �ּ���."), 4, inv);

		Stack(ChatColor.WHITE + mob, 416,0,1,Arrays.asList(ChatColor.GRAY + mob+"�� ���� ����Դϴ�." ), 8, inv);
		Stack(ChatColor.WHITE + "", 30,0,1,Arrays.asList(ChatColor.GRAY +"�̰����� ��������",ChatColor.GRAY +"�÷����� ������."), 7, inv);
		Stack(ChatColor.WHITE + "", 30,0,1,Arrays.asList(ChatColor.GRAY +"�̰����� ��������",ChatColor.GRAY +"�÷����� ������."), 6, inv);
		Stack(ChatColor.WHITE + "", 30,0,1,Arrays.asList(ChatColor.GRAY +"�̰����� ��������",ChatColor.GRAY +"�÷����� ������."), 5, inv);
		
		player.openInventory(inv);
	}

	public void ArmorGUIClick(InventoryClickEvent event)
	{
		if(event.getCurrentItem().hasItemMeta())
			if(event.getCurrentItem().getItemMeta().hasLore())
				if(event.getCurrentItem().getItemMeta().getLore().get(0).equals(ChatColor.GRAY + "�̰��� �������� �־� �ּ���."))
					event.getInventory().remove(event.getCurrentItem());
		switch(event.getSlot())
		{
		case 5:
		case 6:
		case 7:
		case 8:
			event.setCancelled(true);
			return;
		}
	}
	
	public void InventorySetting(InventoryCloseEvent event)
	{
		YamlController Monster_YC = GBD.GoldBigDragon_Advanced.Main.Main.Monster_YC;

		YamlManager Monster  = Monster_YC.getNewConfig("Monster/MonsterList.yml");
		String MonsterName = ChatColor.stripColor(event.getInventory().getItem(8).getItemMeta().getDisplayName().toString());
		if(event.getInventory().getItem(0)==new GBD.GoldBigDragon_Advanced.GUI.GUIutil().getItemStack(ChatColor.WHITE + "�Ӹ�", 302,0,1,Arrays.asList(ChatColor.GRAY + "�̰��� �������� �־� �ּ���.")))
			Monster.set(MonsterName+".Head.Item", null);
		else
			Monster.set(MonsterName+".Head.Item", event.getInventory().getItem(0));
		
		if(event.getInventory().getItem(1)==new GBD.GoldBigDragon_Advanced.GUI.GUIutil().getItemStack(ChatColor.WHITE + "����", 303,0,1,Arrays.asList(ChatColor.GRAY + "�̰��� �������� �־� �ּ���.")))
					Monster.set(MonsterName+".Chest.Item", null);
		else
			Monster.set(MonsterName+".Chest.Item", event.getInventory().getItem(1));
		if(event.getInventory().getItem(2)==new GBD.GoldBigDragon_Advanced.GUI.GUIutil().getItemStack(ChatColor.WHITE + "����", 304,0,1,Arrays.asList(ChatColor.GRAY + "�̰��� �������� �־� �ּ���.")))
			Monster.set(MonsterName+".Leggings.Item", null);
		else
			Monster.set(MonsterName+".Leggings.Item", event.getInventory().getItem(2));
		if(event.getInventory().getItem(1)==new GBD.GoldBigDragon_Advanced.GUI.GUIutil().getItemStack(ChatColor.WHITE + "����", 305,0,1,Arrays.asList(ChatColor.GRAY + "�̰��� �������� �־� �ּ���.")))
			Monster.set(MonsterName+".Boots.Item", null);
		else
			Monster.set(MonsterName+".Boots.Item", event.getInventory().getItem(3));
		if(event.getInventory().getItem(4)==new GBD.GoldBigDragon_Advanced.GUI.GUIutil().getItemStack(ChatColor.WHITE + "����", 267,0,1,Arrays.asList(ChatColor.GRAY + "�̰��� �������� �־� �ּ���.")))
			Monster.set(MonsterName+".Hand.Item", null);
		else
			Monster.set(MonsterName+".Hand.Item", event.getInventory().getItem(4));
		Monster.saveConfig();
		event.getPlayer().sendMessage(ChatColor.GREEN + "[SYSTEM] : ������ ������ ����Ǿ����ϴ�.");
	}

	public void SpawnEggGive(Player player, String mob)
	{
		ItemStack Icon = new MaterialData(383, (byte) 0).toItemStack(1);
		ItemMeta Icon_Meta = Icon.getItemMeta();
		Icon_Meta.setDisplayName(ChatColor.RED+mob);
		Icon_Meta.addEnchant(Enchantment.DURABILITY, 1, true);
		Icon_Meta.setLore(Arrays.asList(ChatColor.GRAY+mob+"���� ����"));
		Icon.setItemMeta(Icon_Meta);
		player.getInventory().addItem(Icon);
		player.sendMessage(ChatColor.YELLOW+"[SYSTEM] : "+ChatColor.GREEN+mob +ChatColor.YELLOW+ "���� ���׸� ������ϴ�!");
	}
	
	public void SpawnEffect (Entity mob,Location loc, int type)
	{
		switch(type)
		{
		case 0: return;
		case 1:
			s.SL(loc, org.bukkit.Sound.ENDERDRAGON_GROWL, 1.0F, 0.5F);
			for(int counter=0;counter<400;counter++)
			p.PLC(loc, Effect.SPELL, 4);
			for(int counter=0;counter<300;counter++)
			p.PLC(loc, Effect.FLYING_GLYPH, 0);
			for(int counter=0;counter<200;counter++)
			p.PLC(loc, Effect.SMOKE, 4);
			return;
		case 2:
			loc.setY((double)(loc.getBlockY()+1));
			s.SL(loc, org.bukkit.Sound.ENDERMAN_TELEPORT, 1.0F, 0.5F);
			p.PLC(loc, Effect.ENDER_SIGNAL, 0);
			for(int counter=0;counter<100;counter++)
			p.PLC(loc, Effect.ENDER_SIGNAL, 0);
			for(int counter=0;counter<50;counter++)
			p.PLC(loc, Effect.MAGIC_CRIT, 4);
			return;
		case 3:
			s.SL(loc, org.bukkit.Sound.EXPLODE, 1.0F, 0.5F);
			p.PLC(loc, Effect.EXPLOSION_LARGE, 0);
			for(int counter=0;counter<3;counter++)
			p.PLC(loc, Effect.EXPLOSION_HUGE, 0);
			for(int counter=0;counter<10;counter++)
			p.PLC(loc, Effect.EXPLOSION, 4);
			return;
		case 4:
			s.SL(loc, org.bukkit.Sound.GHAST_FIREBALL, 1.0F, 0.5F);
			p.PLC(loc, Effect.FLAME, 0);
			for(int counter=0;counter<200;counter++)
			p.PLC(loc, Effect.SMOKE, 9);
			for(int counter=0;counter<200;counter++)
			p.PLC(loc, Effect.FLAME, 0);
			return;
		case 5:
			s.SL(loc, org.bukkit.Sound.ZOMBIE_METAL, 1.0F, 0.6F);
			p.PLC(loc, Effect.CRIT, 0);
			for(int counter=0;counter<400;counter++)
			p.PLC(loc, Effect.SPELL, 4);
			loc.setY((double)(loc.getBlockY()+1.5));
			for(int counter=0;counter<1;counter++)
			p.PLC(loc, Effect.VILLAGER_THUNDERCLOUD, counter);
			return;
		case 6:
			s.SL(loc, org.bukkit.Sound.CHEST_CLOSE, 1.0F, 0.5F);
			loc.setY((double)(loc.getBlockY()+1.8));
			p.PLC(loc, Effect.HEART, 0);
			return;
		case 7:
			switch(mob.getType())
			{
			case ZOMBIE :
			case GIANT :
				s.SL(loc, org.bukkit.Sound.ZOMBIE_IDLE, 1.0F, 0.5F);
				loc.setY((double)(loc.getBlockY()+1.8));
				p.PLC(loc, Effect.VILLAGER_THUNDERCLOUD, 0);
				for(int counter=0;counter<50;counter++)
					p.PLC(loc, Effect.MAGIC_CRIT, counter);
				break;
			case SKELETON :
				s.SL(loc, org.bukkit.Sound.SKELETON_DEATH, 1.0F, 0.5F);
				loc.setY((double)(loc.getBlockY()+1.8));
				p.PLC(loc, Effect.VILLAGER_THUNDERCLOUD, 0);
				for(int counter=0;counter<50;counter++)
					p.PLC(loc, Effect.MAGIC_CRIT, counter);
				break;
			case ENDERMAN :
			case ENDERMITE :
				s.SL(loc, org.bukkit.Sound.ENDERMAN_TELEPORT, 1.0F, 0.5F);
				loc.setY((double)(loc.getBlockY()+1));
				for(int counter=0;counter<100;counter++)
					p.PLC(loc, Effect.ENDER_SIGNAL, 0);
				break;
			case CREEPER :
				s.SL(loc, org.bukkit.Sound.EXPLODE, 1.0F, 0.5F);
				loc.setY((double)(loc.getBlockY()+1));
				p.PLC(loc, Effect.EXPLOSION_LARGE, 0);
				for(int counter=0;counter<3;counter++)
				p.PLC(loc, Effect.EXPLOSION_HUGE, counter);
				for(int counter=0;counter<5;counter++)
				p.PLC(loc, Effect.EXPLOSION, counter);
				break;
			case SPIDER :
			case CAVE_SPIDER :
			case SILVERFISH:
				s.SL(loc, org.bukkit.Sound.SPIDER_IDLE, 1.0F, 0.5F);
				for(int counter=0;counter<10;counter++)
				p.PLC(loc, Effect.LARGE_SMOKE, counter);
				loc.setY((double)(loc.getBlockY()+1));
				p.PLC(loc, Effect.SMOKE, 0);
				break;
			case SLIME:
				s.SL(loc, org.bukkit.Sound.SLIME_WALK, 1.0F, 0.5F);
				loc.setY((double)(loc.getBlockY()+1));
				for(int counter=0;counter<20;counter++)
				p.PLC(loc, Effect.SLIME, counter);
				break;
			case MAGMA_CUBE:
				loc.setY((double)(loc.getBlockY()+1));
				s.SL(loc, org.bukkit.Sound.SLIME_WALK, 1.0F, 0.5F);
				for(int counter=0;counter<40;counter++)
				p.PLC(loc, Effect.MOBSPAWNER_FLAMES, counter);
				break;
			case BLAZE :
				s.SL(loc, org.bukkit.Sound.BLAZE_BREATH, 1.0F, 0.5F);
				for(int counter=0;counter<200;counter++)
				p.PLC(loc, Effect.SMOKE, 9);
				for(int counter=0;counter<200;counter++)
				p.PLC(loc, Effect.FLAME, 0);
				break;
			case GHAST :
				s.SL(loc, org.bukkit.Sound.GHAST_MOAN, 1.0F, 0.5F);
				p.PLC(loc, Effect.FLAME, 0);
				for(int counter=0;counter<100;counter++)
					p.PLC(loc, Effect.SMOKE, 4);
				for(int counter=0;counter<40;counter++)
				p.PLC(loc, Effect.MOBSPAWNER_FLAMES, counter);
				break;
			case PIG_ZOMBIE :
				s.SL(loc, org.bukkit.Sound.ZOMBIE_PIG_IDLE, 1.0F, 0.5F);
				for(int counter=0;counter<100;counter++)
					p.PLC(loc, Effect.SMOKE, 4);
				for(int counter=0;counter<40;counter++)
				p.PLC(loc, Effect.MOBSPAWNER_FLAMES, counter);
				break;
			case WITCH:
				s.SL(loc, org.bukkit.Sound.VILLAGER_NO, 1.0F, 0.5F);
				for(int counter=0;counter<400;counter++)
				p.PLC(loc, Effect.SPELL, 4);
				for(int counter=0;counter<300;counter++)
				p.PLC(loc, Effect.FLYING_GLYPH, 0);
				for(int counter=0;counter<200;counter++)
				p.PLC(loc, Effect.SMOKE, 4);
				break;
			case GUARDIAN : 
				s.SL(loc, org.bukkit.Sound.SWIM, 1.0F, 0.5F);
				for(int counter=0;counter<400;counter++)
				p.PLC(loc, Effect.WATERDRIP, counter);
				break;
			case SNOWMAN : 
				s.SL(loc, org.bukkit.Sound.DIG_SNOW, 1.0F, 0.5F);
				for(int counter=0;counter<200;counter++)
				p.PLC(loc, Effect.SNOWBALL_BREAK, counter);
				break;
			}
			return;
		}
	}
	
	public int getMonsterID(String MonsterType)
	{
		switch(MonsterType)
		{
			case "����":
				return 54;
			case "���̾�Ʈ":
				return 53;
			case "�״����̷���":
			case "���̷���":
				return 51;
			case "������":
				return 58;
			case "����ũ����":
			case "ũ����":
				return 50;
			case "�Ź�":
				return 52;
			case "�����Ź�":
				return 59;
			case "������":
				return 60;
			case "���������":
				return 67;
			case "�ʴ���������": case "Ư�뽽����": case "ū������": case "���뽽����": case "����������": 
				return 55;
			case "Ư�븶�׸�ť��": case "ū���׸�ť��": case "���븶�׸�ť��": case "�������׸�ť��": case "���׸�ť��":
				return 62;
			case "��������":
				return 61;
			case "����Ʈ":
				return 56;
			case "�����Ǳ׸�":
				return 57;
			case "����":
				return 66;
			case "����":
				return 64;
			case "�����巡��":
				return 63;
			case "����ũ����Ż":
				return -50;
			case "��ȣ��":
				return 68;
			case "��":
				return 91;
			case "��":
				return 92;
			case "����":
				return 90;
			case "��":
				return 100;
			case "�䳢":
				return 101;
			case "������":
				return 98;
			case "����":
				return 95;
			case "��":
				return 93;
			case "������":
				return 96;
			case "��¡��":
				return 94;
			case "�ֹ�":
				return 120;
			case "�����":
				return 97;
			case "��":
				return 99;
			case "����":
				return 65;
			default : return -60;
		}
	}

	public String getMonsterCustomName(String MonsterType)
	{
		switch(MonsterType)
		{
			case "����":
				return "CUSTOMZOMBIE";
			case "���̾�Ʈ":
				return "CUSTOMGIANT";
			case "�״����̷���":
			case "���̷���":
				return "CUSTOMSKELETON";
			case "������":
				return "CUSTOMENDERMAN";
			case "����ũ����":
			case "ũ����":
				return "CUSTOMCREEPER";
			case "�Ź�":
				return "CUSTOMSPIDER";
			case "�����Ź�":
				return "CUSTOMCAVESPIDER";
			case "������":
				return "CUSTOMSLIVERFISH";
			case "���������":
				return "CUSTOMENDERMITE";
			case "�ʴ���������": case "Ư�뽽����": case "ū������": case "���뽽����": case "����������":
				return "CUSTOMSLIME"; 
			case "Ư�븶�׸�ť��": case "ū���׸�ť��": case "���븶�׸�ť��": case "�������׸�ť��": case "���׸�ť��":
				return "CUSTOMMAGMACUBE"; 
			case "��������":
				return "CUSTOMBLAZE";
			case "����Ʈ":
				return "CUSTOMGHAST";
			case "�����Ǳ׸�":
				return "CUSTOMPIGZOMBIE";
			case "����":
				return "CUSTOMWITCH";
			case "����":
				return "CUSTOMWITHER";
			case "�����巡��":
				return "CUSTOMENDERDRAGON";
			case "��ȣ��":
				return "CUSTOMGUARDIAN";
			case "��":
				return "CUSTOMSHEEP";
			case "��":
				return "CUSTOMCOW";
			case "����":
				return "CUSTOMPIG";
			case "��":
				return "CUSTOMHORSE";
			case "�䳢":
				return "CUSTOMRABBIT";
			case "������":
				return "CUSTOMOCELOT";
			case "����":
				return "CUSTOMWOLF";
			case "��":
				return "CUSTOMCHICKEN";
			case "������":
				return "CUSTOMMOOSHROOM";
			case "��¡��":
				return "CUSTOMSQUID";
			case "�ֹ�":
				return "CUSTOMVILLAGER";
			case "�����":
				return "CUSTOMSNOWGOLEM";
			case "��":
				return "CUSTOMIRONGOLEM";
			case "����":
				return "CUSTOMBAT";
			default:
				return "CUSTOMZOMBIE";
		}
	}
}
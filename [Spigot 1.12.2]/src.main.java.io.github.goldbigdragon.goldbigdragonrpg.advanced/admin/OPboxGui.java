package admin; e

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import customitem.gui.EquipItemListGui;
import customitem.gui.UseableItemListGui;
import effect.SoundEffect;
import job.JobGUI;
import main.MainServerOption;
import quest.QuestGui;
import skill.OPboxSkillGui;
import structure.StructureGui;
import user.UserDataObject;
import util.GuiUtil;
import util.YamlLoader;

public class OPboxGui extends GuiUtil
{
	public void opBoxGuiMain (Player player, int page)
	{
		YamlLoader configYaml = new YamlLoader();
		configYaml.getConfig("config.yml");
		String uniqueCode = "��0��0��1��0��0��r";
		Inventory inv = Bukkit.createInventory(null, 54, uniqueCode + "��0������ ���� : "+page+" / 3");
		
		removeFlagStack("��0"+page, 160,11,1,null, 0, inv);
		removeFlagStack(" ", 160,11,1,null, 1, inv);
		removeFlagStack("��c��l[���� �ð� ���� -��-]", 160,4,1,Arrays.asList("��f���� ���� �ð��� ������","��f���� ��ŵ�ϴ�."), 2, inv);
		removeFlagStack("��7��l[���� �ð� ���� -��-]", 160,4,1,Arrays.asList("��f���� ���� �ð��� ������","��f���� ��ŵ�ϴ�."), 3, inv);
		removeFlagStack("��e��l[���� ��ġ�� ��������]", 160,4,1,Arrays.asList("��f���� ��ġ�� ���� ��������","��f���� ��ŵ�ϴ�."), 4, inv);
		removeFlagStack("��3��l[���� ���� ���� -����-]", 160,4,1,Arrays.asList("��f���� ���� ������ ����","��f���� ��ŵ�ϴ�."), 5, inv);
		removeFlagStack("��7��l[���� ���� ���� -�帲-]", 160,4,1,Arrays.asList("��f���� ���� ������ �帮��","��f���� ��ŵ�ϴ�."), 6, inv);
		removeFlagStack(" ", 160,11,1,null, 7, inv);
		removeFlagStack(" ", 160,11,1,null, 8, inv);
		removeFlagStack(" ", 160,11,1,null, 9, inv);
		removeFlagStack(" ", 160,11,1,null, 18, inv);
		removeFlagStack(" ", 160,11,1,null, 17, inv);
		removeFlagStack(" ", 160,11,1,null, 26, inv);
		removeFlagStack(" ", 160,11,1,null, 27, inv);
		removeFlagStack(" ", 160,11,1,null, 36, inv);
		removeFlagStack(" ", 160,11,1,null, 35, inv);
		removeFlagStack(" ", 160,11,1,null, 36, inv);
		removeFlagStack(" ", 160,11,1,null, 37, inv);
		removeFlagStack(" ", 160,11,1,null, 38, inv);
		removeFlagStack(" ", 160,11,1,null, 39, inv);
		removeFlagStack(" ", 160,11,1,null, 40, inv);
		removeFlagStack(" ", 160,11,1,null, 41, inv);
		removeFlagStack(" ", 160,11,1,null, 42, inv);
		removeFlagStack(" ", 160,11,1,null, 43, inv);
		removeFlagStack(" ", 160,11,1,null, 44, inv);

		removeFlagStack("��f��l�÷����� ���̵�", 340,0,1,Arrays.asList("��eGoldBigDragonAdvanced","��f�÷����ο� ����","��f������ ���ϴ�."), 22, inv);
		
		switch(page)
		{
			case 1:
				stackItem(getPlayerSkull("��f��lGoldBigDragonRPG", 1, Arrays.asList("","��e[����]","��f��l"+MainServerOption.serverVersion,"","��e[��ġ]","��f��l"+MainServerOption.serverUpdate), "GoldBigDragon"), 10, inv);
				removeFlagStack("��a��l���� ����", 137,0,1,Arrays.asList("��7������ ���� �������� ������ �մϴ�."), 12, inv);
				removeFlagStack("��f��l����", 397,4,1,Arrays.asList("��7Ŀ���� ���͸� �����ϰų�","��7���� ���׸� ����ϴ�."), 14, inv);
				removeFlagStack("��f��l�̺�Ʈ", 401,0,1,Arrays.asList("��7�̺�Ʈ ���ֽ� ���ӵ� ���","��7�÷��̾�鿡�� �˷�����,","��7���� �����ϴ� ��� �÷��̾��","��7�̺�Ʈ ������ �˷��ݴϴ�."), 16, inv);
				if(configYaml.getBoolean("Server.Like_The_Mabinogi_Online_Stat_System") == true)
				{removeFlagStack("��f��l���� ����", 346,0,1,Arrays.asList("��f[������]","��7ȯ���� ���������� �����ϸ�,","��7������ ���Ƿ� �ø� �� �����ϴ�.","��c�÷��̾��� ���� �����Ͱ� �̾����Ƿ�","��c����� ���ǰ� �ʿ��մϴ�."), 28, inv);}
				else
				{{removeFlagStack("��f��l���� ����", 40,0,1,Arrays.asList("��6[������ ���丮]","��7������ ���Ƿ� �ø� �� ������,","��7���������� ȯ���� �������� �ʽ��ϴ�.","��c�÷��̾��� ���� �����Ͱ� �̾����Ƿ�","��c����� ���ǰ� �ʿ��մϴ�."), 28, inv);}	}
				removeFlagStack("��f��lĿ���� ������", 389,0,1,Arrays.asList("��fĿ���� �������� �����ϰų�","��fŬ���Ͽ� ���� �޽��ϴ�.","","��e[�� Ŭ���� ������ �ޱ�]","��e[Shift + �� Ŭ���� ������ ����]","��c[Shift + �� Ŭ���� ������ ����]"), 30, inv);
				removeFlagStack("��f��l�׺���̼�", 358,120,1,Arrays.asList("��f��ã�� �ý����� �����մϴ�."), 32, inv);
				removeFlagStack("��f��l����Ʈ", 403,0,1,Arrays.asList("��f����Ʈ�� ���� ����ų�","��f�����ϰų� �����մϴ�."), 34, inv);
				removeFlagStack("��f��l���� ������", 323,0,1,Arrays.asList("��7���� �������� �̵� �մϴ�."), 50, inv);
				break;

			case 2:
				removeFlagStack("��a��l��ų", 403,0,1,Arrays.asList("��7���� Ȥ�� ī�װ��� ��� ������","��7��ų���� ����մϴ�."), 10, inv);
				removeFlagStack("��a��lī�װ� �� ����", 397,3,1,Arrays.asList("��7��ų�� ������ ���� ������ �մϴ�."), 12, inv);
				removeFlagStack("��a��l�Һ� ������", 260,0,1,Arrays.asList("��7�� Ŭ�� Ȥ�� ����Ű�� ����","��7��� ������ �������� �����մϴ�."), 14, inv);
				removeFlagStack("��a��l����", 395,0,1,Arrays.asList("��7���� ������ ���Ͽ� ��������","��7Ư���� �ɼ��� ������ �� �ֽ��ϴ�."), 16, inv);
				removeFlagStack("��a��l������", 145,2,1,Arrays.asList("��7������ ���� ����� ���� ����ų�","��7������ �� �ֽ��ϴ�."), 28, inv);
				removeFlagStack("��a��l�ʽ���", 54,0,1,Arrays.asList("��7������ ó�� ���� �÷��̾","��7���Ͽ� ������ �մϴ�."), 30, inv);
				removeFlagStack("��a��l���� ����", 2,0,1,Arrays.asList("��7���ο� ���带 �����մϴ�."), 32, inv);
				removeFlagStack("��a��l����", 345,0,1,Arrays.asList("��7���� ������ �����ϰų�, �̵��մϴ�."), 34, inv);

				removeFlagStack("��f��l���� ������", 323,0,1,Arrays.asList("��7���� �������� �̵� �մϴ�."), 48, inv);
				removeFlagStack("��f��l���� ������", 323,0,1,Arrays.asList("��7���� �������� �̵� �մϴ�."), 50, inv);
				break;
			case 3:
				removeFlagStack("��a��l����", 266,0,1,Arrays.asList("��7���� ���� ����� ���ϴ�."), 10, inv);
				removeFlagStack("��a��l��ɼ� ��ü", 130,0,1,Arrays.asList("��7���� ����� ���� ��ü����","��7��ġ�ϰų� �����մϴ�."), 12, inv);
				removeFlagStack("��a��l����", 52,0,1,Arrays.asList("��7�ν� �Ͻ� ������ ���� ������ �մϴ�."), 14, inv);
				removeFlagStack("��a��l����", 58,0,1,Arrays.asList("��7���ۿ� ���� ������ �մϴ�."), 16, inv);
				
				removeFlagStack("��f��l���� ������", 323,0,1,Arrays.asList("��7���� �������� �̵� �մϴ�."), 48, inv);
				break;
			
		}

		removeFlagStack("��f��l�ݱ�", 324,0,1,Arrays.asList("��7�۾� ������ â�� �ݽ��ϴ�."), 53, inv);
		
		player.openInventory(inv);
	}
	
	public void opBoxGuiSetting(Player player)
	{
		YamlLoader configYaml = new YamlLoader();
		configYaml.getConfig("config.yml");
		String uniqueCode = "��0��0��1��0��1��r";
		Inventory inv = Bukkit.createInventory(null, 54, uniqueCode + "��0������ �ɼ�");
		
		removeFlagStack(" ", 160,11,1,null, 0, inv);
		removeFlagStack(" ", 160,11,1,null, 1, inv);
		removeFlagStack(" ", 160,11,1,null, 2, inv);
		removeFlagStack(" ", 160,11,1,null, 3, inv);
		removeFlagStack(" ", 160,11,1,null, 4, inv);
		removeFlagStack(" ", 160,11,1,null, 5, inv);
		removeFlagStack(" ", 160,11,1,null, 6, inv);
		removeFlagStack(" ", 160,11,1,null, 7, inv);
		removeFlagStack(" ", 160,11,1,null, 8, inv);
		removeFlagStack(" ", 160,11,1,null, 9, inv);
		removeFlagStack(" ", 160,11,1,null, 18, inv);
		removeFlagStack(" ", 160,11,1,null, 17, inv);
		removeFlagStack(" ", 160,11,1,null, 26, inv);
		removeFlagStack(" ", 160,11,1,null, 27, inv);
		removeFlagStack(" ", 160,11,1,null, 36, inv);
		removeFlagStack(" ", 160,11,1,null, 35, inv);
		removeFlagStack(" ", 160,11,1,null, 36, inv);
		removeFlagStack(" ", 160,11,1,null, 37, inv);
		removeFlagStack(" ", 160,11,1,null, 38, inv);
		removeFlagStack(" ", 160,11,1,null, 39, inv);
		removeFlagStack(" ", 160,11,1,null, 40, inv);
		removeFlagStack(" ", 160,11,1,null, 41, inv);
		removeFlagStack(" ", 160,11,1,null, 42, inv);
		removeFlagStack(" ", 160,11,1,null, 43, inv);
		removeFlagStack(" ", 160,11,1,null, 44, inv);

		if(configYaml.getBoolean("Server.EntitySpawn"))
		{removeFlagStack("��a��l��ƼƼ ����", 52,0,1,Arrays.asList("��a[Ȱ��ȭ]","��7�ش� �ɼ��� ��Ȱ��ȭ ������ ���","��7���̻� ��ƼƼ���� ��ȯ���� �ʽ��ϴ�."), 10, inv);}
		else
		{{removeFlagStack("��c��l��ƼƼ ����", 166,0,1,Arrays.asList("��c[�� Ȱ��ȭ]","��7�ش� �ɼ��� ��Ȱ��ȭ ������ ���","��7���̻� ��ƼƼ���� ��ȯ���� �ʽ��ϴ�."), 10, inv);}	}
		
		if(configYaml.getBoolean("Server.PVP"))
		{removeFlagStack("��a��l������ PVP", 276,0,1,Arrays.asList("��a[Ȱ��ȭ]","��7���� ������ ������ ��� �˴ϴ�."), 11, inv);}
		else
		{{removeFlagStack("��c��l������ PVP", 166,0,1,Arrays.asList("��c[�� Ȱ��ȭ]","��7���� ������ ������ ������ �ʽ��ϴ�."), 11, inv);}	}
		switch(configYaml.getInt("Server.MonsterSpawnEffect"))
		{
			case 0 : removeFlagStack("��f��l���� ���� ȿ��", 383,0,1,Arrays.asList("��f[����]"), 12, inv); break;
			case 1 : removeFlagStack("��f��l���� ���� ȿ��", 383,66,1,Arrays.asList("��9[����]","��c�� ���� �� ������ ������ �˴ϴ�!"), 12, inv); break;
			case 2 : removeFlagStack("��f��l���� ���� ȿ��", 383,58,1,Arrays.asList("��5[����]","��c�� ���� �� ������ ������ �˴ϴ�!"), 12, inv); break;
			case 3 : removeFlagStack("��f��l���� ���� ȿ��", 383,50,1,Arrays.asList("��a[����]","��c�� ���� �� ������ ������ �˴ϴ�!"), 12, inv); break;
			case 4 : removeFlagStack("��f��l���� ���� ȿ��", 383,61,1,Arrays.asList("��4[ȭ��]","��c�� ���� �� ������ ������ �˴ϴ�!"), 12, inv); break;
			case 5 : removeFlagStack("��f��l���� ���� ȿ��", 383,120,1,Arrays.asList("��c[ȭ��]","��c�� ���� �� ������ ������ �˴ϴ�!"), 12, inv); break;
			case 6 : removeFlagStack("��f��l���� ���� ȿ��", 383,90,1,Arrays.asList("��d[����]","��c�� ���� �� ������ ������ �˴ϴ�!"), 12, inv); break;
			case 7 : removeFlagStack("��f��l���� ���� ȿ��", 50,0,1,Arrays.asList("��6[���]","��c�� ���� �� ������ ������ �˴ϴ�!"), 12, inv); break;
		}

		if(configYaml.getBoolean("Server.CustomWeaponBreak"))
		{removeFlagStack("��a��lĿ���� ���� �ı�", 268,50,1,Arrays.asList("��a[Ȱ��ȭ]","��7Ŀ���� ������ �������� 0�� �� ���","��7�Ϲ� ����� ���� �ı��˴ϴ�."), 13, inv);}
		else
		{{removeFlagStack("��c��lĿ���� ���� �ı�", 166,0,1,Arrays.asList("��c[�� Ȱ��ȭ]","��7Ŀ���� ����� �������� 0�� �Ǿ","��7�ı����� �ʽ��ϴ�."), 13, inv);}	}

		if(configYaml.getString("Server.JoinMessage") != null)
			removeFlagStack("��a��l���� �޽���", 386,0,1,Arrays.asList("��a[����]","��8"+configYaml.getString("Server.JoinMessage"),"","��e[�� Ŭ���� ���� �޽��� ����]"), 14, inv);
		else
			removeFlagStack("��a��l���� �޽���", 166,0,1,Arrays.asList("��c[����]","��7���� �޽����� �����ϴ�.","","��e[�� Ŭ���� ���� �޽��� ���]"), 14, inv);

		if(configYaml.getString("Server.QuitMessage") != null)
			removeFlagStack("��a��l���� �޽���", 386,0,1,Arrays.asList("��a[����]","��8"+configYaml.getString("Server.QuitMessage"),"","��e[�� Ŭ���� ���� �޽��� ����]"), 15, inv);
		else
			removeFlagStack("��a��l���� �޽���", 166,0,1,Arrays.asList("��c[����]","��7���� �޽����� �����ϴ�.","","��e[�� Ŭ���� ���� �޽��� ���]"), 15, inv);
		removeFlagStack("��a��l��������", 323,0,1,Arrays.asList("��7������ ���� �ð�����","��7���������� �˸��ϴ�.","","��e[�� Ŭ���� �������� ����]"), 16, inv);

		if(configYaml.getString("Server.ChatPrefix")==null)
			stackItem(getPlayerSkull("��a��lä�� ����", 1, Arrays.asList("��7ä�� ���¸� �����մϴ�.","��7��, ���¸� ������ ���","��7��� �Ϲ� ä���� ��ε�","��7ĳ��Ʈ �������� ����ǹǷ�","��7�����ؾ� �մϴ�.","","��3[���� ä�� ����]","��f[   ����   ]","","��e[�� Ŭ���� ���λ� ����]","��c[�� Ŭ���� ���λ� ����]","","��a[�ڵ� ����]","��f��lB4TT3RY"), "B4TT3RY__"), 19, inv);
		else
		{
			String prefix = configYaml.getString("Server.ChatPrefix");
			prefix=prefix.replace("%t%","[�ð�]");
			prefix=prefix.replace("%gm%","[���� ���]");
			prefix=prefix.replace("%ct%","[ä�� Ÿ��]");
			prefix=prefix.replace("%lv%","[����]");
			prefix=prefix.replace("%rlv%","[���� ����]");
			prefix=prefix.replace("%job%","[����]");
			prefix=prefix.replace("%player%","[�г���]");
			prefix=prefix.replace("%message%", "[����]");
			stackItem(getPlayerSkull("��a��lä�� ����", 1, Arrays.asList("��7ä�� ���¸� �����մϴ�.","��7��, ���¸� ������ ���","��7��� �Ϲ� ä���� ��ε�","��7ĳ��Ʈ �������� ����ǹǷ�","��7�����ؾ� �մϴ�.","","��3[���� ä�� ����]","��f"+prefix,"","��e[�� Ŭ���� ���λ� ����]","��c[�� Ŭ���� ���λ� ����]","","��a[�ڵ� ����]","��f��lB4TT3RY"), "B4TT3RY__"), 19, inv);
		}

		if(configYaml.getBoolean("Server.CustomBlockPlace"))
			removeFlagStack("��a��lĿ���� ��� ��ġ", 1,0,1,Arrays.asList("��a[����]","��7�����ۿ� ������ �پ� �ְų�","��7�̸��� ����� ��������","��7��ġ�Ǵ� ���� ���� �ʽ��ϴ�."), 20, inv);
		else
			removeFlagStack("��c��lĿ���� ��� ��ġ", 166,0,1,Arrays.asList("��c[�Ұ���]","��7�����ۿ� ������ �پ� �ְų�","��7�̸��� ����� ��������","��7��ġ�Ǵ� ���� �����ϴ�."), 20, inv);

		removeFlagStack("��a��l���� �̸� ����", 340,0,1,Arrays.asList("��7������ ���� �̸���","��7������� �����մϴ�.","","��e[�� Ŭ���� ���� �̸� ����]","","��c[       ����       ]","��c���� �̸� ����� ������ �ѷ���","��cĿ���� �������� �ɷ�ġ��","��c��� ��ȿ ó���� �Ǹ�,","��c��ų�� ���� ���� �ɼ���","��c�� ���� �Ͽ��� �մϴ�."), 21, inv);

		removeFlagStack("��a��l���� �ý��� ����", 266,0,1,Arrays.asList("��7ȭ�� ���õ� �ý�����","��7�����մϴ�.","","��e[�� Ŭ���� ȭ�� �ý���GUI �̵�]"), 22, inv);

		removeFlagStack("��a��l��� �ý��� ����", 397,0,1,Arrays.asList("��7����� ���õ� �ý�����","��7�����մϴ�.","","��e[�� Ŭ���� ��� �ý���GUI �̵�]"), 23, inv);

		if(main.MainServerOption.AntiExplode)
			removeFlagStack("��a��l���� ����", 46,0,1,Arrays.asList("��a[Ȱ��ȭ]","��7ũ����, TNT, ���� ũ����Ż�� ����","��7��� �ı��� �����մϴ�."), 24, inv);
		else
			removeFlagStack("��a��l���� ����", 166,0,1,Arrays.asList("��c[�� Ȱ��ȭ]","��7ũ����, TNT, ���� ũ����Ż�� ����","��7��� �ı��� ��ġ�մϴ�."), 24, inv);

		if(main.MainServerOption.dualWeapon)
			removeFlagStack("��a��l�޼� ���� ������ ����", 442,0,1,Arrays.asList("��a[Ȱ��ȭ]","��7�޼տ� ������ ���⵵","��7������ ��꿡 ���ϴ�."), 25, inv);
		else
			removeFlagStack("��a��l�޼� ���� ������ ����", 166,0,1,Arrays.asList("��c[�� Ȱ��ȭ]","��7�޼տ� ������ �����","��7���� ������ �����մϴ�."), 25, inv);

		if(main.MainServerOption.removeMonsterDefaultDrops)
			removeFlagStack("��c��l���� �⺻ ����� ����", 166,0,1,Arrays.asList("��7������ �⺻ ������� �����մϴ�."), 28, inv);
		else
			removeFlagStack("��a��l���� �⺻ ����� ����", 54,0,1,Arrays.asList("��7������ �⺻ ������� �����մϴ�."), 28, inv);
		
		removeFlagStack("��f��l���� ���", 323,0,1,Arrays.asList("��7���� ȭ������ ���ư��ϴ�."), 45, inv);
		removeFlagStack("��f��l�ݱ�", 324,0,1,Arrays.asList("��7�۾� ������ â�� �ݽ��ϴ�."), 53, inv);
		
		player.openInventory(inv);
	}
	
	public void opBoxGuiBroadCast(Player player, byte page)
	{
		YamlLoader broadcastYaml = new YamlLoader();
		broadcastYaml.getConfig("BroadCast.yml");

		String uniqueCode = "��0��0��1��0��2��r";
		Inventory inv = Bukkit.createInventory(null, 54, uniqueCode + "��0������ �������� : " + (page+1));

		if(broadcastYaml.contains("0"))
		{
			int broadcastAmount = broadcastYaml.getConfigurationSection("").getKeys(false).size();
			byte loc=0;
			for(int count = (short) (page*45); count < broadcastAmount;count++)
			{				
				removeFlagStack("��0��l" + count, 340,0,1,Arrays.asList(broadcastYaml.getString(count+"")
						,"","��c[Shift + ��Ŭ���� �˸� ����]"), loc, inv);
				
				loc++;
			}

			if(broadcastAmount-(page*44)>45)
			removeFlagStack("��f��l���� ������", 323,0,1,Arrays.asList("��7���� �������� �̵� �մϴ�."), 50, inv);
			if(page!=0)
			removeFlagStack("��f��l���� ������", 323,0,1,Arrays.asList("��7���� �������� �̵� �մϴ�."), 48, inv);
		}
		YamlLoader configYaml = new YamlLoader();
		configYaml.getConfig("config.yml");

		removeFlagStack("��f��l���� ����", 152,0,1,Arrays.asList("��7�� ��6"+configYaml.getInt("Server.BroadCastSecond")+"��7�ʸ��� ����"), 46, inv);
		
		removeFlagStack("��f��l�� ����", 386,0,1,Arrays.asList("��7���ο� ���������� �����մϴ�."), 49, inv);
		removeFlagStack("��f��l���� ���", 323,0,1,Arrays.asList("��7���� ȭ������ ���ư��ϴ�."), 45, inv);
		removeFlagStack("��f��l�ݱ�", 324,0,1,Arrays.asList("��7â�� �ݽ��ϴ�."), 53, inv);
		player.openInventory(inv);
	}
	
	public void opBoxGuiStatChange(Player player)
	{
		String uniqueCode = "��0��0��1��0��3��r";
		Inventory inv = Bukkit.createInventory(null, 54, uniqueCode + "��0������ ���� ����");

		removeFlagStack("��f��lü��", 267,0,1,Arrays.asList("��7[  ���� �̸�  ]","��f"+MainServerOption.statSTR), 0, inv);
		removeFlagStack("��f��l�ؾ�", 261,0,1,Arrays.asList("��7[  ���� �̸�  ]","��f"+MainServerOption.statDEX), 1, inv);
		removeFlagStack("��f��l����", 369,0,1,Arrays.asList("��7[  ���� �̸�  ]","��f"+MainServerOption.statINT), 2, inv);
		removeFlagStack("��f��l����", 370,0,1,Arrays.asList("��7[  ���� �̸�  ]","��f"+MainServerOption.statWILL), 3, inv);
		removeFlagStack("��f��l���", 322,0,1,Arrays.asList("��7[  ���� �̸�  ]","��f"+MainServerOption.statLUK), 4, inv);

		removeFlagStack("��f��l�����", 276,0,1,Arrays.asList("��7[  ���� �̸�  ]","��f"+MainServerOption.damage), 5, inv);
		removeFlagStack("��f��l���� �����", 403,0,1,Arrays.asList("��7[  ���� �̸�  ]","��f"+MainServerOption.magicDamage), 6, inv);
		
		
		String lore = MainServerOption.STR_Lore;
		lore = lore.replace("%stat%", MainServerOption.statSTR);
		removeFlagStack("��f��lü�� ����", 323,0,1,Arrays.asList(lore.split("%enter%")), 9, inv);
		lore = MainServerOption.DEX_Lore;
		lore = lore.replace("%stat%", MainServerOption.statDEX);
		removeFlagStack("��f��l�ؾ� ����", 323,0,1,Arrays.asList(lore.split("%enter%")), 10, inv);
		lore = MainServerOption.INT_Lore;
		lore = lore.replace("%stat%", MainServerOption.statINT);
		removeFlagStack("��f��l���� ����", 323,0,1,Arrays.asList(lore.split("%enter%")), 11, inv);
		lore = MainServerOption.WILL_Lore;
		lore = lore.replace("%stat%", MainServerOption.statWILL);
		removeFlagStack("��f��l���� ����", 323,0,1,Arrays.asList(lore.split("%enter%")), 12, inv);
		lore = MainServerOption.LUK_Lore;
		lore = lore.replace("%stat%", MainServerOption.statLUK);
		removeFlagStack("��f��l��� ����", 323,0,1,Arrays.asList(lore.split("%enter%")), 13, inv);
		
		removeFlagStack("��f��l���� ���", 323,0,1,Arrays.asList("��7���� ȭ������ ���ư��ϴ�."), 45, inv);
		removeFlagStack("��f��l�ݱ�", 324,0,1,Arrays.asList("��7â�� �ݽ��ϴ�."), 53, inv);
		player.openInventory(inv);
	}
	
	public void opBoxGUIMoney(Player player)
	{
		String uniqueCode = "��0��0��1��0��4��r";
		Inventory inv = Bukkit.createInventory(null, 54, uniqueCode + "��0������ ȭ�� ����");

		YamlLoader configYaml = new YamlLoader();
		configYaml.getConfig("config.yml");
		
		removeFlagStack("��f��l��� �ִ� �׼� ����", 166,0,1,Arrays.asList("��7��� ������ �ִ� �ݾ���","��7�����մϴ�.","","��e[     ���� �ִ� ���     ]","��7 "+configYaml.getInt("Server.Max_Drop_Money")), 11, inv);
		
		removeFlagStack("��f��lȭ��", 421,0,1,Arrays.asList("","��7[     ���� �̸�     ]"," ��f"+MainServerOption.money), 13, inv);
	
		removeFlagStack("��f��lȭ�� ��� ����", MainServerOption.Money1ID,MainServerOption.Money1DATA,1,Arrays.asList("��7   [  50�� ����  ]  ",""), 28, inv);
		removeFlagStack("��f��lȭ�� ��� ����", MainServerOption.Money2ID,MainServerOption.Money2DATA,1,Arrays.asList("��7   [ 100�� ���� ]  ",""), 29, inv);
		removeFlagStack("��f��lȭ�� ��� ����", MainServerOption.Money3ID,MainServerOption.Money3DATA,1,Arrays.asList("��7   [1000�� ����]  ",""), 30, inv);
		removeFlagStack("��f��lȭ�� ��� ����", MainServerOption.Money4ID,MainServerOption.Money4DATA,1,Arrays.asList("��7   [10000�� ����]  ",""), 31, inv);
		removeFlagStack("��f��lȭ�� ��� ����", MainServerOption.Money5ID,MainServerOption.Money5DATA,1,Arrays.asList("��7   [50000�� ����]  ",""), 32, inv);
		removeFlagStack("��f��lȭ�� ��� ����", MainServerOption.Money6ID,MainServerOption.Money6DATA,1,Arrays.asList("��7   [50000�� �ʰ�]  ",""), 33, inv);
		removeFlagStack("��f��lȭ�� ��� �ʱ�ȭ", 325,0,1,Arrays.asList("��7   [ �ʱ�ȭ ��ŵ�ϴ� ]  ",""), 34, inv);
		
		removeFlagStack("��f��l���� ���", 323,0,1,Arrays.asList("��7���� ȭ������ ���ư��ϴ�."), 45, inv);
		removeFlagStack("��f��l�ݱ�", 324,0,1,Arrays.asList("��7â�� �ݽ��ϴ�."), 53, inv);
		player.openInventory(inv);
	}

	public void opBoxGuiDeath(Player player)
	{
		String uniqueCode = "��0��0��1��0��5��r";
		Inventory inv = Bukkit.createInventory(null, 54, uniqueCode + "��0������ ��� ����");

		YamlLoader configYaml = new YamlLoader();
	  	configYaml.getConfig("config.yml");

		removeFlagStack("��6��l[����� �������� ��Ȱ]", 345,0,1,Arrays.asList("","��7[���� ���� ����]","","��a + "+configYaml.getString("Death.Spawn_Home.SetHealth")+" �����","��c - ����ġ "+configYaml.getString("Death.Spawn_Home.PenaltyEXP")+" ����","��c - ������ "+configYaml.getString("Death.Spawn_Home.PenaltyMoney")+" ����","","��e[�� Ŭ���� ����]"), 10, inv);
		removeFlagStack("��c��l[�ٽ� �Ͼ��]", 2266,0,1,Arrays.asList("","��7[���� ���� ����]","","��a + "+configYaml.getString("Death.Spawn_Here.SetHealth")+" �����","��c - ����ġ "+configYaml.getString("Death.Spawn_Here.PenaltyEXP")+" ����","��c - ������ "+configYaml.getString("Death.Spawn_Here.PenaltyMoney")+" ����","","��e[�� Ŭ���� ����]"), 12, inv);
		removeFlagStack("��c��l[������ ��ٸ���]", 397,3,1,Arrays.asList("","��7[���� ���� ����]","","��a + "+configYaml.getString("Death.Spawn_Help.SetHealth")+" �����","��c - ����ġ "+configYaml.getString("Death.Spawn_Help.PenaltyEXP")+" ����","��c - ������ "+configYaml.getString("Death.Spawn_Help.PenaltyMoney")+" ����","","��e[�� Ŭ���� ����]"), 14, inv);
		removeFlagStack("��3��l[��Ȱ�� ���]", 399,0,1,Arrays.asList("","��7[���� ���� ����]","","��a + "+configYaml.getString("Death.Spawn_Item.SetHealth")+" �����","��c - ����ġ "+configYaml.getString("Death.Spawn_Item.PenaltyEXP")+" ����","��c - ������ "+configYaml.getString("Death.Spawn_Item.PenaltyMoney")+" ����","","��e[�� Ŭ���� ����]"), 16, inv);
		if(configYaml.getInt("Death.Track")==-1||configYaml.contains("Death.Track")==false)
			removeFlagStack("��3��l[��� BGM]", 166,0,1,Arrays.asList("��c[����]","��7��� BGM�� �������� �ʾҽ��ϴ�."), 19, inv);
		else
			removeFlagStack("��3��l[��� BGM]", 2264,0,1,Arrays.asList("��a"+configYaml.getInt("Death.Track")+"�� Ʈ�� ���"), 19, inv);
		
		if(configYaml.getBoolean("Death.DistrictDirectRevive"))
			removeFlagStack("��3��l[�ٽ� �Ͼ��]", 166,0,1,Arrays.asList("��c[�Ұ���]","��7���ڸ� ��Ȱ �ɼ��� ������� �ʽ��ϴ�."), 21, inv);
		else
			removeFlagStack("��3��l[�ٽ� �Ͼ��]", 2264,0,1,Arrays.asList("��a[����]","��7���ڸ� ��Ȱ �ɼ��� ����մϴ�."), 21, inv);
		if(configYaml.getBoolean("Death.SystemOn")==false)
			removeFlagStack("��3��l[��� �ý���]", 166,0,1,Arrays.asList("��c[�� Ȱ��ȭ]","��7��� �ý����� ������� �ʽ��ϴ�."), 31, inv);
		else
			removeFlagStack("��3��l[��� �ý���]", 397,0,1,Arrays.asList("��a[Ȱ��ȭ]","��7��� �ý����� ����մϴ�."), 31, inv);
		removeFlagStack("��3��l[���� ������]", 288,0,1,Arrays.asList("��7�ൿ �Ҵɵ� �÷��̾","��7�ٽ� ������ �����ִ�","��7ġ�� �������� �����մϴ�.","","��e[�� Ŭ���� Ȯ�� �� ����]"), 23, inv);
		removeFlagStack("��3��l[��Ȱ ������]", 399,0,1,Arrays.asList("��7�ൿ �Ҵ��� �Ǿ��� ���","��7���ڸ����� ��Ȱ �� �� �ִ�","��7���ڸ� ��Ȱ �������� �����մϴ�.","","��e[�� Ŭ���� Ȯ�� �� ����]"), 25, inv);
		
		removeFlagStack("��f��l���� ���", 323,0,1,Arrays.asList("��7���� ȭ������ ���ư��ϴ�."), 45, inv);
		removeFlagStack("��f��l�ݱ�", 324,0,1,Arrays.asList("��7â�� �ݽ��ϴ�."), 53, inv);
		player.openInventory(inv);
	}
	
	public void opBoxGuiSettingReviveItem(Player player)
	{
		YamlLoader configYaml = new YamlLoader();
		configYaml.getConfig("config.yml");

		String uniqueCode = "��1��0��1��0��6��r";
		Inventory inv = Bukkit.createInventory(null, 9, uniqueCode + "��0��Ȱ ������");

		ItemStack item = configYaml.getItemStack("Death.ReviveItem");
		
		if(item != null)
			stackItem(item, 4, inv);
		
		removeFlagStack("��c��l[������ �ֱ�>", 166,0,1,null, 1, inv);	
		removeFlagStack("��c��l[������ �ֱ�>", 166,0,1,null, 2, inv);
		removeFlagStack("��c��l[������ �ֱ�>", 166,0,1,null, 3, inv);	
		removeFlagStack("��c��l<������ �ֱ�]", 166,0,1,null, 5, inv);
		removeFlagStack("��c��l<������ �ֱ�]", 166,0,1,null, 6, inv);	
		removeFlagStack("��c��l<������ �ֱ�]", 166,0,1,null, 7, inv);
		
		removeFlagStack("��f��l���� ���", 323,0,1,Arrays.asList("��7���� ȭ������ ���ư��ϴ�."), 0, inv);
		removeFlagStack("��f��l�ݱ�", 324,0,1,Arrays.asList("��7â�� �ݽ��ϴ�."), 8, inv);
		player.openInventory(inv);
		return;
	}

	public void opBoxGuiSettingRescueItem(Player player)
	{
		YamlLoader configYaml = new YamlLoader();
		configYaml.getConfig("config.yml");

		String uniqueCode = "��1��0��1��0��7��r";
		Inventory inv = Bukkit.createInventory(null, 9, uniqueCode + "��0���� ������");

		ItemStack item = configYaml.getItemStack("Death.RescueItem");
		
		if(item != null)
			stackItem(item, 4, inv);
		
		removeFlagStack("��c��l[������ �ֱ�>", 166,0,1,null, 1, inv);	
		removeFlagStack("��c��l[������ �ֱ�>", 166,0,1,null, 2, inv);
		removeFlagStack("��c��l[������ �ֱ�>", 166,0,1,null, 3, inv);	
		removeFlagStack("��c��l<������ �ֱ�]", 166,0,1,null, 5, inv);
		removeFlagStack("��c��l<������ �ֱ�]", 166,0,1,null, 6, inv);	
		removeFlagStack("��c��l<������ �ֱ�]", 166,0,1,null, 7, inv);
		
		removeFlagStack("��f��l���� ���", 323,0,1,Arrays.asList("��7���� ȭ������ ���ư��ϴ�."), 0, inv);
		removeFlagStack("��f��l�ݱ�", 324,0,1,Arrays.asList("��7â�� �ݽ��ϴ�."), 8, inv);
		player.openInventory(inv);
		return;
	}

	public void guideGui (Player player)
	{
		String uniqueCode = "��0��0��1��0��8��r";
		Inventory inv = Bukkit.createInventory(null, 54, uniqueCode + "��0������ ���̵�");
		
		removeFlagStack("��e��l���� �ý���", 340,0,1,Arrays.asList("��7�÷����ο��� 5���� ������ �ֽ��ϴ�.","��c["+MainServerOption.statSTR+"]","��7"+MainServerOption.statSTR+"�� �÷��̾���","��7������ �������� �����մϴ�.",ChatColor.GREEN + "["+MainServerOption.statDEX+"]","��7"+MainServerOption.statDEX+"�� �÷��̾��� �뷱�� ��","��7���� �������� ���� ǰ��,","��7���Ÿ� �������� �����մϴ�.","��9["+MainServerOption.statINT+"]","��7"+MainServerOption.statINT+"�� ������� �� ������ȣ,","��7���� ���ݷ¿� �����մϴ�.","��f["+MainServerOption.statWILL+"]","��7"+MainServerOption.statWILL+"�� �÷��̾���","��7ũ��Ƽ�ÿ� �����մϴ�.","��e["+MainServerOption.statLUK+"]","��7"+MainServerOption.statLUK+"�� ũ��Ƽ�� ��","��7��Ű �ǴϽ�, ��Ű ���ʽ� ��","��7���� 'Ȯ��'�� �����մϴ�."), 0,inv);
		removeFlagStack("��e��l��Ű �ǴϽ�", 340,0,1,Arrays.asList("��7���͸� ����Ͽ��� ���","��7���� Ȯ���� ���� �� ������ �˴ϴ�."), 1,inv);
		removeFlagStack("��e��l��Ű ���ʽ�", 340,0,1,Arrays.asList("��7ä���� �� ��� ���� Ȯ����","��7ä�� ǰ���� �� ������ �˴ϴ�."), 2,inv);
		removeFlagStack("��e��lĿ���� ������ [1]", 340,0,1,Arrays.asList("��7���� Ŀ���� ��������","��7�����ϰų� ����Ͽ�","��7������ �ҷ��� �� �ֽ��ϴ�.","","��6[��ɾ�]","��e/������"), 3,inv);
		removeFlagStack("��e��lĿ���� ������ [2]", 340,0,1,Arrays.asList("��8"+ MainServerOption.damage+", ���, ��ȣ ����","��7Ư�� �ɼ��� ���� ��������","��7�������� 0�� �� �� ȿ����","��7������� �ʽ��ϴ�.","��7�׷� ���, ���� �����ϰų�","��7�������� NPC�� ����","��7���� �޾ƾ� �մϴ�.","","��6[��ɾ�]","��e/������ ����"), 4,inv);
		removeFlagStack("��e��l���� ����", 340,0,1,Arrays.asList("��7������ �����Ͽ� ���� Ȥ��","��7PVP��, ���� ����� ���� ������","��7������ �� �ֽ��ϴ�.","��7���� ������ ���� �ֱ� �湮��","��7�������� ��Ȱ �ϰų�,","��7���� ����� Ư�� �޽�����","��7���� �� �ֽ��ϴ�.","","��6[��ɾ�]","��e/����"), 5,inv);
		removeFlagStack("��e��lNPC", 340,0,1,Arrays.asList("��7NPC ������ ��eCitizens2 ��7�÷�������","��7����Ͻô� ���� �����մϴ�.","��7NPC ���� ��, �ش� NPC�� ��Ŭ�� �Ͽ�","��7NPC�� ���� ���� ������ �� �� �ֽ��ϴ�."), 6,inv);
		removeFlagStack("��e��l����Ʈ", 340,0,1,Arrays.asList("��7���ǹڽ����� ���� ���� ����Ʈ��","��7���� ������ �����Ͻ� �� �ֽ��ϴ�.","","��6[��ɾ�]","��e/���ǹڽ�","��e/����Ʈ ������3 [Ÿ��]��e [����Ʈ �̸�]","","��3[�Ϲ�/�ݺ�/����/����/�Ѵ�]"), 7,inv);
		removeFlagStack("��e��l�̺�Ʈ", 340,0,1,Arrays.asList("��7���ǹڽ� 1�������� �ִ� ��e'�̺�Ʈ'","��7�������� Ŭ���Ͽ� ���ٸ�","��7������ Ư�� �̺�Ʈ��","��7���� �Ͻ� �� �ֽ��ϴ�.","��7�����鰣 �뷱���� �����ϸ�","��7������ �̺�Ʈ�� ���� �ݽô�."), 8,inv);
		removeFlagStack("��e��l��ų [1]", 340,0,1,Arrays.asList("��7���ǹڽ� 2�������� �ִ� ��e'��ų'","��7�������� Ŭ���Ͽ� ���ٸ�","��7���� ��ų�� �����ϰų� �����ϴ�","��7GUI ȭ���� ��Ÿ���ϴ�.","��7�̰����� ������ ���� ��ų����","��7������ �ֵ� �ý��ۿ� ���� �з��Ͽ�","��7���� ������ ��� �����ϰ� �Ǹ�","��7��ų�� ��dĿ�ǵ��7�� ����� �� ������,","��3MagicSpells �÷����Ρ�7����3 ������7�մϴ�."), 9,inv);
		removeFlagStack("��e��l��ų [2]", 340,0,1,Arrays.asList("��7��ų�� ���� �ϼ̴ٸ�","��7��ų ��ũ�� ����� �����Դϴ�.","��7��ų ��ũ�� ����̴ٸ�","��7������ ��ų ��ũ�� �´�","��7Ŀ�ǵ� Ȥ�� ���������� ����,","��7��ũ���� ��� ���� ���ʽ� ����,","��7��ũ���� �ʿ��� ��ų ����Ʈ ��","��7�پ��� �ɼ��� �����Ͻ� �� �ֽ��ϴ�."), 10,inv);
		removeFlagStack("��e��l����, �׸��� �ý��� [1]", 340,0,1,Arrays.asList("��eGoldBigDragon_Advanced","��7(���� GBD_A)","��7�÷����ο��� �� ���� ���� �ý�����","��7�����մϴ�. "+ChatColor.STRIKETHROUGH+"(���̺긮�� �÷�����)","��7�� ���� Ư���� ����ϸ鼭��","��7���� �ٸ��⿡, �ý��� �����","��7���Ǹ� ���մϴ�."), 11,inv);
		removeFlagStack("��e��l����, �׸��� �ý��� [2]", 340,0,1,Arrays.asList("��c��l[������ ���丮]","��7ù ��°�� �˾ƺ��� �ý�����","��7�����в� ģ���� ������","��7�����ý��丮�� ������","��7�����ý��丮�� �ý����Դϴ�.","��7���� ���� ���� ���� Ŭ������","��7�����Ͻ� �� ������,","��7���� Ŭ���� ������ �Ǵٽ�","��72�� ����, 3�� ������ ����","��7�±� ������ �����մϴ�.","��7���� ���� �� �±޺��� ��������","��7��ų�� �ο��� �� �ְ� �Ǹ�,","��7������ ��, ���� ����Ʈ�� �����ϸ�","��7������ ������ ���ϴ� ����","��7���������ν� �������ϴ�.","��7������ ��5Citizens �÷����Ρ�7����","��7NPC�� ������ ��, �� Ŭ����","��7NPC���� â�� ������ �װ�����","��6[���� ����]��7��ư�� ���� ����","��6[���� ����]��7�� ������ ���","��7�������� �ش� NPC�� ����","��7������ Ŭ������ ������ ������ ���ϴ�."), 12,inv);
		removeFlagStack("��e��l����, �׸��� �ý��� [3]", 340,0,1,Arrays.asList("��f��l[������]","��7�� ��°�� �˾ƺ��� �ý�����","��7���� ���� �����̾���","��7������ ������ �ý����Դϴ�.","��7������ �ý����� ���","��7�����ý��丮 ó�� ������","��7���� ����Ʈ ������ ������","��7������ ������ ���� ����","��7��� ��ų�� ��� �� �ִ�","��7������ �������� ������ �ֽ��ϴ�.","��7������ ������ ���丮ó��","��7������ ������ ��ų�� ��� �ִ�","��7������ �ƴ϶�, �ڽ��� ����","��5NPC�� ��ȭ��7�� �ϰų�","��5Ư���� å��7�� �������ν�","��7��ų�� �͵��� �� �ֽ��ϴ�.","��7��ų�� ���������� ������","��7�����ǿ� ����� ��ų��","��7�����ǿ� ����� �� �����ϴ�.","��bȯ����7 �ס�5 Ư���� å��7�� ���� ������","��7���� ���̵忡�� �����ϰڽ��ϴ�."), 13,inv);
		removeFlagStack("��e��l����, �׸��� �ý��� [4]", 340,0,1,Arrays.asList("��f��l[������]","��b<ȯ��>","��7������ ���丮�� ������ ������ �ֽ��ϴ�.","��7������ �����⿡�� ������ �ִٸ�","��7��� ��ų�� ������ ���� ������.","��7�̷� ���� �غ��ϱ� ���� ��ġ��","��b'ȯ��'��7�Դϴ�.","��7ȯ���� �� ���, ���ݱ��� ����","��7��� ������ '���� ����'�� ��������,","��7�Ϲ����� ������ 1�� �ʱ�ȭ �˴ϴ�.","��7�̴� ������ �ƴ�, ��ų ����Ʈ��","��7���� ������ ���� �� �ִ� ��ġ�Դϴ�.","��7������ 1�� �ȴٸ� �ڽ��� ��ƾ� ��","��7����ġ ���� �������״ϱ��.","��7���� ĳ������ ���̰� 20���� �Ǹ�","��7ȯ���� ����������, �� �÷����ο�����","��7�Һ� �������� ��eȯ�� ���ǡ�7��","��7�����ϰ� �ֽ��ϴ�."), 14,inv);
		removeFlagStack("��e��l����, �׸��� �ý��� [5]", 340,0,1,Arrays.asList("��f��l[������]","��5<Ư���� å>","��7���ǹڽ� 2�������� �ִ�","��a�Һ� �����ۡ�7 �������� Ŭ���ϸ�","��7��ų ����Ʈ �ֹ������� ����","��7ȯ������ ������ ����","��7��κ��� �Һ� �������� ����ų�","��7������ �� ������, ���� ����帱","��5Ư���� å��7 ���� ������ �����մϴ�.","��7Ư����å�� ���, ������ �ٷ� �Ҹ� ������","��7�÷��̾ �𸣴� ��ų��","��7���� �� �ֵ��� �ϰų�,","��7Ư�� ������ �������ִ�","��7�ɷ��� ������ �ֽ��ϴ�.","��7�׷��⿡ ���� ������ �翬","��7�߿� �ŷ� ǰ���� �� ���ɼ���","��7���� �������̹Ƿ�, �����","��7������ �뷱�� �������� �ʿ���","��7������ 1������� ���Ƶ�","��7������ �ƴմϴ�.","��7�뷱���� ���� �����,","��7�̺�Ʈ�� ���� ����,","��7���� ���� ������ ������","��7������ ���Դϴ�."), 15,inv);
		removeFlagStack("��e��l����", 340,0,1,Arrays.asList("��7Ŀ���� ���������� ����","��7������ ��, ���� �ɼ���","��7���� �������� ��츸","��7������ �����ϸ�, ������","��3[���� ����]��7�� �������� ����","��7NPC���� ���� �� �ֽ��ϴ�.","��7���� ���ο��� ���ǹڽ����� ����","��7�������� ��Ͻ�Ű��","��7�ش� NPC���Լ� �ش� ������","��7�����ϰ� �˴ϴ�."), 16,inv);
		removeFlagStack("��e��l��", 340,0,1,Arrays.asList("��7������ ����� ����������","��7���� Ȯ���� ������,","��9���7 �̶�� �������� �ʿ��մϴ�.","��7���� ���ǹڽ� 2����������","��7���� ���� �� �ֽ��ϴ�."), 17,inv);
		//Stack2("��e��l", 340,0,1,Arrays.asList("��7"), 18,inv);
		removeFlagStack("��c            ��l����9��l�ס�a��l����e��l����f��lƮ            ", 403,0,1,Arrays.asList("",
				"��7�ɰ��� : ��4|||||||||||||||||||||||||||||||||||||||| [�ְ�]","��c�� ������ �������� ���� ������ȣ ���� ��","��c���� ���/��ȣ�� �������� Pain ��ų","��cŬ������ ������� �����","",
				"��7�ɰ��� : ��6||||||||||||||||||||"+ChatColor. GRAY+"||||||||||||||||||||��6 [����]","��e�� ���� ���� �𸣴� ������ ��. ����","",
				"��7�ɰ��� : ��2||||||||||"+ChatColor. GRAY+"||||||||||||||||||||||||||||||��2 [����]","��a�� ������ ����� ���ʽ��� ����","��a�ٷιٷ� ������Ʈ�� ���� ������","��a�°ų� �ֹٸ� �����̸� ���ΰ�����."), 22,inv);

		removeFlagStack("��4��l[������ ���̵�]", 389,0,1,Arrays.asList("","��b[Ŭ���� ������ URL�� �������ϴ�.]"), 36,inv);
		
		removeFlagStack("��f��l���� ���", 323,0,1,Arrays.asList("��7���� ȭ������ ���ư��ϴ�."), 45, inv);
		removeFlagStack("��f��l�ݱ�", 324,0,1,Arrays.asList("��7�۾� ������ â�� �ݽ��ϴ�."), 53, inv);
		
		player.openInventory(inv);
	}
	
	
	//���� GUIâ ���� �������� ������ ��, �ش� �����ܿ� ����� �ִ� �޼ҵ�1   -���� GUI, ���ǹڽ�, Ŀ���� ����GUI-//
	public void opBoxGuiInventoryClick(InventoryClickEvent event)
	{
		Player player = (Player) event.getWhoClicked();
		int slot = event.getSlot();
		
		if((slot >= 0 && slot <= 8)||(slot >= 45 && slot <= 53))
		{
			if(slot == 2)//���� �ð� ������
			{
				SoundEffect.playSound(player, Sound.ENTITY_CHICKEN_AMBIENT, 0.8F, 1.0F);
				Bukkit.getServer().getWorld(player.getLocation().getWorld().getName()).setTime(0);
				player.sendMessage("��6[System] : "+player.getLocation().getWorld().getName()+" ���� �ð��� ������ �����Ͽ����ϴ�!");
			}
			else if(slot == 3)//���� �ð� ������
			{
				SoundEffect.playSound(player, Sound.ENTITY_WOLF_HOWL, 0.8F, 1.0F);
				Bukkit.getServer().getWorld(player.getLocation().getWorld().getName()).setTime(14000);
				player.sendMessage("��6[System] : "+player.getLocation().getWorld().getName()+" ���� �ð��� ������ �����Ͽ����ϴ�!");
			}
			else if(slot == 4)//���� ���� ���� ����
			{
				SoundEffect.playSound(player, Sound.ENTITY_VILLAGER_YES, 0.8F, 1.0F);
				Bukkit.getServer().getWorld(player.getLocation().getWorld().getName()).setSpawnLocation((int)player.getLocation().getX(), (int)player.getLocation().getY(), (int)player.getLocation().getZ());
				player.sendMessage("��6[System] : "+player.getLocation().getWorld().getName()+" ������ ���� ������ "+(int)player.getLocation().getX()+","+(int)player.getLocation().getY()+","+(int)player.getLocation().getZ()+" �� �����Ͽ����ϴ�!");
			}
			else if(slot == 53)//�ݱ�
			{
				SoundEffect.playSound(player, Sound.BLOCK_PISTON_CONTRACT, 0.8F, 1.8F);
				player.closeInventory();
			}
			else
			{
				SoundEffect.playSound(player, Sound.ENTITY_ITEM_PICKUP, 0.8F, 1.0F);
				if(slot == 5)//���� ���� ����
				{
					Bukkit.getServer().getWorld(player.getLocation().getWorld().getName()).setStorm(false);
					Bukkit.getServer().getWorld(player.getLocation().getWorld().getName()).setWeatherDuration(180000);
					player.sendMessage("��6[System] : "+player.getLocation().getWorld().getName()+" ���� ������ �������� �����Ͽ����ϴ�!");
				}
				else if(slot == 6)//���� ���� �帲
				{
					Bukkit.getServer().getWorld(player.getLocation().getWorld().getName()).setStorm(true);
					Bukkit.getServer().getWorld(player.getLocation().getWorld().getName()).setWeatherDuration(180000);
					player.sendMessage("��6[System] : "+player.getLocation().getWorld().getName()+" ���� ������ �帲���� �����Ͽ����ϴ�!");
				}
				else if(slot == 48)//���� ������
					opBoxGuiMain(player,(byte) (Short.parseShort(ChatColor.stripColor(event.getInventory().getItem(0).getItemMeta().getDisplayName()))-1));
				else if(slot == 50)//���� ������
					opBoxGuiMain(player,(byte) (Short.parseShort(ChatColor.stripColor(event.getInventory().getItem(0).getItemMeta().getDisplayName()))+1));
			}
		}
		else
		{
			String displayName = ChatColor.stripColor(event.getCurrentItem().getItemMeta().getDisplayName());
			SoundEffect.playSound(player, Sound.ENTITY_ITEM_PICKUP, 0.8F, 1.0F);
			if(displayName.equals("Ŀ���� ������"))
				new EquipItemListGui().itemListGui(player, 0);
			else if(displayName.equals("����"))
				new monster.gui.MonsterListGui().monsterListGUI(player, 0);
			else if(displayName.equals("���� ����"))
				opBoxGuiSetting(player);
			else if(displayName.equals("����Ʈ"))
				new QuestGui().AllOfQuestListGUI(player, (short) 0,false);
			else if(displayName.equals("��ų"))
				new OPboxSkillGui().AllSkillsGUI(player,(short) 0,false,null);
			else if(displayName.equals("ī�װ� �� ����"))
				new JobGUI().chooseSystemGUI(player);
			else if(displayName.equals("�Һ� ������"))
				new UseableItemListGui().useableItemListGui(player, 0);
			else if(displayName.equals("����"))
				new area.gui.AreaListGui().areaListGui(player, (short) 0);
			else if(displayName.equals("����"))
				new dungeon.DungeonGui().DungeonListMainGUI(player, 0, 52);
			else if(displayName.equals("��ɼ� ��ü"))
				new StructureGui().StructureListGUI(player, 0);
			else if(displayName.equals("����"))
				new GambleGui().gambleMainGui(player);
			else if(displayName.equals("�׺���̼�"))
				new NavigationGui().navigationListGui(player,(short) 0);
			else if(displayName.equals("����"))
				new warp.WarpGui().warpListGUI(player, 0);
			else if(displayName.equals("���� ����"))
				new admin.WorldCreateGui().worldCreateGuiMain(player);
			else if(displayName.equals("�ʽ���"))
				new NewBieGui().newBieGuiMain(player);
			else if(displayName.equals("������"))
				new UpgradeGui().upgradeRecipeGui(player,0);
			else if(displayName.equals("�̺�Ʈ"))
				new EventGui().eventGuiMain(player);
			else if(displayName.equals("���� ����"))
			{
				YamlLoader configYaml = new YamlLoader();
				configYaml.getConfig("config.yml");
				SoundEffect.playSound(player, Sound.ENTITY_ITEM_PICKUP, 0.8F, 1.0F);
				configYaml.set("Time.LastSkillChanged", new util.NumericUtil().RandomNum(0, 100000)-new util.NumericUtil().RandomNum(0, 100000));
				if(configYaml.getBoolean("Server.Like_The_Mabinogi_Online_Stat_System")==true) {configYaml.set("Server.Like_The_Mabinogi_Online_Stat_System", false);}
				else{configYaml.set("Server.Like_The_Mabinogi_Online_Stat_System", true);}
				configYaml.saveConfig();
				opBoxGuiMain(player,(byte) 1);
				new job.JobMain().AllPlayerFixAllSkillAndJobYML();
			}
			else if(displayName.equals("�÷����� ���̵�"))
				guideGui(player);
			else if(displayName.equals("GoldBigDragonRPG"))
			{
				if(MainServerOption.serverVersion.equals(MainServerOption.currentServerVersion)&&MainServerOption.serverUpdate.equals(MainServerOption.currentServerUpdate))
				{
					SoundEffect.playSound(player,Sound.BLOCK_ANVIL_USE, 0.8F, 1.0F);
					player.sendMessage("��e[���� üũ] : ���� GoldBigDragonRPG�� �ֽ� �����Դϴ�!");
				}
				else
				{
					SoundEffect.playSound(player,Sound.BLOCK_ANVIL_USE, 0.8F, 1.0F);
					player.sendMessage("��c[���� üũ] : ���� GoldBigDragonRPG�� ������Ʈ�� �ʿ��մϴ�!");
					player.sendMessage("��c[���� ����] : "+MainServerOption.serverVersion);
					player.sendMessage("��c[�ֽ� ����] : "+MainServerOption.currentServerVersion);
					player.sendMessage("��c[���� ��ġ] : "+MainServerOption.serverUpdate);
					player.sendMessage("��c[�ֽ� ��ġ] : "+MainServerOption.currentServerUpdate);
				}
			}
			else if(displayName.equals("����"))
			{
				SoundEffect.playSound(player,Sound.BLOCK_ANVIL_USE, 0.8F, 1.0F);
				player.sendMessage("��c[���� üũ] : ���� ������Ʈ �� �����˴ϴ�!");
			}
			
		}
		return;
	}
	
	public void opBoxGuiSettingInventoryClick(InventoryClickEvent event)
	{
		Player player = (Player) event.getWhoClicked();
		int slot = event.getSlot();
		
		YamlLoader configYaml = new YamlLoader();
		configYaml.getConfig("config.yml");

		if(slot == 53)//�ݱ�
		{
			SoundEffect.playSound(player, Sound.BLOCK_PISTON_CONTRACT, 0.8F, 1.8F);
			player.closeInventory();
		}
		else
		{
			SoundEffect.playSound(player, Sound.ENTITY_ITEM_PICKUP, 0.8F, 1.0F);
			if((slot >= 10 && slot <= 13) || slot == 20 || slot == 24|| slot == 25|| slot == 28)
			{
				if(slot == 10)//��ƼƼ ����
					configYaml.set("Server.EntitySpawn", ! configYaml.getBoolean("Server.EntitySpawn"));
				else if(slot == 11)//PVP
				{
					configYaml.set("Server.PVP", ! main.MainServerOption.PVP);
					main.MainServerOption.PVP = ! main.MainServerOption.PVP;
				}
				else if(slot == 12)//���� ���� ȿ��
				{
					if(configYaml.getInt("Server.MonsterSpawnEffect")<7)
						configYaml.set("Server.MonsterSpawnEffect", configYaml.getInt("Server.MonsterSpawnEffect")+1);
					else
						configYaml.set("Server.MonsterSpawnEffect", 0);
				}
				else if(slot == 13)//Ŀ���� ���� �ı�
					configYaml.set("Server.CustomWeaponBreak", ! configYaml.getBoolean("Server.CustomWeaponBreak"));
				else if(slot == 20)//Ŀ���� ��� ��ġ/��ġ ����
					configYaml.set("Server.CustomBlockPlace", ! configYaml.getBoolean("Server.CustomBlockPlace"));
				else if(slot == 24)//���� ���� ����
				{
					configYaml.set("Server.AntiExplode", ! main.MainServerOption.AntiExplode);
					main.MainServerOption.AntiExplode = ! main.MainServerOption.AntiExplode;
				}
				else if(slot == 25)//�޼� ���� ���
				{
					configYaml.set("Server.LeftHandWeaponDamageEnable", ! main.MainServerOption.dualWeapon);
					main.MainServerOption.dualWeapon = ! main.MainServerOption.dualWeapon;
				}
				else if(slot == 28)//�� ����� ����
				{
					configYaml.set("Server.RemoveMonsterDefaultDrops",  ! main.MainServerOption.removeMonsterDefaultDrops);
					main.MainServerOption.removeMonsterDefaultDrops = ! main.MainServerOption.removeMonsterDefaultDrops;
				}
				configYaml.saveConfig();
				opBoxGuiSetting(player);
			}
			else
			{
				if(slot == 45)//���� ���
					opBoxGuiMain(player, (byte) 1);
				else if(slot == 16)//��������
					opBoxGuiBroadCast(player, (byte) 0);
				else if(slot == 21)//���� �̸� ����
					opBoxGuiStatChange(player);
				else if(slot == 22)//���� �ý��� ����
					opBoxGUIMoney(player);
				else if(slot == 23)//��� �ý��� ����
					opBoxGuiDeath(player);
				else
				{
					player.closeInventory();
					UserDataObject u = new UserDataObject();
					if(slot == 14)//���� �޽��� ����
					{
						u.setString(player, (byte)1,"JM");
						player.sendMessage("��a[SYSTEM] : ���� �޽����� �Է� �� �ּ���! (��f������a �Է½� ���� �޽��� ����)");
					}
					else if(slot == 15)//���� �޽��� ����
					{
						u.setString(player, (byte)1,"QM");
						player.sendMessage("��a[SYSTEM] : ���� �޽����� �Է� �� �ּ���! (��f������a �Է½� ���� �޽��� ����)");
					}
					else if(slot == 19)//ä�� ���� ����
					{
						if(event.isRightClick())
						{
							SoundEffect.playSound(player, Sound.BLOCK_LAVA_POP, 0.8F, 1.0F);
							configYaml.removeKey("Server.ChatPrefix");
							configYaml.saveConfig();
							player.sendMessage("��c[SYSTEM] : ���λ縦 �����Ͽ����ϴ�!");
							opBoxGuiSetting(player);
							return;
						}
						u.setString(player, (byte)1,"CCP");
						player.sendMessage("��a[SYSTEM] : ä�� ���¸� �Է� �� �ּ���!");
						player.sendMessage("��6%t%��f - ���� �ð� ��Ī�ϱ� -");
						player.sendMessage("��6%gm%��f - ���Ӹ�� ��Ī�ϱ� -");
						player.sendMessage("��6%ct%��f - ä�� Ÿ�� ��Ī�ϱ� -");
						player.sendMessage("��6%lv%��f - ���� ��Ī�ϱ� -");
						player.sendMessage("��6%rlv%��f - ���� ���� ��Ī�ϱ� - (���� ������ �����ý��丮�� ��� ���� ����.)");
						player.sendMessage("��6%job%��f - ���� ��Ī�ϱ� - (���� ������ �������� ��� ���� ����.)");
						player.sendMessage("��6%message%��f - ä�� ���� ��Ī�ϱ� -");
					}
					u.setType(player, "System");
					player.sendMessage("��6%player%��f - �÷��̾� ��Ī�ϱ� -");
					player.sendMessage("��f��l&l ��0&0 ��1&1 ��2&2 "+
					"��3&3 ��4&4 ��5&5 " +
							"��6&6 ��7&7 ��8&8 " +
					"��9&9 ��a&a ��b&b ��c&c " +
							"��d&d ��e&e ��f&f");
				}
			}
		}
		return;
	}
	
	public void opBoxGuideInventoryClick(InventoryClickEvent event)
	{
		Player player = (Player) event.getWhoClicked();
		int slot = event.getSlot();

		if(slot==53)//�ݱ�
		{
			SoundEffect.playSound(player, Sound.BLOCK_PISTON_CONTRACT, 0.8F, 1.8F);
			player.closeInventory();
		}
		else
		{
			SoundEffect.playSound(player, Sound.ENTITY_ITEM_PICKUP, 0.8F, 1.0F);
			if(slot==36)//������ ���̵�
			{
				player.closeInventory();
				player.sendMessage("��4��l[YouTube] ��f��l: ��9��lhttps://www.youtube.com/playlist?list=PLxqihkJXVJABIlxU3n6bNhhC8x6xPbORP   ��e��l[Ŭ���� ���̵� �������� ����˴ϴ�]");
			}
			if(slot==45)//���� ���
				opBoxGuiMain(player,(byte) 1);
		}
	}

	public void opBoxGuiBroadCastClick(InventoryClickEvent event)
	{
		Player player = (Player) event.getWhoClicked();
		int slot = event.getSlot();
		
		if(slot == 53)//������
		{
			SoundEffect.playSound(player, Sound.BLOCK_PISTON_CONTRACT, 0.8F, 1.8F);
			player.closeInventory();
		}
		else
		{
			SoundEffect.playSound(player, Sound.ENTITY_ITEM_PICKUP, 0.8F, 1.0F);
			if(slot == 45)//���� ���
				opBoxGuiSetting(player);
			else if(slot == 46)//���� ����
			{
				player.closeInventory();
				player.sendMessage("��3[����] : �� �ʸ��� ������ �����?");
				player.sendMessage("��e(�ּ� 1�� ~ �ִ� 3600��(1�ð�) ���� ���ڸ� �Է� �ϼ���!)");
				UserDataObject u = new UserDataObject();
				u.setType(player, "System");
				u.setString(player, (byte)1, "BMT");
			}
			else if(slot == 48)//���� ������
				opBoxGuiBroadCast(player, (byte) (Integer.parseInt(event.getInventory().getTitle().split(" : ")[1])-2));
			else if(slot == 49)//�� ����
			{
				YamlLoader broadcastYaml = new YamlLoader();
				broadcastYaml.getConfig("BroadCast.yml");
				int broadCastNumber = broadcastYaml.getKeys().size();
				broadcastYaml.set(broadCastNumber+"", "��e[���ο� �������� ���� ��]");
				broadcastYaml.saveConfig();
				player.closeInventory();
				player.sendMessage("��3[����] : ���ο� ���� ������ �Է� �� �ּ���!");
				player.sendMessage("��f��l&l ��0&0 ��1&1 ��2&2 "+
				"��3&3 ��4&4 ��5&5 " +
						"��6&6 ��7&7 ��8&8 " +
				"��9&9 ��a&a ��b&b ��c&c " +
						"��d&d ��e&e ��f&f");
				UserDataObject u = new UserDataObject();
				u.setType(player, "System");
				u.setString(player, (byte)1, "NBM");
				u.setInt(player, (byte)0, broadCastNumber);
			}
			else if(slot == 50)//���� ������
				opBoxGuiBroadCast(player, (byte) (Integer.parseInt(event.getInventory().getTitle().split(" : ")[1])));
			else if(event.isShiftClick() && event.isRightClick())
			{
				SoundEffect.playSound(player, Sound.BLOCK_LAVA_POP, 0.8F, 1.0F);
				YamlLoader broadcastYaml = new YamlLoader();
				broadcastYaml.getConfig("BroadCast.yml");
				int acount =  broadcastYaml.getKeys().size()-1;
				int number = (((Integer.parseInt(event.getInventory().getTitle().split(" : ")[1])-1)*45)+event.getSlot());
				for(int counter = number;counter <acount;counter++)
					broadcastYaml.set(counter+"", broadcastYaml.get((counter+1)+""));
				broadcastYaml.removeKey(acount+"");
				broadcastYaml.saveConfig();
				opBoxGuiBroadCast(player, (byte) (Integer.parseInt(event.getInventory().getTitle().split(" : ")[1])-1));
			}
		}
	}

	public void opBoxGuiStatChangeClick(InventoryClickEvent event)
	{
		event.setCancelled(true);
		Player player = (Player) event.getWhoClicked();

		int slot = event.getSlot();
		if(slot == 53)//������
		{
			SoundEffect.playSound(player, Sound.BLOCK_PISTON_CONTRACT, 0.8F, 1.8F);
			player.closeInventory();
		}
		else
		{
			SoundEffect.playSound(player, Sound.ENTITY_ITEM_PICKUP, 0.8F, 1.0F);
			if(slot == 45)//���� ���
				opBoxGuiSetting(player);
			else
			{
				player.closeInventory();
	
				if(slot >=9 && slot <=13)
				{
					player.sendMessage("��3[System] : ���ο� "+ChatColor.stripColor(event.getCurrentItem().getItemMeta().getDisplayName())+"�� �Է� �� �ּ���!");
					player.sendMessage("��6%enter%��f - ���� ��� ���� -");
					player.sendMessage("��6%stat%��f - ���� �̸� ���� -");
				}
				else
				{
					player.sendMessage("��3[System] : ���ο� "+ChatColor.stripColor(event.getCurrentItem().getItemMeta().getDisplayName())+" ���� �̸��� �Է� �� �ּ���!");
					player.sendMessage("��7(��� ���� �� ��ȣ ��� �Ұ�)");
				}
				UserDataObject u = new UserDataObject();
				u.setType(player, "System");
				u.setString(player, (byte)1, "CSN");
				u.setString(player, (byte)2, ChatColor.stripColor(event.getCurrentItem().getItemMeta().getDisplayName()));
			}
		}
	}

	public void opBoxGuiMoneyClick(InventoryClickEvent event)
	{
		Player player = (Player) event.getWhoClicked();
		int slot = event.getSlot();
		
		if(slot == 45)//���� ���
		{
			SoundEffect.playSound(player, Sound.ENTITY_ITEM_PICKUP, 0.8F, 1.0F);
			opBoxGuiSetting(player);
		}
		else if(slot == 53)//������
		{
			SoundEffect.playSound(player, Sound.BLOCK_PISTON_CONTRACT, 0.8F, 1.8F);
			player.closeInventory();
		}
		else if(slot == 34)//ȭ�� ��� �ʱ�ȭ
		{
			YamlLoader configYaml = new YamlLoader();
			configYaml.getConfig("config.yml");
			
			SoundEffect.playSound(player, Sound.ENTITY_IRONGOLEM_ATTACK, 0.8F, 1.0F);
			player.sendMessage("��3[System] : ȭ�� ����� �ʱ�ȭ �Ǿ����ϴ�!");

			configYaml.set("Server.Money.1.ID",348);
			MainServerOption.Money1ID = 348;
			configYaml.set("Server.Money.2.ID",371);
			MainServerOption.Money2ID = 371;
			configYaml.set("Server.Money.3.ID",147);
			MainServerOption.Money3ID = 147;
			configYaml.set("Server.Money.4.ID",266);
			MainServerOption.Money4ID = 266;
			configYaml.set("Server.Money.5.ID",41);
			MainServerOption.Money5ID = 41;
			configYaml.set("Server.Money.6.ID",41);
			MainServerOption.Money6ID = 41;
			configYaml.set("Server.Money.1.DATA",0);
			MainServerOption.Money1DATA = 0;
			configYaml.set("Server.Money.2.DATA",0);
			MainServerOption.Money2DATA = 0;
			configYaml.set("Server.Money.3.DATA",0);
			MainServerOption.Money3DATA = 0;
			configYaml.set("Server.Money.4.DATA",0);
			MainServerOption.Money4DATA = 0;
			configYaml.set("Server.Money.5.DATA",0);
			MainServerOption.Money5DATA = 0;
			configYaml.set("Server.Money.6.DATA",0);
			MainServerOption.Money6DATA = 0;

			configYaml.saveConfig();
			opBoxGUIMoney(player);
		}
		else
		{
			SoundEffect.playSound(player, Sound.ENTITY_ITEM_PICKUP, 0.8F, 1.0F);
			UserDataObject u = new UserDataObject();
			u.setType(player, "System");
			if(slot >= 28 && slot <= 33)
			{
				if(slot == 28)
					u.setInt(player, (byte)1,50);
				else if(slot == 29)
					u.setInt(player, (byte)1,100);
				else if(slot == 30)
					u.setInt(player, (byte)1,1000);
				else if(slot == 31)
					u.setInt(player, (byte)1,10000);
				else if(slot == 32)
					u.setInt(player, (byte)1,50000);
				else if(slot == 33)
					u.setInt(player, (byte)1,-1);
				player.sendMessage("��3[System] : ȭ�� ������� ������ ������ ID�� �Է� �� �ּ���!");
				u.setString(player, (byte)1, "CMID");
			}
			else
			{
				if(slot == 11)
				{
					player.sendMessage("��3[System] : �ִ� �󸶱����� ��� �����ϵ��� �ұ��?");
					player.sendMessage("��7(�ּ� 1000(1õ)�� �̻�, �ִ� 1000000000(1��)�� ����)");
					u.setString(player, (byte)1, "CDML");
				}
				if(slot == 13)
				{
					player.sendMessage("��3[System] : ���ο� ȭ�� ������ �Է� �� �ּ���!");
					player.sendMessage("��7(��� ���� �� ��ȣ ��� �Ұ�)");
					u.setString(player, (byte)1, "CSN");
					u.setString(player, (byte)2, ChatColor.stripColor(event.getCurrentItem().getItemMeta().getDisplayName()));
				}
			}
			player.closeInventory();
		}
		return;
	}

	public void opBoxGuiDeathClick(InventoryClickEvent event)
	{
		Player player = (Player) event.getWhoClicked();
		int slot = event.getSlot();

		if(slot == 53)//������
		{
			SoundEffect.playSound(player, Sound.BLOCK_PISTON_CONTRACT, 0.8F, 1.8F);
			player.closeInventory();
		}
		else
		{
			SoundEffect.playSound(player, Sound.ENTITY_ITEM_PICKUP, 0.8F, 1.0F);
			if(slot == 19)//��� BGM
			{
				YamlLoader configYaml = new YamlLoader();
			  	configYaml.getConfig("config.yml");
				if(configYaml.getInt("Death.Track")==-1||configYaml.contains("Death.Track")==false)
					new area.gui.AreaMusicSettingGui().areaMusicSettingGui(player, 0, "DeathBGM��");
				else
				{
					configYaml.set("Death.Track", -1);
					configYaml.saveConfig();
					opBoxGuiDeath(player);
				}
			}
			else if(slot == 21)//���ڸ� ��Ȱ �ɼ� �ѱ�/����
			{
				YamlLoader configYaml = new YamlLoader();
			  	configYaml.getConfig("config.yml");
				if(configYaml.getBoolean("Death.DistrictDirectRevive"))
					configYaml.set("Death.DistrictDirectRevive",false);
				else
					configYaml.set("Death.DistrictDirectRevive",true);
				configYaml.saveConfig();
				opBoxGuiDeath(player);
			}
			else if(slot == 23)//���� ������ ����
				opBoxGuiSettingRescueItem(player);
			else if(slot == 25)//��Ȱ ������ ����
				opBoxGuiSettingReviveItem(player);
			else if(slot == 31)//��� �ý��� ��/����
			{
				YamlLoader configYaml = new YamlLoader();
			  	configYaml.getConfig("config.yml");
				if(configYaml.getBoolean("Death.SystemOn"))
					configYaml.set("Death.SystemOn",false);
				else
					configYaml.set("Death.SystemOn",true);
				configYaml.saveConfig();
				opBoxGuiDeath(player);
			}
			else if(slot == 45)//���� ���
				opBoxGuiSetting(player);
			else
			{
				UserDataObject u = new UserDataObject();
				u.setType(player, "System");
				if(slot == 10)//����� �������� ��Ȱ
				{
					u.setString(player, (byte)1, "RO_S_H");
					player.sendMessage("��a[��Ȱ] : ������ �������� ��Ȱ�� ���, �� %�� ��e����¡�a�� ������ ��Ȱ �ϵ��� �ϰڽ��ϱ�?");
				}
				else if(slot == 12)//���ڸ����� ��Ȱ
				{
					u.setString(player, (byte)1, "RO_T_H");
					player.sendMessage("��a[��Ȱ] : ���ڸ����� ��Ȱ�� ���, �� %�� ��e����¡�a�� ������ ��Ȱ �ϵ��� �ϰڽ��ϱ�?");
				}
				else if(slot == 14)//���� ��û
				{
					u.setString(player, (byte)1, "RO_H_H");
					player.sendMessage("��a[��Ȱ] : ������ �޾� ��Ȱ�� ���, �� %�� ��e����¡�a�� ������ ��Ȱ �ϵ��� �ϰڽ��ϱ�?");
				}
				else if(slot == 16)//������ ���
				{
					u.setString(player, (byte)1, "RO_I_H");
					player.sendMessage("��a[��Ȱ] : �������� ����Ͽ� ��Ȱ�� ���, �� %�� ��e����¡�a�� ������ ��Ȱ �ϵ��� �ϰڽ��ϱ�?");
				}
				player.sendMessage("��7(�ּ� 1 ~ �ִ� 100)");
				player.closeInventory();
			}
		}
	}

	public void opBoxGuiRescueOrReviveClick(InventoryClickEvent event)
	{
		int slot = event.getSlot();
		Player player = (Player) event.getWhoClicked();

		if(!event.getClickedInventory().getTitle().equals("container.inventory"))
		{
			if(slot != 4)
				event.setCancelled(true);
			if(slot == 8)//������
			{
				SoundEffect.playSound(player, Sound.BLOCK_PISTON_CONTRACT, 0.8F, 1.8F);
				player.closeInventory();
			}
			else
			{
				SoundEffect.playSound(player, Sound.ENTITY_ITEM_PICKUP, 0.8F, 1.0F);
				if(slot == 0)//���� ���
					opBoxGuiDeath(player);
			}
		}
	}
	
	
	public void opBoxGuiRescueOrReviveClose(InventoryCloseEvent event, String subjectCode)
	{
		YamlLoader configYaml = new YamlLoader();
		configYaml.getConfig("config.yml");
		if(event.getInventory().getItem(4) != null)
		{
			if(subjectCode.equals("06"))//��Ȱ
			{
				configYaml.set("Death.ReviveItem", event.getInventory().getItem(4));
				MainServerOption.DeathRevive = event.getInventory().getItem(4);
			}
			else
			{
				configYaml.set("Death.RescueItem", event.getInventory().getItem(4));
				MainServerOption.DeathRescue = event.getInventory().getItem(4);
			}
		}
		else
		{
			if(subjectCode.equals("06"))//��Ȱ
			{
				configYaml.set("Death.ReviveItem", null);
				MainServerOption.DeathRevive = null;
			}
			else
			{
				configYaml.set("Death.RescueItem", null);
				MainServerOption.DeathRescue = null;
			}
		}
		if(subjectCode.equals("06"))//��Ȱ
			event.getPlayer().sendMessage("��a[SYSTEM] : ��Ȱ ������ ������ �Ϸ�Ǿ����ϴ�!");
		else
			event.getPlayer().sendMessage("��a[SYSTEM] : ���� ������ ������ �Ϸ�Ǿ����ϴ�!");
		configYaml.saveConfig();
		SoundEffect.playSound((Player)event.getPlayer(), Sound.BLOCK_ANVIL_USE, 1.0F, 1.0F);
		return;
	}
}

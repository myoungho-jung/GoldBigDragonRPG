package area.gui;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class _AreaGUIManager
{
	//Area GUI Click Unique Number = 02
	//영역 관련 GUI의 고유 번호는 02입니다.
	
	//If you want add this system, just Put it in for Main_InventoryClcik!
	//당신이 영역 관련 GUI 기능을 넣고싶을땐, 그냥 Main_InventoryClick 클래스 안에 넣으세요!
	
	public void clickRouting(InventoryClickEvent event, String subjectCode)
	{
		if(subjectCode.equals("00"))//전체 영역 목록
			new AreaListGui().areaListGuiClick(event);
		else if(subjectCode.equals("01"))//영역 설정
			new AreaSettingGui().areaSettingClick(event);
		else if(subjectCode.equals("02"))//영역 몬스터 스폰 룰 설정
			new AreaMonsterSpawnSettingGui().areaMonsterSpawnSettingClick(event);
		else if(subjectCode.equals("03"))//영역 대체 몬스터 설정
			new AreaMonsterSettingGui().areaMonsterSettingGuiClick(event);
		else if(subjectCode.equals("04"))//영역 낚시 보상 설정
			new AreaFishSettingGui().areaFishSettingClick(event);
		else if(subjectCode.equals("05"))//영역 특산품 목록
			new AreaBlockSettingGui().areaBlockSettingClick(event);
		else if(subjectCode.equals("06"))//영역 특산품 설정
			new AreaBlockItemSettingGui().areaBlockItemSettingClick(event);
		else if(subjectCode.equals("07"))//영역 몬스터 선택
			new AreaMonsterListGui().areaMonsterListGuiClick(event);
		else if(subjectCode.equals("08"))//영역 특수 몬스터 선택
			new AreaSpawnSpecialMonsterListGui().areaSpawnSpecialMonsterListGuiClick(event);
		else if(subjectCode.equals("09"))//영역 배경음 선택
			new area.gui.AreaMusicSettingGui().areaMusicSettingGuiClick(event);
	}
	
	public void closeRouting(InventoryCloseEvent event, String subjectCode)
	{
		if(subjectCode.equals("04"))//영역 낚시 보상 설정
			new AreaFishSettingGui().areafishingSettingClose(event);
		else if(subjectCode.equals("06"))//영역 특산품 설정
			new AreaBlockItemSettingGui().areaBlockItemSettingClose(event);
	}
}

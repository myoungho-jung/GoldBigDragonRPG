package party;

import org.bukkit.event.inventory.InventoryClickEvent;

public class _PartyGUIManager
{
	//Party GUI Click Unique Number = 04
	//파티 관련 GUI의 고유 번호는 04입니다.
	
	//If you want add this system, just Put it in for Main_InventoryClcik!
	//당신이 파티 관련 GUI 기능을 넣고싶을땐, 그냥 Main_InventoryClick 클래스 안에 넣으세요!
	
	public void ClickRouting(InventoryClickEvent event, String SubjectCode)
	{
		if(SubjectCode.equals("00"))//파티 메인 GUI
			new party.PartyGUI().PartyGUI_MainClick(event);
		else if(SubjectCode.equals("01"))//파티 목록 GUI
			new party.PartyGUI().PartyListGUIClick(event);
		else if(SubjectCode.equals("02"))//파티 멤버 목록 GUI
			new party.PartyGUI().PartyMemberInformationGUIClick(event);
	}
}

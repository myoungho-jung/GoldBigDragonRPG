package structure;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType;

import user.UserDataObject;

public class _StructureGUIManager
{
	//Structure GUI Click Unique Number = 0d
	//개체 관련 GUI의 고유 번호는 0d입니다.
	
	//If you want add this system, just Put it in for Main_InventoryClcik!
	//당신이 개체 관련 GUI 기능을 넣고싶을땐, 그냥 Main_InventoryClick 클래스 안에 넣으세요!
	
	public void InventoryClickRouter(InventoryClickEvent event, String InventoryName)
	{
		String Striped = ChatColor.stripColor(event.getInventory().getName().toString());
		if(event.getInventory().getType()==InventoryType.CHEST)
		{
			if(!(Striped.equals("보낼 아이템")
			))
				event.setCancelled(true);
		}
		if(InventoryName.equals("우편함"))
			new StructPostBox().PostBoxMainGUIClick(event);
		else if(InventoryName.equals("보낼 아이템"))
			new StructPostBox().ItemPutterGUIClick(event);
		else if(InventoryName.contains("게시판"))
		{
			if(InventoryName.contains("거래"))
			{
				if(InventoryName.contains("메뉴"))
					new StructTradeBoard().SelectTradeTypeGUIClick(event);
				else if(InventoryName.contains("설정"))
					new StructTradeBoard().TradeBoardSettingGUIClick(event);
				else
					new StructTradeBoard().TradeBoardMainGUIClick(event);
			}
			else
			{
				if(InventoryName.contains("설정"))
					new StructBoard().BoardSettingGUIClick(event);
				else
					new StructBoard().BoardMainGUIClick(event);
			}
		}
		else if(InventoryName.equals("판매할 아이템을 고르세요"))
			new StructTradeBoard().SelectSellItemGUIClick(event);
		else if(InventoryName.equals("구매할 아이템을 고르세요"))
			new StructTradeBoard().SelectBuyItemGUIClick(event);
		else if(InventoryName.contains("일반 아이템"))
			new StructTradeBoard().SelectNormalItemGUIClick(event);
		else if(InventoryName.equals("받고싶은 아이템을 고르세요"))
			new StructTradeBoard().SelectExchangeItem_YouGUIClick(event);
		else if(InventoryName.equals("내가 줄 아이템을 고르세요"))
			new StructTradeBoard().SelectExchangeItem_MyGUIClick(event);
		else if(InventoryName.equals("모닥불"))
			new StructCampFire().CampFireGUIClick(event);
	}
	
	public void InventoryCloseRouter(InventoryCloseEvent event, String InventoryName)
	{
		UserDataObject u = new UserDataObject();
		Player player = (Player)event.getPlayer();
		
		if(InventoryName.equals("보낼 아이템"))
			new StructPostBox().ItemPutterGUIClose(event);
		else if(InventoryName.equals("판매할 아이템을 고르세요")||InventoryName.equals("구매할 아이템을 고르세요"))
		{
			if(u.getItemStack((Player)event.getPlayer())==null)
				u.clearAll(player);
		}
		else if(InventoryName.contains("일반 아이템"))
			u.clearAll(player);
	}
	
	
	public void ClickRouting(InventoryClickEvent event, String SubjectCode)
	{
		if(SubjectCode.equals("00"))//전체 개체 목록
			new structure.StructureGui().StructureListGUIClick(event);
		else if(SubjectCode.equals("01"))//개체 타입 선택
			new structure.StructureGui().SelectStructureTypeGUIClick(event);
		else if(SubjectCode.equals("02"))//개체 방향 선택
			new structure.StructureGui().SelectStructureDirectionGUIClick(event);
		else if(SubjectCode.equals("03"))//우편함 메인
			new structure.StructPostBox().PostBoxMainGUIClick(event);
		else if(SubjectCode.equals("04"))//우편함 아이템 배송
			new structure.StructPostBox().ItemPutterGUIClick(event);
		else if(SubjectCode.equals("05"))//게시판 목록
			new structure.StructBoard().BoardMainGUIClick(event);
		else if(SubjectCode.equals("06"))//게시판 설정
			new structure.StructBoard().BoardSettingGUIClick(event);
		else if(SubjectCode.equals("07"))//거래 게시판 목록
			new structure.StructTradeBoard().TradeBoardMainGUIClick(event);
		else if(SubjectCode.equals("08"))//거래 게시판 설정
			new structure.StructTradeBoard().TradeBoardSettingGUIClick(event);
		else if(SubjectCode.equals("09"))//거래 게시판 메뉴
			new structure.StructTradeBoard().SelectTradeTypeGUIClick(event);
		else if(SubjectCode.equals("0a"))//판매할 아이템 선택
			new structure.StructTradeBoard().SelectSellItemGUIClick(event);
		else if(SubjectCode.equals("0b"))//구매할 아이템 선택
			new structure.StructTradeBoard().SelectBuyItemGUIClick(event);
		else if(SubjectCode.equals("0c"))//교환시 내가 받을 아이템 선택
			new structure.StructTradeBoard().SelectExchangeItem_YouGUIClick(event);
		else if(SubjectCode.equals("0d"))//교환시 내가 줄 아이템 선택
			new structure.StructTradeBoard().SelectExchangeItem_MyGUIClick(event);
		else if(SubjectCode.equals("0e"))//일반 아이템 목록
			new structure.StructTradeBoard().SelectNormalItemGUIClick(event);
		else if(SubjectCode.equals("0f"))//모닥불
			new structure.StructCampFire().CampFireGUIClick(event);
	}
	
	public void CloseRouting(InventoryCloseEvent event, String SubjectCode)
	{
		if(SubjectCode.equals("04"))//우편함 아이템 배송
			new structure.StructPostBox().ItemPutterGUIClose(event);
	}
}

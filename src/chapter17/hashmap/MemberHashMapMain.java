package chapter17.hashmap;

public class MemberHashMapMain {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap=new MemberHashMap();
		
		//입력에 필요한 매개변수 객체 생성
		Member2 memberLee=new Member2(1001, "이수근");
		Member2 memberSon=new Member2(1004, "손민국");
		Member2 memberPark=new Member2(1003, "박서연");
		Member2 memberHong=new Member2(1002, "홍미진");
		
		//입력
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(new Member2(1005, "이민정"));
		memberHashMap.addMember(new Member2(1005, "임민정"));
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1002);
		memberHashMap.showAllMember();

	}

}

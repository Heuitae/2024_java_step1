package chapter17.treemap;


public class MemberTreeMapMain {

	public static void main(String[] args) {
		
		MemberTreeMap memberTreeMap=new MemberTreeMap();
	    
		//입력될 MemberTree 객체 생성
				MemberTree memberLee=new MemberTree(1001, "이수근");
				MemberTree memberSon=new MemberTree(1004, "손민국");
				MemberTree memberPark=new MemberTree(1003, "박서연");
				MemberTree memberHong=new MemberTree(1002, "홍미진");
				
				//입력
				memberTreeMap.addMember(memberLee);
				memberTreeMap.addMember(memberSon);
				memberTreeMap.addMember(memberPark);
				memberTreeMap.addMember(memberHong);
				memberTreeMap.addMember(new MemberTree(1005, "이민정"));
				memberTreeMap.addMember(new MemberTree(1005, "임민정"));
				
				memberTreeMap.showAllMember();
				
				memberTreeMap.removeMember(1002);
				memberTreeMap.showAllMember();


	}

}

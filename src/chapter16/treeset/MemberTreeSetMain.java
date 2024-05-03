package chapter16.treeset;

public class MemberTreeSetMain {

	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet=new MemberTreeSet();
		
		memberTreeSet.addMember(new Member3(1003,"¼Õ¹Î±¹"));
		memberTreeSet.addMember(new Member3(1001,"¹Ú¼­ÈÍ"));
		memberTreeSet.addMember(new Member3(1002,"ÀÌÁö¿ø"));
		
		memberTreeSet.showAllMember();
		
		
		
		
		
		

	}

}

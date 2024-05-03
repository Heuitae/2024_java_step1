package chapter17.treemap;

public class MemberTree implements Comparable<MemberTree>{
	
	private int memberId;
	   private String memberName;
	   
	   public MemberTree() {
	      // TODO Auto-generated constructor stub
	   }
	   
	   public MemberTree(int memberId, String memberName) {
	      this.memberId = memberId;
	      this.memberName = memberName;
	   }

	   public int getMemberId() {
	      return memberId;
	   }

	   public void setMemberId(int memberId) {
	      this.memberId = memberId;
	   }

	   public String getMemberName() {
	      return memberName;
	   }

	   public void setMemberName(String memberName) {
	      this.memberName = memberName;

	   }
	   
	 //물리적 값
	   @Override
	   public int hashCode() {
	            return memberId;
	   }
	   
	   @Override
	   public boolean equals(Object obj) {
	      if(obj instanceof MemberTree) {
	         MemberTree member=(MemberTree)obj;
	         if(this.memberId == member.memberId) {
	            return true;
	         }
	      }
	      return false;
	   } 
	   
	   @Override
	   public String toString() {
		   return "MemberTree [memberId=" + memberId + ", memberName=" + memberName + "]";
	   }
	   
	@Override
	public int compareTo(MemberTree member) {
		// TODO Auto-generated method stub
		return this.memberId-member.memberId;
	}



}

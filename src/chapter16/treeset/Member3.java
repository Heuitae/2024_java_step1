package chapter16.treeset;

import java.util.Comparator;

public class Member3 implements Comparable<Member3>{
	
    private int memberId;
    private String memberName;

    public Member3(int memberId, String memberName) {
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

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    // 물리적 주소(16진수)
    @Override
    public int hashCode() {
        return memberName.hashCode()+memberId;
    }

    // 논리적 주소(실제 데이터 값)
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member3){
            Member3 member = (Member3) obj;
            return member.memberName.equals(memberName) && (member.memberId==memberId); // DB에 있는 member과 memberName이 같은지 물어봄
        }else{
            return false;
        }
    }

	@Override
	public int compareTo(Member3 member3) {
		
		return (this.memberId-member3.memberId);
	}

	
	
}

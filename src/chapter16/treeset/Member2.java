package chapter16.treeset;

import java.util.Comparator;

public class Member2 implements Comparator<Member2>{//TreeSet에 Member2를 지정해주었기 때문에 Comparator을 통해 지정해주어야 함

    private int memberId;
    private String memberName;

    public Member2(int memberId, String memberName) {
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
        if(obj instanceof Member2){
            Member2 member = (Member2) obj;
            return member.memberName.equals(memberName) && (member.memberId==memberId); // DB에 있는 member과 memberName이 같은지 물어봄
        }else{
            return false;
        }
    }

	@Override
	public int compare(Member2 member1, Member2 member2) {
		
		return (member1.memberId - member2.memberId)*-1;
	}
	
	
}

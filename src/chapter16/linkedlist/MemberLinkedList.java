package chapter16.linkedlist;

import java.lang.reflect.Member;
import java.util.Iterator;
import java.util.LinkedList;
/*
public class MemberLinkedList {
	
	private LinkedList<Member> linkedlist;

	
	//생성자를 통한 LinkedList객체 생성
	public MemberLinkedList() {
		linkedlist=new LinkedList<Member>();
	}
	
	
	//addMember라는 메소드 생성->Member객체를 매개변수로 하여 linkedList에 추가
	public void addMember(Member member) {
		linkedlist.add(member);
	}
	
	//removeMember
	public boolean removeMember(int MemberId) {
		Iterator<Member> ir=linkedlist.iterator();//DataBase
		
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempid= member.getMemberId();
			if(tempid==MemberId) {
				linkedlist.remove(member);
				return true;
			}
		}
		System.out.println(MemberId+"가 존재하지 않습니다.");
		return false;
	}
	//출력
	public void showAllMem() {
		
		for(Member member:linkedlist) {
			System.out.println(member);
		}
		System.out.println();
		
	}
	
}*/

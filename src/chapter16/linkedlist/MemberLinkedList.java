package chapter16.linkedlist;

import java.lang.reflect.Member;
import java.util.Iterator;
import java.util.LinkedList;
/*
public class MemberLinkedList {
	
	private LinkedList<Member> linkedlist;

	
	//�����ڸ� ���� LinkedList��ü ����
	public MemberLinkedList() {
		linkedlist=new LinkedList<Member>();
	}
	
	
	//addMember��� �޼ҵ� ����->Member��ü�� �Ű������� �Ͽ� linkedList�� �߰�
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
		System.out.println(MemberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	//���
	public void showAllMem() {
		
		for(Member member:linkedlist) {
			System.out.println(member);
		}
		System.out.println();
		
	}
	
}*/

package chapter16.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet=new TreeSet<String>();//�⺻ ��������
		
		treeSet.add("ȫ�浿");
		treeSet.add("��浿");
		treeSet.add("�̱浿");
		
		for(String str:treeSet) {
			System.out.println(str);
		}

	}

}
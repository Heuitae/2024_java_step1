package chapter16.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest1 {

	public static void main(String[] args) {
		// default�� �������̵��� �Ǿ��ִ� String/Integer������ �ڵ� �������� ���İ� ���� �˻����
		Set<String> set=new TreeSet<String>();
		
		set.add("aaa");
		set.add("fff");
		set.add("ddd");
		
		System.out.println(set);

	}

}

package chapter16.hashset;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		
		HashSet<String> hashSet=new HashSet<String>();
		//String type=> �ߺ��� ������ �ȵ�
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		
		System.out.println(hashSet);
		hashSet.add(new String("������"));
		System.out.println("-------------------------");
		System.out.println(hashSet);

	}

}

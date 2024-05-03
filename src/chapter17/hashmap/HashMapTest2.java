package chapter17.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// Map<String Integer>���� map
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		//���� ������(����, 1)����
		map.put("Ȳ", 1);
		map.put("Ȳ��", 2);
		map.put("Ȳ����", 3);
		map.put("Ȳ����Ȳ", 4);
		map.put("Ȳ����Ȳ��", 5);
		map.put("Ȳ����Ȳ����", 6);
		
		//������ �ο�
		System.out.println("�� �ο� : "+map.size());
		System.out.println();
		
		//������ �й��� �˾Ƴ���
		System.out.print("���� �й� : ");
		System.out.println(map.get("Ȳ��"));
		
		//���� ����� �й�
		Set<String> keyset=map.keySet();
		Iterator<String> keyiterator=keyset.iterator();
		
		while(keyiterator.hasNext()) {
			String key=keyiterator.next();
			int value=map.get(key);
			System.out.println("\t"+key+": "+value);
		}

	}

}

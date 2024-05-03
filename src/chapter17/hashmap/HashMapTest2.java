package chapter17.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// Map<String Integer>생성 map
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		//팀원 데이터(성함, 1)저장
		map.put("황", 1);
		map.put("황희", 2);
		map.put("황희태", 3);
		map.put("황희태황", 4);
		map.put("황희태황희", 5);
		map.put("황희태황희태", 6);
		
		//팀원의 인원
		System.out.println("팀 인원 : "+map.size());
		System.out.println();
		
		//팀원의 학번을 알아내기
		System.out.print("팀장 학번 : ");
		System.out.println(map.get("황희"));
		
		//팀원 모두의 학번
		Set<String> keyset=map.keySet();
		Iterator<String> keyiterator=keyset.iterator();
		
		while(keyiterator.hasNext()) {
			String key=keyiterator.next();
			int value=map.get(key);
			System.out.println("\t"+key+": "+value);
		}

	}

}

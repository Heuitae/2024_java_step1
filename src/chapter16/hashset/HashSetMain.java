package chapter16.hashset;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		
		HashSet<String> hashSet=new HashSet<String>();
		//String type=> 중복과 정렬이 안됨
		hashSet.add(new String("임정민"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연희"));
		hashSet.add(new String("강수진"));
		
		System.out.println(hashSet);
		hashSet.add(new String("강수진"));
		System.out.println("-------------------------");
		System.out.println(hashSet);

	}

}

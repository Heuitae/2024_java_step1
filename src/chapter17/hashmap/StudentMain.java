package chapter17.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		
		//학생정보, 점수
		Map<Student, Integer> map=new HashMap<Student, Integer>();
		
		//중복X
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "홍길동"), 85);
		map.put(new Student(3, "김민선"), 90);
		map.put(new Student(4, "서주희"), 99);
		
		System.out.println("총 인원 : "+map.size());
		
		//순환구조로 처리
		Set<Student> keyset=map.keySet();
		Iterator<Student> keyIterator=keyset.iterator();
		
		while(keyIterator.hasNext()) {
			Student key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t"+key+" : "+value);
		}
        System.out.println();
		
		Scanner scan = new Scanner(System.in);
		Student std; //����
		int input;
		String name;
		
		while(true) {
			System.out.print("�л� ��ȣ�� �Է��ϼ��� : ");
			input=scan.nextInt();
			System.out.print("�л� �̸��� �Է��ϼ��� : ");
			name=scan.next();
			std=new Student(input, name);//heap
			
			if(map.containsKey(std)) {
				System.out.println(name+" �л��� ������ : "+map.get(std)+"�� �Դϴ�.");
				break;
			}else {
				System.out.println("�ش� �л��� �����Ͱ� �������� �ʽ��ϴ�.");
			}
		}
	}

}

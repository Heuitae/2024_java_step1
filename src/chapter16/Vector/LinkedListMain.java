package chapter16.Vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<String>();
		List<String> list2=new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime=System.nanoTime();
		System.out.println("ArrayList�� ����Ǵµ� �ҿ�Ǵ� �ð� : "+(endTime-startTime)+"ns");
		System.out.println("-----------------------------------------");
		
		startTime=System.nanoTime();
		
		for(int i=0;i<10000;i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime=System.nanoTime();
		System.out.println("LinkedList�� ����Ǵµ� �ҿ�Ǵ� �ð� : "+(endTime-startTime)+"ns");

	}

}
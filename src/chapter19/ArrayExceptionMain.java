package chapter19;

public class ArrayExceptionMain {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		/*
		for(int i=0;i<=5;i++) {
			System.out.println(arr[i]);
		}*/
		
		try {
			for(int i=0;i<5;i++) {
				arr[i]=i+1; //각각의 배열방에 데이터 입력 1 2 3 4 5
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println(e);
		}finally {
			//에러가 나던 나지 않던 무조건 수행한다
			System.out.println("Finally!");
		}
		System.out.println();
		System.out.println("프로그램 종료");
	}//main

}

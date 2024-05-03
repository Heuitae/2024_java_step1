package chapter19;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		try {
			for(int i=0;i<5;i++) {
				arr[i]=i+1; //각각의 배열방에 데이터 입력 1 2 3 4 5
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("비정상 종료");

	}

}

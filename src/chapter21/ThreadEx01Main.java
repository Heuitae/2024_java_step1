package chapter21;

public class ThreadEx01Main {

	public static void main(String[] args) {
		
		ThreadEx01 t=new ThreadEx01();
		t.start(); //run() 메소드 호출되는 것과 같다
		//t.run(); //독립적인 공간이 있지만 컴파일을 하지 못함
		System.out.println("main 종료");

	}

}

package chapter21;

public class Thread_Inter_Main implements Runnable{

	public static void main(String[] args) {
		/*
		메인 클래스 시작!
		run()
		first()
		second()
		*/
		System.out.println("메인 클래스 시작!");
		Thread_Inter_Main t1=new Thread_Inter_Main();
		t1.run(); //컴파일 가능한 Runnable의 메소드
		System.out.println("==========================");
		/*
		run()
		first()
		second()
		메인 클래스 종료!
		
		**스레드 수행절차**
		메인 클래스 종료!
		run()
		first()
		second()
		*/
		Thread mThread=new Thread();
		mThread.start();
		System.out.println("메인 클래스 종료");
        
	}

	@Override
	public void run() {
		System.out.println("run() 메소드 실행");
		first();
	}
	public void first() {
		System.out.println("first() 메소드 실행");
		second();
	}
	public void second() {
		System.out.println("second() 메소드 실행");
	}

}

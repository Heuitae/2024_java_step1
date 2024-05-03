package chapter21;

public class ThreadEx01 extends Thread{

	@Override
	public void run() {
		// 프로세스 독립적으로 수행
		for(int i=0; i<10; i++) {
			System.out.println((i+1)+"번째 스레드 실행");
		}
	}

}

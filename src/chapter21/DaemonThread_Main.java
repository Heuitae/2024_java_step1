package chapter21;

public class DaemonThread_Main implements Runnable{

	static boolean autoSave=false; //자동저장기능 잠김으로 초기화
	
	public static void main(String[] args) {
		//데몬스레드
		/*
		 다른 일반 스레드의 작업을 돕는 보조적인 역할을 수행 
		 단 함께 구동중인 일반 스레드가 종료되면 데몬스레드도 종료된다.
		 */
		DaemonThread_Main dm=new DaemonThread_Main();
		Thread t=new Thread(dm);//run()을 start()로 구동 즉 스레드화 시킴
		t.setDaemon(true); //데몬스레드로 설정하면서 일반스레드가 종료되면 데몬스레드도 종료
		t.start();//run()
		
		for(int i=0;i<=15;i++) {
			//메인스레드
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
			
			if(i==3) //3초 뒤에 자동저장모드로 전환
				autoSave=true;
		}

	}//main

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}//try
			
			if(autoSave == true) {
				System.out.println("자동저장 됩니다.");
			}
		}	
	}//run()

}//class

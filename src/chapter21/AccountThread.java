package chapter21;

import java.util.Random;

public class AccountThread implements Runnable{
	
	Account acc;
	//생성자 오버로드
	public AccountThread(Account acc) {
		this.acc=acc;
	}

    @Override
    public void run() {
    	while(true) {
			try {
				Thread.sleep(5000);
			}catch(Exception e){
				e.printStackTrace();
			}
			//출금액을 난수로 발생
			int money=(new Random().nextInt(3)+1)*100;
			acc.withdraw(money);
			System.out.println("잔액 : "+acc.balance);
		}
	
	
}
}
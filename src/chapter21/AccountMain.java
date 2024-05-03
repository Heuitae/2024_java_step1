package chapter21;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc=new Account();
		Runnable r=new AccountThread(acc);
		
		//스레드화로 변환
		Thread t1=new Thread(r);
		t1.start(); //r.run();
		
		//스레드와는 상관없음
		while(true) {
			System.out.print("입금할 돈을 입력하세요 : ");
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			acc.deposit(n);
			if(acc.balance==0) {
			    break;
			}
		}

	}

}

package chapter21;

public class ThreadMulti_Main {

	public static void main(String[] args) {
		// Multi Thread
		ThreadEx03 t1=new ThreadEx03();
		ThreadEx03_1 t2=new ThreadEx03_1();
		
		t1.start();
		t2.start();

	}

}

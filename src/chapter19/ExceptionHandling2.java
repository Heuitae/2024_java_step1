package chapter19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		FileInputStream fis=null;
		//...
		//fis=new FileInputStream("a.txt");
		
		try {
			fis=new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();//자원 반납
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("end");

	}

}

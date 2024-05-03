package chapter20.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest01 {

	public static void main(String[] args) {
		//방법 1
		/*
		try(FileInputStream fis=new FileInputStream("input.txt")){
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		//방법 2
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//finally
		
		System.out.println("end");

	}//main

}

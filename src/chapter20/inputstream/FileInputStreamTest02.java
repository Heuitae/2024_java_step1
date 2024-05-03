package chapter20.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest02 {

	public static void main(String[] args) {
		//한글 깨짐
		//FileInputStream fis=null;
		FileReader fis=null;
		
		try {
			fis=new FileReader("input2.txt");
			int i;
			//fis.read() : 파일을 끝까지 읽으면 -1반환
			while((i=fis.read()) !=-1) {
				System.out.print((char)i+" ");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}//finally
		
		System.out.println("end");

	}//main

}

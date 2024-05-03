package chapter20.decorator;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		//InputStreamReader : 실시간으로 읽어오기
		try(InputStreamReader isr=new InputStreamReader(new FileInputStream("reader.txt"))) {
			// InputStreamReader isr=new InputStreamReader(System.In)
			int i;
			while((i=isr.read()) !=-1) {
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		Socket socket=new Socket();
		try {
			InputStreamReader isr=new InputStreamReader(socket.getInputStream());
		} catch (Exception e) {
			// TODO: handle exception
		}*/

	}//main

}

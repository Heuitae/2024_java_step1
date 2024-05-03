package chapter20.outputstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try(FileWriter fw=new FileWriter("writer1.txt")) {
			
			fw.write('A');
			fw.write(65);
			fw.write("65");
			
			//배열
			char[] buf= {'B', 'C', 'D', 'E', 'F', 'G'};
			//fw.write(buf);
			fw.write(buf, 2, 4);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 생성 완료!");
		
	}

}

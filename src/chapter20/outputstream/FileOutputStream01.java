package chapter20.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStream01 {

	public static void main(String[] args) throws FileNotFoundException {
		// 전체저장
		//FileOutputStream fos=new FileOutputStream("output1.txt");
		//부분저장
		FileOutputStream fos=new FileOutputStream("output2.txt");
		
		try(fos) {
			
			byte[] bs=new byte[26];
			byte data=65;//A
			
			for(int i=0;i<bs.length;i++) {
				bs[i]=data;
				data++;
			}
			
			//fos.write(bs); //전체저장
			fos.write(bs, 2, 10); //부분저장
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("저장이 완료 되었습니다.");

	}

}

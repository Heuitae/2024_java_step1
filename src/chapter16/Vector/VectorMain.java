package chapter16.Vector;

import java.util.List;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		
		List<Board> list=new Vector<Board>();
		
		//�����߰�
		Board b=new Board("����1", "����1", "�۾���1");
		list.add(b);
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		list.add(new Board("����6", "����6", "�۾���6"));
		
		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writter);
			
			//�������
			list.remove(2);
			System.out.println();
			for(int j=0;j<list.size();j++) {
				Board board1=list.get(i);
				System.out.println(board1.subject+"\t"+board1.content+"\t"+board1.writter);
			}
		}
		

	}

}

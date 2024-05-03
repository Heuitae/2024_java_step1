package chapter16.Vector;

import java.util.List;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		
		List<Board> list=new Vector<Board>();
		
		//내용추가
		Board b=new Board("제목1", "내용1", "글쓴이1");
		list.add(b);
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		list.add(new Board("제목6", "내용6", "글쓴이6"));
		
		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writter);
			
			//내용삭제
			list.remove(2);
			System.out.println();
			for(int j=0;j<list.size();j++) {
				Board board1=list.get(i);
				System.out.println(board1.subject+"\t"+board1.content+"\t"+board1.writter);
			}
		}
		

	}

}

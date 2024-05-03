package chapter16.stack_queue;

import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {
	
		Object obj;
		
		Stack<Object> st=new Stack<Object>();
		
		//입력
		if(st.empty()) {//스택이 비어있는지 확인
			for(int i=0;i<=5;i++) {
				st.push(new String("Hi"+i));
				System.out.println("입력"+i+"번째 : "+st.peek()); //peek() : 작업위치
			}
		}//if
		
		//출력
		st.pop(); //밖으로 나오는 5출력
		System.out.println("현재 Top의 위치 : "+st.peek());//현재 위치 4 (5를 밖으로 내보내서)
		st.pop(); //밖으로 나오는 4출력
		System.out.println("현재 Top의 위치 : "+st.peek());//현재 위치 3 
		
		st.push(new String("Happy"));
		System.out.println(st.peek());
		st.push(new String("Good"));
		System.out.println(st.peek());

	}

}

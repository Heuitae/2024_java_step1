package chapter16.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue=new LinkedList<Message>();
		
		//offer:입력
		messageQueue.offer(new Message("Send mail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "김유신"));
		messageQueue.offer(new Message("sendKakaotalk", "이순신"));
		
		//poll:출력
		while(!messageQueue.isEmpty());{
			Message message=messageQueue.poll();
			switch (message.command){
			case "Send mail": 
				System.out.println(message.to +"님에게 보내는 메일입니다.");
				break;
			case "sendSMS": 
				System.out.println(message.to +"님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk": 
				System.out.println(message.to +"님에게 카카오톡을 보냅니다.");
				break;
			
			}
		}

	}

}

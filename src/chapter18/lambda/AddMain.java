package chapter18.lambda;

public class AddMain {

	public static void main(String[] args) {
		// Lambda : 메서드의 이름이 없음 구현부만 존재
		Add addF = (x, y) -> x + y;// 수행문
	    System.out.println(addF.add(3, 4));

	}

}

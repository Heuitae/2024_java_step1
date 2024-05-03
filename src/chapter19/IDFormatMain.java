package chapter19;

public class IDFormatMain {
	
	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		
		try {
			if(userID == null) {
				throw new IDFormatException("아이디는 null일 수 없습니다.");
			}else if(userID.length()<8 || userID.length()>20) {
				throw new IDFormatException("아이디는 8글자 이상이거나 20글자 이하로 쓰세요.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}else if(userID.length()<8 || userID.length()>20) { //논리연산
			throw new IDFormatException("아이디는 8글자 이상이거나 20글자 이하로 쓰세요.");
		}
		this.userID = userID;//정상적인 아이디
	}
//=================================================================
	public static void main(String[] args) {
		
		IDFormatMain test=new IDFormatMain();
		/*
		String userID=null;
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) { //사용자 지정 메세지
			System.out.println(e); //코드와 메세지
			System.out.println(e.getMessage()); //메세지
		}*/
		String userID="1234567";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) { //사용자 지정 메세지
			System.out.println(e); //코드와 메세지
			System.out.println(e.getMessage()); //메세지
		}

	}

}

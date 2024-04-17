package basic.ch08;

public class UserInfo {

	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	//생성자 오버로딩이란
	//생성자의 갯수가 여러개 있다
	
	//기본생성자 형태 만들기 
	public UserInfo() {}
	
	//값을 받는 생성자 만들기
	public UserInfo(String Id) {
		userId = Id;
	}
	public UserInfo(String Id,String Name) {
		userId = Id;
		userName = Name;
		
	}
	
	//연습문제
	//1 - 매개변수 3개를 받는 생성자를 만들어라
	public UserInfo(String Id,String Name, String Pw) {
		userId = Id;
		userName = Name;
		userPassword = Pw;
	}
	//2- 매개변수 4개를 받는 생성자를 만들어라
	public UserInfo(String Id,String Name, String Pw, String Address) {
		userId = Id;
		userName = Name;
		userPassword = Pw;
		userAddress =Address;
		
	}
	
	//3- 매개변수 5개를 받는 생성자를 만들어라
	public UserInfo(String Id,String Name, String Pw, String Address,String Number) {
		userId = Id;
		userName = Name;
		userPassword = Pw;
		userAddress =Address;
		phoneNumber = Number;
	}
}

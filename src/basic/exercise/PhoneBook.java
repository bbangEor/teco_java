package basic.exercise;

public class PhoneBook {

	//속성값

	private String userName;
	private String phNumber;
	
	//생성자
	public PhoneBook(String userName,String phNumber) {
		this.phNumber=phNumber;
		this.userName=userName;
	}
	//getter setter

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

}
	

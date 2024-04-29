package basic.exercise.interfaces;

public class UserInfoClient {
	// main (메인 스레드 : 메인 작업자);
	public static void main(String[] args) {

	// 사용자에게 정보를 입력하세요 -- > Scanner활용
	String inputUserName = "홍길동";
	String inputUserPw = "asd123";
	
	// DTO : 데이터들을 받아서 (취합해서, 가공) 해서 전달하는 역할을 가지고있는 인스턴스를 말함.
	UserInfo userinfo = new UserInfo(inputUserName, inputUserPw);
	
	
	// 데이터를 받아서 IUserInfoDao를 구현한 구현 클래스 에게 전달하고자함
	
	//iUserInfoDao iUserInfoDao1 = new UserInfoMySqlDaoImpl(); // 다형성적용	
	iUserInfoDao iUserInfoDao1 = new UserInfoOracleDaoImpl(); // 다형성적용	
	
	iUserInfoDao1.insertUserInfo(userinfo);
	iUserInfoDao1.updateUserInfo(userinfo);
	iUserInfoDao1.deleteUserInfo(0);
	iUserInfoDao1.selectUserInfo();
	}//

}//

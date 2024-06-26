package useful.ch03;

public class PasswordMainTest {

	// 메인 스레드
	public static void main(String[] args) {

		Password password = new Password();

		String inputPwd = null;
		inputPwd = "ab"; // set에서 입력한 조건과 다르다면 오류발생.

		// 테스트 해보니 , 아래 코드는 실행시점에 예외가 발생되는 코드다 !
		// 해결방법
		// 1. 직접 예외처리
		// 2. 던지기!
		try {
			password.setPwd(inputPwd);
		} catch (PasswordException e) {
			System.out.println(" 우리가 정의한 password 예외가 발생");
		} catch (Exception e) {
			System.out.println(" 예외발생 : " + e.getMessage());
		}

	} // end of main

} // end of class

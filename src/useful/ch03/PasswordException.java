package useful.ch03;

// 예외클래스로 동작하게 하고싶다면?!
/**
 * 사용자 정의 예외클래스 생성
 */
public class PasswordException extends RuntimeException {

	// 생성자
	public PasswordException(String message) {
		super(message);

	}

}

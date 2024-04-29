package useful.ch03;

public class Password {

	private String pwd;

	// getter
	public String getPwd() {
		return pwd;
	}

	// setter
	public void setPwd(String pwd) throws PasswordException {

		if (pwd == null) {
			throw new PasswordException(" 비밀번호는 null 값일수 없습니다.");
		}

		if (pwd.length() < 5) {
			throw new PasswordException(" 비밀번호는 5자 이상이여야 합니다. ");
		}
		// 정규 표현식을 활용할 수 있다.
		// pw 의값이 a-z or A-Z 범주값 -> true
		// 숫자나 특수문자가 없다면 아래 sys값 출력됨.
		// pw 값에 특수문자 ! 나 숫자 10 포함함. -> false 값이 나옴
		if (pwd.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야합니다.");
		}
		//[...] : 대괄호는 문자열을 나타냄.
		// a-z, A-Z 모든 알파벳 문자열을 말한다.
		// + : 바로 앞에 표현식이 하나 이상은 반복되어야한다.
		// 즉, "Hello" "world" --> true 를 반환한다. (조건에 해당함)
		//"AI" , "bbb"(세글자미만) --> false 반환

		this.pwd = pwd;
		
	}

}

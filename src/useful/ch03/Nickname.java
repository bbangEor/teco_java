package useful.ch03;

public class Nickname {

	private String name;

	// getter
	public String getName() {
		return name;
	}

	// setter
	public void setName(String name) throws NicknameException {
		if (name == null) {
			throw new NicknameException("닉네임은 필수값 입니다!");

		}
		if (name.length() < 3) {
			throw new NicknameException(" 닉네임은 3글자 이상이여야 가능합니다.");
		}
		if (name.matches("[a-zA-Z]+")) {
			throw new NicknameException(" 닉네임에 특수문자와 숫자가 필수값 입니다!");
		}
		this.name = name;
	}

}

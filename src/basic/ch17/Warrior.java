package basic.ch17;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	// 상속을 사용할때 오버라이드 기능 사용할수있음
	@Override
	void attack() {
		System.out.println("전사가 기본공격을 합니다");
	}

	void comboAttack() {
		System.out.println("전사가 2단 공격을 합니다.");
	}
}

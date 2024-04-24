package basic.ch17;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
	}

	void fireArrow() {
		System.out.println( name + "가 불화살 공격을 합니다.");
		// name 클래스는 부모에 있는 변수이다.  super.name  < 적어도됨
	}
	void attack() {
		System.out.println( "궁수가 불화살 공격을 합니다.");
	}
}

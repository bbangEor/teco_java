package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;

	// getter, setter 메서드 만들어 보기 .
	// get
	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public double getDefense() {
		return this.defense;
	}

	public boolean getIsDie() {
		return this.isDie;
	}

	// set
	public void setName(String inputName) { // 파라미터 설계하기
		this.name = inputName;
	}

	public void setHp(int inputHp) {
		this.hp = inputHp;
	}

	public void setPower(int inputPower) {
		this.power = inputPower;
	}

	public void setDefense(double inputDefense) {
		this.defense = inputDefense;
	}

	public void setIsDie(boolean inputIsDie) {
		this.isDie = inputIsDie;
	}

}

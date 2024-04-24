package starcraft.ver02;

public class Marine {
	private String name;
	private int power;
	private int hp;
	
	public Marine(String name) {
		this.name = name;
		power =4;
		hp = 70;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// 마린이 질럿을 공격 합니다.
	public void attack(Zealot z) {
		System.out.println(this.name + " 이 " + z.getName() + " 을 공격합니다.");
		z.beAttacked(this.power);
	}

	// 자신이 공격을 당합니다.
	public void beAttacked(int power) { // 파워 값을써서 hp값을깎아주기.
		// 방어적 코드
		// hp : 80 - 75 = 5
		// hp : 5 - 75 = -70
		if (hp <= 0) {
			System.out.println("[" + this.name + "]이미 사망하였습니다.");
			hp = 0; // hp : -75 이렇게 되면 부자연. 이 시점에선 0으로 고정
			return;// 코드가 더이상 흐르지않게 막기.
		}
		hp -= power;
		}
			public void showInfo() {
				System.out.println("==== 상태창 ====");
				System.out.println("이름 : " + this.name);
				System.out.println("공격력 : " + this.power);
				System.out.println("생명력 : " + this.hp);

	} // end of main
}// end of class

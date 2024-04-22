package starcraft.ver01;

public class Zealot {

	private String name;
	private int power;
	private int hp;

	public Zealot(String name) {
		this.name = name;
		power = 1;
		hp = 80;

	}

	// getter
	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 질럿이 저글링을 공격합니다.
	public void attackZergling(Zergling z) {
		System.out.println(this.name + " 이 " + z.getName() + " 을 공격합니다.");
		z.beAttacked(this.power);
	}

	// 질럿이 마린을 공격합니다.
	public void attackMarine(Marine m) {
		System.out.println(this.name + " 이 " + m.getName() + " 을 공격합니다.");
		m.beAttacked(this.power);
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
		hp -= power; // 복합대입연산자로 간추리기
	}

	public void showInfo() {
		System.out.println("이름 :" + this.name);
		System.out.println("공격력 :" + this.power);
		System.out.println("생명력:" + this.hp);
	}
}

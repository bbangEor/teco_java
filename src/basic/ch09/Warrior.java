package basic.ch09;

public class Warrior {

	String warriorName; // 각각 전사의 이름
	int warriorHealth; // 캐릭터의 체력
	int warriorAttackPower; // 캐릭터의 공격력
	int warriorLevel; // 캐릭터의 레벨

	public Warrior(String name, int health, int power, int level) {
		warriorName = name;
		warriorHealth = health;
		warriorAttackPower = power;
		warriorLevel = level;
	}

	// 메서드 정의
	public void attack(int stronger) {
		warriorLevel++;
		warriorHealth++;
		warriorAttackPower += stronger;
	}
	public void showInfo() {
		System.out.println("전사가"+warriorAttackPower +"데미지를입혔습니다.");
		
	}
	
	
}

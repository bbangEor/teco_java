package basic.ch05;

public class WorriorMainTest {
	// 메인함수 --> JVM Stack 
	public static void main(String[] args) {

		
		// new -->예약어 () <-- 생성자
		Warrior warrior1 = new Warrior();
		Warrior warrior2 = new Warrior();
		// 메모리에 올라가면 객체라고 부름 stack 과 heap 중 객체는 heap(동적메모리영역) 에 올라감  
		//객체의 접근은 .연산자를 통해 접근가능
		
		warrior1.name = "티모";
		warrior1.health = 100;
		warrior1.attackPower = 30;
		warrior1.defensePower = 1;
		
		System.out.println("--------------------");
		
		warrior2.name = "야스오";
		warrior2.health = 120;
		warrior2.attackPower = 20;
		warrior2.defensePower = 2;
		
		System.out.println("--------------------");
		System.out.println(warrior1.name);
		System.out.println(warrior2.name);
		
		
		
		
	}

}

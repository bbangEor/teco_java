package basic.ch20;
public class Banana extends Fruit {
	
	String origin;
	
	public Banana() {
		name = "춘식이 바나나";
		price = 5000;
		origin = "한국";
	}
	
	public void saleBanana() {
		System.out.println("바나나 가격을 할인합니다!");
		price -= 1000; // 복합대입연산자를 이용해서 -1000원 깎기
	}
}

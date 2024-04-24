package basic.ch20;

public class Tiger extends Animal { // 상속
	
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 걸어요");
	}
	
	@Override
	public void eating() {
		System.out.println("호랑이가 밥을 먹습니다.");
	}
	
	
}

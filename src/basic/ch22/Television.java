package basic.ch22;

public class Television extends HomeAppliances implements RemoteController { //인터페이스 구현
// 추상메서드를 구현메서드로 변경해야함.
	
	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다");
	}
}

package basic.ch22;

public class Refrigerator extends HomeAppliances implements RemoteController,SoundEffect { 
	//RemoteController 에서 가져올수있음

	@Override
	public void turnOn() {
		System.out.println("냉장고 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고 전원을 끕니다");
	}

	@Override
	public void soundOn() {
		System.out.println("띠링~");
	}

}

package basic.ch22;

public class ToyRobot implements RemoteController,SoundEffect {

	// 속성
		int width;
		int height;
		String color;
	
	@Override
	public void turnOn() {
		System.out.println("장난감로봇의 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("장난감로봇의 전원을 끕니다");
	}

	@Override
	public void soundOn() {
		System.out.println("도도동");
	}

	
}

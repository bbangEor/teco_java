package basic.ch07;

public class Bus {

	int busNum;
	int busCost;
	String busRoute;
	
	public void number() {
		System.out.println(busNum + "번 버스입니다.");
	}
	public void cost() {
		System.out.println("요금은"+ busCost + "원 입니다.");
	}
	public void route() {
		System.out.println(busRoute + "방향입니다.");
	}
		public void showInfo() {
			System.out.println("-------상태창-------");
			System.out.println("버스번호" + busNum);
			System.out.println("버스요금 :" + busCost);
			System.out.println("버스노선 :" + busRoute);
	
	}
}

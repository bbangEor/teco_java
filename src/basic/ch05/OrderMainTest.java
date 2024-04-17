package basic.ch05;

public class OrderMainTest {

	public static void main(String[] args) {

		Order order1 = new Order();
		
		System.out.println(order1);
		
		order1.user = "김도아";
		order1.address = "부산시 범향빌딩";
		order1.number =12345;
		
		System.out.println(order1.user);
		System.out.println(order1.address);
		System.out.println(order1.number);
		
				
		
	}

}

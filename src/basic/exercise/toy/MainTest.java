package basic.exercise.toy;

public class MainTest {

	public static void main(String[] args) {
		
		Product product1 = new Lion();
		Product product2 = new Bear();
		Product product3 = new AirPod();
		
		product1.showInfo();
		product2.showInfo();
		product3.showInfo();
		
		System.out.println("------------------------------");
		
		Lion lion1 = new Lion();
		Bear bear1 = new Bear();
		AirPod airPod1 = new AirPod();
		
		Product[] products = new Product[3];
		products[0] = lion1;
		products[1] = bear1;
		products[2] = airPod1;
		
		System.out.println("-------------------------");
		
		products[0].pick();
		products[0].miss();
		products[1].pick();
		products[1].miss();
		products[2].pick();
		products[2].miss();
		
		
		
		
	}

}

package basic.ch07;

public class BusMainTest {

	public static void main(String[] args) {
		
		Bus bus1 = new Bus ();
		
		bus1.busNum = 1000;
		bus1.busCost= 1400;
		bus1.busRoute ="그린컴퓨터아카데미";
		
		bus1.number();
		bus1.cost();
		bus1.route();
		
	
	}
}

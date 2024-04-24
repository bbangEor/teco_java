package basic.ch20;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.move();
		animal.eating();
		System.out.println("----------------------");
		
		Animal 주소2 = new Tiger();
		주소2.move();
		주소2.eating();
		System.out.println("----------------------");
		
		
		Animal 주소3 = new Human();
		주소3.move();
		주소3.eating();
		((Human)주소3) .readBooks(); // 휴먼으로 강제 형변환 
		
	
		//주소3.readBooks(); // Human 안에는 readBooks 메서드가 있음. 
		//근데 오류가 나는 이유는? 
	}

}

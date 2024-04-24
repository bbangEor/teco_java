package basic.exercise.toy;

//상품 (사자인형, 곰인형, 에어팟)
public class Product {

	String name;
	int grade;

	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println(grade + "등급");
	}
	void pick() {
		System.out.println(grade + "등급, " + name +" 을 뽑았습니다!");
	}
	void miss() {
		System.out.println("놓쳤습니다");
	}
}

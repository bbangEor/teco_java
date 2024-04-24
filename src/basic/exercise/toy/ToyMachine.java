package basic.exercise.toy;
// 클래스 인형뽑기 설계하기
// 여러 상품이 존재함
// 사자인형, 곰인형, 에어팟 > product 
// 배열을 사용해서 객체들을 담아주세요
public class ToyMachine {
	
	Product product;
	
	public ToyMachine() {
		product = new Product(); // 초기화
		
	}
	
	public void pickUp() {
		product.pick();
	}
	
	public void missToy() {
		product.miss();
	}
	
}

package basic.ch02;

public class DiscontCalculater {

	public static void main(String[] args) {

		// 상수선언 -원가 , 할인율
		final double PRICE = 59.99;
		final double DISCOUNT_RATE = 0.3;
		// 할인된 가격 예상하기 (비지니스 로직)
		double discountedPrice = PRICE - (PRICE * DISCOUNT_RATE);

		
		// 최종된 가격을 정수형으로 변환 형변환 처리
		int finalPrice = (int)discountedPrice;
		System.out.println("최종 가격 : " + finalPrice);
		System.out.println("최종 가격(소수점) : " + discountedPrice);
		

		// 결과출력
		

	}

}

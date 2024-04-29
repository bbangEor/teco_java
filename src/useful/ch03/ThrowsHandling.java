package useful.ch03;

public class ThrowsHandling {

	// 메인스레드
	public static void main(String[] args) {

		Calc calc = new Calc();

		try {
			// 던져서 강제성이 발생이 되고,
			// 사용하는 사람이 직접 예외처리 핸들링을 할 수있다.
			calc.divide(10, 0);
		} catch (ArithmeticException e) { // ArithmeticException 먼저 그다음 -> Exception 적기
			System.out.println("어떤 수를 0으로 나눌수 없습니다!");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	} //

} //

class Calc {

	public int divide(int n1, int n2) throws Exception {
		// 사용자가 0을 입력하면 예외가 발생 될 수있는 코드 영역이다.
		// 해결방법
		// 1. 해당 메서드에서 직접 예외 처리를 구현한다.
		// 2. 사용하는 사람이 직접 예외 처리를 할 수 있도록, 던져 버린다.
		return n1 / n2;
	}
}

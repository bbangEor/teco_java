package basic.ch22;

public class CompleteCalc extends Calculator {
	
	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int substract(int n1, int n2) {
		return n1-n2;
	}

	@Override
	public int times(int n1, int n2) {
		return n1*n2;
	}
	
	public void showInfo() {
		System.out.println("계산완료");
	}

	// 코드테스트 메인함수 
	public static void main() {
		Calc calc = new CompleteCalc(); // 업캐스팅된 상태
		
		System.out.println(calc.add(10, 10));
		System.out.println(calc.divide(10, 0));
		System.out.println("--------------------");
		
		//calc.showInfo(); > 업캐스팅된상태라 안됨
		((CompleteCalc)calc).showInfo();
		//반복문 제어문
		if(calc instanceof CompleteCalc) {
			((CompleteCalc)calc).showInfo();
		}
	}



}

package basic.ch06;

public class Function1 {
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int sum;
		add(10,10);
		
		//함수의 호출은 모양맞추기 
		int result2 = calcSum(10, 10);
		System.out.println(result2);
	}// end of main
	
	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}
	// 연습문제
	// 파라메터 정수 2개 받을수있도록 설계
	//s1, s2 --> 반복
	// ex) 1,10 --> 55가 나와야함.
	static int calcSum(int n1, int n2) { 
		int sum = 0;
		int i;
		// n1에 7 대입 --> i값 7
		for (i = n1; i <= n2; i++) { // 횟수 100 번 동작 하는 녀석
			// 0 = 0 + 1
			// 1 = 1 + 2
			// 3 = 3 + 3
			sum = sum + i; // 5050
		}
		return sum;
		
		
	}
}

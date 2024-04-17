package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {
		
		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		double result4 = 5.0 / 3;
		//int result4 = 5.0 / 3; //고민 해볼 사항. 
		int result5 = 5 % 3;
		
		System.out.println("result1 :" + result1 );
		System.out.println("result2 :" + result2 );
		System.out.println("result3 :" + result3 );
		System.out.println("result4 :" + result4 );
		System.out.println("result5 :" + result5 );
		
		//문제 
		//1. (12+3) /3 값을 화면에 출력하기 
		//변수명 , 데이터 유형 스스로 결정하고 식 만들기
		int num1 = (12 + 3) / 3;
		System.out.println("num1 :" + num1);
		
		
		//2., (25%2) 값을 화면에 출력하기
		// 어떤 수 를 2로 나눴을때 나머지가 0 이면 짝수 1이면 홀수 
		double num2 = (25 % 2);
		System.out.println("num2 :" + num2);
		
		//3. 15를 4로 나눈후 , 그절대값 출력
		double num3 = 15 / 4 ;
		System.out.println("num3 :" + num3);
		
		int oneStepDistance = 1;
		final int ZERO_POINT = 0;
		int currentPosition = 0;
		currentPosition = ZERO_POINT + (oneStepDistance * 3);
		System.out.println(currentPosition);
		
		
		
		
		
	} // end of main

} // end of class

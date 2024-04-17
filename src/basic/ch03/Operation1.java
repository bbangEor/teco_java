package basic.ch03;
/**
 * 부호연산자
 * 단항 연산자 --> 변수에 부호를 변경 (리터럴값에 부호를 변경)
 */
public class Operation1 {

	public static void main(String[] args) {
		
		int intData = 1000;
		System.out.println(+intData);
		System.out.println(-intData);
		System.out.println("--------------");
		System.out.println(intData);
		//! 변수의 실제값이 변경되는것은 아니다 !
		
		// 메모리 공간안에 실제 값을 변경 할 수 있는 방법은?
		//대입연산자와 함께 사용하는것이다!
		
		intData = -intData;
		System.out.println("실제 변수 안에 들어있는 값 :" + intData);
		
		//연습
		int oneStepDistance = 1;
		final int ZERO_POINT = 0; //  상수를 사용할땐 대문자 권장함.
		int currentPosition = 0; // 현재 포인트값
		
		
		// 제로포인트에서 왼쪽으로 3칸 이동한 값을 출력하세요.
		//식
		currentPosition = ZERO_POINT - (oneStepDistance * 3);
		System.out.println(currentPosition);
		//결과값
		
		//절대값?
		//절대값이란 어떤 수의 크기를 나타내는것으로 그 수가 0에서 얼마나 
		//떨어져 있는지를 표시함.
		// 즉 currentPosition 절대값은 3 (왼쪽으로 3칸이동 -3 이지만 절대값은 3)
		// 어떤 수의 절대값은 그 수 가 양수이든 음수이든 상관없이 항상 양수이다.
		
		// currentPosition 값이 양수였다면 부호 연산자를 통해 변경하면 
		// 절대 값이 틀려지게 된다. 
		//그래서 , 절대값을 구하는 알고리즘을 만들어야함!
		System.out.println(-currentPosition);
		// 앞에 - 붙여서 >  3이된다. 
		
		// 자바 개발자들이 이미 만들어둔 도구임.
		Math math; // 수학과 관련된 기능들에 모음. (안정적으로 만들어진)
		System.out.println("Math 라이브러리 사용"+ Math.abs(currentPosition));
		
		
		
		
		
	} // end of main

} // end of class

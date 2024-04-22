package basic.ch04;

public class whileTest2_1 {

	public static void main(String[] args) {

		// 1 부터 5까지 덧셈 연산을 하세요.
		// 1 + 2 + 3 + 4 + 5

		int start = 1;
		int end = 5;
		int sum = 0; // 변수 메모리를 저장하는 공간
		// start가 6이되면 거짓 -> 반복문 종료
		// 특정 조건식을 만들어서 반복문을 멈추게 해야한다.
		// while(start <= 5)
		// 스타트 값이 10 일때 종료하라 .
		boolean flag = true;
		while (flag) {
			if (start == 10) {
				flag = false;
			
				//return;  -> 실행에 제어권을 반납한다.
			}
			// 첫번째 반복
			// 0 = 0 + 1
			// 3 = 1 + 2
			// 6 = 3 + 3
			// 10= 6 + 4
			// 15= 10 + 5
			sum = sum + start;
			System.out.println("sum(" + start + "):" + sum);
			start++; // 1씩증가

		} // end of while

	}// end of main

}// end of class

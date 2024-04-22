package basic.ch04;

public class whileTest2 {
	// 메인함수
	public static void main(String[] args) {

		// 특정 조건을 이용해서 반복문을 종료시킬수있어야한다.
		boolean flag = true; // 깃발
		int start = 1;
		int end = 3;
		// while(조건식 == boolean)
		while (flag) {
			if (start == end) {
				System.out.println("if 구문이 동작함");
				flag = false;
				return;
				// start 와 end 가 같아지면 flag 값을 false로 변경해주면됨!
			}
			System.out.println("start : " + start);

			start++;
		} // end of while

	} // end of main

}// end of class

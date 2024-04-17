package basic.cho4;

public class IfElseIfElse {

	public static void main(String[] args) {

		int age = 17;
		if (age <= 7) {
			System.out.println("학교에 아직 다니고 있지 않다.");
		} else if (age <= 13) {
			System.out.println("초등학교에 다니고 있다.");
		} else if (age <= 16) {
			System.out.println("중학교에 다니고 있다.");
		} else {
			System.out.println("고등학교 이상 다니거나 졸업했다.");
			// if else if else 조건사용시 주의점
			// 조건식에 담을수 있는 범위가 점점 넓어져야한다.
			// 위의 식 7  , 13 , 16 처럼
		} // end of if
	}

}

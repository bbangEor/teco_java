package basic.ch04;

public class ForTest1 {
	// 코드의 시작점
	public static void main(String[] args) {
		
		//문제 - 화면에 0~ 9까지 출력하세요
////		System.out.println("0");
////		System.out.println("1");
////		System.out.println("2");
////		System.out.println("3");
////		System.out.println("4");
////		System.out.println("5");
////		System.out.println("6");
////		System.out.println("7");
////		System.out.println("8");
////		System.out.println("9");
//		
		// 반복적인 패턴이 보인다면 반복문(for)을  생각하자.
		//0~9 까지 / true <= 10이 포함됨.
	
		for(int i = 0; i < 10; i++ ) {
			
		//반복적인 패턴에 구문을 작성한다.
		System.out.println(i);
		//계속 i +++ ...-> 9까지 true
		}// end of for
		
		
	} // end of main

} // end of class

package basic.cho4;

public class whileTest1 {
	// 코드의 시작점 메인함수
	public static void main(String[] args) {
		// ex) 1 부터 10까지 콘솔창에 숫자를 출력하고 싶다. 
		//조건식 <-- true false
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
//		
		// while 구문의 형태 예시 
		//     x <= 10  
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			//변하는수 변수 i입력.
			//while 구문은 조건식에 처리가 없다면 무한히 반복한다. 
			//i ++
			//i = i + 1;
			i += 1;
		}// end of while
		
	} // end of main

} // end of class

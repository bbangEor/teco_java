package basic.ch04;

public class ForTest2 {

	public static void main(String[] args) {

		// 화면에 구구단 2단을 출력하세요.
		int num = 2;
		System.out.println(num + "*1=" + (num * 1));
		System.out.println(num + "*2=" + (num * 2));
		System.out.println(num + "*3=" + (num * 3));
		System.out.println(num + "*4=" + (num * 4));
		System.out.println(num + "*5=" + (num * 5));
		System.out.println(num + "*6=" + (num * 6));
		System.out.println(num + "*7=" + (num * 7));
		System.out.println(num + "*8=" + (num * 8));
		System.out.println(num + "*9=" + (num * 9));
		// 자바 반복문 사용해보면 좋겠다.

		System.out.println("--------------------------------");
		// 화면에 구구단3단을 출력하기.
		num = 3; // < 변수의 효용을 이용하여 2단에서 3단으로 바꾸기
		// 언제든 접근해서 활용이 가능하기때문!
		System.out.println(num + "*1=" + (num * 1));
		System.out.println(num + "*2=" + (num * 2));
		System.out.println(num + "*3=" + (num * 3));
		System.out.println(num + "*4=" + (num * 4));
		System.out.println(num + "*5=" + (num * 5));
		System.out.println(num + "*6=" + (num * 6));
		System.out.println(num + "*7=" + (num * 7));
		System.out.println(num + "*8=" + (num * 8));
		System.out.println(num + "*9=" + (num * 9));

		System.out.println("--------------------------------");
		// 화면에 구구단 4단을 출력하기.
		num = 4; // 3단에서 4단으로 !
		System.out.println(num + "*1=" + (num * 1));
		System.out.println(num + "*2=" + (num * 2));
		System.out.println(num + "*3=" + (num * 3));
		System.out.println(num + "*4=" + (num * 4));
		System.out.println(num + "*5=" + (num * 5));
		System.out.println(num + "*6=" + (num * 6));
		System.out.println(num + "*7=" + (num * 7));
		System.out.println(num + "*8=" + (num * 8));
		System.out.println(num + "*9=" + (num * 9));

		System.out.println("--------------------------------");
		// 화면에 구구단 5단을 출력하기.
		// for 문 사용해보기
		num = 5;
		// 1~9 아홉번 반복하는 for구문.
		for (int i = 1; i < 10; i++) {
		// i = 1 (처음)
		// i = 2
		// i = 3
		System.out.println(num + "*" +i + "=" + (num * i));
		} // end of for
		System.out.println("--------------------------------");
		
		// for 구문을 활용해서 6단을 출력하기.
		num = 6;
		for (int i = 1; i<10; i++) {
		System.out.println(num + "*" + i + "=" + (num*i)) ;
		}
		
		System.out.println("--------------------------------");
		
		num = 7 ;
		for (int i =1; i < 10; i ++) {
		System.out.println(num + "*" + i +"=" + (num*i));
		}
		
		System.out.println("--------------------------------");
		
		num = 8 ;
		for (int i =1; i <10;  ) {
		System.out.println(num +"*"+ i + "=" + (num*i));
		}
		
		System.out.println("--------------------------------");
		
		num = 9 ;
		for (int i =1; i <10; i++) {
		System.out.println(num +"*"+ i + "=" + (num*i));
		} // end of for
		
	} // end of main

} // end of class

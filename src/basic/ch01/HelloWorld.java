package basic.ch01;

public class HelloWorld {
	// <- 주석, 한줄주석 (컴파일러가 무시하는 영역입니다.)

	public static void main(String[] args) {

		// 화면에(콘솔창에) 출력하라
		System.out.println("Hello World");

		System.out.println(); // 출력 후 다음줄로 넘어가는 역할
		// 숫자 0부터 9까지 화면에 하나씩 출력하세요
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		// 숫자만 쓸때는 ""안에 안써도됨 
		// 우리 일상에서는 10진수라는 개념을 주로 사용함. 
		//10진수란 뭘까?
		//0~9까지 사용하는 수
		//10 <-- 단위 1을 올리고 0부터 다시 시작하는 개념이다
		
		//2진수란 
		//0과 1로만 이루어진 숫자 체계
		//2진수로 2를 표현한다면? 
		//1--> 2 --> 단위 1을 올리고 -->10 (10진수에서 2이다.
		//2진수로 3을 표현하면,
		//1->10 =2  -> 11 =3 (10진수 =3)
		System.out.println("코드를 수정했어");
		
		
	} // end of main

}// end of class

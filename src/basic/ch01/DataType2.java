package basic.ch01;

public class DataType2 {

	public static void main(String[] args) {
		
		// 기본자료형 중 문자타입 (사실 정수형)
		// 문자를 저장하기 위한 변수를 선언할 때 사용.
		// char 타입은 단 하나의 문자만을 저장할 수 있다.
		
		char charBox;
		charBox = 'A'; // char은 홀따옴표를 사용한다.
		System.out.println(charBox);
		
		//charBox = '가나'; //대입불가 '가나 ' 두글자여서 불가능
		
		//참고 ! 두개 이상의 문자가 연속된 형태를 (String) 문자열 -> "안녕 반가워" 이런거 표현 가능.
		
		System.out.println("--------------------------------");
		System.out.println((int)charBox); // 강제 형변환.
		// 아스키코드(영어권만가능) 값이 나옴.
		// 유니코드 (한국어도 가능)
		
		//소문자 a b c 는 정수값으로 얼마?
		
		charBox ='a';
		System.out.println((int)charBox);
				
		charBox ='b';
		System.out.println((int)charBox);
		
		charBox ='c';
		System.out.println((int)charBox);
	} // end of main

} // end of class

package basic.ch01;

public class DataType1 {
	/**
	 * 데이터 타입이란 상자에 들어갈 수 있는 값의 유형과 크기를 지정하는것
	 */
	// 코드의 시작점
	public static void main(String[] args) {

		// 데이터 타입의 종류
		// 1. 기본자료형 (primitive data type)
		// 2. 참조 타입 (Reference type)

		// 기본 자료형
		// [정수형, 문자형(문자열 x), 실수형, 논리형 ] 4가지로 구분.
		// 정수형 -정수는 소수점 이하를 포함하지않는 숫자를 의미함.
		// 1, 2, -5, 100 등 모두 정수입니다.

		byte byteBox; // 1바이트 -> 네모칸 1칸은 1bit(비트) 8개 모이면 ->1byte (바이트)
		short shortBox; // 2바이트-> 16bit(비트) ->2 byte
		int intBox; // 4바이트 -> 32bit
		long longBox;// 8바이트 -> 64bit

		// 위 상자들은 정수 값을 담을 수 있는 상자인데 크기가 정해져있음.
		byteBox = -128;
		byteBox = 127; // 여기 128담으면 오류뜸 .

		shortBox = -32768;
		shortBox = 32767;

		// 약 +- 21억 까지 사용가능하다.
		// 그래서 보통 연산은 int 를 주로 사용함.
		intBox = -2147483648;
		intBox = 2147483647;

		// 약 경까지
		longBox = -9223372036854775808L;
		longBox = 9223372036854775807L; // int 값이 아니라 long 값이라고 표시 용도이다.
		// 숫자 마지막에 L은 접미사라고 합니다. 꼭 붙여야함. 안붙이면 오류남
		// 보통 오른쪽에 기술되는 수의 기본단위는 4바이트 크기인 int형으로 먼저 인지함. 
		//정수형의 기본 연산단위는 int형이다.
		
		
	
	} // end of main

} // end of class

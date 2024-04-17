package basic.ch02;


	/**
	 * 컴파일 시점과 -> .class파일을 만들어내는 과정 (javac 명령어 동작) 
	 * 런타임 시점 -> ctrl +F11 프로그램 실행 ~~~ 실행 종료까지
	 * 
	 *  자바 명령어는 프로그램을 실행시키는 명령어다. 
	 *  자바 명령어는 번역하는 과정이다. 
	 *  
	 *  자바 언어로 코드를 작성중
	 *  JDK라는 도구를 설치해야 자바 프로그래밍이 가능함 이유:여러도구들이 존재해서
	 *  JDK --> JRE (자바 프로그램 실행환경)
	 *  JRE --> JVM (자바 가상 머신)
	 *  JVM --> .class 파일을 실행시켜주는 애임.
	 *  JVM은 어떤연산을 거쳐 이진코드 (바이너리파일로 변환시켜서 수행하는 애이다.)
	 */
public class Constant {
	//메인함수 -코드의 시작점
	public static void main(String[] args) {
		
		// 상수 선언 -> 값이 정해지면 변경할수 없는 수 (값, 데이터)
		final int MAX_NUM =10;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		//MAX_NUM = 100; // 코드 오류가 날땐 컴파일 할 수가 없음. 
		//ctrl + s 를 누르면 IDE툴이 javac Constant.java 명령어를 수행한다.
		//이 명령어의 결과로 Constant.class 파일이 생성됨.
		// 이걸 하는 이유는  JVM이 이해할수있는 언어로 변경해줘야한다. 
		
		System.out.println("----------------");
		//원주율 상수로 선언
		final double PI = 3.14159;
		//원의 반지름을 상수로 선언하자 !
		final int RADIUS = 10;
		
		// 원의 둘레 계산
		System.out.println( 2 * PI * RADIUS);
		// 원의 면적 계산 (원 내부 공간크기)
		System.out.println(PI * RADIUS* RADIUS);
		// literal (리터럴) 은 상수의 다른이름
		
	} // end of main

} // end of class

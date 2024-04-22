package basic.ch14;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 배열이란?
		// 연관된 데이터를 모아서 통으로 관리하기 위한 데이터 타입! 
		
		// 배열 특징 (중요)
		// 배열은 사용하기 전에 반드시 몇개의 데이터가 들어갈지
		// 크기를 지정해야 사용할 수 있다.
		
		// 배열 메모리 공간 만들기 
		int [] numbers = new int[3]; // 초기화된것임 . 주소 numbers. < 를 통해서 접근됨.
		int intBoxes[] = new int[5]; // 위아래 두 형식 다 사용가능.
		
		//값넣기 .(초기화 )
		// 배열 길이 -> 3 인덱스 길이 (n-1) ->  2 
		numbers[0] = 1000;  // 인덱스 연산을 함. 첫번째 인덱스에 1000 값을 넣음
		numbers[1] = 1001;  	
		numbers[2] = 1002;  	
		
		//numbers[3] = 1003;  --> 인덱스의 길이 (2)를 초과해서 오류가 발생. 
		//사전기반지식 -  모든 프로그래밍의 인덱스 번호의 시작은 0부터 시작한다.
		
		
		//배열에 선언과 동시에 초기화 
		int[] grades = new int[] {5,3,1}; // 배열의 크기 3 .인덱스길이 2
		int[] grades2 = {5,3,1}; // new int [] < 생략이 가능함. 
		
		// 문제1 
		// 5개의 크기를 가지는 double 타입의 배열을 선언하세요.
		//배열의 이름은 마음대로 작성하세요.
		double[]num = new double[5];
		
		// 문제2 
		// 문제1에서 선언한 배열의 값을 인덱스 1~2까지 초기화 하세요.
		// 값은 아무거나 상관없음.
		num[0] = 10.0;
		num[1] = 20.0;
		num[2] = 30.0;
		// 값을 넣지않은 4 5 는 0.0 으로 초기화되어있음
		
		// 문제3
		// String 타입의 배열을 선언, 배열에 크기는 3개 
		// 선언과 동시에 초기화하세요.
		String[]textBoxes =  new String[] {"가","나","다"};
		String[]textBoxes2 = {"가","나","다"}; // 생략해도됨.
		
	}// end of main

}// end of class
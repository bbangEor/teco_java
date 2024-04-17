package basic.ch02;
/** 
 * 형 변환이란?
 * 데이터 타입을 다른 타입으로 변경하는것 
 * 자동 형변환, 강제 형변환
 */
public class TypeConversion {
	//메인함수
	public static void main(String[] args) {
	int intDataBox =100; //4 byte
	double doubleDataBox; // 8byte
	
	doubleDataBox = intDataBox;
	// 작은 상자에서 큰 상자로 들어가는 개념이다.
	//100
	System.out.println(doubleDataBox);
	// 자동 형 변환이다.
	
	System.out.println("---------------------------");
	
	
	
	//강제 형변환은 ?
	final double PI = 3.14159;
	//int intBox = PI; // 컴파일러가 작은 상자에 큰 상자로 값을 넣을수 없어서 생기는 오류
	// 컴파일러한테 강제로 넣어달라고하는법
	int intBox = (int) PI;  
	//강제로 해달라고 해서 강제로 변환함! 대신 데이터 손실이 발생할 수도 있음! 
	System.out.println(intBox);
	// 원래 3.14159 가 나와야하는데 소수점값을 버려버림.
	
	
	//연습 
	double interestRate;
	int discount;
	
	interestRate = 15.5;
	// discount 에 강제 형변환으로 값을 넣어보기 ! 
	
	discount = (int)interestRate;
	System.out.println(discount);
	// 역시 15.5 에서 소수점값 잘려서 나옴. 데이터 손실 발생.
	System.out.println( (int)7.5);
	// 값 7로 출력됨.
	
	
	
	
	
	
	
	
	
		
	} // end of main

} // end of class

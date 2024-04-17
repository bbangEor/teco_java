package basic.cho4;

import java.util.Scanner;

public class EvenSumCalculator {
	//코드의 시작점 메인함수
	public static void main(String[] args) {
	//crtl + shift + o
	Scanner sc = new Scanner(System.in);
	System.out.println("정수값을 입력하세요 : ");
	int maxNumber = sc.nextInt();
	// 1<---      10 -> 2 + 4 + 6 + 8 +10 ;
	int sum = 0;
	
	//초기값(i)부터 입력한 값까지 반복적인 패턴이 보임.
	//반복문 사용할수있음.
	//1~10 까지 10번 반복함.  
	//초기값 2부터 시작 i+=2 로 2칸씩 넘어감. 그럼짝수만 더할수있음.
	for(int i = 2; i <= maxNumber; i += 2 ) {
	// 1 = 0 + 1;
	// 3 = 1 + 2;
	// 6 = 3 + 3;
	 sum = sum + i ;
	}
	System.out.println("sum :" + sum + "\n");
	// 역슬래쉬 n 은 한줄내리기
	 
	
	
	
	
	
	}// end of main

} // end of class

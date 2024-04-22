package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {
	// 코드의 시작점 메인함수
	public static void main(String[] args) {
		// 사용자의 입력값을 받아서 1부터 x 까지 숫자에 홀수를 덧셈하고 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 값을 입력하세요. : ");
		int maxNumber = sc.nextInt();
		int sum = 0;
		
		for (int i = 1 ;  i <= maxNumber; i+=2 ) {
		sum = sum + i;
		} // end of for
		System.out.println("sum :" + sum + "\n");
	
	
		
	} // end of main

} // end of class

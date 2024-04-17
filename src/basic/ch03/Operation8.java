package basic.ch03;
/** 
 * 삼항연산자 (조건연산자 )
 * int num = 조건식 ? 결과1 : 결과2
 */
import java.util.Scanner;

public class Operation8 {

	public static void main(String[] args) {
	System.out.println("입력받은 두 수 중에 큰수를 출력하세요");
	
	Scanner sc = new Scanner(System.in);
	int x  =sc.nextInt(); //사용자가 입력한 값을 받아주는 녀석
	System.out.println("x의 받은 값은 :" + x);
	int y = sc.nextInt();
	System.out.println("y의 받은 값은 :" + y);
	
	System.out.println("------------------");
	
	// 삼항연산자 : 조건식 ? 결과1 : 결과2
	int max = x > y ? x : y;
	
	System.out.println("두 수중에 큰 수는 :" + max + "입니다.");
	
	//자원닫기
	sc.close();
	
	
	} //end of main

} // end of class

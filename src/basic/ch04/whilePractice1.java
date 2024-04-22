package basic.ch04;

public class whilePractice1 {
	// 메인함수
	public static void main(String[] args) {
		//1 부터 10까지 덧셈에 연산을 콘솔창에 출력 하시오 단, while 구문 작성 
		boolean flag = true; 
		int start = 1 ;
		int end = 10 ;
		// 조건식 사용
		int sum = 0;
		
		// 1 첫번째 1 부터 100 보다 작거나 같다 
		// 2
		// 3
		// 4 
		// 5    5  <=  5 -- 참
		//      5       --> 거짓 
		while(start <= 10) {
			//     0  +  1  --> sum : 1
			//     1  +  2  --> sum : 3 <-- 두번째 반복 
			//     3  +  3  --> sum : 6 <-- 세번째 반복 
			//     6  +  4  --> sum : 10<-- 네번째 반복
			//    10  +  5  --> sum : 15
			//    15  +  6  --> sum : 21
			//    21  +  7  --> sum : 28
			//    28  +  8  --> sum : 36
			//    36  +  9  --> sum : 45
			//    45  +  10 --> sum : 55
			sum = sum + start;
			System.out.println("sum("+ start +"):" + sum );
		  start = start + 1;	
		}// end of while
		
	}// end of  main

} // end of class

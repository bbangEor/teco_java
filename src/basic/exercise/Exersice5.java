package basic.exercise;

public class Exersice5 {
	//코드의 시작점 메인함수
	public static void main(String[] args) {

		//1단계 - 세로 반복에 횟수 
		//*     - 1번
		//**    - 2번 
		//***   - 3번
		//****  - 4번
		//***** - 5번
		
		for (int i = 0; i < 5; i++) { // 5번
			
		}
		
		//2단계 
		
		System.out.println("*");
		System.out.println();
		System.out.println("**");
		System.out.println();
		System.out.println("***");
		System.out.println();
		System.out.println("****");
		System.out.println();
		System.out.println("*****");
		System.out.println();
		
		System.out.println("----------------------");
		
		for (int j = 0; j < 1; j++) { //1번 동작
			System.out.print("*"); // print로 바꾸기
		}
		System.out.println(); // 줄바꿈
		
		for (int j = 0; j < 2; j++) { //2번 동작
			System.out.print("*"); // print로 바꾸기
		}
		System.out.println(); // 줄바꿈
		
		for (int j = 0; j < 3; j++) { //3번 동작
			System.out.print("*"); // print로 바꾸기
		}
		System.out.println(); // 줄바꿈
		
		for (int j = 0; j < 4; j++) { //4번 동작
			System.out.print("*"); // print로 바꾸기
		}
		System.out.println(); // 줄바꿈
		
		for (int j = 0; j < 5; j++) { //5번 동작
			System.out.print("*"); // print로 바꾸기
		}
		System.out.println(); // 줄바꿈
		
		System.out.println("----------------");
		
		//3단계
		// outer for
		for (int i = 0; i < 5; i++) {
			//inner for
			//첫번째 동작 j = 0, j <= 0  ---> 1번 동작 -> * 출력 -> 줄바꿈
			//두번째 동작 j = 0, j <= 1  ---> (0.1) 2번 동작 ->** 출력 -> 줄바꿈
			//세번째 동작 j = 0, j <= 2  ---> (0.1,2) 3번 동작 ->*** 출력 -> 줄바꿈
			//네번째 동작 j = 0, j <= 3  ---> (0.1,2,3) 4번 동작 ->**** 출력 -> 줄바꿈
			//다섯번째 동작 j = 0, j <= 4  ---> (0.1,2,3,4) 5번 동작 ->***** 출력 -> 줄바꿈
			
			for (int j = 0; j < i; j++) { //5번 동작
				System.out.print("*"); // print 로 바꾸기
			}
			System.out.println(); // 줄바꿈
		}
		
	} //end of main

} // end of class

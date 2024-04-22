package basic.ch04;

public class breakTest1 {
	//코드의 시작점 메인함수 
	public static void main(String[] args) {
  
		// 중간에 멈추는 break문
		// 소수 7이면 반복문을 멈추어라
		for (int i = 1; i < 11; i++) {
			System.out.println("i의값 :" + i);
			if((i % 7) == 0) {
				 //break; // 중간에 멈추고 반복문 하나를 빠져나옴
				return; //브레이크와 리턴의 차이: 리턴은 실행의 제어권을 반납.  
		}
		}
		
	} // end of main

	}// end of class

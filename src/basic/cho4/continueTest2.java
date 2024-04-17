package basic.cho4;

public class continueTest2 {

	public static void main(String[] args) {
		//풀이 1 
		
//		int i = 1;
//		while (i < 101) {
//			if ((i % 3) == 0) {
//				System.out.println("i의 값 :" + i);
//			}	
//			i++; // 증감 식 사용 (무한반복예방)
		
		//풀이 2 특정조건이 되었을때 반복문을 멈춰라.
		int i =1;
		boolean flag = true ;
		while(flag) {
			if ( i % 3 == 0) {
			System.out.println("3의 배수 :" + i);
			}
			
			//특정 조건 --> 멈추기
			if(i == 100) {
			   flag = false;
			}
				
			i++;
			

		}
	}// end of main

}// end of class

package basic.ch04;

public class breakTest2 {
	// 코드의 시작점 메인함수
	public static void main(String[] args) {

		// for 문 대신에 while 문으로 대신해서 결과 출력
		int i = 1;
		while (i < 11 ) {
			// 단독 if문은 수행이 될 수 도 있고 안될수도있다.
			if(i % 7 ==0) {
				//중간에 멈추는법 ->break
				break;
			}
			System.out.println("i의값 :" + i);
			
			i++; // 무한반복 안되고싶음 해라. 
		} //10번 반복하는 while문 

	} // end of main

} // end of class

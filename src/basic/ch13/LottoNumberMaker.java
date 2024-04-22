package basic.ch13;

import java.util.Random;

public class LottoNumberMaker {
 
	//멤버변수 
	private String version = "1.0.0"; // 버전 표기
	
	// 함수 
	public static void main(String[]args) {
		
		System.out.print(makeNumber()+"\t"); // 45 사이의 랜덤한 숫자 발생
		System.out.print(makeNumber()+"\t"); 
		System.out.print(makeNumber()+"\t"); 
		System.out.print(makeNumber()+"\t"); 
		System.out.print(makeNumber()+"\t"); 
		System.out.print(makeNumber()+"\t"); 
		// 아직은 중복값이 나올순 있음!
		//오름차순(작은수 -> 큰수) 정렬도 안되어있음.
		
		
	} // end of main
	
	//인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		//static함수안에 멤버변수를 사용할수 없다. 메모리가 뜨는순서 !
		//System.out.println("ver : " + version); 
		// 멤버변수 는 객체가 메모리에올라가야 사용가능.
		// 자바 도구 = 표준 API
		// 난수 발생기 -> 랜덤값을 생성해줌.
		Random random = new Random();
		int resultNumber = random.nextInt(45)+1; // 0 ~~~~ 44
		return resultNumber;
	}
	
	
	
	
}

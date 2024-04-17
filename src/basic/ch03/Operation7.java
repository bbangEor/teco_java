package basic.ch03;


/** 
 * 빠른 평가란?
 * 논리 연산에 있어 첫번째 조건이 결과를 결정할때 
 * 두번째 조건을 평가하지않는것을 의미한다.
 * 
 */
public class Operation7 {

	public static void main(String[] args) {
	
		int number = 5 ;
		int index = 0 ;
		
		//빠른 평가가 동작하는 식을 만들어보자.
		// 기존의 5의값에 +10= 15 <10 -> F  
		//                           15           < 10
		boolean result = ((number = number = 10 ) < 10 ) && ((index = index +2) < 10);
		System.out.println("현재 넘버 변수에 값은 :" + number);
		System.out.println("현재 index 변수에 값은 :" + index);
		
		System.out.println("------------------");
		
		// number 값 재설정 
		number = 5;
		//논리 합을 이용한 빠른 평가식을 만들어보자. 
		//                F                               
		result =((number +=10)< 10) || ((index +=2)< 10);
		
		//문제
		System.out.println("number :" + number);
		System.out.println("index :" + index);
	
		// 도전문제 number 와 index 를 반대로 변경해서출력해보자.
		
		
		
	}

}

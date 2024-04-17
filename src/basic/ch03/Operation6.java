package basic.ch03;


/** 
 * 논리 연산자 
 * 관계 연산자와 혼합하여 많이 사용된다 .
 * 연산에 결과는 true flase 으로 반환된다.
 *  
 */
public class Operation6 {

	public static void main(String[] args) {
	// 논리 연산자는 3가지 종류가 있다.
	// 논리곱 ---> && ( 엠퍼센트 ,엠퍼센트 )
	// 논리합 ---> || (버티컬 바, 버티컬 바)
	// 부정 ---> ! 
		
		int num1 =10;
		int num2 =20;
		
		//1. 논리곱(&&)
		//                 T     &&    T
		// 논리곱은 전부 트루 이면. 트루 반환. 하나라도 거짓이면 false 반환.
		boolean flag1 = (num1>0) && (num2>0);
		System.out.println("flag 1 :" + flag1);
		
		//       F    =     T     &&     F
		boolean flag2 = (num1 > 0) && (num2<0);
		
		System.out.println("-------------------------");
		
		//2. 논리합
		//      T     =    T     ||    F
		// 둘중 하나라도 트루면 결과는 무조건 트루.
		boolean flag3 = (num1>0) || (num2<0);
		System.out.println(flag3);
		
		//3. 부정
		System.out.println("부정 논리 연산자 사용 :"+ !flag3);
		//연산의 결과를 확인해봐야함 -- 로깅 한다
		//부정은 앞에 ! < 붙이면됨. 
		System.out.println("flag3 : " + flag3);
		
		//논리곱과 논리합은 앞의 항 결과에 따라 뒤 항 결과를 평가하지않음. 
		
		
		
	
		
		
	}

}

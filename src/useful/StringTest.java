package useful;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // false
		
		String str3 = "abc";
		String str4 = "abc"; // 불변
		
		//상수 풀에 올라간 String값은 먼저 존재하는지 확인부터 한다.
		
		
		//완전 똑같은 문자열 "abc" 가 존재한다면 새로 생성하지않고
		//다시 재사용한다!
		
		System.out.println(str3 == str4); // true
		
		// == -> 객체의 주소값을 비교하는 것. (참조타입)
		// equals 는 문자열 값을 비교하는것.
		// 결론! 문자열 비교는 논리적인 판단으로 
		//같은지 다른지 true , false 값을 반환한다.
		
		System.out.println(str1 == str4 ); // false 
		System.out.println( str1.equals(str4)); // true 
		
		
	}//
	
}//

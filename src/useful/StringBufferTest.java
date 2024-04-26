package useful;

public class StringBufferTest {

	//코드의 시작점 - (메인 작업자)
	public static void main (String[] args) {
		
	String str1 = new String("Hello");
	String str2 = new String("World");
	//heap 메모리에 객체를 2개 생성! 

	StringBuffer bufferStr = new StringBuffer("Hello"); //StringBuffer 라는 데이터 타입
		System.out.println(bufferStr);
		//1.
		System.out.println(System.identityHashCode(bufferStr)); // 원시 주소값 확인하기
		
		bufferStr.append(str2); // str2를 더함. 
		
		System.out.println(bufferStr);
		//2.
		System.out.println(System.identityHashCode(bufferStr));
		
		//1 번 과 2 번의 결과 주소밗이 같다는 의미는?
		//새로운 메모리를 할당 한 것이 아니라 변경한것이다.
		
		//활용
		String newStr = bufferStr.toString(); 
		//toString 을 이용해서 
		//StringBuffer -> String 으로 변환~ !  
		
	}//
	
}//

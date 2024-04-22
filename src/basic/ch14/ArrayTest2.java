package basic.ch14;

public class ArrayTest2 {

	public static void main(String[] args) {

		String[] names = new String[5]; //5칸짜리 메모리공간을 할당!  
		
		//생성 수정 삭제 조회 > 모든 프로그램의 기본.
		
		//생성 - C
		names[0] = "김씨"; //0번째 인덱스에 값을 넣음 
		names[1] = "나씨";  
		names[2] = "박씨";  
		//names[3] = null  
		//names[4] = null  
				
		//조회 - Read
		System.out.println(names);  // 주소값이 출력됨
		System.out.println(names[0]); // 인덱스 값을넣으면 출력됨 
		System.out.println(names[1]); // 인덱스 값을넣으면 출력됨 
		System.out.println(names[2]); // 인덱스 값을넣으면 출력됨 
		System.out.println(names[3]); // 인덱스 값을넣으면 출력됨 
		System.out.println(names[4]); // 인덱스 값을넣으면 출력됨 
		//System.out.println(names[5]); // 인덱스 값을 초과해서 오류발생. 
		
		
		//수정 - Update
		names[0] = "Mr. kim";
		names[1] = "Mr. Na";
		names[2] = "Mr. Park";
		
		
		//삭제 - Delete
		names[0] = null;
		names[1] = null;
		names[2] = null;
		
		
		// 자바에서 null 값은 할당되지않은 상태를 의미합니다.
		// Object 타입에서 사용가능
		
		//1단계
		// 배열의 길이와 인덱스 길이에 대한 이해 --> 인덱스의 길이는 n-1 이다.
		System.out.println("배열의 크기 : " + names.length); // name 안에 length 라는 변수
		System.out.println("인덱스 크기 : " + (names.length-1)); 
		
		//문제2
		// 배열의 크기가 50개이면 인덱스의 길이는 얼마인가 --> 0~49 까지
		// 배열의 크기가 100개이면 인덱스의 길이는 얼마인가 --> 0~99 까지
		// 배열의 크기가 375개이면 인덱스의 길이는 얼마인가 --> 0~374 까지
		
		
		
		
		
		
	}// end of main

}// end of class

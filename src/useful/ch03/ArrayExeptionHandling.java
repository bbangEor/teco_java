package useful.ch03;

public class ArrayExeptionHandling {

	// 메인 스레드
	public static void main(String[] args) {

		//런타임 시 발생할 수있는 에러를 
		//try catch 로 잡았다.
		
		
		// 런타임 에러
		int[] arr = { 1, 2, 3, 4, 5 };

		try { // 예외가 발생할 수있는 코드를 넣어서 수행
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) { // 어떤 예외를 잡을건지 catch() 안에 대입
			System.out.println("배열의 크기를 인덱스가 벗어났습니다.");
			// System.out.println(e.getMessage());

		}

		System.out.println("비정상 종료가 되지않았습니다.");

	} // end of main

} // end of class

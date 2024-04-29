package useful.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	// 메인 스레드
	public static void main(String[] args) {

		FileInputStream fis = null;

		// fis = new FileInputStream("test1.txt"); //컴파일시점에 오류발생, 예외처리 하기!
		// test1.txt 파일이 없어서!

		try {
			fis = new FileInputStream("demo.txt");
			//return;
		} catch (FileNotFoundException e) {
			System.out.println("catch 구문 실행!");
			e.printStackTrace(); // 오류가 발생한 코드를 추적해서 결과값에 출력해주는 기능!
		} finally { // 반드시 수행되어야하는 코드 영역 !
			// 심지어 return코드를 만나더라도 이 영역은 수행이 됨!
			System.out.println("finally 블록 수행! "); // 수행됨!
			try {
				fis.close();// 닫는 시점에 fis. <-- 객체가 생성되지않았을 수도 있다.그래서 닫을 필요도 없다. 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

		System.out.println("비정상 종료가 되지않았습니다."); // 리턴 구문때문에 수행안됨!ㄴ

	} //

} //

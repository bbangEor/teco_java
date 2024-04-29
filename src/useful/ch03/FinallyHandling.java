package useful.ch03;

import java.util.Scanner;

public class FinallyHandling {

	// 메인 스레드
	public static void main(String[] args) {

		// try - catch - finally
		// finally 를 사용해야할 때?
		// 자원을 반드시 닫아줘야 할때 사용하기 .. etc
		Scanner scanner = new Scanner(System.in);

		try {
			int result = scanner.nextInt();
			System.out.println("result : " + result);
			// scanner 자원을 다 사용했다면 , 자원을 해제해야한다.
		} finally {
			scanner.close();
			System.out.println(" 자원 해제 완료! ");
		}

	} //

} //

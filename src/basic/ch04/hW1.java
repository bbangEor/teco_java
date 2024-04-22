package basic.ch04;

public class hW1 {
	public static void main(String[] args) {

		// 012

		// 012

		// 012 를 만들어라

		for (int i = 0; i < 3; i++) {

			System.out.print(i + "\t");

		}

		System.out.println();

		for (int i = 0; i < 3; i++) {

			System.out.print(i + "\t");

		}

		System.out.println();

		for (int i = 0; i < 3; i++) {

			System.out.print(i + "\t");

		}

		System.out.println();

		System.out.println("------------------------");

		for (int a = 0; a < 3; a++) {

			for (int i = 0; i < 3; i++) {

				System.out.print(i + "\t");

				// println이 아닌 print 사용 + \t로 가로로 배열되며 띄어쓰기 됨.

			}

			System.out.println();

		}

	}

}

package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {

	public static void main(String[] args) {

		// 스캐너사용
		Scanner sc = new Scanner(System.in);
		// 배열선언100개
		PhoneBook[] phbooks = new PhoneBook[100];

		// 샘플데이터
		phbooks[0] = new PhoneBook("햄발자", "01011112222");
		phbooks[1] = new PhoneBook("령이", "01011113333");
		phbooks[2] = new PhoneBook("가료이", "01011114444");
		phbooks[3] = new PhoneBook("또아", "01011115555");

		final String SAVE = "1";
		final String SEARCH = "2";
		final String CHANGE = "3";
		final String DELETE = "4";
		final String SEARCH_BY_TITLE = "5";

		// while()
		boolean flag = true;
		while (flag) {
			System.out.println("***메뉴선택***");
			System.out.println("1.저장 2.조회 3.수정 4.삭제 5.선택조회");
			String selectedNumber = sc.nextLine();

			// 실행의 흐름 만들기

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">>저장하기<<");
				save(sc, phbooks);
			} else if (selectedNumber.equals(SEARCH)) {
				System.out.println(">>전체조회하기<<");
				search(sc, phbooks);
			} else if (selectedNumber.equals(CHANGE)) {
				System.out.println(">>수정하기<<");
				change(sc, phbooks);
			} else if (selectedNumber.equals(DELETE)) {
				System.out.println(">>삭제하기<<");
				delete(sc, phbooks);
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">>선택조회하기<<");
				readByTitle(sc, phbooks);
			} else {
				System.out.println(">>잘못된 선택입니다.<<");
			}

		}

	} // end of main

	public static void save(Scanner sc, PhoneBook[] phbooks) {
		System.out.println("-----저장하기-----");
		System.out.println("이름을 입력하세요.");
		String userName = sc.nextLine();
		System.out.println("전화번호를 입력하세요.");
		String phNumber = sc.nextLine();
		PhoneBook phbook = new PhoneBook(userName, phNumber);
		System.out.println("저장되었습니다.");

		for (int i = 0; i < phbooks.length; i++) {
			if (phbooks[i] == null) {
				phbooks[i] = phbook;
				break;
			}
		}
	}

	public static void search(Scanner sc, PhoneBook[] phbooks) {
		System.out.println("-----전체조회하기-----");
		for (int i = 0; i < phbooks.length; i++) {
			if (phbooks[i] != null) {
				System.out.println(phbooks[i].getUserName() + "," + phbooks[i].getPhNumber());
			}
		}

	}

	public static void delete(Scanner sc, PhoneBook[] phbooks) {
		System.out.println("-----전체삭제하기-----");
		for (int i = 0; i < phbooks.length; i++) {
			phbooks[i] = null;
		}

	}

	public static void readByTitle(Scanner sc, PhoneBook[] phbooks) {
		System.out.println("-----선택조회하기-----");
		System.out.println("연락처를 입력하세요.");
		String phNumber = sc.nextLine();
		boolean isFind = true;

		for (int i = 0; i < phbooks.length; i++) {
			if (phbooks[i] != null) {
				if (phbooks[i].getPhNumber().equals(phNumber))
					;
				System.out.println(phbooks[i].getUserName() + "," + phbooks[i].getPhNumber());
				break;
			}
		}
		if (isFind == false) {
			System.out.println("잘못된 입력입니다.");
		}
	}

	public static void change(Scanner sc, PhoneBook[] phbooks) {
		// 조회 먼저 -있으면 실행
		System.out.println("-----수정하기-----");
		System.out.println("이름을 입력하세요.");
		String textBox1 = sc.nextLine();
		System.out.println("수정할 이름을 입력하세요.");
		String textBox2 = sc.nextLine();
		System.out.println("수정할 번호를 입력하세요.");
		String textBox3 = sc.nextLine();

		for (int i = 0; i < phbooks.length; i++) {
			if (phbooks != null && textBox1.equals(phbooks[i].getUserName())) {
				phbooks[i] = null;

				PhoneBook phbooks3 = new PhoneBook(textBox2, textBox3);
				phbooks[i] = phbooks3;
				return;
			}

		}

	}

} // end of class

package basic.ch15;

import java.util.Scanner;

/**
 * author - 김도아 모든 프로그래밍의 기본은 C R U D 이다.
 */
public class MyBookStore {

	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		// 준비물
		Scanner sc = new Scanner(System.in);
		// 배열 선언
		Book[] books = new Book[100];

		// 샘플 데이터 만들어 놓기
		books[0] = new Book("플러터 UI 실전", "김근호");
		books[1] = new Book("무궁화 꽃이 피었습니다", "김진명");
		books[2] = new Book("흐르는강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");
		LAST_INDEX_NUMBER = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETE_ALL = "4";
		final String END = "0";

		boolean flag = true;

		while (flag) {
			System.out.println("*** 메뉴 선택 ***"); // 얘넨 반복되어야하기떄문에 while 문안으로 대입
			System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 0.프로그램종료");
			String selectedNumber = sc.nextLine(); // next(); 문자열 + 다음줄로 이동처리

			// 실행의 흐름 만들기
			if (selectedNumber.equals(SAVE)) {// 문자열 비교는 equals 이용하기
				System.out.println(">>저장하기<<");
				save(sc, books);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">>전체조회하기<<");
				readAll(books);
			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">>선택조회하기<<");
				readByTitle(sc, books);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				System.out.println(">>전체삭제하기<<");
				deleteAll(books);

			} else if (selectedNumber.equals(END)) {
				System.out.println(">>프로그램종료<<");
				flag = false;

			} else {
				System.out.println(">>잘못된 선택 입니다.<<");
			}

		}

	} // end of main

	// 함수 활용하기 !
	public static void readAll(Book[] books) { // Book배열 안에있는것들 모두 출력하기.
		System.out.println("-----전체 조회하기-----");
		for (int i = 0; i < books.length; i++) {
			// 방어적 코드 작성
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
			}

		}

	}

	// 전체삭제하기
	public static void deleteAll(Book[] books) {
		System.out.println("-----전체 삭제하기-----");
		for (int i = 0; i < books.length; i++) {
			books[i] = null; // null값 넣어주면 삭제됨.
		}
	}

	public static void save(Scanner sc, Book[] books) {
		System.out.println("-----저장하기-----");
		System.out.println("책의 제목을 입력하세요.");
		String bookTitle = sc.nextLine();
		System.out.println("책의 저자를 입력하세요.");
		String bookAuthor = sc.nextLine();
		Book book = new Book(bookTitle, bookAuthor);

		if (LAST_INDEX_NUMBER >= books.length) {
			System.out.println("더이상 책을 저장할 공간이 없습니다ㅏ.");
			return;
		}
		// book [0] 번째 값이 있다면 안들어감.
		// book [1] 번째 값이 있다면 안들어감.
		// book [2] 번째 값이 있다면 안들어감.
		// book [3] 번째 가 null일때 -> new Book (bookTitle, bookAuthor); 저장하면들어감.
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				LAST_INDEX_NUMBER++; // 요소의 갯수로 사용해보기
				break;
			}

		}
		System.out.println("저장되었습니다.");
	}

	public static void readByTitle(Scanner sc, Book[] books) {
		System.out.println("-----선택 조회하기-----");
		System.out.println("책 제목을 입력해주세요.");
		String bookTitle = sc.nextLine();
		boolean isFind = false;
		// 사용자가 입력한 책 제목
		// books 전부 조사 books[0] --> 객체 --> 객체.getTitle()
		// 문자열 --> equals
		// books[0].getTitle().equal() //배열안에 객체가 없다면 ->null pointer 오류 ->방어적 코드작성

		for (int i = 0; i < books.length; i++) {
			// 방어적코드작성
			// t and t
			// if(books[i] !=null && books[i].getTitle().equals(bookTitle)) { > && 써서 한번에써도댐
			if (books[i] != null) {
				if (books[i].getTitle().equals(bookTitle)) {
					System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
					break; // 무시하고 멈추기.
				}

			}
		}

		// 만약 사용자가 입력한 책 제목과 배열 요소안에 title 값이 같다면
		// 화면에 책 제목, 저자, 이름을 출력하고
		// 아니라면
		// 해당하는 책이 없습니다. 문구를 출력하세요.
		// 심화 -- 반복문을 전부 돌리면 안됩니다.

		// 만약 선택된값이 없다면
		// 해당제목의 책은 존재하지않습니다.
		if (isFind == false) {
			System.out.println("해당제목의 책은 존재하지않습니다.");
		}
	}

} // end of class

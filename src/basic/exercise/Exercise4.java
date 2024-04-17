package basic.exercise;

import java.util.Scanner;

public class Exercise4 {
	// 메인함수
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		//특정 조건을 만날때 반복문을 종료해야한다면 
		//깃발 flag사용하기 . 
		// \n은 무조건 한줄 내림
	boolean flag =true ;	
	while (true)	{
		System.out.println("\n메뉴선택");
		System.out.println("1. 등록 2.조회 3.수정 4.삭제 0.종료");
		System.out.println("선택 :");
		choice = sc.nextInt();

		// 만약... 사용자가 1 선택 -> 등록을 선택했습니다.
		if (choice == 1) {
			System.out.println("등록을 선택했습니다.");
		} else if (choice == 2) {
			System.out.println("조회를 선택했습니다.");
		} else if (choice == 3) {
			System.out.println("수정을 선택했습니다.");
		} else if (choice == 4) {
			System.out.println("삭제를 선택했습니다.");
		} else if (choice == 0) {
			System.out.println("프로그램을 종료합니다.");
			break; //while  반복문을 빠져나와
		} else {
			System.out.println("잘못된 입력입니다. 다시선택해주세요.");

		}
	}
	} // end of main

} // end of class

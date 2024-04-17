package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {
	static Scanner sc = new Scanner(System.in);
	// 메인함수
	public static void main(String[] args) {
		int a = sc.nextInt();
		
		
		// 설계된 클래스를 가지고 본인이 의도한 대로 실행에 흐름을 만들어보자 
		
		//스캐너를 활용해서 1번을 누르면 버스를 태워서 실행되게 하고 
		//2번을 누르면 지하철을 태우는 실행 흐름을 만들어보자
		
		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Student s1 = new Student("티모", 100_000) ;
		Student s2 = new Student("나르", 100_000) ;
		
		
	
		
		s1.takeBus(bus2);
		s1.showInfo();
		
		s2.takeSubway(subway2);
		s2.showInfo();
		
		


			
	
	}
	
} // end of class

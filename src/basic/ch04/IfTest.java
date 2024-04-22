package basic.ch04;
//변수명을 작성할때 약속(권장사항) --> 코딩 컨벤션
	// int myScore; <-- 카멜 표기법	(낙타 모양같다캐서)
	// 첫시작의 단어를 대문자로 작성하고 연결에 단어도 대문자로 표기한다면
	// -->파스칼 케이스
public class IfTest {
	//코드의 시작점 메인함수
	public static void main(String[] args) {
		
		//조건문(제어문) if
		//주어진 조건에 따라서 실행이 이루어지도록 흐름을 만든다.
		// if.... -> 만약 ... 이라면 (이럴때 쓰면됨)
		
		boolean flag = true ;
		
		if (flag) {
			// 수행구문( flag 가 트루라면 이 부분을 수행하기! )
			System.out.println("트루라면 출력됨^^");
			flag = false;
			//이것때문에  false로 출력됨.
			
		} 	//end of if - 블록의 범위! 
			// if문 단독은 수행이 될 수 도있고 안될 수 도있다.
		 
		System.out.println("코드가 여기까지 내려온다. :" + flag);
		
	}	// end of main

}	// end of class

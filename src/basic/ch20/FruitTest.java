package basic.ch20;

public class FruitTest {

	public static void main(String[] args) {
		Fruit fruit1 = new Banana(); 
		Fruit fruit2 = new Peach(); 
		
		fruit1.showInfo();
		fruit2.showInfo();
		
		// 다형성
		// 다양한 형태로 클래스(데이터 타입)를 바라볼 수 있다.
		System.out.println("---------------------------");
		
		Banana banana1 = new Banana(); // 업캐스팅 된 상태
		Peach peach1 = new Peach(); // (부모의데이터 타입으로 자식의 데이터값을 할당한상태)
		Peach peach2 = new Peach(); 

		// 다형성을 사용하면 코드를 유연하게 작성할 수 있음! 장점!
		
		Fruit[] fruits = new Fruit[3]; // 과일의 배열 3개 만들기
		fruits[0] = banana1;
		fruits[1] = peach1;
		fruits[2] = peach2;

		System.out.println("-----------------------------");
		// fruit[0] --> 바나나
		// 바나나의 속성인 origin을 출력하세요
		// 바나나의 기능인 saleBanana() 메서드를 호출하세요.
		
		
		System.out.println(((Banana)fruits[0]).origin);
		((Banana)fruits[0]).saleBanana();
		
		System.out.println("---------------------------");
		// 배열은 반복문과 함께 자주 사용된다
		
		//0번째는 바나나 객체
		//1번째 복숭아 객체 < 그래서 오류생김.
		
		// instanceof 연산자를 알아야 해결 가능.
		// 실행 시점에 객체가 특정 클래스의 인스턴스인지 확인하는 키워드
		for (int i = 0; i < fruits.length; i++) {
			if(fruits[i] instanceof Banana) {
				((Banana)fruits[i]).saleBanana();
			}else {
				fruits[i].showInfo();
			}
			
		}
		
		
		
	} // end of main

} // end of class

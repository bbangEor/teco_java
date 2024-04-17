package basic.exercise;

public class Exercise1 {
	//메인함수
public static void main(String[] args) {
	//1. 데이터 10,100 ,100 변수를 이름을 정해서 선언, 
	//동시에 초기화 후 화면에 출력하기 
	int data1 = 10;
	int data2 = 100;
	int data3 = 100;
	System.out.println(data1);
	System.out.println(data2);
	System.out.println(data3);
			
	//2. int ageBox 상자에 20을 담기
	int ageBox = 20;
	//ageBox = 20  선언하고 초기화 해도됨.
	
	//2-1. ageBox 상자의 값을 30으로 변경하고 기존에
	//담겨있던 데이터를 다른곳으로 옮기기 
	int oldBox = ageBox;
	ageBox = 30;
	//아까 있던 20은 어떻게 찾아올까요?
	//사라지기전에 옮길수있는 메모리공간을 따로 만들어둬야한다.
	System.out.println("ageBox : " + ageBox);
	System.out.println("old : " + oldBox);
	
	//3. int a =1; int b = 3;
	// 선언하고 a와b 에 담겨있는값을 스위칭.
	int a = 1;
	int b = 3;
	//값이 사라지지않게 하기 위해서는 메모리 상자 하나를 더 만든다.
	int temp = a;
	a = 3;
	b = 1;
}// end of main
}// end of class

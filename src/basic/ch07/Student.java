package basic.ch07;
/** 
 * 객체의 속성은 멤버 변수로 
 * 객체의 기능은 메서드로 구현한다. 
 */
public class Student {
	// 멤버 변수 - 특징 : 초기화 값을 넣지않는다면 기본값으로 초기화 된다.
	//new ... 생성자 (); --> heap 메모리에 올라갔을시 값이 없다면 기본값으로 초기화된다.
	int studentID;
	String studentName;
	String address;
	
	//메서드 설계하기
	public void study() {
		System.out.println(studentName + "학생이 공부를 합니다.");
	}
	public void breakTime() {
		System.out.println(studentName + "학생이 휴식을 합니다.");
	}
	public void takeTest() {
		System.out.println(studentID + "학생이 시험을 칩니다.");
	}
	
	public void showInfo() {
		System.out.println("-------상태창-------");
		System.out.println("학생 ID :" + studentID);
		System.out.println("학생 이름 :" + studentName);
		System.out.println("학생 주소 :" + address);
		System.out.println("학생 ID :"+ studentID );
		// 아설계만 하고 메모리에 올리진 않음. 
	}
	

}// end of class

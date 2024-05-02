package structure;

public class MainTest1 {

	public static void main(String[] args) {

		TencoIntArray tencoIntArray = new TencoIntArray(); // 10 개의 배열 생성됨!
		tencoIntArray.addElement(100);
		tencoIntArray.addElement(200);
		tencoIntArray.addElement(300);
		tencoIntArray.addElement(400);
		// tencoIntArray.insertElement(1, 50); // 0번째 요소에 50 을 넣기!
		// ARRAY_SIZE > position 여서 실행오류 / ARRAY_SIZE < position 수정!

		// System.out.println(tencoIntArray.getElement(0));

		tencoIntArray.printAll(); // 전체 요소 출력

		System.out.println("--------------------------------");

		System.out.println(tencoIntArray.getCountSize());

		System.out.println("--------------------------------");

		System.out.println(tencoIntArray.isEmpty());

		System.out.println("--------------------------------");

		tencoIntArray.removeAll(); // 전체 삭제
		tencoIntArray.printAll(); // 출력
	} //

} //

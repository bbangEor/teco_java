package useful.ch04;

public class StudentTest {

	public static void main(String[] args) {

		//A
		Student student = Student.getInstance();
		System.out.println(student);
		
		//B
		Student student2 = Student.getInstance();
		System.out.println(student2);
		
	}

}

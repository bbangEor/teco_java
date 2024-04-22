package basic.ch12;

public class Company {

	public static String companyName = "그림컴퍼니"; //접근제어지시자 public 
	static int empSerialNumber = 1000; //  Employee  에서 활용 
	
	
	// 코드 테스트 
	public static void main (String[]args) {
		
		Employee employee1 = new Employee("홍길동");
		System.out.println(employee1.getEmployeeId());
		
		Employee employee2 = new Employee("김도아");
		System.out.println(employee2.getEmployeeId());
		
		Employee employee3= new Employee("김가령");
		System.out.println(employee3.getEmployeeId());
	}
		 

	
}

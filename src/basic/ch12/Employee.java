package basic.ch12;

public class Employee {

	private int employeeId; // 멤버변수 (객체마다 고유의 값을 가져야함.)
	private String name; // 사원의 이름
	private String department; // 사원의 부서

	// 요구조건
	// 사원이 존재하게 될때마다 고유한 사원번호를
	// 할당하고 싶다. 단 사원번호는 중복되어서는 안된다.
	
	Employee employee1 = new Employee("김도아");

	// static 과 멤버변수의 활용 !
	// 객체 생성자 , 멤버 변수, 함수를 필요하다면 호출 또는 초기화 할수있다.
	public Employee(String name) {
		this.name = name;
		this.employeeId = Company.empSerialNumber; 
		Company.empSerialNumber++; //증감연산자 사용 
	} // Alt + SHift + s 

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee getEmployee1() {
		return employee1;
	}

	public void setEmployee1(Employee employee1) {
		this.employee1 = employee1;
	}

	
}

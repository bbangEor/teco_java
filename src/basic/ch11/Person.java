package basic.ch11;

public class Person {

	// this 의 3가지 사용방법
	//1 .  this 는 자기 자신을 가리키며 인스턴스의 주소 이다.
	//2 . 생성자에서 다른 생성자를 호출할때 사용할 수있다. 
	//3 . 자신의 주소(참조값, 주소값)을 반환 시킬 수 있다.
	
	
	
	//변수 --> private (기본)
	private String name;
	private int age;
	private String phone;
	private String gender;
	
	// 1.자기자신
	//생성자 (오버로딩 = 여러개쓰는것)
	public Person(String name, int age) {
		// 자기 자신의 멤버변수 name에 외부에서 들어오는 지역변수 name을 대입한다.
		this.name = name;
		this.age = age;
	}
	//2.
	public Person(String name, int age, String phone) {		
		this(name,age);   // <-- 생성자에서 다른 생성자를 호출 할 수 있다. this(..)
		// 다른 생성자를 가장 먼저 호출하고 다른 수식을 작성해야함.
//		this.name = name;
//		this.age = age;
		this.phone = phone;
	}
	public Person(String name, int age, String phone,String gender) {
		this(name, age, phone); 
		this.gender = gender;
	
	}
	//3. 자신의 주소 값을 반환 시킬 수 있다.
	public Person getPerson() {
		// 자신의 주소값 반환시키는것
		return this; // 지 자신말하는거 
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + ",나이 : " + age);
	}
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	// getter
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getGender() {
		return this.gender;
	}
}

package useful.ch04;

public class CompanyTest {

	public static void main(String[] args) {
		// 접근제어지시자가 private 이라 생성 불가! 
		//Company company = new Company(); 
		
		//?  Company 객체에 접근할수있는 방법은 무엇일까  ?
		
		//A 클래스에서 활용
		Company company = Company.getInstance(); // 클래스 이름으로 호출가능!
		System.out.println(company);
		
		//B 클래스에서 활용
		Company company2 = Company.getInstance();
		System.out.println(company2);
		
		//A 와  B 주소값은 같게 나온다! 
		//하나 더 생성되는것이 아닌 이미 생성된것을 호출하게됨!
		
		
	} //

} //

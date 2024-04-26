package useful;
import java.lang.*; // lang.* 모든녀석들 다 가지고옴. 
/**
 * Object 클래스는 모든 클래스의 최상위 클래스이다.
 * impotant java. lang.* 프로그래밍시 import하지 않아도 자동으로 가지고있다.
 * 자바는 단일 상속만 지원합니다. 단 Object클래스를 제외하고!  
 */


public class Book extends Object {

	private String title;
	private String author;
	
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	// Object  -> toString();
	
	@Override // 재정의 할 수 있음
	public String toString() {
		return "[" + title +","+ author +"]";
	}
	
	//테스트코드
	public static void main(String[] args) {
		Book book = new Book("데미안", "헤르만 헤세");
		System.out.println(book); 
		System.out.println("----------------------");
		
		String str1 = new String("안녕");
		System.out.println(str1);
	}
	
}

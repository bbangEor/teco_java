package useful;

public class EBook {

	int bookTypeId;
	private String title;
	private String author;

	//생성자
	public EBook(int bookTypeId,String title,String author) {
		this.bookTypeId = bookTypeId;
		this.title = title;
		this.author = author;
	}
	// Object 클래스에 있는 메서드를 재정의
	@Override
	public String toString() {
		return bookTypeId +"," + title +"," + author;
	}
	// Object 클래스에 있는 메서드를 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof EBook) {
			EBook tBook = (EBook)obj;
			//1.Ebook의 클래스의 인스턴스가 맞다면
			//2.Ebook의 제목과 저자의 이름이 같다면 true를 반환시켜라 
			if(this.title.equals(tBook.title)) {
				return true;
			}else {
			return false;
			}
	}
		return false;
	}
	
	public static void main(String[] args) {
		Book myBook1 = new Book("흐르는강물처럼", "파울로코엘료");
		EBook book1 = new EBook(1, "홍길동전", "허균");
		EBook book2 = new EBook(1, "홍길동전", "허균");
		System.out.println("----------------------------");
		
		Boolean result1 =book1 == book2;
		System.out.println("result1 : " + result1);
	
		Boolean result2 =book1.equals(book2);
		System.out.println("result2 : " + result2);
		
//		if(book1.equals(book2)) {
//		System.out.println("같은 주소를 가리킴");
//	} else {
//		System.out.println("아니다. 다른주소다");
//	}
//		System.out.println(book1);
//		System.out.println(book2);
//		
	}
}

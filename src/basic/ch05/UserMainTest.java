package basic.ch05;

public class UserMainTest {

	public static void main(String[] args) {

		User user1 = new User();
		
		System.out.println(user1);
		
		user1.name = "햄발";
		user1.userId = "hambal11";
		user1.userpw = "*******";
		
		System.out.println(user1.name);
		System.out.println(user1.userId);
		System.out.println(user1.userpw);
		
		
}
}
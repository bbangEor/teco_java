package useful.ch03;

public class NicknameMainTest {
	
	// 메인스레드
	public static void main(String[] args) {

		Nickname nickname = new Nickname();
		
		String inPutName = null;
		inPutName = "BABO^^";
		
		try {
			nickname.setName(inPutName);
		} catch (NicknameException e) {
			System.out.println(" 우리가 정의한 닉네임 예외가 발생");
		} catch (Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		
	} //

} //

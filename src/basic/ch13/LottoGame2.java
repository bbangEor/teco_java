package basic.ch13;

public class LottoGame2 {

	public static void main(String[] args) {

		int gameNumber = LottoNumberMaker.makeNumber(); // 클래스이름.메서드 호출
		// static변수 --> 클래스 변수라고 부른다 .

		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		// 전체 1~6 까지 나온 결과값을 오름차순으로 정렬
		// 단, 중복값 제외
		int tempBox = 0;
		
		//     5      >      1    = true  동작 수행됨.
		if (gameNumber1>gameNumber2) {
			//  5  
			tempBox = gameNumber1;
			//  1     <--      1    
			gameNumber1 =gameNumber2;
			//  5     <--     5
			gameNumber2 = tempBox;
			//  5     >       9    //false 수행안됨
		}if (gameNumber2>gameNumber3) {
			tempBox = gameNumber2;
			gameNumber2 =gameNumber3;
			gameNumber3 = tempBox;
			//  9     >       7    // true 수행됨
		}if(gameNumber3>gameNumber4) {
			//  9     <--     9 
			tempBox = gameNumber3;
			//  7     <--     7
			gameNumber3 =gameNumber4;
			//  9     <--     9
			gameNumber4 = tempBox;
			//  9      >      2   true 수행됨  
		}if(gameNumber4>gameNumber5) {
			//  9     <--   9
			tempBox = gameNumber4;
			//  2     <--   2
			gameNumber4 =gameNumber5;
			//  2     <--   9
			gameNumber5 = tempBox;
			//  9     >     3   true 수행됨
		}if(gameNumber5>gameNumber6){
			//  9     <--   9
			tempBox = gameNumber5;
			//  3     <--   3
			gameNumber5 =gameNumber6;
			//  9     <--   9
			gameNumber6 = tempBox;
		}
		
		// 1 , 5 , 7 , 2 , 3 , 9  
		
		// 수식 작성!
		// if문 -> 반복문 사용 금지. if문 6개로 해결하기 .
		
		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
		System.out.println(gameNumber3);
		System.out.println(gameNumber4);
		System.out.println(gameNumber5);
		System.out.println(gameNumber6);

	}

}

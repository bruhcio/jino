package chap_05;
//5-6임

public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hangman hangman = new Hangman();
		int result = hangman.playGame();
		if (result <= 2)
			System.out.println(result + "번 틀렸습니다. 참 잘했어요!");
		else if (result <= 3)
			System.out.println(result + "번 틀렸습니다. 잘했어요!");
		else if (result <= 4)
			System.out.println(result + "번 틀렸습니다. 보통이네요!");
		else
			System.out.println(result + "번 틀렸습니다. 분발하세요!");

	}

}

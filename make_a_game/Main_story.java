package make_a_game;
import java.util.Scanner;
public class Main_story {
	//status는 이벤트 하나 끝날 떄마다 출력하기

	public static void main(String[] args) {
		Scanner sn = new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.println("여기에는 스토리 막 적기");//아마 술을 찾아나서는 프롤로그 정도 적을 듯
		System.out.println("처음으로 여행할 국가를 고르세요");
		int first_Choice = 0;
		boolean validChoice = false;
		
		while (!validChoice) {
			first_Choice = sn.nextInt();
			
		if (first_Choice == 1) { // 1번 중국?
			china ch = new china();
		}
		if (first_Choice == 2) { // 2번 미국?
			usa us = new usa(); 
		}
		if ( first_Choice == 3) { // 3번 나머지 일단 아무 나라나 써 둠
			sing sp = new sp();
		}
		else {
			System.out.println("잘못된 선택입니다. 다시 입력하세요.");
		}
		}
		System.out.println("=============== 상태창 ===============");
		status status = new status();
		 status.setHPValue(3);
		 int currentHP = status.getHPValue();
	        System.out.println("현재 HP: " + currentHP);
	     status.setMentalValue(3);
		 int currentMental = status.getMentalValue();
		    System.out.println("현재 Mental: " + currentMental);
		 status.setMoneyValue(0);
		 int currentMoney = status.getMoneyValue();
		    System.out.println("현재 Money: " + currentMoney);
		
	}
}

//상태창을 열어보려면 매번 선택지를 만들어야한다는건데 
//오버라이드로 받아야 하나?

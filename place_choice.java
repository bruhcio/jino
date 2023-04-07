package test;

import java.util.Scanner;

public class place_choice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static int place_choice(int place_number) {
			Scanner in =new Scanner(System.in);
			System.out.println("1. 사냥터");
			System.out.println("2. 포션 상점");
			System.out.println("3. 입장하실 장소를 입력하세요 : ");
			int num = in.nextInt();
			if (num == 1);{
			System.out.println("사냥터에 입장하였습니다. ");
			System.out.println("1.너구리\n"+"2.살쾡이");
			System.out.printf("전투할 상대를 입력하세요. : ");
			//몬스터 고르는 선택지 단순하게 판별문으로
			if (monster_select == 1) {
				monster_name = "너구리";
				 monster_hp = 100;
				 monster_level = 1;
				 monster_power = 20;
				 monster_defense = 5;
				 monster_money = 10;
				 monster_experience = 10;
			}
			else if (monster_select == 2) {
				monster_name = "살쾡이";
				 monster_hp = 2000;
				 monster_level = 5;
				 monster_power = 100;
				 monster_defense = 20;
				 monster_money = 30;
				 monster_experience = 50;
			}
			System.out.printf("%s와 전투를 시작합니다.\n",monster_name);
			//히어로 선공
			monster_attacked(hero_attack());
			if (monster_hp <= 0) {
				System.out.printf("%s가 재로 변하였습니다.\n", monster_name);
				hero_money += monster_money;
				hero_experience += monster_experience;
				break;
			}
			//몬스터가 반격하는 거
			hero_attacked(monster_attack());
			if (hero_hp <= 0) {
				System.out.printf("%s가 무릎을 꿇었습니다.\n", hero_name);
				System.out.printf("%s가 굴욕적으로 부활합니다.\n", hero_name);
				hero_hp = 1;
				break;
			}
			}
			if (num == 2); {
			System.out.println("포션 상점에 입장하셨습니다. ");
			System.out.println("1. 힘 증강 포션 (30원)");
			System.out.println("2. 방어력 증강 포션 (30원)");
			System.out.println("3. 경험치 증강 포션 (100원)");
			System.out.println("4. HP 증강 포션 (10원)");
			System.out.println("5. MP 증강 포션 (10원)");
			System.out.println("원하시는 물건을 입력하세요 : ");
			int stp = 30, dfp = 30, epp = 100, hpp = 10, mpp =10;
			int portion_choice = in.nextInt();
			switch (portion_choice) {
			case 1:
				hero_money = hero_money - 30;
			case 2:
				hero_money = hero_money - 30;
			case 3:
				hero_money = hero_money - 100;
			case 4:
				hero_money = hero_money - 10;
			case 5:
				hero_money = hero_money - 10;
			}
			System.out.println("초션 상점에서 물건을 구매 시도하는 중입니다.");
			System.out.println("구입이 완료됐습니다.");
			System.out.printf("남은 금액은 : %d원 입니다.", hero_money);
			}
		}
	}

}

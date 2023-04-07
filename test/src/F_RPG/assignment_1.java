package F_RPG;

import java.util.Scanner;
public class assignment_1 {
	static int hero_level = 1, hero_power = 15, hero_defense = 25, hero_hp = 80, hero_mp = 100, hero_experience = 0, hero_money = 0,hero_damage = 0;
	static int monster_hp = 0, monster_level = 0, monster_power = 0, monster_defense = 0, monster_money = 0,monster_experience = 0, monster_damage = 0;
	static String hero_name ="", monster_name = "", hero_job =""; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("영웅의 이름을 입력하세요. : ");
		hero_name = sc.next();
		System.out.println("이름이 입력됐습니다.");
		System.out.println("*********************");
		System.out.println("1. 전사");
		System.out.println("직업의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("전사가 선택되었습니다.");
			  hero_job = "전사";
			  hero_level = 1;
			  hero_power = 15;
			  hero_defense = 25;
			  hero_hp = 80;
			  hero_mp = 100;
			  //스킬 시전을 위한 mp시스템 추가
		}
		System.out.println("게임에 입장하였습니다.");
		while (true) {
			System.out.println("*********************");
			System.out.println("현재 Hero의 이름 : " + hero_name);
			System.out.println("현재" + hero_name + "의 레벨 :"+ hero_level);
			System.out.println("현재" + hero_name + "의 힘 : "+ hero_power);
			System.out.println("현재" + hero_name + "의 방어력 : " + hero_defense);
			System.out.println("현재" + hero_name + "의 HP : " + hero_hp);
			System.out.println("현재" + hero_name + "의 MP : " + hero_mp);
			System.out.println("현재" + hero_name + "의 경험치 : "+ hero_experience);
			System.out.println("현재" + hero_name + "의 돈 : "+ hero_money + "원");
			System.out.println("*********************");
			System.out.println("1. 사냥터");
			System.out.println("2. 포션 상점");
			System.out.println("입장할 장소를 선택하세요 : ");
			int place_cho = sc.nextInt();
			if (place_cho ==1) {
			System.out.println("사냥터에 입장하였습니다. ");
			System.out.println("1.너구리\n"+"2.살쾡이");
			System.out.printf("전투할 상대를 입력하세요. : ");
			//몬스터 고르는 선택지 단순하게 판별문으로
			while (true) {
			int monster_select = sc.nextInt();
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
				System.out.printf("%s가 무릎을 꿇었습니다.\n", hero_name); //적을 잡았다는 문구 추가
				System.out.printf("%s가 굴욕적으로 부활합니다.\n", hero_name); //부활 문구 바꾸기
				hero_hp = 1;
				break;
			}
			}
			}
			if(place_cho == 2) {
				System.out.println("포션 상점에 입장하셨습니다.");
				System.out.println("1. 힘 증강 포션 (30원)");
				System.out.println("2. 방어력 증강 포션 (30원)");
				System.out.println("3. 경험치 증강 포션 (100원)");
				System.out.println("4. HP 증강 포션 (10원)");
				System.out.println("5. MP 증강 포션 (10원)");
				System.out.println("원하시는 물건을 입력하세요 : ");
			
				int portion_choice = sc.nextInt();
				switch (portion_choice) {
				case 1:
					hero_money = hero_money - 30;
					if (hero_money < 0) {
						System.out.println("돈이 부족합니다.");
						hero_money = hero_money + 30;
						break;
					}
					else {
						System.out.println("포션 상점에서 물건을 구매 시도하는 중입니다.");
						System.out.println("구입이 완료됐습니다.");
						System.out.printf("남은 금액은 : %d원 입니다.\n", hero_money);
						break;
					}
						
				case 2:
					hero_money = hero_money - 30;
					if (hero_money < 0) {
						System.out.println("돈이 부족합니다.");
						hero_money = hero_money + 30;
						break;
					}
					else {
						System.out.println("포션 상점에서 물건을 구매 시도하는 중입니다.");
						System.out.println("구입이 완료됐습니다.");
						System.out.printf("남은 금액은 : %d원 입니다.\n", hero_money);
						break;
					}
				case 3:
					hero_money = hero_money - 100;
					if (hero_money < 0) {
						System.out.println("돈이 부족합니다.");
						hero_money = hero_money + 100;
						break;
					}
					else {
						System.out.println("포션 상점에서 물건을 구매 시도하는 중입니다.");
						System.out.println("구입이 완료됐습니다.");
						System.out.printf("남은 금액은 : %d원 입니다.\n", hero_money);
						break;
					}
				case 4:
					hero_money = hero_money - 10;
					if (hero_money < 0) {
						System.out.println("돈이 부족합니다.");		
						hero_money = hero_money + 10;
						break;
					}
					else {
						System.out.println("포션 상점에서 물건을 구매 시도하는 중입니다.");
						System.out.println("구입이 완료됐습니다.");
						System.out.printf("남은 금액은 : %d원 입니다.\n", hero_money);
						break;
					}
				case 5:
					hero_money = hero_money - 10;
					if (hero_money < 0) {
						System.out.println("돈이 부족합니다.");
						hero_money = hero_money + 10;
						break;
					}
					else {
						System.out.println("포션 상점에서 물건을 구매 시도하는 중입니다.");
						System.out.println("구입이 완료됐습니다.");
						System.out.printf("남은 금액은 : %d원 입니다.\n", hero_money);
						break;
					}
				}
				//여기가 포션 구매의 끝, 
				//포션을 사지 못할 경우 다시 선택지로 돌아가야 하나, 하려고 하면 포션 상점 자페를 메서드로 작성해야하므로 이후에 메서드로 작성 후 구현하려고 함
				}
				//여기가 상점 끝
			if (hero_experience >= hero_level * 80) {
				hero_experience -= hero_level * 80;
				hero_level++;
				System.out.println("레벨이 올랐습니다.");
				hero_money += hero_level * 50;
				System.out.println("레벨업 기념으로 소지품 중 무언가가 증가하였습니다.");
				hero_status();
				//히어로 현재 상태 출력
			}//레벨업 시스템
		}//여기가 while문 끝
	}//메인 스트링 끝

	
	
	static void hero_status() {
		System.out.println("*********************");
		System.out.println("현재 Hero의 이름 : " + hero_name);
		System.out.println("현재 Hero의 직업은 " + hero_job);
		System.out.println("현재" + hero_name + "의 레벨 :"+ hero_level);
		System.out.println("현재" + hero_name + "의 힘 : "+ hero_power);
		System.out.println("현재" + hero_name + "의 방어력 : " + hero_defense);
		System.out.println("현재" + hero_name + "의 HP : " + hero_hp);
		System.out.println("현재" + hero_name + "의 경험치 : "+ hero_experience);
		System.out.println("현재" + hero_name + "의 돈 : "+ hero_money + "원");
		System.out.println("*********************");
	}
	//히어로가 공격하는 거
	static int hero_attack() {
		Scanner in =new Scanner(System.in);
		System.out.println("1. 쓰러스트\n2. 제네시스");
		System.out.println("공격번호를 입력하세요 :");
		int num = in.nextInt();
		int damage_sum = 0;
		if (num == 1) {
			//사실상 그냥 평타
			damage_sum += hero_level * 10;
			damage_sum += hero_power * 30;
		}
		if (num ==2) {
			//그냥 있기에는 아까워서 스킬 추가 
			if (hero_mp >= 50) {
				// 평타보다는 데미지를 높게 하였으므로 mp 소모를 넣었음
			damage_sum += hero_level * 30;
			damage_sum += hero_power * 80;
			hero_mp -= 50;
			}
			else {
				System.out.println("스킬을 시전하실 수 없습니다.");
				//스킬을 시전할 수 없을 경우 다시 스킬 누르는 선택지로 리턴
				//메서드로 받아서 다시 리턴 가능하다.
				return hero_attack();//이걸로 스킬 다시 누르는 걸로 리턴하는 거임
			}
		}
		System.out.printf("몬스터에게 가한 데미지는 %d 입니다.\n", damage_sum);
		return damage_sum;
		}
	//히어로가 공격당함 즉 인트 안에 몬스터 데미지를 입력받아서 하는 거임
	static int hero_attacked(int hero_damage) {
		if (hero_defense >= hero_damage) {
				hero_hp = hero_hp - 0;
		}
		else {
			hero_hp = hero_hp - hero_damage;
		}
		System.out.printf("몬스터에게 받은 데미지는 : %d 입니다.\n", hero_damage);
		if (hero_hp >0) {
		System.out.printf("남은 체력 : %d\n", hero_hp);
		}
		else {
			System.out.println("당신의 체력이 모두 소진되었습니다.");
		}
		return hero_hp;
	}
	//몬스터가 공격하는 거
	static int monster_attack() {
		int hero_damage = monster_power;
		return hero_damage;
	}
	//몬스터가 공격받는 거 즉 히어로가 공격함
	static void monster_attacked(int damage_sum )	{
		if (monster_defense >= damage_sum) {
				monster_hp = monster_hp - 0;
				System.out.printf("%s의 남은 체력은 %d입니다.\n", monster_name, monster_hp);
		}
		else {
				monster_hp = monster_hp - damage_sum;
				if (monster_hp > 0) {
					System.out.printf("%s의 남은 체력은 %d입니다.\n", monster_name, monster_hp);
				}
				}
		}
}


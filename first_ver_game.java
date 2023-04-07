package test;

import java.util.Scanner;

public class first_ver_game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("영웅의 이름을 입력하세요. : ");
		String hero_name ="";
		hero_name = sc.next();
		int hero_level = 1;
		int hero_power = 15;
		int hero_defense = 25;
		int hero_hp = 80;
		int hero_experience = 0;
		int hero_money = 0;
		int hero_damage = 0;
		//히어로 데미지는 히어로가 입히는 데미지가 아니라 히어로가 입는 데미지이다.
		int monster_damage = 0;
		//몬스터 데미지는 몬스터가 입히는 데미지가 아니라 몬스터가 입히는 데미지이다.
		int monster_hp = 0;
		int monster_level = 0;
		int monster_power = 0;
		int monster_defense = 0;
		int monster_money = 0;
		int monster_experience = 0;
		String monster_name = "너구리";
		
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");
		System.out.println("*********************");
		System.out.println("현재 Hero의 이름 : " + hero_name);
		System.out.println("현재" + hero_name + "의 레벨 :"+ hero_level);
		System.out.println("현재" + hero_name + "의 힘 : "+ hero_power);
		System.out.println("현재" + hero_name + "의 방어력 : " + hero_defense);
		System.out.println("현재" + hero_name + "의 HP : " + hero_hp);
		System.out.println("현재" + hero_name + "의 경험치 : "+ hero_experience);
		System.out.println("현재" + hero_name + "의 돈 : "+ hero_money + "원");
		System.out.println("*********************");
		System.out.println("사냥터에 입장하였습니다. ");
		System.out.println("1.너구리\n"+"2.살쾡이");
		System.out.printf("전투할 상대를 입력하세요. : ");
		int monster_select = in.nextInt();
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
		//주석처리로 선택 제공??
		System.out.println(hero_name+"의 공격입니다.");
		while (true) {
			monster_damage = hero_level * 10 +hero_power * 30;
			hero_damage = monster_power;
			int damage_sum =0;
			if (monster_defense >= monster_damage) {
				//몬스터 방어력이 입는 데미지보다 높아서 죽지 않을 때
				monster_damage = 0;
			}
			else {
				//몬스터가 데미지를 입을 때
				monster_hp = monster_hp + monster_defense - damage_sum;
				if (monster_hp <= 0) {
					//몬스터가 죽을 때
					hero_experience += monster_experience;
					hero_money += monster_money;
					System.out.printf("%s 데미지는 %d 입니다.\n", monster_name, monster_damage);
					System.out.printf("%s가 죽었습니다.\n", monster_name);
					break;
				}
				else {
					//몬스터가 한 번에 죽지 않을 때 
					hero_hp = hero_hp + hero_defense - monster_power;
					if (hero_hp <= 0) {
						hero_hp = 1;
						System.out.println("히어로가 다시 부활합니다.");
						break;
					}
				}
			}
		}
		System.out.println("*********************");
		System.out.println("현재 Hero의 이름 : " + hero_name);
		System.out.println("현재" + hero_name + "의 레벨 :"+ hero_level);
		System.out.println("현재" + hero_name + "의 힘 : "+ hero_power);
		System.out.println("현재" + hero_name + "의 방어력 : " + hero_defense);
		System.out.println("현재" + hero_name + "의 HP : " + hero_hp);
		System.out.println("현재" + hero_name + "의 경험치 : "+ hero_experience);
		System.out.println("현재" + hero_name + "의 돈 : "+ hero_money + "원");
		System.out.println("*********************");
		
		
		
		//int num = sc.nextint();
		//System.out println(monster_name + "과 전투들 시작합니다.")
		//while (true) {
		// 히어로 공격, 몬스터 방어 데미지 초기화 몬스터 데미지 계산
		//몬스터 데미지 = hero_level*10+hero_power*30
			//데미지 초기화
			//몬스터 데미지 계산
			//몬슽터 방어 >= 몬스터 데미지 : 몬스터 hp그대로
		//else monster_hp = monster_hp + monster_defense - sum;
		//몬스터 죽음
		//: 히어로 경험지 += 몬스터 경험지
		//: 히어로 돈 += 몬스터 돈
		//: break
		//히어로 데미지 = 몬스터 파워
		//몬스터 공격, 히어로 방어 히어로 방어 >= 몬스터 파워 : 히어로 hp 그대로
		//else hero.hp = hero.hp + hero_defense - monster_ power;
		//히어로 죽음
		//: 히어로 hp = 1
		//: 히어로 부활 메시지 출력
		//:break
		//}
		//히어로 현재 상태 출력
		
		

	}

}

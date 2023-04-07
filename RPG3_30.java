package test;

import java.util.Scanner;

public class RPG3_30  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		String hero_name ="";
		int hero_level = 1;
		int hero_power = 15;
		int hero_defense = 25;
		int hero_hp = 80;
		int hero_mp = 0;
		int hero_experience = 0;
		int hero_money = 0;
		int hero_damage = 0;
		//히어로 데미지는 히어로가 입히는 데미지가 아니라 히어로가 입는 데미지이다.
		int monster_damage = 0;
		//몬스터 데미지는 몬스터가 입히는 데미지가 아니라 몬스터가 입는 데미지이다.
		int monster_hp = 0;
		int monster_level = 0;
		int monster_power = 0;
		int monster_defense = 0;
		int monster_money = 0;
		int monster_experience = 0;
		String monster_name = "너구리";
		System.out.println("영웅의 이름을 입력하세요. : ");
		hero_name = sc.next();
		System.out.println("이름이 입력됐습니다.");
		System.out.println("*********************");
		System.out.println("1. 전사");
		System.out.println("직업의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("전사가 선택되었습니다.");
			  hero_level = 1;
			  hero_power = 15;
			  hero_defense = 25;
			  hero_hp = 80;
			  hero_mp = 0;
		}
		System.out.println("게임에 입장하였습니다.");
		while (true) {
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
		while (true) {
			int damage_sum = 0;
			System.out.println(hero_name+"의 공격입니다.");
			damage_sum += hero_level*10;
			damage_sum += hero_level*30;
			System.out.println(monster_name + " 데미지는 " + damage_sum +"입니다.");
			hero_damage = monster_power;
			if (monster_defense >= monster_damage) {
				//몬스터 방어력이 입는 데미지보다 높아서 죽지 않을 때
				monster_damage = 0;
			}
			else {
				//몬스터가 데미지를 입을 때
				monster_hp = monster_hp + monster_defense - damage_sum;
			if (monster_hp <= 0) {
					//몬스터가 죽을 때
					System.out.println(monster_name + "가 죽었습니다.");
					hero_experience += monster_experience;
					hero_money += monster_money;
			break;
				}
				System.out.println(monster_name + "의 공격입니다.");
				System.out.println("히어로의 데미지는" + monster_power +"입니다");
				if (hero_defense >= monster_power)
					hero_hp = hero_hp;
				else
					hero_hp = hero_hp + hero_defense - monster_power;
				if (hero_hp <= 0) {
					hero_hp = 1;
					System.out.println("히어로가 다시 부활합니다.");
					break;
					//아마 턴제 게임으로 하려면 루프로 받아야 할듯
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
		}
	}
}


Static int hero_attack() {
	Scanner sc =new Scanner(System.in);
	System.out.println("1. 쓰러스트");
	System.out.println("공격번호를 입력하세요 :");
	int num = sc.nextInt();
	int damage_sum = 0;
	if (num == 1) {
		damage_sum += hero_level * 10;
		damage_sum += hero_power * 30;
	}
	System.out.printf("데미지는 %d 입니다.\n", damage_sum);
	}
Static int hero_attacked(int hero_damage) {
	if (hero_defense >= hero_damage) {
			hero_hp = hero_hp - 0;
	}
	else {
		hero_hp = hero_hp - hero_damage;
	}
}
Static int monster_attack() {
	int hero_damage = monster_power;
	System.out.printf("몬스터가 입힌 데미지는 %d입니다.",hero_damage);
	return hero_damage;
}
Static void monster_attacked(int damage_sum )	{
	if (monster_defense >= damage_sum) {
			monster_hp = monster_hp - 0;
	else {
			monster_hp = monster_hp - damage_sum;
			}
	}
}
	
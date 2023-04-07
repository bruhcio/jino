package test;

import java.util.Scanner;

public class method_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}	
	for (hero_money = hero_money; hero_money > 0; )
 static int hero_attack() {
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
		return damage_sum;
			}
 static int hero_attacked(int hero_damage) {
			if (hero_defense >= hero_damage) {
					hero_hp = hero_hp - 0;
			}
			else {
				hero_hp = hero_hp - hero_damage;
			}
		}
 static int monster_attack() {
			int hero_damage = monster_power;
			System.out.printf("몬스터가 입힌 데미지는 %d입니다.",hero_damage);
			return hero_damage;
		}
 static void monster_attacked(int damage_sum )	{
			if (monster_defense >= damage_sum) {
					monster_hp = monster_hp - 0;
			}
			else {
					monster_hp = monster_hp - damage_sum;
					}
 }
}

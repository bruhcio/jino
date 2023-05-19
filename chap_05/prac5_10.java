package chap_05;
import java.util.Random;
import java.util.Scanner;

public class prac5_10 {
	public static void main(String[] args) {
		int com[] = new int[3];
		Random r = new Random();
		
		while (com[0] == 0) {
			com[0] = r.nextInt(10);
		}
		while (com[0] == com[1] || com[1] == 0) {
			com[1] = r.nextInt(10);
		}
		while (com[2] == com[0] || com[2] == com[1] || com[2] == 0) {
			com[2] = r.nextInt(10);
		}
		int user[] = new int[3];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			int strike = 0;
			int ball = 0;
			for(int i = 0; i < user.length; i++) {
				System.out.print((i + 1) + "번쨰 수 :");
				user[i] = sc.nextInt();
				if (user[i] > 9 || user[i] <= 0) {
					System.out.println("숫자 범위는 1~9입니다.");
				}
			}
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (com[i] == user[j] && i == j) {
						strike++;
					}
					else if (com[i] == user[j] && i != j) {
						ball++;
					}
				}
			}
			System.out.println(strike + "스트라이크" + ball + "볼");
			count++;
			if(strike == 3) {
				System.out.println("게임 끝\n" + count + "번쨰 시도 성공");
				break;
			}
			
		}

	}

}

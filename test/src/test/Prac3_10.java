package test;
import java.util.Scanner;
public class Prac3_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("성적을 입력하세요 : ");
			int x =in.nextInt();
			int y =x/10;
			switch (y) {
			case 10,9:
				System.out.println("당신의 성적은 A입니다.");
			break;
			case 8,7:
				System.out.println("당신의 성적은 B입니다.");
			break;
			case 6,5:
				System.out.println("당신의 성적은 C입니다.");
			break;
			case 4:
				System.out.println("당신의 성적은 D입니다.");
				break;
			default :
				System.out.println("당신의 성적은 F입니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if (x<0) {
				break;
			}
		}
	}
}

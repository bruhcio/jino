package test;

import java.util.Scanner;

public class Prac3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("양의 정수를 입력하세요");
			int x = in.nextInt();
			int sum = 0;
			for (int y = x; y>0; y--) {
				sum += y;
			}
			if (x==999) {
				System.out.println("프로그램을 종료합니다.");
			break;
			}
			System.out.printf("1부터 %d까지의 합은 %d입니다.\n", x, sum);
			}
			in.close();
		}
}
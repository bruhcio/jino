package test;

import java.util.Scanner;

public class Prac3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int x = in.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int y = in.nextInt();
		System.out.printf("두 수중에 큰 수는 %d입니다.\n", get_max(x, y));
	}
		public static int get_max(int x, int y) {
			if (x>y) {
				return x;
			}
			if (x<y) {
				return y;
			}
			return 0;
		}
		
		
		}

	


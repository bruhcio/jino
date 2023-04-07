package test;
//1부터 키보드로 입력한 수까지의 합을 구해 다음과 같이 출력하는 프로그램을 작성
//양의 정수를 입력하세요 : 100
//1부터 100까지 합은 5050입니다.

import java.util.Scanner;

public class Prac3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요 :");
		int x = in.nextInt();
		int sum = 0;
		for (int y=1;y <= x; y++) {
			sum += y;	
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", x, sum );
	}


}

package test;

import java.util.Scanner;

public class Prac3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x, sum = 0;
		do {
			System.out.println("양의 정수를 입력하세요 : ");
			x=in.nextInt();
			if (x%2==0)
				sum += x;
				
		} while (x>0);
		System.out.printf("입력한 양의 정수 중에서 짝수의 합은 %d",sum);
			

	}

}

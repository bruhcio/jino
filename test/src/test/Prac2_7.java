package test;
import java.util.Scanner;
public class Prac2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("0~999숫자를 입력하세요 : ");
		int x = in.nextInt();
		int y = x/100;
		int z = x%100/10;
		int r = x%100%10;
		System.out.printf("각 자리수의 합 =  %d", y+z+r);
		

	}

}

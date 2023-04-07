package test;
import java.util.Scanner;
public class practice2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("원하는 정수 입력 : ");
		int x = in.nextInt();
		
			if (x%2 == 0)
				System.out.printf("%d 는 짝수입니다.",x);
			else
			
				System.out.printf("%d는 홀수입니다.",x);
	}

}

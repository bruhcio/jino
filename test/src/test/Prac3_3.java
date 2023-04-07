package test;
import java.util.Scanner;
public class Prac3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("출력하고자 하는 구구단 : ");
		int i = in.nextInt();
		int x = 1;
		while (x<10) {
			System.out.print(x+"*"+i+"="+i*x+"\n");
			// 여기서 println과 print의 차이는 무엇인가??
			// 왜 값이 살짝 다르게 출력되는지?
			x++;
		}
		

	}

}

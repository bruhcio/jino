package test;
import java.util.Scanner;
public class Prac3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("5자리 숫자를 입력하세요 : ");
		int x =in.nextInt();
		int a = x/10000;
		int b = x%10000/1000;
		int c = x%1000/100;
		int d = x%100/10;
		int e = x%10;
		System.out.printf("1의 자리 : %d\n",a);
		System.out.printf("1의 자리 : %d\n",b);
		System.out.printf("1의 자리 : %d\n",c);
		System.out.printf("1의 자리 : %d\n",d);
		System.out.printf("1의 자리 : %d\n",e);
		int even = 0;
		int odd = 0;
		if (a%2==0)
			even = even + 1;
		else 
			odd = odd +1;
		if (b%2==0)
			even = even + 1;
		else 
			odd = odd +1; 
		if (c%2==0)
			even = even + 1;
		else 
			odd = odd +1;
		if (d%2==0)
			even = even + 1;
		else 
			odd = odd +1;
		if (e%2==0)
			even = even + 1;
		else 
			odd = odd +1;
		System.out.printf("짝수의 갯수 : %d\n",even);
		System.out.printf("홀수의 갯수 : %d\n",odd);
		
		

	}

}

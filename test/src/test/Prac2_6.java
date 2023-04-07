package test;
import java.util.Scanner;
public class Prac2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x =in.nextInt();
		System.out.println("4와 5로 나누어진다 : "+((x%4==0) && (x%5==0)));
		System.out.println("4 또는 5로 나누어진다 : "+((x%4==0) || (x%5==0)));
		System.out.println("4나 5 중 하나로는 나누어지지만 둘 모두로는 나누어지지 않는다 : " + (((x%4==0) || (x%5==0)) ^ ((x%4==0) && (x%5==0))));
		
			}

}

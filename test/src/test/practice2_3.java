package test;
import java.util.Scanner;
public class practice2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("원기둥의 밑면의 반지름은?");
		double x = in.nextDouble();
		System.out.println("원기둥의 높이는?");
		double y = in.nextDouble();
		System.out.printf("원기둥의 부피는 %017.14f", 3.14*x*x*y);
	}

}

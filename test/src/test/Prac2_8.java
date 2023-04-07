package test;
import java.util.Scanner;
public class Prac2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("전공 이수 학점 : ");
		int x = in.nextInt();
		System.out.println("교양 이수 학점 : ");
		int y = in.nextInt();
		System.out.println("일반 이수 학점 : ");
		int z = in.nextInt();
		int a =x+y+z;
		//a = 총 이수학점
		boolean aa =((a>=140)&&(x>=70)&&((y>=30)&&(z>=30)||(y+z>=80)))?true:false;
		System.out.println(aa?"졸업가능":"졸업불가능");
		

	}

}

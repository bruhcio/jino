package chap_05;
import java.util.Scanner;
public class prac5_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		
		for (int i =0; i<intArray.length; i++) {
			System.out.print((i + 1) + "번쨰 입력 : ");
			intArray[i] = in.nextInt();
			if (intArray[i]> max)
				max = intArray[i];
		
		}
		System.out.print("입력된 가장 큰 수는 " + max + "입니다");
		
	}

}

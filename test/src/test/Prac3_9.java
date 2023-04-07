package test;

import java.util.Scanner;

public class Prac3_9 {
	//while(true)
	//x= in.nextint();
	//if(조건)break;
	//switch(x) {
	// case 1-> print
	// case 2,3-> print
	// case 4,5,6 -> print
	// default -> print
	//}
	//}
	//2번쨰 
	//while((x=in.nextint())!=0) {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("등수 입력 : ");
		int x;
		while ((x = in.nextInt()) != 0) {
			switch (x) {
				case 1:
					System.out.println("아주 잘했습니다.");
					System.out.println("등수 입력 : ");
					break;
				case 2,3:
					System.out.println("잘했습니다.");
					System.out.println("등수 입력 : ");
					break;
				case 4,5,6:
					System.out.println("보통입니다.");
					System.out.println("등수 입력 : ");
					break;
				default:
					System.out.println("노력해야겠습니다.");
					System.out.println("등수 입력 : ");
					break;
			}
		}
		

	}

}

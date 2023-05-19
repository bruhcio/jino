package chap_05;

import java.util.Scanner;

public class Prac5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

			StringBuffer outputString = new StringBuffer();
			Scanner scan = new Scanner(System.in);
			System.out.print("단어 입력: ");
			String user = scan.nextLine();
			for (int i = 0; i < user.length(); i++) {
			outputString.append("-");
			}
			System.out.println("\n 단어(" + user.length() + "글자" + "):" + outputString);
		
		
	}

}

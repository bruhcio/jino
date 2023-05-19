package chap_05;
import java.util.Scanner;
public class prac5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hiddenString = "hello";
		StringBuffer outputString = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		String user;
		int remainder = hiddenString.length();
		
		for (int i = 0; i < hiddenString.length(); i++) { 
		outputString.append('-');
		}
		while (outputString.indexOf("-") >= 0) {
		System.out.println("\n단어("+ hiddenString.length() + "글자" + "):" + outputString);
		System.out.print("1.문자를 입력하세요. : ");
		user = scan.next();
		char ch = user.charAt(0);
		
		boolean found = false;
		for (int i = 0; i < hiddenString.length(); i++) {
		if (hiddenString.charAt(i) == ch && outputString.charAt(i) != ch) {
		outputString.setCharAt(i, ch);
		found = true;
		remainder--;
		}
		}
		if (found == false) {
			System.out.println("일치하는 문자가 없습니다.");
		}
		}
		System.out.println("단어(5글자): " + hiddenString +"\n축하합니다");
	}
}

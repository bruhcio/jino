package chap_05;
import java.util.Scanner;
public class prac_5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		while (true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("URL을 입력하세요 : ");
		s = sc.next();
		if (s.equals("bye")) {
			break;
		}
		if (s.endsWith("com")) {
			System.out.println(s + "은 'com'으로 끝납니다.");
		}
		if (s.contains("java")){
			System.out.println(s + "은 'java'를 포함합니다.");		
		}
	}
	}

}

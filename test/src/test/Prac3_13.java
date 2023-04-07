package test;
import java.util.Scanner;
public class Prac3_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String c = input(in, "철수");
		String y = input(in, "영희");
		whoswin(c,y);
	}	
	public static String input(Scanner in, String player) {
		System.out.print(player + " : ");
		String choice = in.next();
		return choice;
	}
	public static void whoswin(String c, String y) {
		//return값이 없으니까 void기억하기
		if (c.equals(y))
			System.out.println("무승부!");
		else if (c.equals("r")) {
			if (y.equals("p"))
				System.out.println("영희, 승!");
			else
				System.out.println("철수, 승!");
		}else if (c.equals("p")) {
			if (y.equals("s"))
				System.out.println("영희,승!");
			else
				System.out.println("철수, 승!");
		}else {
			if (y.equals("r"))
				System.out.println("영희, 승!");
			else
				System.out.println("철수, 승!");
		}
		
	}

}


//Scanner in = new Scanner(System.in);
//System.out.println("철수 : ");
//String c = in.next();
//System.out.println();
//string y = in.next();

//if (c.equals(y))
//System.out.println("무승부!");
//else if (c.equals("r")) {
//if (y.equals("p"))
//	System.out.println("영희, 승!");
//else 
//	System.out.println("철수, 승!");
//}else if (c.equals("p")) {
//if (y.equals("s"))
//	System.out.println("영희, 승!");
//else 
//	System.out.println("철수, 승!");
//}else {
	//	if (y.equals("r"))
//	System.out.println("영희, 승!");
//else 
//	System.out.println("철수, 승!");
//}
//}



//}

package chap_05;

public class prac_5_1 {
	static int countChar(String s, char c) {
		int count = 0;
		for (int i =0; i < s.length();i++) {
			if(s.charAt(i) == c) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countChar("jazz",'z'));
	}

}

package chap_05;

public class prac5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		char a = 'A';
		char[] alpha = new char[26];
		
		for (i =0; i<alpha.length; i++)
			alpha[i] = a++;
		
		for(i = 0; i<alpha.length; i++) {
			for(j = 0; j<= i; j++)
				System.out.print(alpha[j]);
			System.out.println();
		}
		
	}

}

package chap_05;
// 2중 for문 2번
public class prac5_11 {
public static void main(String[] args) {
	int [][]hang = new int[5][5];
	int inc = 1;
	int i,j;
	for (i = 0; i < hang.length; i++) {
		for (j = 0; j < hang[i].length; j++) {
			hang[i][j] = inc++;
		}
	}
		for (i=0; i < hang.length; i++) {
		for (j = 0; j < hang[i].length; j++) {
			System.out.printf("%2d", hang[i][j]);
		}
		System.out.println();
	}
	
}
}

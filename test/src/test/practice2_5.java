package test;
import java.util.Scanner;
public class practice2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("초 단위 정수를 입력하세요 : \n");
		int sec = in.nextInt();
		// 초(sec)를 60으로 나누고 나머지(min_1)는 그대로 초로 몫을 다시 60으로 나누어서 분 만들고 나머지 분으로 쓰기 
		int min = sec/60;
		int min_1 = sec%60;
		int hour = min/60;
		System.out.printf("%d시간 %d분 %d초",hour,min,min_1);
				
	}

}

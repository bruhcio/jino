package chap_05;
import java.util.ArrayList;
import java.util.Scanner;
//동적배열 이용해서 작성
public class prac5_12 {

	public static void main(String a[]) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
	ArrayList<Integer> scores = new ArrayList<>();
	int data;
	int n =0;
	while (true) {
		System.out.print(++n + "원소 입력:");
		if ((data = in.nextInt()) < 0)
			break;
		scores.add(data);
	}
	System.out.print("배열 원소 : ");
	for (int i :scores)
		System.out.print(i + "");
	}

}

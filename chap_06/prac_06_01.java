package chap_06;
import java.util.Scanner;


	class Total{
		int kor;
		int eng;
		int mat;
		int tot;
		public void calc_total() {
			tot = kor + eng +mat;
			System.out.println("총점은" + tot + "이다.");
		}
	}
	class Average extends Total{
		double avr;
		void calc_avr() {
			avr = tot/3.0;
			System.out.println("평균은" + avr +"이다.");
		}
	}

	
	public class prac_06_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average av = new Average();
		Scanner sn = new Scanner(System.in);

		System.out.print("국어 :");
		av.kor = sn.nextInt();
		System.out.print("수학 :");
		av.eng = sn.nextInt();
		System.out.print("영어 :");
		av.mat = sn.nextInt();
		
		av.calc_total();
		av.calc_avr();
	}

}

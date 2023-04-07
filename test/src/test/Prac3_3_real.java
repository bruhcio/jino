package test;

public class Prac3_3_real {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		while (x<10) {
			//왜 여기에 인트가 들어가야 제대로 돌아가는지?
			int y=1;
			while (y<10) {
				System.out.printf("%d * %d = %d\n",x,y,x*y);
				y++;
			}	
			System.out.println();
			x++;

		}

	}
}

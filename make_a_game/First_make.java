package make_a_game;

public class First_make {
//메인 스토리 플롯 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("스토리 어쩌고 저쩌고");
		System.out.println("처음으로 갈 국가는 : 처음으로 갈 곳 결정");
		
		 status status = new status();
		 status.setHPValue(3);
		 int currentHP = status.getHPValue();
	        System.out.println("현재 HP: " + currentHP);

	}

}

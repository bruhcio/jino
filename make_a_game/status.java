package make_a_game;

public class status {
	private HP hp; //HP클래스를 멤버 변수로 선언
	private Mental mental;
	private Money money;
	String Nick_name;
	String item;
	
	public status() {
		hp = new HP(); // HP 객체를 초기화
		mental = new Mental();
		money = new Money();
	
	}
	
	//HP클래스 정의
	private class HP{
		private int value; //HP 값을 저장하는 변수
		
		public void setValue(int value) {
			this.value = value;//HP 값을 설정
		}
		public int getValue() {
			return value; //HP값을 반환
		}
	}
	public void setHPValue(int value) {
		hp.setValue(value); // HP값을 설정하는 메서드
		
	}
	public int getHPValue() {
		return hp.getValue(); // HP값을 반환하는 메서드
		
	}
	public void printCurrenHP() {
		System.out.println("현재 HP: " + hp.getValue());
	}
	
	
	
	private class Mental{
		private int value; // Mental 값을 저장하는 변수
		
		public void setValue(int value) {
			this.value = value;// Mental 값을 설정
		}
		public int getValue() {
			return value; // Mental값을 반환
		}
	}
	public void setMentalValue(int value) {
		mental.setValue(value); // Mental값을 설정하는 메서드
		
	}
	public int getMentalValue() {
		return mental.getValue(); // Mental값을 반환하는 메서드	
	}
	public void printCurrenMental() {
		System.out.println("현재 mental: " + mental.getValue());
	}
	

	private class Money{
		private int value; // Money 값을 저장하는 변수
		
		public void setValue(int value) {
			this.value = value;// Money 값을 설정
		}
		public int getValue() {
			return value; // Money값을 반환
		}
	}
	public void setMoneyValue(int value) {
		mental.setValue(value); // Money값을 설정하는 메서드
		
	}
	public int getMoneyValue() {
		return mental.getValue(); // Money값을 반환하는 메서드
		
	}
	public void printCurrenMoney() {
		System.out.println("현재 money: " + money.getValue());
	}
	
	
}


//public static void main(String[] args) {
//}

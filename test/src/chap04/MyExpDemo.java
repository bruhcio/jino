package chap04;//4-4

class MyExp{
	//public static으로 정의하지 않으면 메서드 아니라 다른 파일로 무언가 생기는 거임
	//근데 가시성을 위해서는 2개로 만드는 게 좋을 듯
	int base, exp;
	//핸드폰 자체 액정에 차단 기능을 넣는다면? - 이거는 그냥 생각임
	//온오프 할 수 있는 - 위와 같음
	
	int getValue() {
		//이것도 사실 publlic static int로 해도 가능함 
		int x = 1;
		int base_sum = base;
			while(x<exp) {
				base_sum = base_sum * base;
				x++;
			}
		return base_sum;
	}
	void print() {
	System.out.println(base + "의" + exp + "승 = " + getValue());
}
}
public class MyExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyExp number1 = new MyExp();
		MyExp number2 = new MyExp();
		number1.base = 2;
		number1.exp  = 3;
		number1.print();
		number2.base = 3;
		number2.exp  = 4;
		number2.print();
	
	}

}

package chap04;//4-2

class Phone {
	String model;
	//뒤에 보면  그냥 문자열이니까 스트링임을 유추하고
	int value;
	//뒤에 보면 정수 값이므로 정수 선언
	
	void print() {
		//마찬가지로 프린트니까 프린트 해주자	
		System.out.println(value + "만원 짜리 " + model + "스마트폰");
	}
}
public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 S8";
		myPhone.value = 100;
		myPhone.print();
		
		
		//다른 거 
		Phone yourPhone = new Phone();
		yourPhone = myPhone;
		yourPhone.print();
		
		//원래 거 
		//myPhone.model = "G6";
		//myPhone.value = 85;
		//myPhone.print();
		

	}

}

package chap_05;

//equals를 equalsIgnoreCase로 바꾸기
//compare로 바꿔보기
class Cars{
	String color;
	static int numOfCar = 0;
	static int numOfRedCar = 0;
	
	Cars(String color){
		this.color = color;
		numOfCar++;
		if (color.equalsIgnoreCase("red"))
				numOfRedCar++;
	}
	static int getNumOfCar() {
		return numOfCar;
	}
	static int getNumOfRedCar() {
		return numOfRedCar;
	}
}
public class Car_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cars c1 =new Cars("red");
Cars c2 =new Cars("blue");
Cars c3 =new Cars("Red");
System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Cars.getNumOfCar(), Cars.getNumOfRedCar());
	}

}
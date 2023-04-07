package test;//4-1

	class Rectangle2 {
	
	double width = 10;
	double length = 50;
	double calc_area() {
		return width * length;
	

}


}

public class ExeRectangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle2 rec = new Rectangle2();
	 	 //rec은 뭐임??
		 System.out.println("사각형의 면적은 : "+ rec.calc_area());
				

	}

}

package chap_05;
import java.util.ArrayList; 
public class Test_prac_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hi, Java!";
		String s2 = new String("Hi, Java!");
		String s3 = "Hi, Code!";
		String s4 = "Hi, java!";
		
		System.out.println(s1.equals(s2));
		// equals는 문자열을 현재 문자열과 비교 후 true or false 반환
		// boolean과 같은 느낌아닌가???
		//문자열과 객체를 받아서 하는 것이라서 같다고 하는 것 같음
		System.out.println(s1.equals(s3));
		//문자열과 문자열이라서 다르다고 하는 듯
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		//equalsIgnoreCase의 경우 대소문자 무시하고 그냥 비교하게 해줌
		
		System.out.println(s1.compareTo(s3));
		//compareTo는 문자열을 사전 순으로 베교해서 정수 값을 반환한다.
		//7이 나오는 이유 : c가 99이고 j가 106이라서 차이가 7이 난다.(아스키 코드)
		//꼭 알 필요는 없을 듯
		System.out.println(s1.compareToIgnoreCase(s4));
		//문자열이 완전 같으면 0으로 출력된다.
		System.out.println(s3.compareTo(s4));
		System.out.println("hi, Java!".compareToIgnoreCase("hi, java!"));
	
	}
		class problem_Two{
			String r1 = new String("Hi,");
			String r2 = new String(" Java");
			void printLength() {
			System.out.println("문자열 길이(r1) : " + r1.length());
		}
		}
}

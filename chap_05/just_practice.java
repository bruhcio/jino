package chap_05;

public class just_practice {

	public static void main(String[] args) {
//		String s1 = "hi, java!";
//		String s2 = "hi, java!";
//		String s3 = new String("hi, java!");
//		String s4 = new String("hi, java!");
//		System.out.println("s1 == s2 -> " + (s1 == s2));
//		System.out.println("s2 == s3 -> " + (s1 == s3));
//		System.out.println("s3 == s4 -> " + (s3 == s4));
//		s1 = s3;
//		System.out.println("s1 == s3 -> " + (s1 == s3));
		String s1 = "hi, java!";
		String s2 = new String("hi, java!");
		String s3 = "hi, code!";
		String s4 = "hi, java!";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println(s1.compareTo(s4));
		System.out.println("hi, java!".compareToIgnoreCase("hi, java!"));
	
	
	
	
	
	
	
	
	
	}

}

package chap_05;

public class prac5_13 {
	public static int[] reverse(int[] org) { 
		//매개변수 org
		int[] a = new int [org.length];
		for (int i = 0, j = a.length -1; i < org.length; i++, j--) {
			a[j] = org[i];
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] data = {1,3,5,7,9};
 int [] result = reverse(data);
	System.out.print("변환 전 :");
	for (int i : data)
		System.out.print(i + " ");
	System.out.print("\n변환 후 :");
	for (int i : result)
		System.out.print(i + " ");
	
	}

}

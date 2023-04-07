package test;

public class Prac3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 1; i <= 5; i++) {
	for (int j = 1; j <= i; j++) {
		System.out.print("*");
		//처음에 i가 1일 때 j가 1이면 true라서 그대로 간다.
		//다만 j가 2로 올라가면 false이므로 *를 출력하지 않고 다시 처음의 i로 올라간다
		//그럼 i가 2가 되면서 j가 **를 출력한다. 
	}
		System.out.println("");
		//마지막에 이 코드 치는 거는 줄과 줄 사이에 고의적으로 공간을 두려고 만듬
}
	}

}

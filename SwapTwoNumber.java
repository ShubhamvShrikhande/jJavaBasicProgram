package MyProgram;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 0;
		System.out.println("before swapping");
		System.out.println(a + " " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("after swapping");
		System.out.println("a=:" + a + "b:" + b);
	}

}

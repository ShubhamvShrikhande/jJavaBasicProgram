package MyProgram;

public class FibonacciNumber {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int Number = 10;
		System.out.println(a + " " + b);
		for (int i = 1; i <= Number; i++) {
			int temp = a + b;
			System.out.println("" + temp);
			a = b;
			b = temp;
		}

	}

}

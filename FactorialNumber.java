package MyProgram;

public class FactorialNumber {

	public static void main(String[] args) {
		int Number = 5;
		int temp = 1;
		for (int i = 1; i <= Number; i++) {
			temp = temp * i;
		}
		System.out.println("Number is:" + temp);
	}
}

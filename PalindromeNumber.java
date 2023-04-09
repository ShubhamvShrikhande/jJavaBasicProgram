package MyProgram;

public class PalindromeNumber {

	public static void main(String[] args) {
		int a;
		int temp;
		int sum = 0;
		int num = 1222;
		temp = num;
		while (num > 0) {
			a = num % 10;
			sum = (sum * 10 + a);
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println(temp+  ": it is palindrom number");
		} else {
			System.out.println(temp+  " :it is not a paldrom number");
		}

	}

}

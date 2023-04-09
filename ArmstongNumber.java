package MyProgram;

public class ArmstongNumber {
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int len = 0;

		while (num > 0) {
			num = num / 10;
			len++;
		}
		System.out.println("Length is :: " + len);
		num = temp;
		int sum = 0;
		while (num > 0) {
			int product = 1;
			int rem = num % 10;
			for (int i = 1; i <= len; i++) {
				product = product * rem;
			}
			sum = sum + product;
			num = num / 10;
		}
		System.out.println(sum);
		if (temp == sum) {
			System.out.println(temp + " is a armstrong number");
		} else {
			System.out.println(temp + " is a not armstrong number ");
		}
	}

}

package MyProgram;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Number is Even:" + num);
		} else {
			System.out.println("Number is odd:" + num);
		}
	}

}

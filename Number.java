package MyProgram;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		System.out.println("Enter a numbers like 1 ,10,100,1000,.... :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1)
			System.out.println("	Unit");
		else if (a == 10)
			System.out.println("Ten");
		else if (a == 100)
			System.out.println("Hundred");
		else if (a == 1000)
			System.out.println("Thousand");
		else if (a == 10000)
			System.out.println("Ten Thousand");
		else if (a == 100000)
			System.out.println("One Lakh");
		else if (a == 1000000)
			System.out.println("Million");
		else
			System.out.println("number is not available");
	}

}

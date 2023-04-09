package MyProgram;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		System.out.println("Enter a character : ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'a':
		case 'i':
		case 'o':
		case 'u':
		case 'e':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("It is a vowel");
			break;
		default:
			System.out.println("it is a consonent");
		}

	}

}

package practice4Loops;
/**
 * 
 * @author Alonso Herreros Copete
 * 
 */

import java.util.Scanner;

public class Section01 {

	public static void exercise01() {
		Scanner input = new Scanner(System.in);

		System.out.println("We're going to check for odd or even numnbers.");
		for (int i = 0; i < 5; i++) {
			System.out.print("Input a number: ");
			System.out.printf("That number is %s.\n", (input.nextInt()&1) == 0 ? "even":"odd");
		}
		System.out.println("That's it for checking odd or even numbers.");
	}

	public static void exercise02() {
		Scanner input = new Scanner(System.in);
		int n;

		System.out.print("Insert a number to check its times table: ");
		n = input.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %2d = %d\n", n, i, i*n);
		}
	}

	public static void exercise03() {
		Scanner input = new Scanner(System.in);
		String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		String VOWELS = "aiueo";
		String str;

		System.out.print("Insert a string to replace vowels with x's: ");
		str = input.nextLine();
		
		for (int i=0; i<str.length(); i++) {
			String letter = str.substring(i,i+1);
			if (!ALPHABET.contains(letter)) {
				System.out.println("Your string contains forbidden characters.");
				return;
			}
			else if (VOWELS.contains(letter)) {
				str = str.replace(letter, "x");
			}
		}
		
		System.out.printf("Your transformed string is '%s'.\n", str);
	}

	public static void exercise04() {
		Scanner input = new Scanner(System.in);
		int n;
		int elem = 1;
		int prev = 0;

		System.out.print("Insert a number to get fib(n): ");
		n = input.nextInt();
		
		for (int i = 1; i < n; i++) {
			int tmp = elem;
			elem += prev;
			prev = tmp;
		}
		
		System.out.printf("The %d-th number of the Fibonacci sequence is %d.\n", n, elem);
	}

	
	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
		exercise04();
	}

}

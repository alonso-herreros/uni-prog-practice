package practice4Loops;
/**
 * 
 * @author 
 * @author 
 * 
 */
import java.util.Scanner;

public class Section03 {

	public static void exercise01() {
		Scanner input = new Scanner(System.in);
		int n;

		do {
			System.out.println("1- Option 1");
			System.out.println("2- Option 2");
			System.out.println("0- Exit");
			System.out.println();
			System.out.print("Select an option : ");
			n = input.nextInt();
		}
		while (n != 0);
	}

	public static void exercise02() {
		Scanner input = new Scanner(System.in);
		int lower = 0;
		int upper = 100;
		int number = lower + (int) (Math.random()*((float) upper + 1f));
		int attempts = 0;
		int guess;

		do {
			System.out.printf("Select a number between %d and %d: ", lower, upper);
			guess = input.nextInt();
			if (number < guess) {
				upper = guess;
			}
			else {
				lower = guess;
			}
			attempts++;
		}
		while (guess != number);
		
		System.out.printf("You guessed it! The number was %d. You used %d attempts.\n", number, attempts);
	}

	public static void exercise03() {
		Scanner input = new Scanner(System.in);
		int n, opt;

		System.out.print("Insert a number: ");
		n = input.nextInt();

		do {
			System.out.println("1- Factorial");
			System.out.println("2- Digit count");
			System.out.println("3- Exit");
			System.out.println();
			System.out.print("Select an option : ");
			opt = input.nextInt();
			switch (opt) {
			case 1:
				long product = 1;
				for (int i = 1; i<=n; i++) {
					product *= i;
				}
				if (product > 0) {
					System.out.printf("%d factorial is %d.\n", n, product);
				}
				else {
					System.out.printf("%d factorial can't be calculated.\n", n);
				}
				break;
			case 2:
				System.out.printf("%d has %d digit(s).\n", n, (int) Math.log10(n)+1);
				break;
			}
		}
		while (opt != 3);
	}

	

	
	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
		
	}

}

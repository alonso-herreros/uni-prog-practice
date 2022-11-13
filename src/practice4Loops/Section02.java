package practice4Loops;
/**
 * 
 * @author 
 * @author 
 * 
 */
import java.util.Scanner;

public class Section02 {

	public static void exercise01() {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int n = 0;

		System.out.println("We're going to calculate a sum.");
		while (n != -1) {
			System.out.print("Input a number (-1 to end): ");
			n = input.nextInt();
			sum += n;
		}
		
		System.out.printf("The sum of all of those numbers is %d.\n", sum);
	}

	public static void exercise02() {
		Scanner input = new Scanner(System.in);
		int n1, n2, n;

		System.out.print("Insert lower bound: ");
		n1 = input.nextInt();
		System.out.print("Insert upper bound: ");
		n2 = input.nextInt();
		
		n = n1;
		while (n<n2-1) {
			System.out.println(++n);
		}
		System.out.printf("And that's all the numbers between %d and %d.\n", n1, n2);
	}

	public static void exercise03() {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int n;

		System.out.print("Insert a number to check if it's perfect: ");
		n = input.nextInt();
		
		for (int i = 1; i < n; i++) {
			if (n%i==0) {
				sum += i;
			}
		}
		System.out.printf("Your number %d is %sperfect", n, (n==sum)? "":"not ");
	}

	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
	}

}

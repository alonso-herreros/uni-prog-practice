package practice3Conditionals;
/**
 * 
 * @author 
 * @author 
 * 
 */
import java.util.Scanner;

public class Section01 {

	public static void exercise01() {
		boolean a = true; 
		boolean b = false;
		int n1 = 5, n2 = 8;
		if ((!a && b) || !(n1>n2)) System.out.println("Result 1");
		if ((!a || b) || !(n2>n1)) System.out.println("Result 2");
		if ((n1>=n2) && (a || b)) System.out.println("Result 3");
		// That's cool, I guess.
	}

	public static void exercise02() {
		// It might be preferable to have one scanner in the main function and pass it to each
		// method, because you can't really close it here if you want to use it again...
		Scanner input = new Scanner(System.in);
		double weight, height, bmi;
		System.out.print("Insert your weight (kg): "); 
		weight = input.nextDouble(); 
		System.out.print("Insert your height (m): "); 
		height = input.nextDouble();
		// compute the bmi and print the nutritional condition
		bmi = weight / (height*height);
		// I like the ternary operator
		String range = (bmi<18.5)? "underweight" : (bmi<25) ? "normal" : (bmi<30)? "overweight" : "obese";
		// Aren't formatted strings so convenient?
		System.out.printf("Your BMI is %.1f, which is in the %s range.\n", bmi, range);
	}

	public static void exercise03() {
		Scanner input = new Scanner(System.in); 
		int age;
		double price, discount;
		System.out.print("Insert age (yr): "); 
		age = input.nextInt();

		discount = (age>65) ? 0.1 : 0.05;
		
		// I'm going to apply the discount right away
		System.out.print("Insert purchase price (EUR): "); 
		price = input.nextDouble() * (1-discount);
		
		System.out.printf("The final price is %.2f since you got a %d%% discount.\n", price, (int) (discount*100));
	}

	public static void exercise04() {
		Scanner input = new Scanner(System.in);
		double n1, n2;
		System.out.print("Insert first number to compare: "); 
		n1 = input.nextDouble();
		System.out.print("Insert second number to compare: "); 
		n2 = input.nextDouble();
		
		// This represents whether the first one was bigger
		boolean first = n1>=n2;
		
		// I really like the ternary operator
		System.out.printf((n1==n2)? "Both numbers, %.2f and %.2f, are equal.\n" : "%.2f is bigger than %.2f.\n", first? n1:n2, first? n2:n1);
	}

	public static void exercise05() {
		Scanner input = new Scanner(System.in);
		int grade;
		String grades = "ABCDE";
		System.out.print("Insert the foreign grade (0-20): ");
		grade = input.nextInt();

		if (grade < 0 || 20 < grade) {
			System.out.println("That grade is out of the accepted range.");
			return; // I can avoid the else statement by just returning here
		}
		// That's one way to map the numerical grades to letters...
		// I'm using bit shift instead of division by 2 because it's faster.
		System.out.printf("The local grade (A-E) is %c.\n", (grade>=14)? grades.charAt((21-grade)>>1) : 'E');
	}

	public static void exercise06() {
		Scanner input = new Scanner(System.in);
		int grade;
		char gradeLetter;
		System.out.print("Insert the foreign grade (0-20): ");
		grade = input.nextInt();

		if (grade < 0 || 20 < grade) {
			System.out.println("That grade is out of the accepted range.");
			return;
		}

		switch (grade) {
		case 20:
			gradeLetter = 'A';
			break;
		case 19: // Let it fall through.
		case 18:
			gradeLetter = 'B';
			break;
		case 17:
		case 16:
			gradeLetter = 'C';
			break;
		case 15:
		case 14:
			gradeLetter = 'D';
			break;
		default:
			gradeLetter = 'E';
		}

		System.out.printf("The local grade (A-E) is %c.\n", gradeLetter);
	}

	public static void exercise07() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Insert a number to check if it's even or odd: ");
		num = input.nextInt();
		// By doing bitwise AND, I can see if the LSB is 0 or 1.
		System.out.printf("%d is an %s number.\n", num, (num&1)==0? "even" : "odd");
		// This other way of doing it requires division (less efficient):
		// System.out.printf("%d is an %s number.\n", num, (num%2)==0? "even" : "odd");
	}

	public static void exercise08() {
		Scanner input = new Scanner(System.in);
		double[] P = {5f,5f}; // Our reference point
		String[][] ps = new String[2][2]; // Points in string form
		double dif = 0; // This is going to be the difference of the distances squared
		int closest; // I'm going to use this var to indicate which point was closer (0 or 1)

		System.out.print("Insert point 1 in x,y form: ");
		ps[0] = input.nextLine().split(",");
		System.out.print("Insert point 2 in x,y form: ");
		ps[1] = input.nextLine().split(",");

		// I'm not going to take the square root since we're only going to compare the values.
		// Instead, i'm going to use this to find the difference between the distances squared:
		// sqrt(Ax^2 + Ay^2)^2 - sqrt(Bx^2 + By^2)^2 = Ax^2 + Ay^2 - Bx^2 - By^2
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				// Get the single-component distance to P (x or y)
				double dist = Double.valueOf(ps[i][j]) - P[j];
				// Square and add (if it's point A) or subtract (if it's point B)
				dif += (i==0 ? 1:-1) * dist*dist;
				// I'm not 100% sure if you need to square them to get an accurate comparison though.
			}
		}
		
		if (dif == 0) {
			System.out.println("Both points are equally far from point (5,5).");
			return;
		}

		// If the second one was farther, dif will be negative.
		closest = (dif <= 0)? 0 : 1; 
		System.out.printf(
				"Point %d (%s,%s) was closer to (5,5) than point %d (%s,%s).\n",
				closest+1, ps[closest][0], ps[closest][1],
				2-closest, ps[1-closest][0], ps[1-closest][1]
			);
		
	}

	public static void exercise09() {
		Scanner input = new Scanner(System.in);
		double x, y;
		String opString;
		int op;

		System.out.print("Insert first number for operation: ");
		x = input.nextDouble();
		input.nextLine();
		System.out.print("Insert second number for operation: ");
		y = input.nextDouble();
		input.nextLine();
		System.out.print("Insert operation (s/r): ");
		opString = input.nextLine();
		
		op = opString.equals("s")? 1 : opString.equals("r")? 2 : -1;
		if (op == -1) {
			System.out.println("That's not a valid operation...");
			return;
		}

		System.out.printf("The %s of %.2f and %.2f is %.2f.\n", (op==1)? "sum" : "difference", x, y, (op==1)? x+y : x-y);
	}

	public static void exercise10() {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[3];
		System.out.print("Insert first number for sorting: ");
		nums[0] = input.nextInt();
		System.out.print("Insert second number for sorting: ");
		nums[1] = input.nextInt();
		System.out.print("Insert third number for sorting: ");
		nums[2] = input.nextInt();
		
		// Simple bubble sort, on the same array
		boolean sorted;
		do {
			sorted = true;
			for (int i = 0; i < nums.length-1; i++) {
				if (nums[i] < nums[i+1]) {
					int tmp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = tmp;
					sorted = false;
				}
			}
		} while (!sorted);
		
		System.out.printf("The numbers sorted in descending order are %d, %d and %d.\n", nums[0], nums[1], nums[2]);
	}

	public static void main(String[] args) {
		/*exercise01();
		exercise02();
		exercise03();
		exercise04();*/
		exercise05();
		exercise06();
		exercise07();
		exercise08();
    	exercise09();
		exercise10();
	}

}

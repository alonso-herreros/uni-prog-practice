package practice1Datatypes;
/**
 * 
 * @author 
 * @author 
 * 
 */
public class Section03 {

	public static void exercise01() {
		double val = 121;
		double sol = Math.sqrt(121);
		System.out.printf("Square root of %d is %d\n", (int) val, (int) sol);
	}

	public static void exercise02() {
		double val = 2;
		double power = 10;
		double sol = Math.pow(val, power);
		System.out.printf("%d to the power of %d is %d\n", (int) val, (int) power, (int) sol);
	}

	public static void exercise03() {
		int lower = 5;
		int upper = 10;
		int randInt = (int) (Math.random()* 5 + 5);
		System.out.printf("Here's a random integer in [%d, %d): %d\n", lower, upper, randInt);
	}
	
	public static void exercise04() {
		double radius;
		double circumference = 0;		
		radius = 10;
		//Your code here
		circumference = 2*radius*Math.PI;
		
		System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);

	}
	
	public static void exercise05() {
		double a=-1;
		double b=10;
		double c=-21;
		double x1,x2;
		//Calculate x1 y x2
		double insideSqrt = Math.pow(b, 2) - 4*a*c;
		if (insideSqrt < 0) {
			System.out.println("The solutions to this equation are not real numbers");
			return;
		}
		x1 = (-b+Math.sqrt(insideSqrt) ) / 2*a;
		x2 = (-b-Math.sqrt(insideSqrt) ) / 2*a;
		System.out.print("The equation is: ");
		System.out.println(a + "x2 + " + b + "x + " + c + " = 0");
		System.out.println("The solutions are x1 = " + x1+", x2 = "+x2);

	}
	
	public static void exercise06() {
		double base = 3;
		double x = 81;
		double logarithm;
		//your code here
		logarithm = Math.log(x)/Math.log(base);
		
		System.out.println("The logarithm base "+ base + " of "+ x + " is "+ logarithm );
		
	}
	
	public static void exercise07() {
		double h = 100;
		double angle = 30;
		double angleRad = 30.0 / 180 * Math.PI;
		double b = h * Math.cos(angleRad);
		
		System.out.printf("The b side of a triangle of hypotenuse %f and adjacent angle %f is %f\n", h, angle, b);
	}


	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
		exercise04();
		exercise05();
		exercise06();
		exercise07();
	}

}

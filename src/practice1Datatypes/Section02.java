package practice1Datatypes;
/**
 * 
 * @author 
 * @author 
 * 
 */
public class Section02 {

	public static void exercise01() {
		final int CONST=53;
		int op1 = 1;
		int op2 = 5;
		op1 += 8;
		op2 -= 10;
		int op3 = op1*op2;
		op3 += CONST;
		int quotientDiv = op3 / 3;
		int remainderDiv = op3 % 3;
		System.out.printf(
				"op1 = %d\n"
				+ "op2 = %d\n"
				+ "op3 = %d\n"
				+ "quotientDiv = %d\n"
				+ "remainderDiv = %d\n",
				op1, op2, op3, quotientDiv, remainderDiv);
		//initialize op1 with 1
		// initialize op2 with 5
		//sum 8 to op1
		//subtract 10 to op2
		//calculate op1 times op2 and store the result in op3
		//sum CONST to op3
		//Find the quotient of op3 over 3 and store it in quotientDiv
		//Find the remainder of op3 over 3 and store it in remainderDiv 
		//Print to screen the values of op1, op2, op3, quotientDiv, remainderDiv in separate lines 

	}
	
	public static void exercise02() {
		int varInt1 = 10;
		int varInt2 = 10;
		int varInt3 = 10;
		int res1 = 5-7*10+ varInt1  ;
		int res2 = 5-7*10+ varInt2++;
		int res3 = 5-7*10+ ++varInt3;
		
		System.out.printf("Result 1: %d, which is 5-7*10+varInt1, where varInt1 is 10\n", res1);
		System.out.printf("Result 2: %d, which is 5-7*10+varInt2++, where varInt2 was 10 before being used and increased to 11 after being used\n", res2);
		System.out.printf("Result 3: %d, which is 5-7*10+ ++varInt3, where varInt3 was increased 10 to 11 before being used\n", res3);
				
		System.out.printf("varInt1: %d, which was initialized as 10\n", varInt1);
		System.out.printf("varInt2: %d, which was initialized as 10 and increased after being used\n", varInt2);
		System.out.printf("varInt3: %d, which was initialized as 10 and increased before being used\n", varInt3);

	}
	
	public static void exercise03() {
		int varInt; // varInt is declared to be an integer
		varInt  = 0; // varInt is given the value of 0
		varInt += 5; // 5 is added to varInt
		varInt -= 2; // 2 is subtracted from varInt
		varInt *= 3; // varInt is multiplied by 3
		varInt /= 2; // varInt is divided by 2
		System.out.println(varInt); // The value of varInt is printed to stdout
		
	}
	
	public static void exercise04() {
		int age = 18;//age of the customer
		int reports = 0; //accidents reports
		boolean novice = false; //novice driver
		boolean discount = (
				age<60 && (
						age>40 && reports<5 ||
						age>28 && reports<3 ||
						age>17 && reports<2 && !novice
						)
				);
		//initialize age, fraction and novice for testing 
		//discount= boolean expression
		System.out.println("Discount= "+discount);
										 
	}

	public static void exercise05() {
		int bill50, bill20, bill10;
		int eurosToWithdraw=130;
				
		//Your code here
		bill50 = eurosToWithdraw / 50;
		bill20 = (eurosToWithdraw % 50) / 20;
		bill10 = (eurosToWithdraw % 50 % 20) / 10;
		
		System.out.println(	bill50+" 50 euros banknote ");
		System.out.println(	bill20+" 20 euros banknote ");
		System.out.println( bill10+" 10 euros banknote ");

	}
	
	public static void exercise06() {
		double kelvin, fahrenheit;
		//Initialize kelvin for testing
		kelvin = 293.15;
		//Your code here
		fahrenheit = (kelvin - 273.15)*9.0/5+32;
		
		System.out.println("Kelvin :     "+kelvin+"K");
		System.out.println("Fahrenheit : "+fahrenheit+"oF ");
	}

	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
		exercise04();
		exercise05();
		exercise06();			
	}

}

package practice1Datatypes;
/**
 * 
 * @author 
 * @author 
 * 
 */
public class Section04 {

	public static void exercise01() {
		byte varByte;
		short varShort;
		int varInt;
		long varLong;
		float varFloat;
		double varDouble;
				  
		varByte = 20;
		varShort = 2000 ;
		varInt = 2000000 ;
		varLong = 85000000L ;
		varFloat = 10.0E4F ;
		varDouble = 0.123456789e9;
		//explain the implicit conversions and 
		//make the necessary casts
		varInt    = varShort; // Implicit short (2B) -> int (4B)
		varDouble = varFloat; // Implicit float (32B) -> double (64B)
		varFloat  = varLong;  // Implicit long (8B) -> float (32B)
		varLong   = varInt;   // Implicit int (4B) -> long (8B)
		varByte   = (byte) varShort; // Cast short (2B) -> byte (1B)
		varShort  = (short) varInt;   // Cast int (4B) -> short (2B)
		
	}

	public static void exercise02() {
		long varLong;
		int varInt;
		short varShort;
		byte varByte;
		
		varInt = 33000;
		varLong = varInt;
		varShort = (short) varInt;
		varByte = (byte) varInt;
		
		System.out.printf("varInt = %d (original)\n", varInt);
		System.out.printf("varLong = %d (implicit 4B to 8B)\n", varLong);
		System.out.printf("varShort = %d (cast 4B to 2B, disregarding significant data)\n", varShort);
		System.out.printf("varByte = %d (cast 4B to 1B, disregarding significant data)\n", varByte);
		
	}

	public static void exercise03() {
		double varDouble;
		float varFloat;
		long varLong;
		int varInt;
		short varShort;
		byte varByte;
		
		varFloat = 33000.51f;
		varDouble = varFloat;
		varLong = (long) varFloat;
		varInt = (int) varFloat;
		varShort = (short) varFloat;
		varByte = (byte) varFloat;

		System.out.printf("varFloat = %f (original)\n", varFloat);
		System.out.printf("varDouble = %f (implicit 32B -> 8B)\n", varDouble);
		System.out.printf("varLong = %d (cast 32B to 8B integer, disregarding decimal places)\n", varLong);
		System.out.printf("varInt = %d (cast 32B to 4B integer, disregarding decimal places)\n", varInt);
		System.out.printf("varShort = %d (cast 32B to 2B integer, disregarding decimal places and other relevant bits)\n", varShort);
		System.out.printf("varByte = %d (cast 32B to 1B integer, disregarding decimal places and other relevant bits)\n", varByte);
	}
	
	public static void exercise04() {
		double bigD, normalD, smallD;
		float  bigF, normalF, smallF;
		bigD = 2.87e300;
		normalD  = 20.123456789;
		smallD  = 0.1E-200;
				
		bigF = (float) bigD;
		normalF  = (float) normalD;
		smallF  = (float) smallD;
					
		System.out.println("Big Double : " + bigD); 
		System.out.println("Big Float: " + bigF); // This number is so big it can't be represented as a float in 32 bytes
		System.out.println("Normal Double: " + normalD);
		System.out.println("Normal Float: " + normalF);
		System.out.println("Small Double: " + smallD);
		System.out.println("Small Float: " + smallF); // This number is so small it also can't be represented as a float in 32 bytes
		byte b1 =  (byte) 128;
		byte b2 =  127;
		byte b3 =  127;
		b3++;
		short s1 = (short) -32769;
		short s2 = -32768;
		short s3 = -32768;
		s3--;
		System.out.println("Byte  1 : " + b1); // This number is misinterpreted since 128 can't fit in an 8-bit signed integer
		System.out.println("Byte  2 : " + b2); 
		System.out.println("Byte  3 : " + b3); // This number is misinterpreted since 128 can't fit in an 8-bit signed integer
		System.out.println("Short 1 : " + s1); // This number is misinterpreted since -32769 can't fit in a 2-byte signed integer
		System.out.println("Short 2 : " + s2);
		System.out.println("Short 3 : " + s3); // This number is misinterpreted since -32769 can't fit in a 2-byte signed integer
	}

	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
		exercise04();
	}

}

package practice1Datatypes;
/**
 * 
 * @author 
 * @author 
 * 
 */
public class Section01 {
	
	public static void exercise01() {
		int aInteger = 2;
		long anotherInteger = (long) 7.200; // Basically, 7
		double decimal = 3.0;
		double anotherDecimal = 3.0;
		// I don't want to have problems with shortening so i'll allocate more memory to these vars
		short int16bits = 1000;
		int int32bits = 40000;
		char character = 'c';
		char anotherCharacter = 'c';		
		boolean aBoolean = true;
		
		byte an8bitVar = 4;
		byte oneByte = 3;
		double _anotherDecimal = 3.0;

	}

	public static void exercise02() {
		short var1 = 521;
		long var2 = 521L;
		double var3 = 5.21;		
		float var4 = 5.21f;
		double var5 = 5.21d;
		char var6 = '5';		
		char var7 = 'c';
		boolean var8 = true;
	}
	
	public static void exercise03() {
		byte students; //Number of students in a class(small group)
		short spectatorsCinema; //Number of spectators in a cinema 
		int spectatorsStadium; //Number of spectators in a big stadium
		float grade; //Mean grade of this course
		final boolean FALSE = false; //FALSE constant
		float salary; //Monthly salary of an employee 
		double pi; //PI constant
		short civicNum; //Civic number of a street in Madrid
		byte floors; //Floors of a building		
	}

	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
	}

}

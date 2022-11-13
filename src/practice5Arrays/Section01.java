package practice5Arrays;
/**
 * 
 * 
 * @author Alonso Herreros Copete
 * @author 
 * 
 */

public class Section01 {

	public static void exercise01(){
		int[] odds = new int[100];
		int sum = 0;
		
		for (int i = 0; i<odds.length; i++) {
			odds[i] = 1 + (i<<1); // More efficient multiplication by 2 using bit-shift
			sum += odds[i]; // Do the adding in the same loop
		}
		
		System.out.printf("The sum of the first 100 odd numbers is %d", sum);
		
	}

	public static void exercise02(){
	     int[] intArray = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }; // Initializing the array
	     System.out.print(" { "); // Use .print instead of .println 
	     for(int i=1 ; i < intArray.length ; i++) { // Looping over each element
	    	 // There is no entry at intArray.length, since that's out of bounds.
	    	 // We should use the "strictly lesser than" comparison operator.
	         System.out.print(" "+intArray[i]+","); // Priting each number and then a comma
	     }
	     System.out.println(" } ");
	
	}
	
	public static void exercise03(){
		int[][][] bets = new int[3][5][10];

		bets[0][0][9] = 1;
		bets[0][1][2] = 1;
		bets[0][2][5] = 1;
		bets[0][2][8] = 1;
		bets[0][3][4] = 1;
		bets[0][4][2] = 1;

		bets[1][0][9] = 1;
		bets[1][0][3] = 1;
		bets[1][2][3] = 1;
		bets[1][3][4] = 1;
		bets[1][3][6] = 1;
		bets[1][4][8] = 1;
		bets[1][4][9] = 1;

		bets[2][0][4] = 1;
		bets[2][0][8] = 1;
		bets[2][1][0] = 1;
		bets[2][1][8] = 1;
		bets[2][2][3] = 1;
		bets[2][3][5] = 1;
		bets[2][3][7] = 1;

		System.out.println("Lottery ticket");
		
		for (int n=0; n<bets.length; n++) {
			System.out.println("\nBet: " + n);
			for (int i=0; i<bets[n].length; i++) {
				for (int j=0; j<bets[n][i].length; j++) {
					System.out.printf(bets[n][i][j] == 1? "[ *]" : "[%2d]", i*10+j+1);
				}
				System.out.println();
			}
		}
		
	}
	
		
	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
		
	}

}

package practice5Arrays;
/**
 * 
 * 
 * @author Alonso Herreros Copete
 * @author 
 * 
 */

import java.util.Scanner;

public class Section02 {

	public static void exercise01(){
		Scanner input = new Scanner(System.in);
		String[] names = new String[5];
		
		for (int i=0; i<names.length; i++) {
			System.out.print("Enter a name: ");
			names[i] = input.nextLine();
		}
		// That's done, i guess. Not really doing anything with the array...
	}

	public static void exercise02(){
		String[] names = {"Name1", "Name2", "Name3", "Name4", "Name5"};
		String tmp;
		// Dummy array. We havent studied function calls yet...
		
		tmp = names[2];
		names[2] = names[1];
		names[1] = tmp;
		
	}
	
	
		
	public static void main(String[] args) {
		exercise01();
		exercise02();
		
	}

}

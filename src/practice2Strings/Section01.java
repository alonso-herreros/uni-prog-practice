package practice2Strings;
/**
 * 
 * 
 * @author 
 * @author 
 * 
 */
public class Section01 {
	
	public static void exercise01(){
		String string0 = " ";
		String string1 = "";
		
		System.out.printf( "String 0 is: %s. It is %sempty.\n", string0, string0.isEmpty()? "":"not ");
		System.out.printf( "String 1 is: %s. It is %sempty.\n", string1, string1.isEmpty()? "":"not ");
		
		
	}
	
	public static void exercise02() {
	
		//Convert primitive data types to String
		int anInteger = 5;
		String strInt = "2";
		String strInt0 = Integer.toString(anInteger);
		String strInt1 = String.valueOf(anInteger); 
		String strInt2 = ""+ anInteger;	
		System.out.println(strInt0);
		System.out.println(strInt1);
		System.out.println(strInt2);
				
		System.out.println("The sum of " + anInteger + " and " + strInt + " isn't " + anInteger + strInt);
		//We want the sum to be 7
		int sum;
		sum = anInteger + Integer.valueOf(strInt);
		System.out.println("The sum of " + anInteger + " and " + strInt + " is " + sum );
		
	}
	
	public static void exercise03(){
		//Comparacion de Strings
		String string0 = "Hello";
			
		String firstHalf = "He";
		String secondHalf = "llo";
		String string1 = firstHalf + secondHalf;
				
		String string2 = "hello";
		boolean areEquals1;
		boolean areEquals2;
				
		areEquals1 = (string0 == string1);
		System.out.println("Strings " + string0 + " and " + string1 + " are 'equals': " + areEquals1);
			
		// your code here	
		areEquals1 = string0.equals(string1);
 		System.out.println("Strings " + string0 + " and " + string1 + " are equals: " + areEquals1);
						
		areEquals2 = string0.equals(string2);
		System.out.println("Strings " + string0 + " and " + string2 + " are equals: " + areEquals2);
		// your code here	
		areEquals2 = string0.equalsIgnoreCase(string2);
		System.out.println("Strings " + string0 + " and " + string2 + " are equals: " + areEquals2);		
		
	}
	
	public static void exercise04(){
		String string = "1234abcde";

		//Get the length
		int length = string.length();
		//Calculate the index of the middle position of the string
		int middle_pos = (length+1) / 2 - 1;
		//Extract the character in that position
		char middle_char = string.charAt(middle_pos);
		//Print the character to screen
		System.out.println(middle_char);
		//Get the first character of the string and print it to screen
		System.out.println(string.charAt(0));
		//Get the last character and print it tos creen (hint: use the length of the string)
		System.out.println(string.charAt(string.length()-1));
	}
	public static void exercise05(){
		String stringWithoutQuotes = "the string";
		//Modify the assignment to have the word "string" within double quotes. 
		String stringWithQuotes = "the \"string\"";
		System.out.println(stringWithoutQuotes);
		System.out.println(stringWithQuotes);
		
		String stringWithoutTabs = "7 20 1 10";
		//Modify the assignation to have tabs instead of white spaces between numbers. 
		String stringWithTabs = "7\t20\t1\t10";
		System.out.println(stringWithoutTabs);
		System.out.println(stringWithTabs);
		
		String stringOneLine =  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget metus rutrum, aliquet est a, vulputate dui.";
		//Modify the assignation to add a new line between the two sentences
		String stringTwoLines = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\nPhasellus eget metus rutrum, aliquet est a, vulputate dui.";
		System.out.println(stringOneLine);
		System.out.println(stringTwoLines);
				
		//Print to screen a string with the path C:\Program Files\Java
		String stringPathWindows = "C:\\Program Files\\Java";
		System.out.println(stringPathWindows);	
		
	}
	
	public static void exercise06(){
		String stringWithSpaces = "    String with spaces    ";
		String stringWithoutSpaces = stringWithSpaces.trim();
		//Complete the assignment to remove the leading and trailing spaces from stringWithSpaces
		
		System.out.println("The string with spaces is    ("+stringWithSpaces +")");
		System.out.println("The string without spaces is ("+stringWithoutSpaces +")");
	}
	
	public static void exercise07(){
		String smallText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget metus rutrum, aliquet est a, vulputate dui. Phasellus lobortis sit amet purus id viverra. Sed in nisi libero. Mauris suscipit maximus tortor sit amet sagittis. Nunc a congue libero, quis pulvinar justo. Quisque faucibus, nisl et imperdiet lacinia, lacus risus dapibus ex, sit amet tincidunt leo augue id sapien. Fusce suscipit vitae dolor et aliquet.";
		
		System.out.println(smallText);
		//Check if the string starts with "Lorem". Print the result to screen
		System.out.printf("The string %s with \"Lorem\".\n", smallText.startsWith("Lorem")? "starts":"doesn't start");
		//Check if the string ends with "aliquet". Print the result to screen
		System.out.printf("The string %s with \"aliquet\".\n", smallText.endsWith("aliquet")? "ends":"doesn't end");
		// COMMENT: The string ends with "aliquet.". One could remove trailing punctuation, but that's not the point of this exercise.
		//Get and print to screen the index of the first occurrence of the word "sit"
		System.out.printf("The first occurrence of the word \"sit\" is at index %d.\n", smallText.indexOf("sit"));
		//Get and print to screen the index of the last occurrence of the word "sit"
		System.out.printf("The last occurrence of the word \"sit\" is at index %d.\n", smallText.lastIndexOf("sit"));
		//Check if the string contains the word "amet". Print the result to screen
		System.out.printf("The string %s \"amet\".\n", smallText.contains("amet")? "contains":"doesn't contain");
		
	}
	
	public static void exercise08(){
		String spanishAlphabet = "abcdefghijklmnñopqrstuvwxyz";
		String englishAlphabet = "";
		String englishAlphabetUpperCase = "";
		//Get the index of 'ñ'
		int asked_index = spanishAlphabet.indexOf('ñ');
		//Get the substring until 'ñ'(not included)
		String alphabetUntil = spanishAlphabet.substring(0, asked_index);
		//Get the substring from 'ñ'(not included) to the end
		String alphabetFrom = spanishAlphabet.substring(asked_index+1);
		//Concatenate the two substrings using the concat method
		englishAlphabet = alphabetUntil.concat(alphabetFrom);
		//Convert the resulting string to upper case
		englishAlphabetUpperCase = englishAlphabet.toUpperCase();
		System.out.println(spanishAlphabet);
		System.out.println(englishAlphabet);
		System.out.println(englishAlphabetUpperCase);
		
	}
	
	public static void exercise09(){
		String fullName = "Alonso Herreros Copete";
		String initials = fullName;
		int i = 0;
		int j = 0;
		while (j >= 0 && i < initials.length()) {
			j = initials.indexOf(' ');
			initials = initials.substring(0,++i).concat((j>0)? initials.substring(j+1) : "");
		}
		System.out.println(initials); 
	}
	
	public static void exercise10(){
		String palindrome = "abba";
		int length = palindrome.length();
		boolean isPalindrome = true;
		//Your code here
		for (int i = 0; i<length/2; i++) {
			if (palindrome.charAt(i) != palindrome.charAt(length-i-1)) {
				isPalindrome = false;
				break;
			}
		}
		System.out.println("The string "+ palindrome +" is a palindrome: " + isPalindrome);
	}
	
	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
		exercise04();
		exercise05();
		exercise06();
		exercise07();
		exercise08();
		exercise09();
		exercise10();
	}

}

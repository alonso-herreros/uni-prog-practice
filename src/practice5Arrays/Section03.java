package practice5Arrays;
/**
 * 
 * 
 * @author Alonso Herreros Copete
 * @author 
 * 
 */
public class Section03 {

	public static void exercise01(){
		String[] user = new String[2];
		String[] copy;
		
		user [0] = "Pedro";
		user [1] = "Juan";

		copy = user; // Copies the whole user array to the copy array
		
		int cnt = 0;
		while (cnt < copy.length) // Over-engineer for loop
		{
		    System.out.println(copy[cnt]);
		    cnt++;
		}
		
		user[0] = "Luis"; // Change the name at position 0 of the user array
		
		cnt = 0;
		while (cnt < copy.length)
		{
		    System.out.println(copy[cnt]);
		    cnt++;
		}
		
		// For string arrays, what's actually stored is the reference.
		// When copying the user array, the references are copied.
		// When editing the element of the user array, that's the same element pointed at
		// by the copy array.

	}

	public static void exercise02(){
		String[] user = new String[2];
		String[] copy;

		user [0] = "Pedro";
		user [1] = "Juan";

		//Se realiza la copia de la array.
		copy = new String[2];
		copy [0] = user[0];
		copy [1] = user[1];

		int cnt = 0;

		while ((cnt < copy.length))
		{
			System.out.println(copy [cnt]);
			cnt++;
		}

		user [0] = "Andrea";

		cnt = 0;
		while ((cnt < copy.length))
		{
			System.out.println(copy [cnt]);
			cnt++;
		}
		
		// In this case, each element of the copy array is given a copy of the elements
		// in the user array.
		// A deep copy of the user array is made.

	}
	
	public static void exercise03(){
		String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday", "Sunday"};
		int length = days.length;
		String[] daysReversed = new String[length];
		for (int i=0; i < length; i++) {
			daysReversed[length-i-1] = days[i];
		}
	
	}
	
	public static void exercise04(){
		int[] arr1 = {1, 4, 7, 9, 13};
		int[] arr2 = {2, 5, 6, 10, 12};
		int[] arr3 = new int[arr1.length + arr2.length];
		
		// We're going to iterate through both lists, taking the biggest element each time.
		int i = 0;
		int j = 0;
		while (i+j < arr3.length) {
			if ((i<arr1.length? arr1[i]:Integer.MAX_VALUE) < (j<arr2.length? arr2[j]:Integer.MAX_VALUE)) {
				arr3[i+j] = arr1[i++];
			}
			else {
				arr3[i+j] = arr2[j++];
			}
		}
	}
	
	public static void exercise05(){
		int[] nums = {5, 10, 3, 25, 30, 1, 54, 78, 23, 2, 12};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i=0; i<nums.length; i++) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
		
		System.out.printf("The minimum is %d, while the maximum is %d", min, max);

	}
	
		
	public static void main(String[] args) {
		exercise01();
		exercise02();
		exercise03();
		exercise04();
		exercise05();
		
	}

}

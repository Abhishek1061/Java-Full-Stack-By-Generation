package Java.Array_Practice_Set;

public class MaximumValueInArray {
	
	public static void main(String[] args) {
		
//		Create a Java program that finds and prints the maximum value in an array of integers.
		 
		int [] arr = {1,2,3,4,5,6,7,8};
		
		int maxValue = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		System.out.println("Max vlaue in array is: " + maxValue);
		
		
		
	}

}

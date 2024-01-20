package Java.Array_Practice_Set;

import java.util.Arrays;

//Write a Java program that calculates and prints the sum of all elements in an integer array.


public class SumOfElementsInArray {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8};
		int sum = 0 ;
 		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("The sum of array is: " + sum);
	}

}

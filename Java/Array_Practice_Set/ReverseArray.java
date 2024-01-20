package Java.Array_Practice_Set;

import java.util.Arrays;

public class ReverseArray {
//	Write a Java program to print the reverses of an array.

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {1,2,3,4,5,6};
		
		int [] temp = new int [ar.length];
		
		for(int i = 0; i < temp.length; i++) {
			
			temp[i] = ar[ar.length - 1 -i];
			
		}
		System.out.println(Arrays.toString(temp));
	}

}

package Java.Array_Practice_Set;

import java.util.Arrays;

public class CopyElementArray {
	
//	Write a Java program to copy elements from one array to another.
	
	public static void main(String[] args) {
		String str[] = {"Apple", "Mango", "Banana"};
		
		String temp[] = new String[str.length];
		
		for(int i = 0; i < str.length; i++) {
			temp[i] =  str[i];
		}
		System.out.println(Arrays.toString(temp));
		
	}

}

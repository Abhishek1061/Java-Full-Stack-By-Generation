package Java.Array_Practice_Set;

public class FIndElementInArray {
	
	public static void main(String[] args) {
		
//		Write a Java program that searches for a specific element in an array and prints its index.

		
		String str[] = {"Apple", "Mango", "Banana"};
		
		String target = "Mango";
		
		for(int i = 0 ; i < str.length; i++ ) {
			if(str[i].equals(target)) {
				System.out.println("The target " + target + " is at index: " + i);
			}
		}
	}
}

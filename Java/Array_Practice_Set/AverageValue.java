package Java.Array_Practice_Set;

public class AverageValue {

	public static void main(String[ ] args) {
		
//		Create a Java program that finds and prints the average of values in a double array.
		
		double arr [] = {1.2, 1.3, 1.4, 1.5, 1.6};
		
		double sum = 0;
		double average = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		average = sum/arr.length;
		System.out.println(average);
		
	}
	
}

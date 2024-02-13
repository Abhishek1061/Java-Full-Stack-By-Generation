import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to test an array list is empty or not
		
//		ArrayList<String> arrList = new ArrayList<String>();
//		
//		if(arrList.isEmpty()) {
//			System.out.println("The array list is empty.");
//		}else {
//			System.out.println("The array list is not empty.");
//		}
		
//		Write a Java program to reverse elements in a array list
		
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> arrList = new Vector<Integer>();
		
		System.out.print("Enter the length of ArrayList : ");
		int numOfElements = sc.nextInt();
		
		// adding the elements(numeric) to array.
		for(int i = 0; i < numOfElements; i++) {
			System.out.print("Enter the number: ");
			int element = sc.nextInt();
			arrList.add(element);
		}
		
		// Checking if the list is empty.
		if(arrList.isEmpty()) {
			System.out.println("ArrayList is empty.");
		}else {
			System.out.println("Original ArrayList: " + arrList.capacity());
			System.out.println("Reversed ArrayList: " + reverseArrayList(arrList));
		}
		sc.close();
		
		
		//Method No.1 to solve reverse ArrayList
//		ArrayList<Integer> arrListReverse = new ArrayList<Integer>();
//		for(int i = arrList.size()-1; i >= 0; i--) {
//			int b = arrList.get(i);				
//			arrListReverse.add(b);
//		}
//		System.out.println(arrListReverse);
		
	}
	//Method No.2 to solve reverse ArrayList
	public static ArrayList<Integer> reverseArrayList(Vector<Integer> arrList){
		ArrayList<Integer> reversedList = new ArrayList<>(arrList);
		Collections.reverse(reversedList); //Collections is the class which comes under collection framework. 
		return reversedList;
	}		
}

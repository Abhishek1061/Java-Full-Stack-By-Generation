import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class HashSetExample  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Abc a1 = new Abc();
//		System.out.println(a1); //by this the ID is creted. Hexa-decimal code.
//		System.out.println(a1.getClass().hashCode());  // by this you get the hash code.
		
		Scanner sc = new Scanner(System.in);
		
		//Creating the HashSet
		Set<Integer> set = new HashSet<Integer>();
		
		//Adding the eement to Hashset
		set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
		
        //Taking the user input.
        System.out.print("Enter a number: ");
		int userInput = sc.nextInt();
		
        // Use the Iterator to print the elements of the HashSet
		Iterator<Integer> iterator=set.iterator();
		boolean found = false; // setting it false when it is true means number is  present in set.
		while (iterator.hasNext()) {
			if (iterator.next() == userInput) {
                found = true;
                break;
            }
		}
		// Checking if present in set.
		if(found) {
			System.out.println("The number " + userInput + " is in the set.");
		}else {
            System.out.println("The number " + userInput + " is not in the set.");
		}
//		System.out.println(iterator.next());
	}

}
//class Abc{
//	
//}

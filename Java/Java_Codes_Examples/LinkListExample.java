import java.util.*;

public class LinkListExample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			LinkedList<Integer> arrList = new LinkedList<Integer>();
			
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
				System.out.println("Original ArrayList: " + arrList);
			}
			sc.close();
			
			
			//Method No.1 to solve reverse ArrayList
			ArrayList<Integer> arrListReverse = new ArrayList<Integer>();
			for(int i = arrList.size()-1; i >= 0; i--) {
				int b = arrList.get(i);				
				arrListReverse.add(b);
			}
			System.out.println(arrListReverse);
			
		}
	
	
}
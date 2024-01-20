import java.util.*;

class ASCII{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character to know ASCII value = ");
		
		char letter = sc.next().charAt(0);
		int ASCII = (int) letter;
		
		System.out.println(ASCII); 
	}
}
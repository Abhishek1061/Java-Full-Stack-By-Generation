import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0, c=0;
		int [] arr = {1,2,3,4,5};
		String d  = null ;
		System.out.println("Welcome");
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
////			c = a / b ;
//			c = arr[5];
			int length = d.length();
		}
//		catch(ArithmeticException e){
//			
//			System.out.println(e.getMessage());
//			
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
////			System.out.println(e.getMessage()); //1st method
//			System.out.println("check your code"); //2nd method writing direct message.
//		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
		
		
		System.out.println(d);
//		System.out.println("Value = " + c); //ArithmeticException
		
//		System.out.println(arr[5]); //ArrayIndexOutOfBoundsException

	}

}

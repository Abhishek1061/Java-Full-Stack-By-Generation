import java.util.Scanner;

public class CustomExceptionTrow {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter your name: \n");
			String name = sc.nextLine();
			if(!name.equals("Abhishek")) {
				System.out.println("Hello " + name);
			}else {
				throw new CustomException("Invalid Name.");
			}
		}catch(CustomException e) {
			System.out.println(e);
		}
		finally {
			sc.close();
		}
	}

}

class CustomException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CustomException(String msg){
//		System.out.println(msg); // // 1st method to print message
		super(msg); // 2nd method to print message 
		
	}
}

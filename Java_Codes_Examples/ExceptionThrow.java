import java.util.Scanner;
public class ExceptionThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter your age: \n");
			int age = sc.nextInt();
			if(age >= 18) {
				System.out.println("You are eligible for voting.");
			}else {
				throw new Exception("You are not eligible for voting.");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			sc.close();
		}
	}

}

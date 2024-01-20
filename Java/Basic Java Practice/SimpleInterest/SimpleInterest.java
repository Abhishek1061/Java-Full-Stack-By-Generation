import java.util.*;
	
class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of principle amount P = ");
		int P = sc.nextInt();
		System.out.print("Enter the value of time T = ");
		int T = sc.nextInt();
		System.out.print("Enter the value of rate R = ");
		int R = sc.nextInt();

		double result = ((P * T * R) / 100);
		System.out.println("Simple Interest is  " + result);

	}
}
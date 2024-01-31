import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");

//		Example1 ex2 = new Example1();
//		System.out.println(ex2);
//		ex2.print();
//		System.out.println(ex2.a);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Interger Value: ");
		int a = sc.nextInt();
		System.out.println("Interger Value: " + a);
		
		
		System.out.print("Enter Float Value: ");
		float b = sc.nextFloat();
		System.out.println("Float Value: " + b);
		
		System.out.print("Enter Boolean Value: ");
		boolean c = sc.nextBoolean();
		System.out.println("Boolean Value: " + c);
		
		sc.nextLine();
		
		System.out.print("Enter Name: ");
		String d = sc.next();
		System.out.println("String Value: "  + d);
		
		sc.nextLine();
		
		System.out.print("Enter Name: ");
		String str = sc.nextLine();
		System.out.print("String Value: "  + str);

		
		sc.close();
		
		

	}

}

class Example1 {
	int a = 10;

	void print() {
		System.out.println("hello");
	}
}
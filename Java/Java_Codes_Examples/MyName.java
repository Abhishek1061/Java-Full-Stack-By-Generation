import java.util.Scanner;
public class MyName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you Name: ");
		String name = sc.nextLine();
		System.out.print("Enter you Age: ");
		int age = sc.nextInt();
		
		
		MyDetails myDetails = new MyDetails();
		
		myDetails.setName(name);
		myDetails.setAge(age);
		
		sc.close();
		
		System.out.println("Hello " + myDetails.getName());
		System.out.println("Your age is:  " + myDetails.getAge());
	}
}

class MyDetails {
	private String name = "XYZ";
	private int age = 100;
	
	public void setName(String name) {
		this.name  = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}


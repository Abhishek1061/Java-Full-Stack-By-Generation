
public class JavaFeaturesExample {
	public static void main(String[] args) {
		
//		World world1 = new World() {
//			
//			@Override
//			public void sayHi() {
//				System.out.println("Hi");
//			}
//		};
//		world1.sayHi();
//		
		// In Lambda expression
		
//		World world2 = () -> {
//			
//			{
//				System.out.println("Hi again");
//			}
//		};
//		world2.sayHi();
		
//		World world3 = (int f) -> {
//			{
//				System.out.println("Hii");
//				return f*f;
//			}
//		};
//		System.out.println(world3.sayHI(4)); // Lambda Usecase in return type.
		
		World world4 = (int f, int g) -> {
			{
				System.out.println("Hii");
				return f + g;
			}
		};
		System.out.println(world4.sayHi(4, 6)); 
		world4.iCanPrint();
	}
}

// lambda ->> 

//functional interface can contain only one abstract method.
@FunctionalInterface //used in lambda expression to reduce code.
interface World{
	
//	int sayHI(int a);
	int sayHi(int a, int b);
//	void sayHi();
//	void sayBye(); // Adding more than oneabstratct method will not be functional interface.
	
	default void iCanPrint() {
		System.out.println("I can print"); // Java 8
	}
	
	static void iCanAlsoPrint() {
		System.out.println("I can aslo print"); //java 8
	}
	
	private void iCanDoPrint() {
		System.out.println("I can print in private"); // Java 9
	}
}
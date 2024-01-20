class SwapNumberWithoudThird{
	public static void main(String [] args){
		int a = 25;
		int b = 50;

		System.out.println("The value of a and b before swap " + a + " and " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("The value of a and b after swap " + a + " and " + b);
	}
}
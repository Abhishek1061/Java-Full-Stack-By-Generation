class SwapNumber{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		System.out.println("The value of a before swapping is " + a + " and " + "The value of b before swapping is " + b);				

		int temp = a;
		a =  b;
		b = temp;

		System.out.println("The value of a after swapping is " + a + " and " + "The value of b after swapping is " + b);

	}
}
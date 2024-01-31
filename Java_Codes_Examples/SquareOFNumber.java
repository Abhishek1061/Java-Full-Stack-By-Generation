
public class SquareOFNumber {
	public static void main(String[] args) {
		int a = 2;
		Square number = new Square(a);
		int result  = number.squareNum();
		System.out.println("The square of " + a +" is " +  result);
		
	}	
}

class Square {
	int value;
	
	Square(int num){
		value = num;
	}
	
	int squareNum() {
		return value * value;
	}

	
}

public class ExceptionThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation cal = new Calculation();
		int a = 10, b = 10;
		try {
			System.out.println("Value = " + cal.calculation(a, b));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Calculation {
	int calculation(int a, int b) throws Exception {
		
		if (b == 0)
			throw new Exception();
		return a/b;
	}
}
import java.util.Iterator;
import java.util.LinkedList;

public class LInkedListIterator {
	public static void main(String[] args) {
		LinkedList<Integer> arrList = new LinkedList<Integer>();
		
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		
//		for(int i : arrList) {
//			System.out.println(i);
//		}
//		
		Iterator<Integer> iterte=arrList.iterator();
		while (iterte.hasNext()) {
			Integer integer = (Integer) iterte.next();
			System.out.println(integer);
		}
	}
}

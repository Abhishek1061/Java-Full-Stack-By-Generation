import java.util.*;
import java.util.stream.Stream;

public class StreamAPIExample {
	public static void main(String[] arga) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		Stream<Integer> st = list.stream();
		st.forEach(a -> System.out.println(a));

	}
}
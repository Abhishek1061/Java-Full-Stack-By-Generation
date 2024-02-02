import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> empRecords = new HashMap<Integer ,String>();
		
		//In parenthesis (101, "Abhishek") is (key, values), .put is used to add eement not add method used as it is only used for adding single element to list. 
		empRecords.put(101, "Abhishek");
		empRecords.put(102,  "Suraj");
		empRecords.put(103, "Himanshu");
		
		//Creating for loop Note: here in Map we need Entry interface to access the key-value pair.
		for(Map.Entry<Integer, String> emp : empRecords.entrySet()) {
			System.out.println(emp.getKey() + " : " + emp.getValue());
		}
		
	}

}

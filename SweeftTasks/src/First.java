import java.util.HashMap;
import java.util.Map;

public class First {

	

	    public static int findUniqueNumber(int[] arr) {
	        Map<Integer, Integer> numberCount = new HashMap<>();

	        for (int num : arr) {
	            numberCount.put(num, numberCount.getOrDefault(num, 0) + 1);
	        }

	        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
	            if (entry.getValue() == 1) {
	                return entry.getKey();
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = { 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	        int uniqueNumber = findUniqueNumber(arr);
	        if (uniqueNumber != -1) {
	            System.out.println("The unique number is: " + uniqueNumber);
	        } else {
	            System.out.println("No unique number found in the array.");
	        }
	    }
	}




package Day7;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateusingHashMap {

	public static void main(String[] args) {
		String[] s = {"000", "123", "000", "234", "111"};

        // Create a HashMap to store element counts
        Map<String, Integer> countMap = new HashMap<>();

        // Count the occurrences of each element
        for (String str : s) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        // Print the elements with counts greater than 1 (duplicates)
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }

	}

}

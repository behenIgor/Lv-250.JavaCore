package Person;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Person {

	public static void main(String[] args) {
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("key1", "value1");
		personMap.put("key2", "value2");
		personMap.put("key3", "value3");
		personMap.put("key4", "value4");
		personMap.put("key5", "value3");
		personMap.put("key6", "value4");

		// Output the entities of the map on the screen.

		for (String key : personMap.keySet()) {
			System.out.println(key + "=" + personMap.get(key));
		}
		System.out.println();
		

		Set<String> uniqValues = new HashSet<String>(personMap.values());
		System.out.println("Unique values " + uniqValues);

		// Remove from the map person whose firstName is ”Orest” (or other "value3").
		// Print result.

		String name = "value3";

		for (Iterator<Map.Entry<String, String>> it = personMap.entrySet().iterator(); it.hasNext();) {
			Entry<String, String> entry = it.next();
			if (entry.getValue().equals(name)) {
				it.remove();
			}
		}

		System.out.println();
		for (String key : personMap.keySet()) {
			System.out.println(key + "=" + personMap.get(key));
		}

	}

}

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;


public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Nazar", "Travka");
		personMap.put("Ivan", "Franko");
		personMap.put("Taras", "Shevchenko");
		personMap.put("Stive", "Jobs");
		personMap.put("Bob", "Marli");
		personMap.put("Tom", "Crus");
		personMap.put("Lesia", "Ukrainka");
		personMap.put("Orest", "Petrenko");
		personMap.put("Olga", "Kobylanska");
		personMap.put("Stepan", "Bandera");

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		

		for (Iterator<Map.Entry<String, String>> it = personMap.entrySet().iterator(); it.hasNext();) {
			Map.Entry<String, String> entry = it.next();
			if ((entry.getKey()).equals("Orest")) {
				it.remove();
			}
		}

			for (Map.Entry<String, String> entry1 : personMap.entrySet()) {
				System.out.println(entry1.getKey() + " " + entry1.getValue());
			}

		}
	}


package task2;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String,String> persMap = new HashMap<String,String>();
		persMap.put("Mychka","Oksana");
		persMap.put("Shushko","Ivan");
		persMap.put("Krupa","Olena");
		persMap.put("Melnyk","Ruslan");
		persMap.put("Chenchak","Olena");
		persMap.put("Mychka","Taras");
		persMap.put("Andruhiv","Petro");
		persMap.put("Homych","Olena");
		persMap.put("Kitura","Mariya");
		persMap.put("Beloshevych","Anatoliy");
		
		for (Map.Entry<String,String> entry : persMap.entrySet()) {
		    System.out.println("lastName: " + entry.getKey() + " \tfirstName: " + entry.getValue());
		}

		
		/////////////////////////////////////////////////////////////////////////////
		int i = 0;
		for (Map.Entry<String,String> pers1 : persMap.entrySet()) {
			for (Map.Entry<String,String> pers2 : persMap.entrySet()) {
				if(pers1.getValue().equals(pers2.getValue())) {
					i++;
					if(i>2){
						break;
					}
				}
			}
			if(i>2) {
				System.out.println("\nSame names!\n");
				break;
			}
			i = 0;
		}
		
		
		////////////////////////////////////////////////////////////////////////////
		for (Map.Entry<String,String> entry : persMap.entrySet()) {
			if(entry.getValue().equals("Anatoliy")) {
				persMap.remove(entry.getKey());
			}
		}
		
		for (Map.Entry<String,String> entry : persMap.entrySet()) {
		    System.out.println("lastName: " + entry.getKey() + " \tfirstName: " + entry.getValue());
		}
	}
}

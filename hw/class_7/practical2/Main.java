package practical2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Вождь on 04.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> employeeMap = new HashMap<Integer, String>();
        employeeMap.put(6757, "Fata");
        employeeMap.put(9866, "Zata");
        employeeMap.put(547, "Nata");
        employeeMap.put(6687757, "Mata");
        employeeMap.put(677557, "Kata");
        employeeMap.put(3467, "Sata");
        employeeMap.put(75457, "Lata");

        for (Map.Entry<Integer,String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        System.out.println("Input employee's ID");
        Integer ID = Integer.parseInt(scanner.nextLine());
        System.out.println(employeeMap.containsKey(ID)? employeeMap.get(ID) : "No employee whith this ID");

        System.out.println("Input employee's name");
        String Name = scanner.nextLine();
        if (employeeMap.containsValue(Name)){
            for(Map.Entry<Integer, String> entry: employeeMap.entrySet()){
                if (entry.getValue().equals(Name))
                System.out.println(entry.getKey());
            }
        }else System.out.println("No employee whith this name");
    }
}

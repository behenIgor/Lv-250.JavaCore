package task04_07.hw;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 05.07.2017.
 */
public class PersonsMap {
    public static void main(String[] args) {
        Map<String,String> personMap = new HashMap<String,String>();
        personMap.put("Petrenko","Orest");
        personMap.put("Melenko","Sara");
        personMap.put("Sergijchuk","Orest");
        personMap.put("Mil","Oksana");
        personMap.put("Serpen","Julia");
        personMap.put("Petrenk","Orest");
        personMap.put("Petren","Orest");
        personMap.put("Petre","Orest");
        personMap.put("Petrenka","Julia");
        personMap.put("Petrenkiv","Sara");

        for (Map.Entry<String,String> entry: personMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();

        for (Map.Entry<String,String> entry: personMap.entrySet()){
            if(entry.getValue() == "Orest")
                personMap.remove(entry);
            else System.out.println(entry);
        }
    }
}

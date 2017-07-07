package practical1;

import java.util.*;

/**
 * Created by Вождь on 04.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<Integer>();

        Random rand= new Random();;
        for (int i = 0; i < 10; i++) {

            myCollection.add(rand.nextInt(30));
        }

        List<Integer> newCollection = new ArrayList<Integer>();
        for (Integer i: myCollection){
            if(i > 5 ){
                newCollection.add(i);
                System.out.print(i);
            }
        }
        System.out.println();

        for (Integer i: myCollection){
            if(i > 20){
                System.out.println(i);
                newCollection.remove(i);
            }
        }

          myCollection.add(2, 1);
          myCollection.add(8, -3);
          myCollection.add(5, -4);

        for (int i = 0; i < myCollection.size() ; i++) {
            System.out.println("position – " + i + ", value of element – " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        for (Integer i: myCollection){
            System.out.println(i);
        }
    }
}

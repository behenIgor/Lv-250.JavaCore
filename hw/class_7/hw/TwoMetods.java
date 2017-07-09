package task04_07.hw;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 05.07.2017.
 */
public class TwoMetods {
    public static void main(String[] args) {
        Set set = new HashSet<>();
        Set set2 = new HashSet<>();

        set.add(4);
        set.add("sasha");
        set.add(4.6);
        set.add('s');
        set2.add(67);
        set2.add(false);
        set2.add(876744536);

        System.out.println(union(set, set2));
        System.out.println(intersect(set, set2));
    }

    public static Set union(Set set, Set set2){
        set.addAll(set2);
        return set;
    }

    public static Set intersect(Set set, Set set2){
        set.retainAll(set2);
        return set;
    }

}

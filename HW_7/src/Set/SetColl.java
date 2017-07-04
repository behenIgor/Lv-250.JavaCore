package Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Random;

public class SetColl {
	
    public static void main(String[] args) {
        Set <Integer> setFirst = new LinkedHashSet <Integer> ();
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++) {
        	setFirst.add(rand.nextInt(10));
        }
        System.out.println("First " + setFirst);
 
        Set <Integer> setSecond = new LinkedHashSet <Integer> ();
        for (int i = 4; i < 20; i++) {
        	setSecond.add(rand.nextInt(20));
        }
        System.out.println("Second " + setSecond);
        
        System.out.println("-----------------");
        
        System.out.println("Union " +  union(setFirst, setSecond));

        System.out.println("Intersect " + intersect(setFirst, setSecond));
    }

	    static Set <Integer> union(Set <Integer> first, Set <Integer> second) {
	        Set <Integer> unSet = new LinkedHashSet <Integer> ();
	        for (Integer elem : first) {
	            unSet.add(elem);
	        }
	        for (Integer elem : second) {
	            unSet.add(elem);
	        }
	        return unSet;
	    }
	 
	    static Set <Integer> intersect(Set <Integer> first, Set <Integer> second) {
	        Set <Integer> intersect = new LinkedHashSet <Integer> ();
	        for (Integer firstEl : first) {
	            for (Integer secondEl : second) {
	                if (firstEl == secondEl) {
	                	intersect.add(firstEl);
	                }
	            }
	        }
	        return intersect;
	    }
}

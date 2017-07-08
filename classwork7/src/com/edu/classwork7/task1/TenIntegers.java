package com.edu.classwork7.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TenIntegers {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> myCollection = new ArrayList<Integer>(); 
		ArrayList<Integer> newCollection = new ArrayList<Integer>(); 
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
        	int pick = rand.nextInt(50);
        	myCollection.add(pick);
        }
        
        System.out.println("myCollection:\n" + myCollection + "\n");
        
        myCollection.remove(1);
        myCollection.add(1, 1);
        myCollection.remove(7);
        myCollection.add(7, -3);
        myCollection.remove(4);
        myCollection.add(4, -4);
        
        for (int i = 0; i < myCollection.size(); i++) {
			System.out.println("position - " + (i + 1) + ", value of element - " + 
					myCollection.get(i));
			
			if (myCollection.get(i) > 5) {
        		newCollection.add(i + 1);
        	}
		}

        System.out.println("\nmyCollection:\n" + myCollection + "\n");
        System.out.println("newCollection:\n" + newCollection + "\n");
        
        for (int i = 0; i < myCollection.size(); i++) {
        	if (myCollection.get(i) > 20) {
        		myCollection.remove(i);
        		i--;
        	}
		}
        
        System.out.println("myCollection without elements, greater than 20:\n" + 
        		myCollection);
        
        Collections.sort(myCollection, Collections.reverseOrder());
        
        System.out.println("\nSorted myCollection:\n" + myCollection);
        
	}

}

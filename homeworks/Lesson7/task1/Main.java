package task1;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i = 0; i < 5; i++) {
			set1.add(i);
			set2.add(i+5);
		}
		
		SetManage setManager = new SetManage();
		
		System.out.println(set1);
		System.out.println(set2 + "\n");
		
		System.out.println(setManager.union(set1, set2));
		System.out.println(setManager.intersect(set1, set2));
		System.out.println(setManager.intersect(setManager.union(set1, set2), set2));
		
		System.out.println("\n" + set1);
		System.out.println(set2);

	}

}

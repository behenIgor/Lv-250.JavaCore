package PracticalTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PracticalTask1 {

	public static void main(String[] args) {
		List<Integer> myCollection = new ArrayList<Integer>();
		List<Integer> newCollection = new ArrayList<Integer>();
		Random rand;
		for (int i = 0; i < 15; i++) {
			rand = new Random();
			myCollection.add(rand.nextInt(40));

		}
		for (Integer intr : myCollection) {
			System.out.print(intr + " ");
			if (intr > 5) {
				newCollection.add(intr);
			}
		}
		System.out.println("\n-----------");
		for (Integer intr : newCollection) {
			System.out.print(intr + " ");
		}

		// знаю, что плохо, но оно работает
		System.out.println("\n-----------");
		for (int i = 0; i < myCollection.size(); ++i) {
			if (myCollection.get(i) > 20) {
				myCollection.remove(i);
				i--;
			}
		}
		for (Integer intr : myCollection) {
			System.out.print(intr + " ");
		}
		System.out.println("\n-----------");
		newCollection.add(2, 1);
		newCollection.add(8, -3);
		newCollection.add(5, -4);

		for (int i = 0; i < newCollection.size(); ++i) {
			System.out.print(
					"Index " + newCollection.indexOf(newCollection.get(i)) + " Value " + newCollection.get(i) + "\n");
		}
		System.out.println("\n-----------");

		Collections.sort(newCollection);
		for (Integer intr : newCollection) {
			System.out.print(intr + " ");
		}

	}

}

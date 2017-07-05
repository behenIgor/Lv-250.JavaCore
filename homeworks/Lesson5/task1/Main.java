package task1;

import java.util.Random;
import java.util.Scanner;
import javax.imageio.IIOException;

public class Main {

	public static void main(String[] args) throws IIOException {
		
		int[] dayInMonth = new int[12];
		for(int i=0; i<dayInMonth.length; i++) {
			if(i%2==0)
				dayInMonth[i] = 31;
			else 
				dayInMonth[i] = 30;
		}
		dayInMonth[1] = 28;
		
		System.out.println("Input number of month");
		Scanner in = new Scanner(System.in);
		int numOfMonth = in.nextInt();
		if(numOfMonth>0 && numOfMonth<=12) {
			System.out.println(numOfMonth+"th month have a "+dayInMonth[numOfMonth-1]+" days\n");
		}
		else {
			System.out.println("Wrong!");
		}
	}

}


package com.edu.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
				
			System.out.print("Enter price for country 1: ");
			float c1 = Float.parseFloat(br.readLine());
			System.out.print("Enter price for country 2: ");
			float c2 = Float.parseFloat(br.readLine());
			System.out.print("Enter price for country 3: ");
			float c3 = Float.parseFloat(br.readLine());

			System.out.print("Enter duration of talk 1: ");
			float t1 = Float.parseFloat(br.readLine());
			System.out.print("Enter duration of talk 2: ");
			float t2 = Float.parseFloat(br.readLine());
			System.out.print("Enter duration of talk 3: ");
			float t3 = Float.parseFloat(br.readLine());
			
			System.out.println("Talk 1 costs " + (t1*c1) + " standard units");
			System.out.println("Talk 2 costs " + (t2*c2) + " standard units");
			System.out.println("Talk 3 costs " + (t3*c3) + " standard units");
			System.out.println("All talks cost " + (t1*c1 + t2*c2 + t3*c3) + " standard units");
	}

}
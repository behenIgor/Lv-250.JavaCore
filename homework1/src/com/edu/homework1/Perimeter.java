package com.edu.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Perimeter {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		
	float PI = 3.14159f;
	System.out.print("Enter radius: ");
	float radius = Float.parseFloat(br.readLine());
	System.out.println("Perimeter is " + (2*PI*radius));
	System.out.println("Area is " + (PI*Math.pow(radius, 2)));
	}

}

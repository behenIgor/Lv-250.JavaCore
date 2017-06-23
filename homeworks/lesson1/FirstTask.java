package first.homework;

import javax.imageio.IIOException;
import java.util.Scanner;

public class FirstTask {

	private static Scanner in;

	public static void main(String[] args) throws IIOException  {

		in= new Scanner(System.in);
		
		System.out.println("Input the radius ");
		double radius = in.nextDouble();
		System.out.println("Input the unit of measurement ");
		String unitOfMeas = in.next();
	
		double perimeter = 2*Math.PI*radius;
		double area = Math.PI*radius*radius;
		
		System.out.printf("Perimeter of the circle is equal %.2f %s %n",perimeter,unitOfMeas);
		System.out.printf("Area of the circle is equal %.2f %s²",area,unitOfMeas);
	}
}

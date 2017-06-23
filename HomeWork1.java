import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork1 {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));
		
		System.out.println("Enter your flower bed radius, please!");
		double radius = Integer.parseInt(br.readLine());


		
		System.out.println("Hello, the perimeter of your flower bed is " + radius*3.14*2);
		System.out.println("The your flower bed area is " +  radius* radius*3.14 );
}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter radius: ");
		double radius = Double.parseDouble(br.readLine());
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * (radius * radius);
		
		System.out.println("Perimeter -> " + perimeter );		
		System.out.println("Area -> " + area);

	}

}

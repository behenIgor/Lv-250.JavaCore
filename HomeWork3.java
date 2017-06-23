import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));
		
		int c1;
		int c2;
		int c3;
		int t1;
		int t2;
		int t3;
		
		System.out.println("Hello, please enter number of minutes which your call to c1 continued ");
		t1 = Integer.parseInt(br.readLine());
		System.out.println("Hello, please enter number of minutes which your call to c2 continued ");
		t2 = Integer.parseInt(br.readLine());
		System.out.println("Hello, please enter number of minutes which your call to c3 continued ");
		t3 = Integer.parseInt(br.readLine());
		System.out.println("Hello, please enter the price for call to c1 ");
		c1 = Integer.parseInt(br.readLine());
		System.out.println("Hello, please enter the price for call to c2 ");
		c2 = Integer.parseInt(br.readLine());
		System.out.println("Hello, please enter the price for call to c3 ");
		c3 = Integer.parseInt(br.readLine());
		
		System.out.println("So, you have to pay for your call to c1 "  +(t1*c1));
		System.out.println("So, you have to pay for your call to c2 "  +(t2*c2));
		System.out.println("So, you have to pay for your call to c3 "  +(t3*c3));
		System.out.println("Finally, you have to pay for all  your calls "  +((t1*c1)+(t2*c2)+(t3*c3)));	
		
	}
}

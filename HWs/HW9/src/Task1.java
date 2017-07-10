import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Input 2 double numbers ");
		double a =Double.parseDouble(br.readLine()) ;
		double b =Double.parseDouble(br.readLine()) ;
		div(a,b);
	

	}

	static void div(double a, double b) throws ArithmeticException {
		try {
			if (b == 0) {
				throw new ArithmeticException();
			} else {
				System.out.println(a+"/"+b +"="+ a/b);
			}
		} catch (ArithmeticException e) {
			System.out.println(" Division by zero");
			
		}
	}

}

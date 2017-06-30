import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		int input;
		for (int i = 0; i < arr.length; i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter integers ");
			input = Integer.parseInt(br.readLine());
			if (input > 0) {
				arr[i] = input;
			}
			else{
				System.out.println("You entered negative number");
				break;}

		}
		
		int product=1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 ==0) {product = product * arr[i];}}
		System.out.println("Product = " + product);


	}

}

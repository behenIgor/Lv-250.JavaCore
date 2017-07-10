import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       System.out.println("Input the number of HTTP Error ");
			int number = Integer.parseInt(br.readLine());
			
			switch (number) {
			case 400 : System.out.println(Errors.Bad_Request); break;
			case 401 : System.out.println(Errors.Unauthorized); break;
			case 402 : System.out.println(Errors.Payment_Required); break;
			default:
				System.out.println("Wrong!");
			}

	}

}

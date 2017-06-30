import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        int[] Months = {31,28,31,30,31,30,31,31,30,31,30,31};
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of month");
		int month = Integer.parseInt(br.readLine());
		System.out.println(Months[month-1]);
	}

}

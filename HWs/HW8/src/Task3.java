import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;
public class Task3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub 
		Pattern p = Pattern.compile("\\$[0-9]\\.[0-9][0-9]");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  US currency");
		String currency = br.readLine();
		Matcher m = p.matcher(currency);

		if(m.matches())
		{System.out.println("Valid enter: "+currency);}
		else{System.out.println("Invalid enter: "+currency);}
		
		
		
	}

}

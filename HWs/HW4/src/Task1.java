import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Input 3 numbers");
		float a = Float.parseFloat(br.readLine());
		float b = Float.parseFloat(br.readLine());
		float c = Float.parseFloat(br.readLine());
		
		if((a>-5 && a<5) && (b>-5 && b<5) && (c>-5 && c<5))
		{
			System.out.println("All the nubers belong to the range [-5,5]");  
		}
		else
		{
		System.out.println("Not all the nubers belong to the range [-5,5]"); 
		}  
	}

}

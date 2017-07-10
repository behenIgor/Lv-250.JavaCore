import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       System.out.println("Input 3 numbers");
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
			
		if(a>b && a>c)
		{
			System.out.println("Max value = " + a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Max value = " + b);
		}
		else 
		{System.out.println("Max value = " + c);}
		
		
		
		
		
		if(a<b && a<c)
		{
			System.out.println("Min value = " + a);
		}
		else if(b<a && b<c)
		{
			System.out.println("Min value = " + b);
		}
		else 
		{System.out.println("Min value = " + c);}
	}

}

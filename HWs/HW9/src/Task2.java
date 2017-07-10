import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Input  start and end value ");
		int s =Integer.parseInt(br.readLine()) ;
		int e =Integer.parseInt(br.readLine()) ;

		try{
			readNumber(s,e);
		}
		catch(Myexception e1){
		    System.err.print(e1);
		}
	}
	
 	static int readNumber(int start, int end) throws Myexception, NumberFormatException, IOException
	{
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Input  integer number ");
		int n =Integer.parseInt(br.readLine()) ;
		
		if(n>start && n<end)
		{return n;}
		
		else{throw new Myexception("input value is out of range!");}
	}

}

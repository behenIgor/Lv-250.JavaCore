package homework.task1;

import java.util.Scanner;
import javax.imageio.IIOException;

public class Main {
	public enum HttpEerrors{
		Bad_Request,Unauthorized,Payment_Required,Forbidden,Not_Found;
	}
	public static void main(String[] args) throws IIOException {
		//Task1 a)
		System.out.println("Input first number ");
		Scanner in = new Scanner(System.in);
		float num1 = in.nextFloat();
		System.out.println("Input second number ");
		float num2 = in.nextFloat();
		System.out.println("Input third number ");
		float num3 = in.nextFloat();
	
		if(num1 >= -5 && num1 <= 5)
			System.out.println("Fsirst number is belong to the range [-5,5]");
		if(num2 >= -5 && num2 <= 5)
			System.out.println("Second number is belong to the range [-5,5]");
		if(num3 >= -5 && num3 <= 5)
			System.out.println("Third number is belong to the range [-5,5]");
	
		//Task1 b)
		System.out.println("Input first number ");
		int a = in.nextInt();
		System.out.println("Input second number ");
		int b = in.nextInt();
		System.out.println("Input third number ");
		int c = in.nextInt();
		
		System.out.println("Max number = " + Math.max(Math.max(a, b), c));
		System.out.println("Min number = " + Math.min(Math.min(a, b), c));
		
		//Task1 c)
		System.err.println("\nIntut number of HTTP Error ");
		short errorNum = in.nextShort();
		in.close();
		switch(errorNum) {
		case 400 : System.out.println(HttpEerrors.Bad_Request);break;
		case 401 : System.out.println(HttpEerrors.Unauthorized);break;
		case 402 : System.out.println(HttpEerrors.Bad_Request);break;
		case 403 : System.out.println(HttpEerrors.Forbidden);break;
		case 404 : System.out.println(HttpEerrors.Not_Found);break;
		default : System.out.println("Wrong!");break;
		}

	}
	

}

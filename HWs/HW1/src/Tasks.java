import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tasks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//Task 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius:");
		double r = Double.parseDouble(br.readLine());
		double p = 2*3.14*r;
		double s=3.14*r*r;
		System.out.println("Perimeter:"+p);
		System.out.println("Area:"+s);
		
		//Task2
		String name;
		String address;
		System.out.println("What is your name?");
		 name = br.readLine();
		 System.out.println("Where do you live,"+ name + "?");
		 address = br.readLine();
		 System.out.println(name + " lives in " + address);
		 
		 //Task3
		 System.out.println("Standard units per minute in Ukraine");
		 double c1 = Double.parseDouble(br.readLine());
		 System.out.println("Time of the talk in Ukraine");
		 double t1 = Double.parseDouble(br.readLine()); 
		 System.out.println("Standard units per minute in Poland");
		 double c2 = Double.parseDouble(br.readLine());
		 System.out.println("Time of the talk in Poland");
		 double t2 = Double.parseDouble(br.readLine()); 
		 System.out.println("Standard units per minute in USA");
		 double c3 = Double.parseDouble(br.readLine());
		 System.out.println("Time of the talk in USA");
		 double t3 = Double.parseDouble(br.readLine());
		 
		 double p1=c1*t1;
		 double p2=c2*t2;
		 double p3=c3*t3;
		 double t=p1+p2+p3;
		 
		 System.out.println("Pay for the phone call in Ukraine: " + p1);
		 System.out.println("Pay for the phone call in Poland: " + p2);
		 System.out.println("Pay for the phone call in USA: " + p3);
		 System.out.println("Pay for the phone call in total: " + t);
	}

}

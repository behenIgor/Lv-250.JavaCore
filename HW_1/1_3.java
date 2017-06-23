import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thrid {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		// countries
		int c1 = 15;
		int c2 = 8;
		int c3 = 17;

		System.out.println("Cost per minute " + "\nñ1 = " + c1 +
				"; \nc2 = " + c2 + "; \nc3 = " + c3 + ";");

		// Range of random num
		// int a = 1;
		// int b = 60;
		// time ramdom
		// int t1 = a + (int) (Math.random() * b);
		// int t2 = a + (int) (Math.random() * b);
		// int t3 = a + (int) (Math.random() * b);

		System.out.println("Enter time for c1");
		int t1 = Integer.parseInt(br.readLine());

		System.out.println("Enter time for c2");
		int t2 = Integer.parseInt(br.readLine());

		System.out.println("Enter time for c3");
		int t3 = Integer.parseInt(br.readLine());
		
		int sumc1 = SummC(t1, c1);
		int sumc2 = SummC(t2, c2);
		int sumc3 = SummC(t3, c3);

		System.out.println("c1 -> " + t1 + " min summ -> " + sumc1);
		System.out.println("c2 -> " + t2 + " min summ -> " + sumc2);
		System.out.println("c3 -> " + t3 + " min summ -> " + sumc3);

		System.out.println("Total min -> " + Summ(t1, t2, t3) + "\nTotal -> " 
							+ Summ(sumc1,sumc2, sumc3));
	}
	
	// total pay
	public static int SummC(int t, int c){
		int res = t * c;
		return res;
	}
		
	// summ for min and pay
	public static int Summ(int a, int b, int c){
		int summ  = a + b + c;
		return summ;
	}

	
}

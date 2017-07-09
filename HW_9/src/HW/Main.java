package HW;
import java.util.Scanner;

/**
 * Created by Evey on 09.07.2017.
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a, b;

        Main m = new Main();
        try {
            System.out.println("1");
            a = input.nextDouble();
            System.out.println("2");
            b = input.nextDouble();
            m.div(a,b);
            System.out.println("Not throw ArithmeticException and return Double.INFINITY");
        } catch (Exception e){
            System.out.println(e);            
        }finally {
        	input.close();
		}

    }
    void div(double  a, double b)throws ArithmeticException { 	
        try {
            if (b != 0) {
                System.out.println("Result of " + a + " divided by " + b + " is : " + a / b);
            } else
            {
            	throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Sorry Division By Zero Is Not Possible");
        }
     }

}

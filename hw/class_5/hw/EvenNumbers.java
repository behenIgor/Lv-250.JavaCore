package new29;

import java.util.Scanner;

/**
 * Created by Вождь on 01.07.2017.
 */
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (true){
            int n = Integer.parseInt(scanner.nextLine());
            if(n < 0)
                break;
            count++;
        }
        System.out.println("Amount of even numbers is " + count);
    }
}

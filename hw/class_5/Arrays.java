package new29;

import java.util.Scanner;

/**
 * Created by Вождь on 29.06.2017.
 */
public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        int max = numbers[0];
        int sum = 0;
        int countN = 0;
        int countP = 0;
        for (int n: numbers){
            if(max < n)
                max = n;
            if(n >= 0)
                sum +=n;

            if(n < 0)
                countN++;

            if(n >= 0)
                countP++;
        }
        System.out.println("Max = " + max);
        System.out.println("Sum of positve nambers= " + sum);
        System.out.println("Negative amount = " + countN);
        System.out.println(countP > countN ? "Positive amount bigger" : "Negative amount bigger");
        scanner.close();
    }
}

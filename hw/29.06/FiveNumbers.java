package new29;

import java.util.Scanner;

/**
 * Created by Вождь on 01.07.2017.
 */
public class FiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] num = new int[5];

        for (int i = 0; i <num.length ; i++) {
            num[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < num.length ; i++) {
            if(num[i] >= 0){
                System.out.println("Position of second positive number is " + (i+1));
                break;
            }
        }

        int min = num[0];
        int positionMin = 0;
        int i = 0;
        while (i < num.length) {
            if (min > num[i]) {
                min = num[i];
                positionMin = i;
            }
            i++;
        }
        System.out.println("Min is " + min + " positin in the array " + positionMin);
        scanner.close();
    }
}

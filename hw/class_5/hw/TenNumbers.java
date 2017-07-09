package new29;

import java.util.Scanner;

/**
 * Created by Вождь on 01.07.2017.
 */
public class TenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = new int[10];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        int sum = 0;
            for (int j = 0; j < 5 ; j++) {
                if(numbers[j] >= 0)
                    sum =sum + numbers[j];
                 else { sum = 0; break; }
            }
            if(sum == 0){
                for (int k = 5; k <numbers.length ; k++) {
                    sum += numbers[k];
                }
            }

        System.out.println(sum);
        scanner.close();
    }
}

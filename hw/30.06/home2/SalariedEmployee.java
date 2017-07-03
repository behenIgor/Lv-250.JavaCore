package home2;

/**
 * Created by Вождь on 01.07.2017.
 */
public class SalariedEmployee extends Employee implements Calculator {

    private int hourly_rate;
    private int number_of_hours_worked;
    private String socialSecurityNumber;

    @Override
    public double calculatePay() {
        return hourly_rate * number_of_hours_worked;
    }
}

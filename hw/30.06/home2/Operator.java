package home2;

/**
 * Created by Вождь on 01.07.2017.
 */
public class Operator extends SalariedEmployee {

    private int hourly_rate;
    private int number_of_hours_worked;
    private String socialSecurityNumber;

    public Operator(int hourly_rate, int number_of_hours_worked, String socialSecurityNumber) {
        this.hourly_rate = hourly_rate;
        this.number_of_hours_worked = number_of_hours_worked;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourly_rate() {
        return hourly_rate;
    }

    public int getNumber_of_hours_worked() {
        return number_of_hours_worked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setHourly_rate(int hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public void setNumber_of_hours_worked(int number_of_hours_worked) {
        this.number_of_hours_worked = number_of_hours_worked;
    }
}

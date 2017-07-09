package task6.home2;

/**
 * Created by User on 08.07.2017.
 */
public class ContractEmployee extends Employee {

    private String federalTaxIdmember;
    private int hourly_rate;
    private double number_of_hours_worked;

    public ContractEmployee(String name, String employeeld, String federalTaxIdmember, int hourly_rate, double number_of_hours_worked) {
        super(name, employeeld);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourly_rate = hourly_rate;
        this.number_of_hours_worked = number_of_hours_worked;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(int hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public double getNumber_of_hours_worked() {
        return number_of_hours_worked;
    }

    public void setNumber_of_hours_worked(double number_of_hours_worked) {
        this.number_of_hours_worked = number_of_hours_worked;
    }

    @Override
    public double calculatePay() {
       double average_monthly_salary = hourly_rate * number_of_hours_worked;
        return average_monthly_salary;
    }

    @Override
    public String toString() {
        return "ContractEmployee " +
                "name='" + super.getName() +
                ", federalTaxIdmember='" + federalTaxIdmember +
                ", hourly_rate=" + hourly_rate +
                ", average monthly salary=" + calculatePay();
    }
}

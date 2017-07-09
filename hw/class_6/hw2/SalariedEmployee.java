package task6.home2;

/**
 * Created by User on 08.07.2017.
 */
public class SalariedEmployee extends Employee {

    private String socialSecurityNumber;
    private double fixed_monthly_payment;

    public SalariedEmployee(String name, String employeeld, String socialSecurityNumber, double fixed_monthly_payment) {
        super(name, employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixed_monthly_payment = fixed_monthly_payment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixed_monthly_payment() {
        return fixed_monthly_payment;
    }

    public void setFixed_monthly_payment(double fixed_monthly_payment) {
        this.fixed_monthly_payment = fixed_monthly_payment;
    }


    @Override
    public double calculatePay() {
        double average_monthly_salary = fixed_monthly_payment;
        return average_monthly_salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee" +
                "name='" + super.getName() +
                ", socialSecurityNumber='" + socialSecurityNumber +
                ", average monthly salary=" + calculatePay();
    }
}

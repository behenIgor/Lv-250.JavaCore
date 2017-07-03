package home2;

/**
 * Created by Вождь on 01.07.2017.
 */
public class ContractEmployee extends Employee implements Calculator {

    private double monthly_salary;
    private String federalTaxIdmember;

    @Override
    public double calculatePay() {
        return monthly_salary;
    }
}

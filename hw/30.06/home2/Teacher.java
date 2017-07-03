package home2;

/**
 * Created by Вождь on 01.07.2017.
 */
public class Teacher extends ContractEmployee {

    private int monthly_salary;
    private String federalTaxIdmember;

    public Teacher(int monthly_salary, String federalTaxIdmember) {
        this.monthly_salary = monthly_salary;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getMonthly_salary() {
        return monthly_salary;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setMonthly_salary(int monthly_salary) {
        this.monthly_salary = monthly_salary;
    }
}

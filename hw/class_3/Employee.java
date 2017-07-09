package New23;

/**
 * Created by Вождь on 23.06.2017.
 */
public class Employee {

    private String name;
    private double rate;
    private int hours;

    static int totalSum;

    public Employee() {
    }
    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }
    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double salary(){
        return this.getRate()*this.getHours();
    }

    public void changeRate(double rate){
        this.setRate(rate);
    }

    public double bonuses(){
        return salary()*0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}

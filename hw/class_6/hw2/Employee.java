package task6.home2;

/**
 * Created by User on 08.07.2017.
 */
public abstract class Employee implements Calculator {
    private String name;
    private String employeeld;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public Employee(String name, String employeeld) {
        this.name = name;
        this.employeeld = employeeld;
    }
}

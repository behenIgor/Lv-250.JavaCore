package New23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Вождь on 23.06.2017.
 */
public class Person {

    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int age(int birthYear){
        Calendar calendar = new GregorianCalendar();
        return calendar.get(Calendar.YEAR)-birthYear;
    }
    public void input (){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inpun information about person");
        try {
            this.setName(reader.readLine());
            this.setBirthYear(Integer.parseInt(reader.readLine()));
        }catch (IOException e){
            System.out.println("Error in information about person");
        }
    }
    public void output (){
        System.out.println(this.getName());
        System.out.println(this.getBirthYear());
    }
    public void changeName(String name){
        this.setName(name);
    }
}

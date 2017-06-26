package homeWork;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Person {
	private int birthYear;
	private String name;

	public Person() {
	}

	public Person(int birthYear, String name) {
		this.birthYear = birthYear;
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getCurrentYear() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
		calendar.setTime(new Date());
		return calendar.get(Calendar.YEAR);
	}

	public int age() {
		return getCurrentYear() - this.birthYear;
	}

	@Override
	public String toString() {
		return "\nName = " + name + ",  birth year = " + birthYear + ",  age = " + age();
	}

}

package Car;

public class Car {
	String name;
	Double engineCapacity;
	int yearOfProduction;
	public Car(String name, Double engineCapacity, int yearOfProduction) {

		this.name = name;
		this.engineCapacity = engineCapacity;
		this.yearOfProduction = yearOfProduction;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(Double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", engineCapacity=" + engineCapacity + ", yearOfProduction=" + yearOfProduction
				+ "]";
	}


}

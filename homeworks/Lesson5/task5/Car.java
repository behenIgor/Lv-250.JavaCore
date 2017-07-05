package task5;

public class Car {
	private String type;
	private int yearOfProd;
	private double engineCapac;
	
	public Car() {}
	public Car(String type) {
		this.type = type;
	}
	public Car(String type, int yearOfProd) {
		this.type = type;
		this.yearOfProd = yearOfProd;
	}
	public Car(String type, int yearOfProd, double engineCapac) {
		this.type = type;
		this.yearOfProd = yearOfProd;
		this.engineCapac = engineCapac;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYearOfProd() {
		return yearOfProd;
	}
	public void setYearOfProd(int yearOfProd) {
		this.yearOfProd = yearOfProd;
	}
	public double getEngineCapac() {
		return engineCapac;
	}
	public void setEngineCapac(double engineCapac) {
		this.engineCapac = engineCapac;
	}
	
	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProd=" + yearOfProd + ", engineCapac=" + engineCapac + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(engineCapac);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + yearOfProd;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (Double.doubleToLongBits(engineCapac) != Double.doubleToLongBits(other.engineCapac))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (yearOfProd != other.yearOfProd)
			return false;
		return true;
	}
	
	public boolean olderThan(Object obj) {
		Car other = (Car)obj;
		return this.yearOfProd > other.getYearOfProd();
	}
	
	
}

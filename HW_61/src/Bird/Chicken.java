package Bird;

public class Chicken extends NonFlyingBird {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chicken(String feathers, int layEggs, String name) {
		super(feathers, layEggs);
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Breed: " + name + ", Feathers: " + super.getFeathers() + ", Lay Eggs: " + super.getLayEggs());
		super.fly();
	}
}

package Bird;

public class Swallow extends FlyingBird {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Swallow(String feathers, int layEggs, String name) {
		super(feathers, layEggs);
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Breed: " + name +", Feathers: " + super.getFeathers() + ", Lay Eggs: " 
				+ super.getLayEggs());
		super.fly();
	}

}

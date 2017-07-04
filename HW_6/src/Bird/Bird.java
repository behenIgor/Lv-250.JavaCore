package Bird;

public abstract class Bird {

	private String feathers;
	private int layEggs;

	public String getFeathers() {
		return feathers;
	}

	public int getLayEggs() {
		return layEggs;
	}

	public Bird(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	
	public abstract void fly();

	public void displayInfo() {
		
		
	}
	
}

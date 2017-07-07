package task1;

public class Chicken extends NonFlyingBird {

	public Chicken(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	
	@Override
	public String toString() {
		return "Chicken "  + super.toString();
	}
	
}


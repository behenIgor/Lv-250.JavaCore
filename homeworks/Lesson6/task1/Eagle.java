package task1;

public class Eagle extends FlyingBird {
	
	public Eagle(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	
	@Override
	public String toString() {
		return "Eagle " + super.toString();
	}
	
}
	

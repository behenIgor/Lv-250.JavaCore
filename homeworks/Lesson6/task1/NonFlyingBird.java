package task1;

public class NonFlyingBird extends Bird {

	public NonFlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	public String fly() {
		return "can't fly";
	}

}
	


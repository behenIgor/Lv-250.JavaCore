package Bird;

public class FlyingBird extends Bird{

	public FlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
	}

	public void fly(){
		System.out.println("I can fly!");
	}
}

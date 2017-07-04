package Bird;

public class NonFlyingBird extends Bird {

	public NonFlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
	}

	public void fly(){
		System.out.println("I cant fly!");
	}
	
}

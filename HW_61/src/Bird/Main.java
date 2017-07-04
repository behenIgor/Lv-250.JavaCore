package Bird;

public class Main {
	public static void main(String[] args) {

		Bird[] bird = new Bird[4];
		bird[0] = new Eagle("Brown", 2, "Eagle");
		bird[1] = new Swallow("Grey", 5, "Swallow");
		bird[2] = new Penguin("Black and white", 15, "Penguin");
		bird[3] = new Chicken("Yellow", 20, "EaChickengle");
		
		for(Bird brd :bird ){
			brd.displayInfo();
		}		
	}

}

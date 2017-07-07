package task1;

public class Main {

	public static void main(String[] args) {
		Bird[] arrOfBirds = new Bird[4];
		arrOfBirds[0] = new Chicken("yup","allways");
		arrOfBirds[1] = new Eagle("yup","Sometimes");
		arrOfBirds[2] = new Swallow("maybe","don't know");
		arrOfBirds[3] = new Penguin("maybe","once per year");
		
		for(Bird bird : arrOfBirds) {
			System.out.println(bird + bird.fly());
		}
	}
}


public class main {

	public static void main(String[] args) {

		Animal a[] = new Animal[3];
		a[0] = new Cat();
		a[1] = new Dog();
		a[2] = new Cat();
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].voice());
			System.out.println(a[i].feed());
		}
		
		

	}
}



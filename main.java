
public class main {

	public static void main(String[] args) {
	Bird[] b = new Bird[4];
	b[0] = new Eagle();
	b[1] = new Swallow();
	b[2] = new Penguin();
	b[3] = new Chicken();
	
	for (int i=0; i < b.length; i++){
		System.out.println(b[i].fly());
		}

	}

}

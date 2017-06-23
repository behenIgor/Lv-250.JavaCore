import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		String ok = "ok";
		String answer;

		Scanner input = new Scanner(System.in);
		do {
			System.out.println("What is your name?");
			String name = input.next();
			System.out.println("Where are you live, " + name + " ?");
			String address = input.next();
			System.out.println(name + " , you are living  " + address);

			System.out.println("Repeat enter -> ok, Out enter -> something");
			answer = input.next();

		} while (ok.equals(answer));

		input.close();

		System.out.println("Good bay");

	}

}

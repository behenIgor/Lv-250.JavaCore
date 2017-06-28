package Homework4;
import java.util.Scanner;

public class EnumExpl {
	
	public enum HTTPError {
		Badrequest(400, "Bad request"),
		Accessdenied(401, "Access denied"), 
		Forbidden(403, "Forbidden"), 
		Notfound(404, "Not found"), 
		MethodNotAllowed(405, "Method not allowed");
		
		private int value;
		private String name;

		private HTTPError(int value, String name) {
			this.value = value;
			this.name = name;
		}
		
		public String getName() {
			return name;
		}

		public int getValue() {
			return value;
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of HTTP Error ");
		int i = input.nextInt();

		for (HTTPError http : HTTPError.values()) {
			if (i == http.value){
				System.out.println("Value: " + http.value + " - Name: " + http.name);
			}						
		}
		input.close();
	}
}

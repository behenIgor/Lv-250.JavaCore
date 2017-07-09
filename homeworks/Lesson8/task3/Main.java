package task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		Scanner in = new Scanner(System.in);
		String text;
		System.out.println("If you want  to exit enter the \"exit\"");
		
		while(true) {
			System.out.println("Enter US currency in format \"$xx.xx\"");
			text = in.nextLine();
			Matcher m = p.matcher(text);
			if(m.matches()) {
				System.out.println(text + " is valid");
			}
			else {
				if(text.equals("exit")) { break; }
				else { System.out.println(text + " is not valid"); }
			}
		}
		in.close();
	}
}

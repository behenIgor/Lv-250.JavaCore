package ClassW;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;;

public class Main {

	public static void main(String[] args) {
		// 1.1
		String str = "IT";
		String strF = "IT Academy";
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(strF);

		while (m.find()) {
			System.out.println(m.start() + " " + m.group() + " ");
		}

		// 1.1
		String[] som = strF.toString().split(" ");
		for (String res : som) {
			if (res.equals(str)) {
				System.out.println(str + " in string");
			}
		}

		// 2
		String npl = "Name Patronymic Lastname";
		String[] parts = npl.split(" ");

		for (int i = 0; i < parts.length; i++) {
			if (i == 0 || i == 1) {
				System.out.print(parts[i].charAt(0) + " ");
			} else {
				System.out.println(parts[i]);
			}
		}

		// 3
		Scanner input = new Scanner(System.in);

		String login = " ";

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter Login");
			login = input.nextLine();
			Pattern p2 = Pattern.compile("[A-z0-9_]{3,15}");
			Matcher m2 = p2.matcher(login);
			boolean ft = m2.matches();
			System.out.println("You entered " + login + " validation is " + ft);
		}
		input.close();
	}
}
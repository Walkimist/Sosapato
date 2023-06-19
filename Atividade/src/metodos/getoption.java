package metodos;

import java.util.Scanner;

public class getoption {
	public static int getOption() {
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		return option;
	}
	
	public static void getInput() {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}
}

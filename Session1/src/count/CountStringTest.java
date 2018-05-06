package count;

import java.util.Scanner;

public class CountStringTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string or integer value: ");
		String inputstring;
		//java.lang.String line;
		//line = input.nextLine();
		inputstring=input.nextLine();

		System.out.println("The number of characters for this line is: " + inputstring.length());
	}

}

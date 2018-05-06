package ClassAssignment;

import java.util.Scanner;

public class WordBySentence {

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		System.out.print("Enter for a string:");
		String s = Input.nextLine();
		String[] arr = s.split(" ");
		for (String stringholder : arr) {
			System.out.println(stringholder);
		}

	}

}

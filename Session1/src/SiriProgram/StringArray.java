package SiriProgram;

import java.util.Scanner;

import corejava.ProductPriceChecker;
import corejava.TotalProductPrice;

public class StringArray {

	public static void main(String[] args) {
		string();
		// TotalProductPrice price = new TotalProductPrice();
	}

	public static void string() {
		Scanner Input = new Scanner(System.in);
		String s[] = new String[10];
		// int a[] = new int[n];

		// TODO Auto-generated method stub
		s[0] = "Rehana";
		s[1] = "Sirajam";
		s[2] = "Tasnim";
		s[3] = "Rita";
		s[4] = "Ruby";
		s[5] = "Sultana";
		s[6] = "Belal";
		s[7] = "Ismat";
		s[8] = "Rina";
		s[9] = "Kamrun";
		System.out.println("Enter the Contact Name:");
		String n = Input.nextLine();
		int count = 0;

		for (int i = 0; i < s.length - 1; i++) {

			if (n.equalsIgnoreCase(s[i])) {
				count++;

			}

		}
		if (count == 0) {
			System.out.println(" Name does not exist in the array");

		} else {
			System.out.println("Name exists in these array");

		}

	}

}

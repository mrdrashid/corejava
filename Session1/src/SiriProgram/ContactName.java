package SiriProgram;

import java.util.Scanner;

public  class ContactName {
	
	
	Scanner input = new Scanner(System.in);
	
	String n = input.nextLine();
	String s[]= new String[10];
	static String name;
	static String Qualification;
	static String gender;
	static int age;

	ContactName (String n, int a, String g, String q) {
		
	String  name = n;
	int age =a;
	String gender=g;
	String Qualification=q;
	}
		
public static	void DisplayInformation() {
	
	System.out.println("Contact details are: " +name);
	System.out.println("Contact details are: " +age);	
	System.out.println("Contact details are: " +gender);
	System.out.println("Contact details are: " +Qualification);
		
	}
	
	
}

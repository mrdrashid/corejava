package ClassAssignment;

import java.util.Scanner;

public class AssendingOrder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the begining of number1:");
		int valueNumber1, valueNumber2;
			
		valueNumber1=input.nextInt();	
		
		System.out.print("Enter the ending of a number:");
		valueNumber2=input.nextInt();
		
		for (int  i =valueNumber1; i<=valueNumber2; i++)
		{
		
System.out.println("Now, the assending number between from first number to endnumber is:  "  +i);
	}

}
}

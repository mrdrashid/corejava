package SiriProgram;

import java.util.Scanner;

public class InteractiveMessage {

		

		public static void main(String[] args) {
							// TODO Auto-generated method stub
			sent();
		}
			public static void sent()
			{
			//System.out.println("You have scheduled meeting at 10:00am with Bob");
			Scanner input=new Scanner(System.in);
			//String mess=input.nextLine();
			System.out.println("You have scheduled meeting at 10:00am with Bob");
			String meeting=input.nextLine();
			//System.out.println(Towhom);
			System.out.println("I would like to send him a reminder if you want!");
			String Send=input.nextLine();
			//System.out.println(Send);
			System.out.println("go ahead and send him a message");
			String go=input.nextLine();
			
			if(go.equalsIgnoreCase("yes"))
			{
				System.out.println("Reminder was " + Send + " sent");
			}
			else if(go.equalsIgnoreCase("no"))
			{
				System.out.println("Ok, as per your direction, no reminder message was sent");
			}
			
			else
			{
				System.out.println("please select correct one");
			}
			
			
	

	

}

}


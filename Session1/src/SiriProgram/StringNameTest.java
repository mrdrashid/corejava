package SiriProgram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringNameTest {

			
		    public static void main(String args[])
		    
		    {
		    	strName();
		    }
		    
		    
		    	public static void strName() {
		            String strNumber = "";
		            String strName = "";
		            int intNumber;
		            try 
		            {
		                //  open up standard input
		                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		                //  prompt the user to enter their name
		                System.out.print("Enter your name: ");
		                strName = br.readLine();

		                System.out.print("Enter the number of times you want to print your name: ");
		                strNumber = br.readLine();
		                intNumber = Integer.parseInt(strNumber);

		                for (int row = 0; row < intNumber; row++)
		                {
		                    for(int col = 0; col < intNumber; col++)
		                        System.out.print(strName + " ");

		                    System.out.println("");
		                }
		            } 
		            catch (Exception ex) {
		                System.out.println(ex.getMessage());
		                System.exit(1);
		            }


		    }
		
	}



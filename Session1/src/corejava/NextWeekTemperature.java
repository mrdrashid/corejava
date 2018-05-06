package corejava;

import java.util.Scanner;

public class NextWeekTemperature {

	public static void main(String[] args) {
	weather();	
	}
		public static void weather() {
		//int NextWeekTemp []={65,55,70, 75,80,78,74};    
		int NextWeekTemp[] = new int[7];
		NextWeekTemp[0]= 65;
		NextWeekTemp[1]= 55;
		NextWeekTemp[2]= 70;
		NextWeekTemp[3]= 75;
		NextWeekTemp[4]= 80;
		NextWeekTemp[5]= 78;
		NextWeekTemp[6]= 74;
		
		
		
		    //if(NextWeekTemp[i]>=55 && NextWeekTemp[i]<=80)
			
				Scanner input = new Scanner(System.in);
				System.out.print("You would like to see the next week forcast:");
				String reader = input.nextLine();
				for (int i=0;i<NextWeekTemp.length;i++){
				System.out.println("Temperature for next week Monday to Sunday is "+NextWeekTemp[i]); 
		}
		
		
		
		// enhanced for
		//for (int WeekTemp : NextWeekTemp) {
	//		System.out.println(WeekTemp);
		}
					
				

	}




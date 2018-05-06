package corejava;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first array represents the row
		// second array represents column
		String flights [][] = new String [4][4];
		
		
		//first row
		flights [0][0]="Dallas";
		flights [0][1]="NYC";
		flights [0][2]="Miami";
		flights [0][3]="chicago";
		
		//Second row
		flights [1][0]="New Mexico";
		flights [1][1]="San Diego";
		flights [1][2]="DC";
		flights [1][3]="Newark";
		
		//Third Row
		flights [2][0]="New Orleans";
		flights [2][1]="Baton rouge";
		flights [2][2]="Kansas";
		flights [2][3]="toronto";
		
		//forth row
		
		flights [3][0]="Denver";
		flights [3][1]="Honolulu";
		flights [3][2]="Harrisberg";
		flights [3][3]="Houston";
		
	//	System.out.println(flights [2][2]);
		
		int rows =flights.length;
		int cols=flights[0].length;
		
		//argument for rows
		
		
		for (int rownum=0;rownum<rows; rownum++) {
			
			// argument for column
		
		for (int colnum=0;colnum<cols;colnum++){
			
			System.out.println(flights [rownum][colnum]);
		}
		}
		}
		
		
		
		
		
		
		
				

	}



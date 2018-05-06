package ClassAssignment;

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers(7);
		numbers(5.9);
		addition(7,8);
		addition(2,5,7);

	}

	public static void numbers (int a) {
		System.out.println(a);
	}
	
	public static void numbers(double a){
		System.out.println(a);
	}
	
	public static void addition(int a, int b)
	{  
		int add= a+b;
		System.out.println(add);
	}
	public static void addition(int a, int b, int c)
	{
		int add=a+b+c;
		System.out.println(add);
	}
	public static void  addition(int a, int b, int c, int d, int e)
	{
		int add=a+b+c+d+e;
		System.out.println(add);
	}
}

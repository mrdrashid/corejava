package corejava;
// Constructor is an instance method that usually has the same nbame of as class.

// Constructor should be always on non static

public class Constructor {
	int age;
	int salary;
	int house;
	String name;

	Constructor(int a, int s, int h, String n) {
		int age = a;
		int salary = s;
		int house = h;
		String name = n;

		System.out.println("Age is :" + a);
		System.out.println("Salary is :" + s);
		System.out.println("House is :" + h);
		System.out.println("Name is :" + "Alam Apa");

	}

	public static void main(String[] args) {

		Constructor x = new Constructor(47, 10000, 7, "name ");

	}

}

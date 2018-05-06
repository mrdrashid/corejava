package corejava;

// When you have an abstract method in any class, it becomes abstract class
//abstract method means you know your function, but don't know the action of that.
public abstract class Abstract {

public static void color (){
	System.out.println("green is my favourite color");
}

public static void food(){
	System.out.println("I like pie");
}

public static void addition(int a, int b) {

	int add=a+b;
	System.out.println(add);
}
public abstract void dinner();
public abstract void country();
}

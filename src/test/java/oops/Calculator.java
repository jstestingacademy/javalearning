package oops;

public class Calculator {
// method overloading
	
	int add( int a, int b) {
		return a+b;
	}

	double add( double a, double b) {
		return a+b;
	}
	
	int add( int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		System.out.println(c.add(2, 3));
		System.out.println(c.add(2.5, 3.5));
		System.out.println(c.add(2, 3,6));
	}

}

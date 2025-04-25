package training;

import java.util.Scanner;

public class scanner_example {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Enter your name:");
	String name= sc.nextLine();
	
	System.out.println("hello "+ name);
	
	System.out.println(" Enter your age:");
	int age =sc.nextInt();
	System.out.println("your "+ age);
	
	System.out.println(" Enter your marks:");
	Double marks =sc.nextDouble();
	
	System.out.println("your "+ marks);
	
	
	
	
	
	
	}

}

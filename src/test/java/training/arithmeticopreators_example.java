package training;

public class arithmeticopreators_example {

	public static void main(String[] args) {
		
		int a=40, b=50;
		// arithimetic opreators
		
		System.out.println("Addition: " + (a+b));
		System.out.println("Subtraction: " + (a-b));
		System.out.println("Multiplication: " + (a*b));
		System.out.println("Division: " + (a/b));
		System.out.println("Moduls: " + (a%b));
		
		// relational opreators
		
		System.out.println("a==b: " + (a==b));
		System.out.println("a!=b: " + (a!=b));
		System.out.println("a>b: " + (a>b));
		System.out.println("a<b: " + (a<b));
		System.out.println("a<=b: " + (a<=b));
		System.out.println("a>=b: " + (a>=b));
		
		
		//logical opreators
		
		System.out.println((a<b) && (b>60));
		System.out.println((a<b) || (b>60));
		
		
		//assignment opreators
		a +=55; // a= a + 55;
		
		System.out.println("a:" + a);
		
		b *=2;
		System.out.println("b:" + b);
		
		
	}

}

package training;

public class methods_example {
	
	//user defined methods and nonparmetized method
	public void login() {
		System.out.println(" logged in");
	}
	
	
	//partemrized methods
	public void seach(String name) {
		System.out.println(name);
		
	}
	
	public int multiply(int a ,int b) {
		return a *b;
	}
	
	
	public static void main(String[] args) {
	
		//predefined methods
		String name="js testing academy";
		System.out.println(name.length());
		
		methods_example obj =new methods_example();
		obj.login();
		obj.seach("js testing academy");
		int result =obj.multiply(5, 10);
		System.out.println(result);

	}

}

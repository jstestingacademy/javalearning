package oops;

public class tiger extends Animal {

	@Override
	void sound() {
		System.out.println("tiger sound");
	}
	public static void main(String[] args) {
		
		Animal a1 = new dog();
		Animal a2 =new tiger();
		
System.out.println(a1);
System.out.println(a2);
	}

}

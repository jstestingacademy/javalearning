package others;

public class child  extends Parent{

	int value=40;
	
	
	void display() {
		System.out.println("child value" + value);
		System.out.println("parent value" + super.value);
	}
	public static void main(String[] args) {
		child c =new child();
		c.display();

	}

}

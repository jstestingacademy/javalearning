package others;

public class dog extends Animal{

	void sound() {
		super.sound();
		System.out.println("  dog makes sound");
	}
	public static void main(String[] args) {
		dog d = new dog();
		d.sound();

	}

}

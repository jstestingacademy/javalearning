package abstractionexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  abstract class Basetest {
	WebDriver driver;
	
	abstract void runtest();
	
	
	void setup() {
		driver = new ChromeDriver();
		
		System.out.println(" browser launched");
	}
	
	void teardown() {
		driver.quit();
	}
	
	

}

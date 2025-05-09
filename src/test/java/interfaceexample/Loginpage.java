package interfaceexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage  implements loginsteps{
	WebDriver driver;
	public static void main(String[] args) {
		Loginpage l = new Loginpage();
		l.enterpassword();
		l.enterusername();
		l.clicklogin();

	}

	public void enterusername() {
		driver.findElement(By.id("username")).sendKeys("joshi");
		
	}

	public void enterpassword() {
		driver.findElement(By.id("password")).sendKeys("joshi123");
		
		
	}

	public void clicklogin() {
		driver.findElement(By.id("login")).click();
		
	}

}

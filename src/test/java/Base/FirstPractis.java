package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class FirstPractis {
	@Test
	public void Practis() throws InterruptedException {
		WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("This is testing....");
	}

}

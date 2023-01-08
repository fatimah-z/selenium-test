package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondScript {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8000/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("fatimaz1@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.id("submit")).click();
		String at = driver.getTitle();
		String et = null;
		driver.close();
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test successful");
		}
		else {
			System.out.println("Test failed");
		}
	}

}

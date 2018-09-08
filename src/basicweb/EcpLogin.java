package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcpLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://192.168.211.91:12821/ecp/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "//Users//nb1-1338casper//eclipse-workspace//Selenium//geckodriver");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.findElement(By.id("kw")).sendKeys("Selenium Webdriver");
//		driver.findElement(By.id("kw")).sendKeys("Selenium Webdriver");
//		driver.findElement(By.xpath("//input[@id='su']")).click();

	}

}

package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcpLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "https://ai.qbicloud.com/gateway/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.findElement(By.xpath("//div[@id='_JUI_1_']/input")).sendKeys("administrator");
		driver.findElement(By.xpath("//div[@id='_JUI_2_']/input")).sendKeys("111111");
		//driver.findElement(By.xpath("//div[@onclick='Index.doSubmit()']")).click();
		driver.findElement(By.cssSelector("div.LoginButton")).click();
//		driver.findElement(By.id("kw")).sendKeys("Selenium Webdriver");
//		driver.findElement(By.xpath("//input[@id='su']")).click();

	}

}

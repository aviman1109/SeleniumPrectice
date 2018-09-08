package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "//Users//nb1-1338casper//github//SeleniumPrectice//chromedriver");
		driver = new ChromeDriver();
		driver.get(baseUrl);

	}

}

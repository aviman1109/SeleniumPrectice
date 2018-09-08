package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GatewayTesting {
	private static WebDriver driver;
	private static String baseUrl;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		baseUrl = "https://ai.qbicloud.com/gateway/";
		driver = new ChromeDriver();
		Web gateway = new Web();
		gateway.startWeb(baseUrl,driver);
		gateway.loginWeb(driver);
		gateway.tearDown(driver);

	}

}

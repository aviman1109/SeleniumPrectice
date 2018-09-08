package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Web {
	
	public void startWeb( String baseUrl ,WebDriver driver) throws Exception {
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	
	public void loginWeb(WebDriver driver) throws Exception {
		driver.findElement(By.xpath("//div[@id=\'_JUI_1_\']/input")).sendKeys("administrator");
		driver.findElement(By.xpath("//div[@id=\'_JUI_2_\']/input")).sendKeys("111111");
		driver.findElement(By.xpath("//div[@id=\'QsContent\']/div[4]/div[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[7]/div[4]")).click();
	}
	
	public void tearDown(WebDriver driver) throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}

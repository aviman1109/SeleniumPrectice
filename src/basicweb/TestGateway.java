package basicweb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestGateway {
	private static WebDriver driver;
	private static String baseUrl;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		baseUrl = "http://192.168.211.91:12621/gateway/";
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		Thread.sleep(5000);
		driver.quit();
		
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void loginTest() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"LoginNameCell\"]/div/input")).sendKeys("administrator");
		driver.findElement(By.xpath("//*[@id=\"PasswordCell\"]/div/input")).sendKeys("111111");
		driver.findElement(By.xpath("//div[@id=\'QsContent\']/div[4]/div[3]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[7]/div[4]")).click();
	}
	@Test
	void findSysConfig() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id=\"MenuZone\"]/div[2]/div[1]/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"MenuZone\"]/div[2]/div[2]/div[3]/div/div/div[1]/div/div/div/div[2]/div/div[2]")).click();
//		driver.findElement(By.linkText("租戶")).click();
		driver.findElement(By.xpath("//div[@title='新增一笔记录']")).click();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class MenloQuisitiveTestDemo {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");

		DesiredCapabilities cap=DesiredCapabilities.chrome();
		// Set ACCEPT_SSL_CERTS variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver webDriver=new ChromeDriver(cap);

		webDriver.get("https://www.menlo-technologies.com/");

		webDriver.manage().window().maximize();
		
		WebElement solutionsElement = webDriver.findElement(By.xpath("//*[@id=\"menu-item-12243\"]/a"));
		solutionsElement.click();
		
		WebElement cloudMobileDevElement = webDriver.findElement(By.xpath("//*[@id=\"et-boc\"]/div[1]/div[1]/div[1]/div/div/div[1]/div/p/span"));
		String cloudMobileDevElementValue = cloudMobileDevElement.getText();
		System.out.println(cloudMobileDevElementValue);
	}
}

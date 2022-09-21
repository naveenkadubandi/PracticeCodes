import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	/*	driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[aria-label='Accept Cookies']")).click();
		WebElement drpdown=driver.findElement(By.cssSelector("Select[class='dropdown']"));
		Select cntrydrpdwn=new Select(drpdown);  */
	//	cntrydrpdwn.selectByVisibleText("Chile");
	//  cntrydrpdwn.selectByIndex(5);
	/*	driver.findElement(By.cssSelector("input[id='Form_getForm_FullName']")).sendKeys("Kadubandi Naveen Kumar");
		driver.findElement(By.cssSelector("input#Form_getForm_Email")).sendKeys("kaduba2047@gmail.com");
		cntrydrpdwn.selectByValue("Algeria");
		driver.findElement(By.cssSelector("input[Placeholder='Phone Number*']")).sendKeys("7842331609");
		driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();   */
	//	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")).sendKeys("Admin");
	/*	driver.findElement(By.partialLinkText("sub")).click();
		driver.findElement(By.partialLinkText("mit")).click();   */
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.cssSelector("p.oxd-userdropdown-name")).click();
     // driver.findElement(By.tagName("a")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.findElements(By.cssSelector("")).size();
        
        
		
		
		
		
	}

}

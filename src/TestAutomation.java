import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Naveen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
	    driver.manage().window().maximize();
	/*	Assert.assertFalse(false);
		Assert.assertTrue(true);    */
	    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	    System.out.println(driver.findElement(By.cssSelector("[class='css-1dbjc4n'] div div[class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText());
	    driver.findElement(By.cssSelector("[class='css-1dbjc4n'] div div[class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
	    Thread.sleep(2000);
	    for(int i=1;i<5;i++) {
		    driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
		    }
	   for(int i=5;i>0;i--) {
	    driver.findElement(By.cssSelector("div[data-testid='Adult-testID-minus-one-cta']")).click();
	    }   
	    System.out.println(driver.findElement(By.cssSelector("div[class='css-1dbjc4n'] div div[class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']")).getText());
  }
}

package Com.Naukari.QA.Com.Naukari.QA.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class ShinePune {
	
	@Test
	public static void main() throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shine.com/myshine/login/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='id_email_login']"));
		WebElement PassWord = driver.findElement(By.xpath("//input[@id='id_password']"));
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='button']"));
		
		
		Email.sendKeys("srnarwade96@gmail.com");
		PassWord.sendKeys("Shyam@123");
		LoginBtn.click();
		
		

		
		Thread.sleep(3000);
		
		WebElement UpdateProfile = driver.findElement(By.xpath("//a[text()='Update Profile']"));
		UpdateProfile.click();
		
		WebElement EditBtn = driver.findElement(By.xpath("//span[@id='edit-icon-work-summary-web']"));
		
		EditBtn.click();
		

		
		WebElement ProfieTitle = driver.findElement(By.xpath("//input[@id='id_resume_title']"));
		
		Thread.sleep(3000);
		ProfieTitle.clear();
		Thread.sleep(3000);
		ProfieTitle.sendKeys("Seeking professional enrichment opportunities in Manual and Automation Testing");
		
		
		WebElement SaveBtn = driver.findElement(By.xpath("//input[@value='Save']"));
		
		SaveBtn.click();
		
		
		Thread.sleep(2000);
		WebElement AgainProfile = driver.findElement(By.xpath("//span[@class='spanName']"));
		
		Actions actions= new Actions(driver);
		actions.click(AgainProfile).build().perform();
		
		
		
		WebElement LogOut = driver.findElement(By.xpath("//a[@href='/myshine/logout/']"));
		LogOut.click();
		
		Thread.sleep(2000);
		
		System.out.println("Pune Shine profile is updated");
		
		driver.close();
		
		
		
	
	}

}

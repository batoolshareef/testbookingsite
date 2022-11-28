package testbookingsite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Testbookingsite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]")).click();
		driver.findElement(
				By.xpath("		//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[2]/td[7]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By
				.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[3]/td[7]/span/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();

		String errmsg = driver.findElement(By.xpath(" //*[@id=\"destination__error\"]/div")).getText();

//		System.out.println(errmsg);

		String expectedmsg = "are you stuped";

//		System.out.println(expectedmsg);

		Assert.assertEquals(errmsg, expectedmsg);
		
	
	}

}

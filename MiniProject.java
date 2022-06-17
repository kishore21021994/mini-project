package project;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MiniProject {

	public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkatakrishnan\\eclipse-workspace\\SeleniumBasic\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ss= (TakesScreenshot) driver;
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		WebElement id = driver.findElement(By.id("email"));
		
		id.sendKeys("kvkkumar1994@gmail.com");
		
		WebElement Pass= driver.findElement(By.id("passwd"));
		
		Pass.sendKeys("kishore07");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		
		dress.click();
		
		driver.findElement(By.xpath("(//a[@title='Browse our different dresses to choose the perfect dress for an unforgettable evening!'])[1]")).click();
		
		WebElement color= driver.findElement(By.id("color_16"));
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView()", color);
		
		Thread.sleep(2000);
		
		color.click();
		
		color.click();
		
	//	WebElement Quan = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		
	//	js.executeScript("arguments[].scrollIntoView()", Quan);

	//	Quan.click();
		

		WebElement addcart = driver.findElement(By.id("add_to_cart"));
		
		addcart.click();
		
		Thread.sleep(5000);
	

		WebElement proceedtocheckout  =	driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		
	    proceedtocheckout.click();
         
		Thread.sleep(5000);

		WebElement Summary  =		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
			
		js.executeScript("arguments[0].scrollIntoView()", Summary);
		
		Summary.click();
		
		Thread.sleep(5000);
		
		WebElement Address = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		
		
		js.executeScript("arguments[0].scrollIntoView()", Address);
		
		Address.click();
		
		Thread.sleep(5000);
		
		WebElement Shippingagree = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
		
		
		js.executeScript("arguments[0].scrollIntoView()",Shippingagree);


		Shippingagree.click();
		
		Thread.sleep(5000);
		
		WebElement Shipping = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		
		Shipping.click();
		
        Thread.sleep(5000);

		 File SrcFile1=ss.getScreenshotAs(OutputType.FILE); 
         File desfile1 = new File("C:\\Users\\venkatakrishnan\\eclipse-workspace\\SeleniumBasic\\Screenshot\\scrshotaddress.png");
         FileUtils.copyFile(SrcFile1, desfile1)		;
		
         Thread.sleep(5000);
         
         driver.quit();

		

	
		
		
		
		
		
		
		
		
	}

}

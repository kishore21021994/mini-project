package project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelBooking_MiniProject {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\venkatakrishnan\\\\eclipse-workspace\\\\SeleniumBasic\\\\Driver\\\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.navigate().to("https://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("ganeshdwara");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("April@2022");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		WebElement location = driver.findElement(By.name("location"));
		Select dropdown1 = new Select(location);
		dropdown1.selectByIndex(2);
		
		WebElement hotels = driver.findElement(By.name("hotels"));
		Select dropdown2 = new Select(hotels);
		dropdown2.selectByIndex(2);
		
		WebElement roomtype = driver.findElement(By.name("room_type"));
		Select dropdown3 = new Select(roomtype);
		dropdown3.selectByIndex(4);
		
		WebElement roomnos = driver.findElement(By.name("room_nos"));
		Select dropdown4 = new Select(roomnos);
		dropdown4.selectByIndex(3);
				
		WebElement checkindate = driver.findElement(By.name("datepick_in"));
		checkindate.clear();
		// checkindate.click();
		checkindate.sendKeys("29/04/2022");
		
		WebElement checkoutdate = driver.findElement(By.name("datepick_out"));
		checkoutdate.clear();
		// checkoutdate.click();
		checkoutdate.sendKeys("01/05/2022");
		
		WebElement adultroom = driver.findElement(By.name("adult_room"));
		Select dropdown5 = new Select(adultroom);
		dropdown5.selectByIndex(3);
				
		WebElement childroom = driver.findElement(By.name("child_room"));
		Select dropdown6 = new Select(childroom);
		dropdown6.selectByIndex(1);
		
		WebElement submit = driver.findElement(By.name("Submit"));
		submit.click();
		
		WebElement radiobutton = driver.findElement(By.name("radiobutton_0"));
		radiobutton.click();
		
		WebElement conti = driver.findElement(By.name("continue"));
		conti.click();
		
		WebElement firstname = driver.findElement(By.name("first_name"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", firstname);
		firstname.sendKeys("Ganesh");
		
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("R");
		
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("No.221, Porur, Chennai - 116.");
		
		WebElement ccnum = driver.findElement(By.name("cc_num"));
		ccnum.sendKeys("1234567890111213");
		
		WebElement cctype = driver.findElement(By.name("cc_type"));
		Select dropdown7 = new Select(cctype);
		dropdown7.selectByIndex(3);
		
		WebElement ccexpmonth = driver.findElement(By.name("cc_exp_month"));
		Select dropdown8 = new Select(ccexpmonth);
		dropdown8.selectByIndex(7);
		
		WebElement ccexpyear = driver.findElement(By.name("cc_exp_year"));
		Select dropdown9 = new Select(ccexpyear);
		dropdown9.selectByIndex(12);
		
		WebElement cccvv = driver.findElement(By.name("cc_cvv"));
		cccvv.sendKeys("490");
		
		WebElement booknow = driver.findElement(By.name("book_now"));
		booknow.click();
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\\\Users\\\\venkatakrishnan\\\\eclipse-workspace\\\\SeleniumBasic\\\\Screenshot\\\\scrshotaddress.png");
		FileHandler.copy(source, desti);
		
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(booknow));
		
		WebElement searchhotel = driver.findElement(By.name("search_hotel"));
		js.executeScript("arguments[0].scrollIntoView()", searchhotel);
		searchhotel.click();
		
		Thread.sleep(5000);		
		driver.close();		
	}

}
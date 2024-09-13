package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Xpath {
	public static String browser = "Firefox"; //External configuration - XLS, CSV
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.get("https://nagarikrojgar.com/");
		//FOR SIGNUP PAGE RECRUITER
		//driver.findElement(By.xpath("//*[@id="root"]/div/div/header/nav/div[4]/button/svg/path"));
		driver.findElement(By.xpath("/html/body/div/div/div/header/nav/div[3]/a/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/main/section/div[1]/form/div/div[3]/div[2]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/main/section/div[1]/form/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Deepak Yadav");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("yadeepak2000@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9807379305");
		driver.findElement(By.xpath("//*[@id=\"companyName\"]")).sendKeys("Deepak Company");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Laptop@123");
		driver.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("Laptop@123");
		driver.findElement(By.xpath("//*[@id=\"agreeToTerms\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/main/section/div[1]/form/div/button")).click();
		
		//FOR LOGIN PAGE RECRUITER
		driver.findElement(By.xpath("")).click();
		
		
		
	}

}

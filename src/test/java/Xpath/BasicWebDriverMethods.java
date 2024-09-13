package Xpath;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebDriverMethods {
	
	public static String browser = "Chrome"; //External configuration - XLS, CSV
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
		
		
		//driver.get("https://dev.nagarikrojgar.com/");//Get method helps us to get given URL.
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();// Manage method helps to minimize and maximize the browser.
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);//getCurrentUrl method gives the current URL link.
		
		String title =driver.getTitle();// getTitle method gives the title of the current page.
		System.out.println(title);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);//getPageSource method get the source of the last loaded page.
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		// Wait for a few seconds before closing the browser
		try {
			Thread.sleep(5000);  // Wait for 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
		System.out.println(webelements);//findElements method is used to List all elements within the current page.
		//driver.navigate().to("http://google.com");//navigate method helps to navigate to another URL from one URL.
		driver.navigate().to("https://www.sugarcrm.com/");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		//driver.close();//It helps to close the windows browser
		
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div/a")).getCssValue("text-transform"));
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div/a")).getSize());
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div/a")).getLocation());
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div/a")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div/a")).getTagName());
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div/a")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div/a")).isEnabled());
		System.out.println(driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div/a")).isSelected());

		driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div/a")).click();
	





		Set<String>windowHandles=driver.getWindowHandles();
		System.out.println(windowHandles);
		// Wait for a few seconds before closing the browser
		try {
			Thread.sleep(5000);  // Wait for 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//driver.quit();
		
	}

}

package Pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	//for list collection
    public static void main(String[] args) throws InterruptedException {
    	
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/"); 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Login
		WebElement element=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		element.sendKeys("akshaynarhare1541@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akshay123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class=\"eFQ30H\"]"));
		
		for(WebElement a:elements)
		{
			System.out.println(a.getText());
		}
		
		
		

	}

}

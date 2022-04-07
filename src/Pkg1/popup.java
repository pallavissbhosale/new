package Pkg1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.guru99.com/test/delete_customer.php");
				Thread.sleep(2000);
				WebElement e1=driver.findElement(By.xpath("//input[@type=\"text\"]"));
				e1.sendKeys("12345");
				driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			
				Alert k=driver.switchTo().alert();
				System.out.println(k.getText());
			
				if(k.getText().equals("Do you really want to delete this customer?"))
				{
					System.out.println("test passed");
					Thread.sleep(2000);
					k.accept();
					
					//hallo
					
				}
				else
				{
					System.out.println("test fail");
					Thread.sleep(2000);
					k.dismiss();
				}
				

	}

}

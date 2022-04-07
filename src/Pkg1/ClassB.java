package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassB {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com");
			Thread.sleep(5000);
			WebElement song=driver.findElement(By.xpath("//ytd-rich-item-renderer[@<yt-formatted-string id=\"video-title\" class=\"style-scope ytd-rich-grid-media\" aria-label=\"Pushpa: Oo Bolega ya Oo Oo Bolega (Audio) | Allu A, Rashmika | Kanika K | DSP | Sukumar | Samantha by T-Series 1 month ago 3 minutes, 47 seconds 11,394,932 views\">…</yt-formatted-string>]"));
			  
	}

}

package Selenium_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("sb_form_q")).sendKeys("Intellipaat");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='search_svg'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String searchTitle = driver.findElement(By.partialLinkText(("Intellipaat"))).getText();
		System.out.println("The search result is: " + searchTitle);
		driver.close();
	}

}

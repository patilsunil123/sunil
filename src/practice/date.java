package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class date {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium All Softwares\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/?gclid=EAIaIQobChMIjavU8PO_4QIVQZGPCh2-5QxUEAAYASAAEgIlefD_BwE");

		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		List<WebElement> date = driver.findElements(By.xpath("//div[@class='rb-calendar']/child::table//tbody//td"));
		int total_node = date.size();
		for (int i = 0; i < total_node; i++) {
			String dates = date.get(i).getText();
			if (date.equals("25")) {
				date.get(i).click();
				break;
			}
		}

	}
}

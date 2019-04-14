package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date_picker {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium All Softwares\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
		WebElement Search = driver.findElement(By.xpath("//input[@value='Search']"));
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Search);*/
        driver.findElement(By.xpath("//input[@name='aa-leavingOn']")).click();
        List<WebElement> calender= driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/descendant::table[1]/tbody//td"));
        int total_dates=calender.size();
        for(int i=0;i<total_dates;i++){
        	String date=calender.get(i).getText();
        	if(date.equalsIgnoreCase("25")){
        		calender.get(i).click();
        		break;
        	}
        	
        }

}

}

package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DP_Staging_Main_Page {
	

	
	String updateFromLap = "update From Laptop Jan 5 2021";

	private static WebElement element = null;
	
	
	public static WebElement Login(WebDriver driver) {	
		element = driver.findElement(By.xpath("//*[@id=\"banner-container\"]/nav/div/div[2]/ul/li[1]/a"));
		return element;
		
	}
	
	

}

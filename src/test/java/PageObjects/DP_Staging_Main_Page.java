package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DP_Staging_Main_Page {
	
	String updateFromGithub = "update From Github Dec 31 2020";
	String updateFromLocal = "update From Local Dec 31 2020";
	String updateFromLocal = "update From Local Jan 1 2021";

	private static WebElement element = null;
	
	
	public static WebElement Login(WebDriver driver) {	
		element = driver.findElement(By.xpath("//*[@id=\"banner-container\"]/nav/div/div[2]/ul/li[1]/a"));
		return element;
		
	}
	
	

}

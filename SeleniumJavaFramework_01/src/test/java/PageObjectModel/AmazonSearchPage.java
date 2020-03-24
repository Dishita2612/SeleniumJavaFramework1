package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchPage
{
	private static WebElement element = null;
//Create a function for Textbox search
	public static WebElement textboxsearch(WebDriver driver)
	{
		 element = driver.findElement(By.id("twotabsearchtextbox"));
		return element;
		}
//Create a function to hit enter on this Textbox search field
	public static WebElement clicksearchbutton(WebDriver driver)
	{
		element = driver.findElement(By.className("nav-input"));
		return element;
	}
}

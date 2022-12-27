import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/dropdown1.html");
		WebElement ele = driver.findElement(By.id("hotel"));
		Select s =new Select(ele);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("j");
		Thread.sleep(3000);
		s.selectByVisibleText("chutney");
		Thread.sleep(3000);
		System.out.println(s.getAllSelectedOptions());
		boolean multiple = s.isMultiple();
	    if(multiple)
	    {
	    	System.out.println("multiple");
	    }
	    else
	    {
	    	System.out.println("not aa multiple");
	    }
	}
}

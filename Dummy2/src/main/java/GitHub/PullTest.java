package GitHub;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PullTest 
{
	@Test
	public void PullTest() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis = new FileInputStream("./data/CommonProperty.properties");
		Properties prob = new Properties();
		prob.load(fis);
		String Url = prob.getProperty("url");
		driver.get(Url);
		//String URL = System.getProperty("url");
		//System.out.println(URL);
		//driver.get(URL);
		System.out.println("Welcome to jenkins");
		System.out.println("Dummy Project");
		System.out.println("pull request");
		System.out.println("pull request2");
		
		
	}

}

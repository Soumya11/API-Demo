package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class LaunchBrowser 
{
	@Test
	public void sample() throws Throwable
	{
		String key = "webdriver.edge.driver";
		String value = "D:\\QSpiders\\Advanced Selenium\\edgedriver_win64 (1)\\msedgedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://localhost:8888/");
		//FileInputStream fis = new FileInputStream("http://localhost:8888/");
//		Properties pro = new Properties();
//		pro.load(fis);
		
		//String BROWSER = System.getProperty("browser");
//		String URL = System.getProperty("url");
//		String USERNAME = System.getProperty("username");
//		String PASSWORD = System.getProperty("password");
		//driver.get(URL);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin");
		driver.findElement(By.id("loginButton")).click();
	}
}

package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver getBrowser() throws IOException{
		 prop = new Properties();
String chromepath=System.getProperty("user.dir")+"//Drivers//Chrome//chromedriver.exe";
String firefoxpath= System.getProperty("user.dir")+"//Drivers//FirefoxDriver//geckodriver.exe";
String path= System.getProperty("user.dir")+"//src//main//java//Resources//base.properties";
		 
	//FileInputStream fisbase= new FileInputStream("C://Users//SUCHI//workspaces//ProjectP2//src//main//java//Resources//base.properties");
		 
		FileInputStream fisbase= new FileInputStream(path);
		 prop.load(fisbase);
	String browser= prop.getProperty("Browser");
	String url = prop.getProperty("URL");
	if(browser.equalsIgnoreCase("Chrome"))
			{
		System.setProperty("webdriver.chrome.driver", chromepath);
		 driver = new ChromeDriver();
			}
	else if(browser.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.firefox.driver", "C://FirefoxDriver//geckodriver.exe");
		 driver = new FirefoxDriver();	
	}
	else{
		System.out.println("No such browser");
	}
	
	driver.manage().window().maximize();
	return driver;
	}
}

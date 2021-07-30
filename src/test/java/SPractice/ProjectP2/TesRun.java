package SPractice.ProjectP2;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.Spicejet;
import Resources.BrowserFactory;

public class TesRun extends BrowserFactory{
	
  @Test
  public void run() throws IOException, InterruptedException{
	 driver= getBrowser();
	 String url = prop.getProperty("URL");
	 driver.get(url); 
	 Spicejet sj= new Spicejet(driver);
	 sj.getDeparturecity();
	 sj.getPassengers();
	 Thread.sleep(2000);
	 sj.getDate();
	// sj.getAdults();
	 
  }

}

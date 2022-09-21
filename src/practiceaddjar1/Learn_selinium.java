package practiceaddjar1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_selinium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sihik\\Desktop\\selBrowserDrives\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();                              // web page will be in minimized format when the test case is run maximize the browser for clear picture using the following code written
		
		driver.get("https://login.rediff.com/");                         // to launch the website need to use an method called get method
		
	//	driver.findElement(By.id("login-username")).sendKeys("shssh");  //sendkeys()---> is to pass ur given info sshhh and click()--->is to pass just click on that particualr field
                                                                        // findelement() by id-----> method with string value help u to find that element and pass the given info with send keys
		                                                                // when u write find element(), on the top it will import automatically ---> by import
      //  driver.quit();		// to close use quit method()
	}

}

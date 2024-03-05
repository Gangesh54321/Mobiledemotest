package Demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class chromealertdemo {
	static AndroidDriver driver;
	public static void main(String[] args) {

		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12.0");
		capabilities.setCapability("deviceName","11f6dc970408");
		capabilities.setCapability ("appPackage", "com.android.chrome");
		capabilities.setCapability ("appActivity", "com.google.android.apps.chrome.Main");
		capabilities.setCapability("noReset", true);
		
		try {
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html[1]/body[1]/button[1]")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Gangesh Mishra");
		alert.accept();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}

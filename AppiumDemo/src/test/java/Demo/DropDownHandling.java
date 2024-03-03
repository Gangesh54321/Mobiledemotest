package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub


		//Gather Desired capabilities

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName","Gangesh");
        capabilities.setCapability("platformname", "Android");     
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("platformversion", "12");
	        //io.appium.android.apis/io.appium.android.apis.ApiDemos
	        capabilities.setCapability("appPackage","io.appium.android.apis");
	        capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	        

	        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        Thread.sleep(5000);
	        System.out.println("Application Started");


		//click on view button
		driver.findElements(By.id("android:id/text1")).get(11).click();

		//click on controls
		driver.findElements(By.id("android:id/text1")).get(4).click();

		//click on light theme
		driver.findElements(By.id("android:id/text1")).get(0).click();

		WebElement dropdown = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]"));
		dropdown.click();
		
		Thread.sleep(2000);
		
		WebElement earthOption = driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Earth\"]"));
		earthOption.click();
			
		
		Thread.sleep(2000);
		System.out.println("Session closed");
		driver.quit();
		//Sucess fully rum some DOM not detect wait 10 min, after 10 min it will be work.
	}

}

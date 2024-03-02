package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class HandleTextBoxCheckboxRadioBtn {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		//Gather Desired capabilities
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("deviceName","Gangesh");
        capabilities.setCapability("platformname", "Android");     
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("platformversion", "12");
	        
	        capabilities.setCapability("appPackage","io.appium.android.apis");
	        capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	        //io.appium.android.apis/io.appium.android.apis.ApiDemos
	        

	        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        Thread.sleep(5000);
	        System.out.println("Application Started");
	        
	        
	        //click on view button
	       driver.findElements(By.id("android:id/text1")).get(11).click();
	    
	       //click on controls
	       driver.findElements(By.id("android:id/text1")).get(4).click();
	      
	       //click on light theme
	       driver.findElements(By.id("android:id/text1")).get(0).click();
	      
	       //enter text in textbox
	       //io.appium.android.apis:id/edit
	       driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Gangesh Mishra");
           Thread.sleep(2000);
	       //checkbox
	       //io.appium.android.apis:id/check1
	       driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
	       Thread.sleep(2000);
	       
	       //radio button
	       driver.findElement(By.id("io.appium.android.apis:id/radio2")).click();
	       Thread.sleep(2000);
	       
	        driver.quit();//CLOSE SESSION
	}

}

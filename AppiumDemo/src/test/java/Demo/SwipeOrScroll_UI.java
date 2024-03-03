package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SwipeOrScroll_UI {

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
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Picker\"))")).click(); 

				
		Thread.sleep(2000);
		driver.quit();
		//https://testgrid.io/blog/appium-scroll/
		
		
	}

}

package Demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;

public class googlelaunch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		//Gather Desired capabilities
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//com.google.android.dialer/com.google.android.dialer.extensions.GoogleDialtactsActivity
		capabilities.setCapability("deviceName","Gangesh");
        capabilities.setCapability("platformname", "Android");     
        //capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("platformversion", "12");
        capabilities.setCapability(MobileBrowserType.BROWSER, "Chrome");
        //capabilities.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
        
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(5000);
        System.out.println("Application Started");
        	        
	       
	        
	        driver.get("https://www.google.com/");
	        Thread.sleep(2000);
	       // driver.close();//CLOSE SESSION
	}

}

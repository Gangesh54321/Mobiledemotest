package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppManagement {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub

		//Gather Desired capabilities

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName","Gangesh");
        capabilities.setCapability("platformname", "Android");     
        capabilities.setCapability("automationName","uiautomator2");
        capabilities.setCapability("platformversion", "12");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(5000);
        System.out.println("Application Started");


		String packageName = "io.appium.android.apis";
		
		//driver.terminateApp(packageName);
		
		//remove app
		//driver.removeApp(packageName);
		
		if(!driver.isAppInstalled(packageName))
		{
		//install application
		driver.installApp("C:\\Users\\ASUS\\Desktop\\apkfiles\\ApiDemos-debug.apk");
		System.out.println("App sucessfully installed.");

		}
		else
			System.out.println("App already installed.");
		
		//activate the application
		driver.activateApp(packageName);
		
		Thread.sleep(2000);
		driver.quit();//close session
	}

}

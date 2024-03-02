package Demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AutomateCalc {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		//Gather Desired capabilities
		
				   DesiredCapabilities capabilities = new DesiredCapabilities();
				    capabilities.setCapability("deviceName","Gangesh");
			        capabilities.setCapability("platformname", "Android");     
			        capabilities.setCapability("automationName","uiautomator2");
			        capabilities.setCapability("platformversion", "12");
			        capabilities.setCapability("appPackage","com.google.android.calculator");
			        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
			        
			        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			        Thread.sleep(5000);
			        System.out.println("Application Started");
			        
			        
			        //click on number 9
			       WebElement num9 =  driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
			       num9.click(); //perform click action on number 9
			       
			       //click on plus sign
			       WebElement mul =  driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
			       mul.click(); //perform click action on number 8
			    
			        //click on number 2
			       WebElement num5 =  driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
			       num5.click(); //perform click action on number 8
			    
			       
			        //click on equal sign
			       WebElement equal =  driver.findElement(By.id("com.google.android.calculator:id/eq"));
			       equal.click(); //perform click action on number 8
			    
			       
			       //click on result sign
			       WebElement result =  driver.findElement(By.id("com.google.android.calculator:id/result_final"));
			      String resultString = result.getText();
			      
			      if(resultString.equals("21"))
			      {
			    	  System.out.println("**************Pass********************");
			      }
			      else
			      {
			    	  System.out.println("-------------fail-----------");
			      }
			      
			    
			 
			        driver.quit();//Gangesh Mishra
			        
	}

}

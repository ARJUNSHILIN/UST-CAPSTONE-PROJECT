package sampletest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.aspectj.lang.annotation.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class NewTest {
	
	private static AndroidDriver<WebElement> driver;
	
	public static void scroll(AndroidDriver<WebElement> driver)
	{
		  TouchAction  action =new TouchAction(driver);	
		  Dimension size	=driver.manage().window().getSize();
		  int start_x=(int) (size.width*.5);
		  int start_y=(int) (size.height*.5);	
		  
		  int end_x=(int) (size.width*.5);
		  int end_y=(int) (size.height*.3);
		  				
		  action.press(PointOption.point(start_x, start_y))
		  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		  .moveTo(PointOption.point(end_x, end_y)).release().perform();
	}

	
	  @Test
	  public void testone() throws MalformedURLException, InterruptedException 
	  {
		   

		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability(CapabilityType.BROWSER_NAME, "");	   
		  capabilities.setCapability("deviceName", "Pixel 4 XL API 30");
		  capabilities.setCapability("appPackage", "io.selendroid.testapp");
		  capabilities.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		  capabilities.setCapability("autoGrantPermissions",true);
		  driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  
		  
		  	  driver.findElement(By.id(
			  "com.android.permissioncontroller:id/continue_button")).click();
			  driver.findElement(By.id("android:id/button1")).click();
			  
			  
			  String s =
			  driver.findElement(By.id("io.selendroid.testapp:id/visibleButtonTest")).
			  getText(); Assert.assertEquals(s, "Display text view");
			  
			  String s1 =
			  driver.findElement(By.id("io.selendroid.testapp:id/showPopupWindowButton")).
			  getText(); Assert.assertEquals(s1, "Display Popup Window");
			  
			  
			  driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("Mukesh Selenium Appium");
			  driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
			  
			  Thread.sleep(2000);
			  
			  driver.findElement(By.id("io.selendroid.testapp:id/inputUsername")).sendKeys("Admin");
			  driver.findElement(By.id("io.selendroid.testapp:id/inputEmail")).sendKeys("abc@gmail.com");
			  driver.findElement(By.id("io.selendroid.testapp:id/inputPassword")).sendKeys("Admin");
			  driver.findElement(By.id("io.selendroid.testapp:id/inputName")).clear();
			  driver.findElement(By.id("io.selendroid.testapp:id/inputName")).sendKeys("Mr John");
			  driver.findElement(By.id("android:id/text1")).click();
			  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[6]")).click();
			  
			  scroll(driver);
			  
			  driver.findElement(By.id("io.selendroid.testapp:id/input_adds")).click();
			  driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")).click();
			  
			  Thread.sleep(2000);
			  
			  driver.findElement(By.id("io.selendroid.testapp:id/buttonRegisterUser")).click();
			  
			  Thread.sleep(2000);
					 
	  }
	  
	 
	  

}



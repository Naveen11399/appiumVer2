package appium2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class appiumTest {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver driver;
		
		

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "POCO C3");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "4TTCOBI7HU4PAYOR");
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.izome.teacher");
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.izome.teacher.MainActivity");
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		desiredCapabilities.setCapability("autoGrantPermissions", true);
		// desiredCapabilities.setCapability("adbExecTimeout", "60000");
		

		// Initialize the Appium driver with the desired capabilities
		URL url = new URL("http://0.0.0.0:4723/");
		
		
		
		
		
		

		
		 driver = new AndroidDriver(url, desiredCapabilities);
		
		
		
		WebElement nextBtn = driver.findElement(AppiumBy.accessibilityId("Next"));
		nextBtn.click();
		nextBtn.click();

		WebElement getSratBtn = driver.findElement(AppiumBy.className("android.view.View"));
		getSratBtn.click();

		WebElement schoolCode = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
		schoolCode.click();
		schoolCode.sendKeys("5152167243");

		WebElement submitBtn = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Submit\"]"));
		submitBtn.click();

		WebElement teacherId = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
		teacherId.click();
		teacherId.sendKeys("saba");

		WebElement teacherPwd = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));

		teacherPwd.click();
		teacherPwd.sendKeys("Welcome@123");

		WebElement login = driver.findElement(By.xpath("//android.view.View[@content-desc=\"LOGIN\"]"));
		login.click();

		System.out.println("done");
		
//		
//		public UiAutomator2Options getPixelOptions() {
//			
//			UiAutomator2Options options=new UiAutomator2Options();
//			
//			  
//		          
//		          options
//		          .setPlatformName("dd")
//		          .setDeviceName("dd")
//			       .setUdid("dd")
//			       .setApp("dd")
//			       .setAppPackage("dd")
//			       .setAppActivity("dd")
//			       .setNoReset(false);
//			       
//			    return options;
//			
//			
//		}
		
		

	}

}

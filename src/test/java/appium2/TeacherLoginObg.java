package appium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class TeacherLoginObg {
	static AndroidDriver driver;

	public static  void loginOBJ() {
		

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
	}
	
}

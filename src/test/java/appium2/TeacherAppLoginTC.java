package appium2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class TeacherAppLoginTC extends Uiautomator2Options {

	static AndroidDriver driver;

	public static void loginOBJ() throws InterruptedException {

		Thread.sleep(5000);
		driver.get("https://www.google.com/");
		WebElement nextBtn = driver.findElement(AppiumBy.accessibilityId("Next"));
		nextBtn.click();
		nextBtn.click();
		Thread.sleep(2000);
		WebElement getSratBtn = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Get Started\"]"));
		getSratBtn.click();

		Thread.sleep(2000);
		WebElement schoolCode = driver.findElement(AppiumBy.className("android.widget.EditText"));
		schoolCode.click();
		Thread.sleep(2000);
		schoolCode.sendKeys("5152167243");
		Thread.sleep(2000);

		WebElement submitBtn = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Submit\"]"));
		submitBtn.click();

		Thread.sleep(3000);
		WebElement teacherId = driver.findElement(AppiumBy.xpath("//*[@hint='Teacher ID']"));
		teacherId.click();
		teacherId.sendKeys("saba");

		// .navigate().back();

		Thread.sleep(3000);
		WebElement teacherPwd = driver.findElement(By.xpath("//*[@hint='Password']"));

		teacherPwd.click();
		teacherPwd.sendKeys("Welcome@123");
		// driver.navigate().back();

		WebElement login = driver.findElement(By.xpath("//android.view.View[@content-desc=\"LOGIN\"]"));
		login.click();

		System.out.println("done");
	}

	@Test
	public void LoginTC() throws MalformedURLException, InterruptedException {
		AppiumServerFromCode apm = new AppiumServerFromCode();

		AppiumServerFromCode.startAppiumServer();

		Uiautomator2Options options = new Uiautomator2Options();
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options.getPocoBrowserOptions());
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//	driver.launchApp();

		loginOBJ();

		AppiumServerFromCode.stoptAppiumServer();

	}
}

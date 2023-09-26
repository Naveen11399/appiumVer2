package appium2;

import java.io.File;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServerFromCode {
	
	static AppiumDriverLocalService server;
	static AndroidDriver driver;
	

	static void setInstance() {
		String nodeJSmainPath = "C:\\Users\\Picco\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
		
		String nodeExePath="C:\\Program Files\\nodejs\\node.exe";
		
		String logFilePath="C:\\Users\\Picco\\eclipse-workspace\\appiumVer2\\src\\test\\resources\\logs\\log1.txt";
		
		AppiumServiceBuilder builder= new AppiumServiceBuilder();
		builder
		.withAppiumJS(new File(nodeJSmainPath))
		.usingPort(4723)
		.usingDriverExecutable(new File(nodeExePath))
		.withLogFile(new File(logFilePath))
		.withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
		.withIPAddress("127.0.0.1");
		
		server= AppiumDriverLocalService.buildService(builder);
		
		

	}
	
	static AppiumDriverLocalService getInstance() {
		
		if (server==null) {
			setInstance();
		}
		return server;
		
	}
	
	
	static void startAppiumServer() {
		getInstance().start();
	}
	
	static void stoptAppiumServer() {
		if (server!=null) {
		getInstance().stop();;
	}

	}
}

package appium2;

import java.io.File;

import io.appium.java_client.android.options.UiAutomator2Options;

public class Uiautomator2Options {
	
	
	public UiAutomator2Options getPixelOptions() {
		
//		ClassLoader classloader=getClass().getClassLoader();
//		File file=new File (classloader.getResource("builds/mentor.apk").getFile());
//		String apkPath=file.getAbsolutePath();
	
	UiAutomator2Options options=new UiAutomator2Options();
	
	  
          
          options
           .setPlatformName("Android")
           .setPlatformVersion("11")
           .setDeviceName("Pixel XL API 30")
	       .setUdid("emulator-5554")
	       //.setApp(apkPath)
	       .setAutomationName("UiAutomator2")
	       .setAppPackage("com.izome.teacher")
	       .setAutoGrantPermissions(true)
//	       .withBrowserName("Chrome");
	       .setAppActivity("com.izome.teacher.MainActivity")
           .setNoReset(false);
	       
	    return options;
	
	
}
	
	
	public UiAutomator2Options getPocoOptions() {
		
//		ClassLoader classloader=getClass().getClassLoader();
//		File file=new File (classloader.getResource("builds/student.apk").getFile());
//		String apkPath=file.getAbsolutePath();
	
	UiAutomator2Options options=new UiAutomator2Options();
	
	  
          
          options
           .setPlatformName("Android")
           .setPlatformVersion("10")
           .setDeviceName("POCO C3")
	       .setUdid("4TTCOBI7HU4PAYOR")
	       .withBrowserName("Chrome")
	       .setAppPackage("com.izome.teacher")
	       .setAppActivity("com.izome.teacher.MainActivity")
	       .setNoReset(false);
	       
	    return options;
	
	
}
	
	public UiAutomator2Options getPocoBrowserOptions() {
		
//		ClassLoader classloader=getClass().getClassLoader();
//		File file=new File (classloader.getResource("builds/student.apk").getFile());
//		String apkPath=file.getAbsolutePath();
	
	UiAutomator2Options options=new UiAutomator2Options();
	
	  
          
          options
           .setPlatformName("Android")
           .setPlatformVersion("10")
           .setDeviceName("POCO C3")
	       .setUdid("4TTCOBI7HU4PAYOR")
	       .withBrowserName("Chrome")
	       .setNoReset(false);
	       
	    return options;
	
	
}

}

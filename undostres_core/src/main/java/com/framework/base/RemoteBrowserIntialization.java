package com.framework.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteBrowserIntialization {
	
	
	public  void setup(String url, String browserName,WebDriver driver) throws MalformedURLException {
		 {		
		if (browserName.equalsIgnoreCase("CHROME")) {
			DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
			capabilities.setPlatform(Platform.LINUX);
			driver = new RemoteWebDriver(new URL(url),capabilities);
			//Loggers.getInfoLog("New chrome driver instantiated....");	
		}

		else if (browserName.equalsIgnoreCase("FIREFOX")) {
			DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
			capabilities.setPlatform(Platform.LINUX);
			driver = new RemoteWebDriver(new URL(url),capabilities);
			//Loggers.getInfoLog("New Firefox driver instantiated....");
		}
		
		else if (browserName.equalsIgnoreCase("SAFARI")) {
			DesiredCapabilities capabilities =  DesiredCapabilities.safari();
			capabilities.setPlatform(Platform.LINUX);
			driver = new RemoteWebDriver(new URL(url),capabilities);
			//Loggers.getInfoLog("New Firefox driver instantiated....");
		}
		else 
			throw new IllegalArgumentException(
					String.format("%s browser is not valid please provide valid browserName", browserName));
		}}}


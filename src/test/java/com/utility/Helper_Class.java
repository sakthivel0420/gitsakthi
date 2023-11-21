package com.utility;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class Helper_Class {
	public static Helper_Class helperclass;
	public static WebDriver driver;	
	public final static int TIMEOUT = 10;
	public static Logger log = null;
	public static Actions actions ;
	public static JavascriptExecutor jse;
	//constructor
	Helper_Class(){  //setup
		driver = new EdgeDriver();
		jse = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
		actions = new Actions(driver);
		log = LogManager.getLogger(Helper_Class.class);
	}
	public static void openPage(String url) {
		driver.get(url);		
		log.info("User in SportsJam Home page");
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if(helperclass == null) {
			helperclass = new Helper_Class();			
		}
	}
	public static void tearDown() {
		if(driver!=null) {
			//driver.close();
			//driver.quit();
			//log.info("User quits SportsJam Webpage");
		}
		helperclass = null;
	}

 
}

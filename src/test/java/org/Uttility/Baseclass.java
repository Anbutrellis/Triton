package org.Uttility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.json.Row;

public class Baseclass {

	public static WebDriver driver;

	public static void Browerlauch(String browsername) {
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions c = new ChromeOptions();
			c.setAcceptInsecureCerts(true);
			driver = new ChromeDriver(c);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			EdgeOptions e = new EdgeOptions();
			e.setAcceptInsecureCerts(true);
			driver = new EdgeDriver(e);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions f = new FirefoxOptions();
			f.setAcceptInsecureCerts(true);
			driver = new FirefoxDriver(f);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			break;
		}
	}

	public static void sendkeys(WebElement e, String data) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(e));
		try {
			e.sendKeys(data);
			

		} catch (Exception e2) {
			jsSendkeys(data, e);
			e2.printStackTrace();
		}

	}
	public static void jsSendkeys(String data,WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"')", e);
		

	}
	public static void jsclick(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", e);
		
		
	}

	public static void click(WebElement e) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.elementToBeClickable(e));
		try {
			e.click();

		} catch (Exception e2) {
			jsclick(e);
			e2.printStackTrace();
		}

	}

	public static void Screenshot(String name) throws IOException {
		try{
			TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\" + name + ".png");
		FileUtils.copyFile(screenshotAs, f);
	}catch (Exception e) {
		e.printStackTrace();
	}
		}

	public static void windowshandle(int windowcount) {
		Set<String> Allid = driver.getWindowHandles();
		int count = 1;
		for (String Eachid : Allid) {
			if (count == windowcount) {
				driver.switchTo().window(Eachid);
			}
			count++;
		}
	}

	public static void selectption(String options, WebElement element, Object values) {
		Select s = new Select(element);
		switch (options) {
		case "byvalue":
			s.selectByValue((String) values);

			break;
		case "byindex":
			s.selectByIndex((int) values);

			break;
		case "bytext":
			s.selectByVisibleText((String) values);

			break;
		}
	}

	public static String gettext(WebElement e) {
		String text = e.getText();
return text;
	}

	public static void url(String Url) {
		driver.get(Url);

	}

	public static void BrowersQuit() {
		driver.quit();

	}

	public static void refresh() {
		driver.navigate().refresh();

	}

	public static void forward() {
		driver.navigate().forward();

	}

	public static void backward() {
		driver.navigate().back();

	}

	public static String geturl() {
		return driver.getTitle();

	}

	public static String getattribute(WebElement e) {
		return e.getAttribute("value");

	}
	
	public static void loop(int Howmanytime,WebElement e) {
		for (int i = 0; i <Howmanytime ; i++) {
			click(e);
		}
	}
	public static String Getdata(String key) {
		String property =null;
		try {
		Properties p= new Properties();
		FileReader r= new FileReader("C:\\Users\\Admin1\\Documents\\GitHub\\IHC\\src\\test\\resources\\config data\\IHC.properties");
		p.load(r);
		property = p.getProperty(key);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return property;
	}
	public static void Actionclass(String options,WebElement e) {
		Actions a = new Actions(driver);
		switch (options) {
		
		case "movetoelementclick":
			a.moveToElement(e).click().perform();
			break;
		case "doubleclick":
			a.doubleClick().perform();

		default:
			break;
		}

	}
	public static void sleep(int sec) {
		try {
			Thread.sleep(sec);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void cleartext(WebElement e) {
		e.clear();
		
	}
	 public static void setDefaultTimeUsingJQuery( WebElement e, String data) {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('default-time','"+data+"')", e);
		  
	 
	 }	
	
	
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}

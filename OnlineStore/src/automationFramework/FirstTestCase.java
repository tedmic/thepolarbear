package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.NotConnectedException;
//import org.openqa.selenium.firefox.WedDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.Scanner;

//Unable to connect to host 127.0.0.1 on port 7055 after 45000 ms


public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
				"C:\\eclipse workspace\\download\\selenium webdriver java\\geckodriver.exe");
		
		System.setProperty("webdriver.firefox.marionette", 
				"C:\\eclipse workspace\\download\\selenium webdriver java\\geckodriver.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		WebDriver driver = new FirefoxDriver(capabilities);
		//WebDriver driver = new FirefoxDriver();
		
		//String myUrl = "http://www.store.demoqa.com";
		String myUrl = "http://www.yahoo.com";
		
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println("currentUrl=" + currentUrl);
		
		
        String expectedTitle = "Yahoo";
        String actualTitle = "";
		
		try {
			//driver.manage().window().maximize();
			driver.get(myUrl);	// launch website
			
			
			/* Caused by: org.openqa.selenium.firefox.NotConnectedException: 
			 * Unable to connect to host 127.0.0.1 on port 7055 after 45000 ms. 
			 * Firefox console output:
			 */
			
			
			//driver.manage().window().maximize();
			
			actualTitle = driver.getTitle();
			
			//driver.getPageSource();
			
			//XPATH from firebug, firepath, xml
			//driver.findElement(By.xpath(".//*[@id='abar_button_opt']")).click();
			//customized XPATH "   "//tagname[@attribute='value'"
			// <div> <form> <input id="myid" class="myclass" required="" name="phone"
			//driver.findElement(By.xpath("//input[@id='name']").sendkeys("Ted Mic");

			//Scanner input = new Scanner(Sysetm.in);
			//int number;
			//System.out.println("enter a number: ");
			//number= input.nextInt();
			//System.out.println("number=" + number);
				
			//xpath, click also clicks on checkbox, radiobutton
			//xpath, check click on, use .isSelected()
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.get("http://www.cnn.com");    //waits 10 sec after load, giving it time
			
			//explicit wait for db query
			//WebDriverWait wait = new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
			//driver.findElement(By.id("username")).sendKeys("John Doe");
			
			
			
			
			
	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
			
	        //tagName = driver.findElement(By.id("email")).getTagName();
	        //System.out.println(tagName);
	        
		}
		/*catch (NotConnectedException nce) {
			System.out.println("catch NotConnected  exception");
			System.exit(-1); 
		}*/
		catch (ArrayIndexOutOfBoundsException  aioobe) {
			System.out.println("catch ArrayIndexOutOfBounds  exception");
			System.exit(-1); 
		}
		catch (ArithmeticException ae) {
			System.out.println("catch arithmetic exception");
			System.exit(-1); 
		}
		catch (Exception e) {
			System.out.println("catch generic exception");
			System.exit(-1); 
		}
		finally {
			System.out.println("finally");
		}
		
		// print to screen
        System.out.println("Successfully opened the website: " + myUrl);
 
		//Wait for 2 Sec
		//Thread.sleep(2);
		
        // Close the driver
		driver.close();
        driver.quit();
        
        /* tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        driver.close();*/
        System.exit(0); 
        
	}

}

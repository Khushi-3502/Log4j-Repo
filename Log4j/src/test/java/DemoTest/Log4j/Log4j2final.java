package DemoTest.Log4j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j2final {

	public static void main(String[] args) throws FileNotFoundException, Exception {
		// TODO Auto-generated method stub
		
		Logger log = LogManager.getLogger(Log4j2final.class);
		
        File f = new File("C:\\Users\\KHUSHI SHAH\\git\\Log4j-Repo\\Log4j\\src\\main\\resource\\config.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		System.setProperty(prop.getProperty("driverProperty"), prop.getProperty("driverPath"));
		
		WebDriver driver = new ChromeDriver();
	
		log.info("Successfully open chrom browser");
		
		driver.manage().window().maximize();
		
		log.info("windows maximized perfact");
		
		driver.get(prop.getProperty("url"));
		
		Thread.sleep(1000);
		
		log.warn("We use thread so it wait for a 1 second");
		
		driver.findElement(By.id(prop.getProperty("Email"))).sendKeys(prop.getProperty("email"));
		
		log.info("Email is passed successfully");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id(prop.getProperty("Password"))).sendKeys(prop.getProperty("pass"));
		
		log.info("Password is filled successfully");
		
		System.out.println("I have successfully entered email and password");
		
		
		

	}

}

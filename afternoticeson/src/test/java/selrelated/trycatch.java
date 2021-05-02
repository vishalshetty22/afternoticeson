package selrelated;


import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class trycatch {
public static void main(String[] args) throws Exception {
	int a=20;
	int b=5;
	int k;
	try {
		k=a/b;
		System.out.println("try BLOCK");
	} catch (Exception e) {
		System.out.println("catch BLOCK");
	}
	finally {
		System.out.println("final");
	}
	
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://google.com");
//	driver.close();
//	driver.quit();
	
try {
	driver.switchTo().alert().accept();	
	} catch (NoAlertPresentException e) {
		e.printStackTrace();
		System.out.println("Vishal =NoAlertPresentException");
	}
}
}

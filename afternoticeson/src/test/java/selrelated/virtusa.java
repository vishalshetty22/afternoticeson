package selrelated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class virtusa {
	public WebDriver driver;
	
	@BeforeClass
	public void openMain() {
	    driver=new FirefoxDriver();
		driver.get("https://xndev.com/palindrome");
	}
	
	@Test(priority=0)
	public void palindrometest() {
		driver.findElement(By.id("originalWord")).sendKeys("madam");
		driver.findElement(By.id("button1")).click();
		String resultpalindrometext = driver.findElement(By.id("palindromeResult")).getText();
		System.out.println(resultpalindrometext);
	}
	
	@Test(priority=1)
	public void anagramtest() {
		driver.findElement(By.id("anagramWord")).sendKeys("silent");
		driver.findElement(By.id("button2")).click();
		String resultanagramtext = driver.findElement(By.id("anagramResult")).getText();
		System.out.println(resultanagramtext);
	}

}

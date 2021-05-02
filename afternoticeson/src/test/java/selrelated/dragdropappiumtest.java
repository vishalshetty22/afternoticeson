package selrelated;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class dragdropappiumtest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName","Mi 4i" );
		cap.setCapability("platFormName","Android" );
		cap.setCapability("platFormVersion","5.0.2" );
		cap.setCapability("appPackage", "com.mobeta.android.demodslv");
		cap.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher" );
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//		driver.findElementById("com.mobeta.android.demodslv:id/activity_title").click();
//		List<WebElement> Li = driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
//		TouchAction Act=new TouchAction(driver);
//		Act.longPress(Li.get(1)).moveTo(Li.get(4)).release().perform();
		
		driver.findElementByXPath("//*[@text='CursorAdapter']").click();
		Thread.sleep(5000);
		List<WebElement> ListText = driver.findElementsById("com.mobeta.android.demodslv:id/text");
		List<WebElement> Listcross = driver.findElementsById("com.mobeta.android.demodslv:id/click_remove");
	   System.out.println(ListText.size());
	   System.out.println(Listcross.size());
	   int flag = 0;
	   for (int i = 0; i < ListText.size(); i++) {
		if (ListText.get(i).getText().contains("Miles")) {
			Listcross.get(i).click();
			
			break;
		}
			}
	   for (WebElement data : ListText) {
		if (data.getText().contains("Miles")) {
			flag=1;
			break;
		}
	}
	   if (flag==0) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
	}

}

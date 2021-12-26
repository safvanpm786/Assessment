package Com.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.assessment.Browsers;
import Com.assessment.Constants;
import Com.carlistpage.Elements;

public class Carlist {
WebDriver driver;
Elements elementpage = new Elements();

	@BeforeClass
	public void launch() {
		driver = Browsers.launchbrower();
		elementpage = PageFactory.initElements(driver, Elements.class);
		
	}
	@BeforeMethod
	public void navigate() throws InterruptedException {
		driver.get(Constants.url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	@Test
	public void verifycostofcartest() throws InterruptedException {
		
		elementpage.getUsedselectbox();
		elementpage.getSearchbutton().click();
		elementpage.getSelectthefirstcar().click();
		boolean b = elementpage.verifyprice();
		Assert.assertTrue(b, "carpriceisgreaterthan 1000");
		
	}
}

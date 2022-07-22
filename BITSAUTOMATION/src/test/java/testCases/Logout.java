package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
//import pageObjects.Login_Page_Objects;
import pageObjects.Suggest_Station_List_Page_Objects;

public class Logout extends CommonFunctions{
static Logger logger = Logger.getLogger(Login.class);
	
	@Test(priority = 0)
	public static void Signout() throws Throwable
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Verifying Sign Out from the Application");
		logger.info("Signing Out...");
		PageFactory.initElements(driver, Suggest_Station_List_Page_Objects.class);
		Suggest_Station_List_Page_Objects.ProfileClick.click();
		Thread.sleep(2000);
		CommonFunctions.captureScreen("UserLogin - Logging Out.png");
		Suggest_Station_List_Page_Objects.SignOutClick.click();
		Thread.sleep(2000);
		CommonFunctions.captureScreen("UserLogin - Logged Out.png");
		extenttestCase.log(Status.INFO,"User Successfully Signed out");
		
		logger.info("User Successfully Signed out");
	}

}

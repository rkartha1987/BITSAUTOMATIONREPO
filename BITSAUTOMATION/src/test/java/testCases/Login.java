package testCases;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
//import org.apache.xmlbeans.impl.tool.XSTCTester.TestCase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import CommonFunctions.CommonFunctions;
//import testCases.Logout;
import pageObjects.Login_Page_Objects;

public class Login extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(Login.class);
	
	@Test(priority = 0)
	public void TestWithoutCredentials() throws Throwable
	{
		PageFactory.initElements(driver, Login_Page_Objects.class);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Login Authentication Validation : TestWithoutCredentials");
		logger.info("Launching the Application");
		logger.info("Checking Login without any Credentials");
				
		extenttestCase.log(Status.INFO, "Verifying Login Authentication Without any Credentials");
		Login_Page_Objects.UserId.sendKeys(getExcelData("Login", 4, 0));
		Thread.sleep(2000);
		Login_Page_Objects.Password.sendKeys(getExcelData("Login", 4, 1));
		Thread.sleep(2000); 
		Login_Page_Objects.SignIn.click();
		Thread.sleep(5000);
		CommonFunctions.captureScreen("LoginPage - WithoutCredentials.png");
		String LoginWarn = Login_Page_Objects.LoginWarn.getText();
		String UserIdRqd=Login_Page_Objects.UserIdRqd.getText();
		String PasswordRqd=Login_Page_Objects.PasswordRqd.getText();
		
		if((UserIdRqd.contentEquals("User Id is required")|| PasswordRqd.contentEquals("Please enter password")) && LoginWarn.contentEquals("Invalid User Id or password"))
		{
			extenttestCase.log(Status.PASS, "Login validation done without Credentials");
		}		
		else
		{
			extenttestCase.log(Status.INFO, "Login validation Failed without Credentials");
		}
	}

	@Test(priority = 1)
	public void ValidUserandInvalidPassword() throws Throwable
	{		
		extenttestCase.log(Status.INFO, "Verifying Login Authentication with Valid User Id and Invalid Password");
		Login_Page_Objects.UserId.sendKeys(getExcelData("Login", 9, 0));
		Thread.sleep(2000);
		Login_Page_Objects.Password.sendKeys(getExcelData("Login", 9, 1));
		Thread.sleep(2000); 
		Login_Page_Objects.SignIn.click();
		CommonFunctions.captureScreen("LoginPage - Valid User and Invalid Pass.png");
		String LoginWarn = Login_Page_Objects.LoginWarn.getText();
		
		if(LoginWarn.contentEquals("Invalid User Id or password"))
		{
			extenttestCase.log(Status.PASS, "Login validation done with Invalid User Id and Password");
		}		
		else
		{
			extenttestCase.log(Status.INFO, "Login validation Failed with Invalid User Id and Password");
		}
	}

	@Test(priority = 2)
	public void InvalidUserIdandPassword() throws Throwable
	{
		extenttestCase.log(Status.INFO, "Verifying Login Authentication with Invalid User Id and Password");
		
		//System.out.println("Start From Here");
		Login_Page_Objects.UserId.clear();
		Thread.sleep(2000);
		Login_Page_Objects.UserId.sendKeys(getExcelData("Login", 8, 0));
		Thread.sleep(2000);
		Login_Page_Objects.Password.clear();
		Thread.sleep(2000);		
		Login_Page_Objects.Password.sendKeys(getExcelData("Login", 8, 1));
		Thread.sleep(2000);		
		Login_Page_Objects.SignIn.click();
		Thread.sleep(2000);
		CommonFunctions.captureScreen("Login Validation - Invalid credentials.png");
		String LoginWarn = Login_Page_Objects.LoginWarn.getText();
		
		if(LoginWarn.contentEquals("Invalid User Id or password"))
		{
			extenttestCase.log(Status.PASS, "Login validation done with Invalid User Id and Password");
		}		
		else
		{
			extenttestCase.log(Status.INFO, "Login validation Failed with Invalid User Id and Password");
		}		
	}	
	
	@Test(priority = 3)
	public void ValidUserIdandPassword() throws Throwable
	{
		/*Admin Team*/
		extenttestCase.log(Status.INFO, "Verifying Admin Login Authentication with Valid User Id and Password");
		
		AdminLogin();
		
		if (Login_Page_Objects.WelcomeMsg.getText().toString().contains("Welcome"))
		{
			extenttestCase.log(Status.PASS, "Admin Login validation done with Valid User Id and Password");
			CommonFunctions.captureScreen("AdminUserLogin - Dashboard.png");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Admin Login validation not successfull");
			CommonFunctions.captureScreen("AdminUserLogin - Fail.png");
		}
		Logout.Signout();
		Thread.sleep(5000);
		
		/*Planning Team*/
		extenttestCase.log(Status.INFO, "Verifying Planning Login Authentication with Valid User Id and Password");
			
		PlanningLogin();
		
		if (Login_Page_Objects.WelcomeMsg.getText().toString().contains("Welcome Vaurn"))
		{
			extenttestCase.log(Status.PASS, "Planning Login validation done with Valid User Id and Password");
			CommonFunctions.captureScreen("PlanningUserLogin - Dashboard.png");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Planning Login validation not successfull");
			CommonFunctions.captureScreen("PlanningUserLogin - Fail.png");
		}
		Logout.Signout();
		Thread.sleep(5000);
		/*Allotment Team*/
		extenttestCase.log(Status.INFO, "Verifying Allotment Login Authentication with Valid User Id and Password");
		
		Login_Page_Objects.UserId.clear();
		Thread.sleep(2000);
		
		Login_Page_Objects.UserId.sendKeys(getExcelData("Login", 3, 0));
		Thread.sleep(2000);
		
		Login_Page_Objects.Password.clear();
		Thread.sleep(2000);
		
		Login_Page_Objects.Password.sendKeys(getExcelData("Login", 3, 1));
		Thread.sleep(2000);
		
		Login_Page_Objects.SignIn.click();
		Thread.sleep(3000);
		
		if (Login_Page_Objects.WelcomeMsg.getText().toString().contains("Welcome Allotment Team"))
		{
			extenttestCase.log(Status.PASS, "Allotment Login validation done with Valid User Id and Password");
			CommonFunctions.captureScreen("AllotmentUserLogin - Dashboard.png");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Allotment Login validation not successfull");
			CommonFunctions.captureScreen("AllotmentUserLogin - Fail.png");
		}
		Logout.Signout();
	}	
	
	public static void AdminLogin() throws Throwable
	{
		PageFactory.initElements(driver, Login_Page_Objects.class);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	Login_Page_Objects.UserId.clear();
	Thread.sleep(2000);
	
	Login_Page_Objects.UserId.sendKeys(getExcelData("Login", 1, 0));
	Thread.sleep(2000);
	
	Login_Page_Objects.Password.clear();
	Thread.sleep(2000);
	
	Login_Page_Objects.Password.sendKeys(getExcelData("Login", 1, 1));
	Thread.sleep(2000);
	
	Login_Page_Objects.SignIn.click();
	Thread.sleep(3000);
	}
	
	public static void PlanningLogin() throws Throwable
	{
	
	Login_Page_Objects.UserId.clear();
	Thread.sleep(2000);
	
	Login_Page_Objects.UserId.sendKeys(getExcelData("Login", 2, 0));
	Thread.sleep(2000);
	
	Login_Page_Objects.Password.clear();
	Thread.sleep(2000);
	
	Login_Page_Objects.Password.sendKeys(getExcelData("Login", 2, 1));
	Thread.sleep(2000);
	
	Login_Page_Objects.SignIn.click();
	Thread.sleep(3000);
	}
}
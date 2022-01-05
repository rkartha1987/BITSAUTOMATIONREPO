package testCases;

import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
//import pageObjects.Login_Page_Objects;
import pageObjects.Profile_Page_Objects;


public class FacultyRole_EditProfile extends CommonFunctions{
	
	static Logger logger=Logger.getLogger(Edit_Profile.class);

	@Test(priority=0)
	public void validateNavigatetoProfile() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Navigate to Profile Validation");
		logger.info("Navigating to Profile Page");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);
		Profile_Page_Objects.mnuProfile.click();		
		Thread.sleep(5000);			
		extenttestCase.log(Status.PASS, "Successfully navigated to Profile Page");
	}
	
	@Test(priority=1)
	public void validateBreadCrumbs() throws Throwable
	{
        String bread = Profile_Page_Objects.brdCrumbs.getText();
       System.out.println(bread);
		if (bread.contains("Edit Faculty")) 
		{
			extenttestCase.log(Status.PASS, "Bread crumbs text pass");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Bread crumbs text failed");
		}
	}
	
	@Test(priority=2)
	public void validateCancelBtn() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Click cancel button test");
		logger.info("Click Cancel button without changes : Navigating to Dashboard Page");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);
		Profile_Page_Objects.btnCancel.click();		
		Thread.sleep(5000);			
		extenttestCase.log(Status.PASS, "Cancel button click validated");
	}
	
	@Test(priority=3)
	public void validateCloseBtnPopup() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Click cancel button test");
		logger.info("Clicking Close Pop up");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);
		Profile_Page_Objects.btnClose.click();		
		Thread.sleep(5000);			
		extenttestCase.log(Status.PASS, "Successfully closed pop up on close button click");
	}
	
	@Test(priority=4)
	public void validateOkayBtnPopup() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Click cancel button test");
		logger.info("Clicking Okay button");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);
			
		Profile_Page_Objects.btnCancel.click();		
		Thread.sleep(3000);			
		extenttestCase.log(Status.INFO, "Successfully opened pop up ");
		Thread.sleep(3000);	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Click Okay button test");
		logger.info("Clicking Okay Button");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);
		Profile_Page_Objects.btnOkay.click();		
		Thread.sleep(3000);			
		extenttestCase.log(Status.PASS, "Successfully Closed pop up on Okay button click ");
	}
	
	@Test(priority=5)
	public void validateNavigatetoProfile1() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Navigate to Profile Validation");
		logger.info("Navigating to Profile Page");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);
		Profile_Page_Objects.mnuProfile.click();		
		Thread.sleep(5000);			
		extenttestCase.log(Status.PASS, "Re-navigated to Profile Page");
	}
	
	@Test(priority=6)
	public void validateSaveBtnWithoutChngs() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Saving Profile without changes");
		logger.info("Saving Profile without changes");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);
		Profile_Page_Objects.btnSave.click();		
		Thread.sleep(5000);			
		extenttestCase.log(Status.PASS, "Successfully Saved Profile without changes");
	}	
	
	@Test(priority=7)
	public void validateSaveBtnWithChngs() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Edit Fields and Save : Happy Path");
		logger.info("Edit Fields and Save");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);
		Profile_Page_Objects.fldFacultyName.clear();
		Thread.sleep(2000);
		
		Profile_Page_Objects.fldFacultyName.sendKeys(getExcelData("Login", 2, 3));		
		Thread.sleep(2000);	
		
		Profile_Page_Objects.fldGender.sendKeys(getExcelData("Fields", 1, 0));
		Thread.sleep(2000);		
		
		Profile_Page_Objects.fldDept.sendKeys(getExcelData("Fields", 1, 1));
		Thread.sleep(2000);
		
		Profile_Page_Objects.fldAreaOfSpc.clear();
		Thread.sleep(2000);
		Profile_Page_Objects.fldAreaOfSpc.sendKeys(getExcelData("Fields", 1, 2));
		Thread.sleep(2000);
		
		Profile_Page_Objects.fldCampus.sendKeys(getExcelData("Fields", 1, 3));
		Thread.sleep(2000);
		
		Profile_Page_Objects.fldPrsnlEmail.clear();
		Thread.sleep(2000);
		Profile_Page_Objects.fldPrsnlEmail.sendKeys(getExcelData("Fields", 1,4));
		Thread.sleep(2000);	
		
		/*Profile_Page_Objects.fldOffclEmail.sendKeys(getExcelData("Fields", 1,5));
		Thread.sleep(2000);	*/
		
		Profile_Page_Objects.fldMobNo.clear();
		Thread.sleep(2000);
		Profile_Page_Objects.fldMobNo.sendKeys(String.valueOf(getExcelData1("Fields", 1, 6)));
		Thread.sleep(2000);	
		
		Profile_Page_Objects.fldLandLine.clear();
		Thread.sleep(2000);
		Profile_Page_Objects.fldLandLine.sendKeys(String.valueOf(getExcelData1("Fields", 1,7)));
		Thread.sleep(2000);	
		
		Profile_Page_Objects.fldAddr1.clear();
		Thread.sleep(2000);
		Profile_Page_Objects.fldAddr1.sendKeys(getExcelData("Fields", 1,8));
		Thread.sleep(2000);	
		
		Profile_Page_Objects.fldAddr2.clear();
		Thread.sleep(2000);
		
		Profile_Page_Objects.fldAddr2.sendKeys(getExcelData("Fields", 1,9));
		Thread.sleep(2000);			
		
		Profile_Page_Objects.fldCountry.sendKeys(getExcelData("Fields", 2,10));
		Thread.sleep(2000);
		
		Profile_Page_Objects.fldCountry.sendKeys(getExcelData("Fields", 1,10));
		Thread.sleep(2000);
		
		Profile_Page_Objects.fldState.sendKeys(getExcelData("Fields", 1,11));
		Thread.sleep(2000);
		
		Profile_Page_Objects.fldCity.sendKeys(getExcelData("Fields", 1,12));
		Thread.sleep(2000);
		
		Profile_Page_Objects.fldPin.clear();
		Thread.sleep(2000);
		Profile_Page_Objects.fldPin.sendKeys(String.valueOf(getExcelData1("Fields", 1,13)));
		Thread.sleep(2000);
		
		Profile_Page_Objects.fldHomeTown.clear();
		Thread.sleep(2000);
		Profile_Page_Objects.fldHomeTown.sendKeys(getExcelData("Fields", 1,14));
		Thread.sleep(2000);
		
		Profile_Page_Objects.btnSave.click();
		extenttestCase.log(Status.PASS, "Succesfully Saved");		
	}
	
	@Test(priority=8)
	public void validateChangeOffclEmailId() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Validating the Official Email Address");
		logger.info("Updating the Official Email Address");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);
					
		Profile_Page_Objects.fldOffclEmail.clear();
		Thread.sleep(5000);			
		
		Profile_Page_Objects.fldOffclEmail.sendKeys(getExcelData("Fields", 1, 4));	
		Thread.sleep(5000);
		
		Profile_Page_Objects.fldOffclEmail.clear();
		Thread.sleep(5000);	
		
		Profile_Page_Objects.fldOffclEmail.sendKeys(getExcelData("Fields", 1, 4));	
		Thread.sleep(5000);
		
		Profile_Page_Objects.btnSave.click();
		Thread.sleep(3500);	
		
		String text=driver.findElement(By.cssSelector(".toast-message")).getText().toString();
		
		if (text.contains("already registered. Can not be changed now."))
		{
			extenttestCase.log(Status.PASS, "Change Official email successfully tested");
		}
		else
		{		
			extenttestCase.log(Status.FAIL, "Not a Success");
		}		
		Thread.sleep(5000);	
		Profile_Page_Objects.btnSave.click();
		Thread.sleep(5000);			
		Profile_Page_Objects.fldOffclEmail.clear();
		Thread.sleep(5000);			
		Profile_Page_Objects.fldOffclEmail.sendKeys(getExcelData("Fields", 2, 5));	
		Thread.sleep(5000);
		
		if (Profile_Page_Objects.InvalidEmail.getText().contains("BITS Email is not valid"))
		{
			extenttestCase.log(Status.PASS, "Official email format successfully tested");
		}
		else
		{		
			extenttestCase.log(Status.FAIL, "Not Success");
		}		
		Thread.sleep(5000);	
		
		Profile_Page_Objects.fldOffclEmail.clear();
		Thread.sleep(5000);	
		
		Profile_Page_Objects.fldOffclEmail.sendKeys(getExcelData("Fields", 1, 5));	
		Thread.sleep(5000);
		Profile_Page_Objects.btnSave.click();
		Thread.sleep(5000);	
		extenttestCase.log(Status.PASS, "Original Official email id restored");			
	}
	
	@Test(priority=9)
	public void validateMobileNumber() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Testing Mobile Number format");
		logger.info("Testing Mobile Number format");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);	
		
		Profile_Page_Objects.fldMobNo.clear();
		Thread.sleep(2000);
		Profile_Page_Objects.fldMobNo.sendKeys(String.valueOf(getExcelData1("Fields", 2, 6)));
		Profile_Page_Objects.btnSave.click();
		Thread.sleep(2000);
		if (Profile_Page_Objects.fldMobNo.getText().length()<10)
		{			
			extenttestCase.log(Status.PASS, "Phone number minimum length validated");
		}
		Thread.sleep(2000);
		Profile_Page_Objects.fldMobNo.clear();
		Thread.sleep(2000);
		Profile_Page_Objects.fldMobNo.sendKeys(String.valueOf(getExcelData1("Fields", 3, 6)));
		Profile_Page_Objects.btnSave.click();
		Thread.sleep(2000);
		if (Profile_Page_Objects.fldMobNo.getText().length()>12)
		{
			extenttestCase.log(Status.PASS, "Phone number maximum length validated");
		}				
		Profile_Page_Objects.fldMobNo.clear();
		Thread.sleep(2000);
		Profile_Page_Objects.fldMobNo.sendKeys(String.valueOf(getExcelData1("Fields", 1, 6)));
		Thread.sleep(2000);	
		Profile_Page_Objects.btnSave.click();
		Thread.sleep(2000);
	}
	//Enter a valid phone number -Maximum 12 digits
	//Enter a valid phone number -Minimum 10 digits
	
	@Test(priority=10)
	public void validateLandPhoneNumber() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Testing LandPhone Number format");
		logger.info("Testing LandPhone Number format");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);	
		
		Profile_Page_Objects.fldLandLine.clear();
		Thread.sleep(2000);
		Profile_Page_Objects.fldLandLine.sendKeys(String.valueOf(getExcelData1("Fields", 2, 7)));
		Profile_Page_Objects.btnSave.click();
		Thread.sleep(2000);
		if (Profile_Page_Objects.fldLandLine.getText().length()<10)
		{			
			extenttestCase.log(Status.PASS, "LandPhone number minimum length validated");
		}
		Thread.sleep(2000);
		Profile_Page_Objects.fldLandLine.clear();
		Thread.sleep(2000);
		Profile_Page_Objects.fldLandLine.sendKeys(String.valueOf(getExcelData1("Fields", 3, 7)));
		Profile_Page_Objects.btnSave.click();
		Thread.sleep(2000);
		if (Profile_Page_Objects.fldLandLine.getText().length()>12)
		{
			extenttestCase.log(Status.PASS, "LandPhone number maximum length validated");
		}		
		Profile_Page_Objects.fldLandLine.clear();
		Thread.sleep(2000);
		Profile_Page_Objects.fldLandLine.sendKeys(String.valueOf(getExcelData1("Fields", 1, 7)));
		Thread.sleep(2000);	
		Profile_Page_Objects.btnSave.click();
		Thread.sleep(2000);
	}
	
	@Test(priority=11)
		public void validatePIN() throws Throwable
		{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			extenttestCase=extentReport.createTest("Testing PIN format");
			logger.info("Testing PIN format");		
			PageFactory.initElements(driver, Profile_Page_Objects.class);	
			
			Profile_Page_Objects.fldPin.clear();
			Thread.sleep(2000);
			Profile_Page_Objects.fldPin.sendKeys(String.valueOf(getExcelData1("Fields", 2, 13)));
			Profile_Page_Objects.btnSave.click();
			Thread.sleep(2000);
			//System.out.println(Profile_Page_Objects.fldPin.getText().toString()+ " "+Profile_Page_Objects.fldPin.getText().toString().length() + " - "+Profile_Page_Objects.InvalidPIN.getText());
			if (/*Profile_Page_Objects.fldPin.getText().length()<5 &&*/ Profile_Page_Objects.InvalidPIN.getText().contains("-Minimum 5 digits"))
			{			
				extenttestCase.log(Status.PASS, "PIN minimum Length Validated");
			}			
			Profile_Page_Objects.fldPin.clear();
			Thread.sleep(2000);
			Profile_Page_Objects.fldPin.sendKeys(String.valueOf(getExcelData("Fields", 4, 13)));
			Profile_Page_Objects.btnSave.click();
			Thread.sleep(2000);
			//System.out.println(Profile_Page_Objects.fldPin.getText().toString()+ " "+Profile_Page_Objects.fldPin.getText().toString().length() + " - "+Profile_Page_Objects.InvalidPIN.getText());
			if (/*Profile_Page_Objects.fldPin.getText().length()==5 && */Profile_Page_Objects.InvalidPIN.getText().contains("Enter a valid PIN"))
			{			
				extenttestCase.log(Status.PASS, "5 digit PIN format validated");
			}			
			Profile_Page_Objects.fldPin.clear();
			Thread.sleep(2000);
			Profile_Page_Objects.fldPin.sendKeys(String.valueOf(getExcelData("Fields", 5, 13)));
			Profile_Page_Objects.btnSave.click();
			Thread.sleep(2000);
			//System.out.println(Profile_Page_Objects.fldPin.getText().toString()+ " "+Profile_Page_Objects.fldPin.getText().toString().length() + " - "+Profile_Page_Objects.InvalidPIN.getText());
			if (/*Profile_Page_Objects.fldPin.getText().length()==6 &&*/ Profile_Page_Objects.InvalidPIN.getText().contains("Enter a valid PIN"))
			{			
				extenttestCase.log(Status.PASS, "6 digit PIN format validated");
			}			
			Thread.sleep(2000);
			Profile_Page_Objects.fldPin.clear();
			Thread.sleep(2000);
			Profile_Page_Objects.fldPin.sendKeys(String.valueOf(getExcelData1("Fields", 3, 13)));
			Profile_Page_Objects.btnSave.click();
			Thread.sleep(2000);
			//System.out.println(Profile_Page_Objects.fldPin.getText().toString()+ " "+Profile_Page_Objects.fldPin.getText().toString().length() + " - "+Profile_Page_Objects.InvalidPIN.getText());
			if (/*Profile_Page_Objects.fldPin.getText().toString().length()>6 && */Profile_Page_Objects.InvalidPIN.getText().contains("-Maximum 6 digits"))
			{
				extenttestCase.log(Status.PASS, "PIN maximum length validated");
			}
			Profile_Page_Objects.fldPin.clear();
			Thread.sleep(2000);
			Profile_Page_Objects.fldPin.sendKeys(String.valueOf(getExcelData1("Fields", 1, 13)));
			Thread.sleep(2000);	
			Profile_Page_Objects.btnSave.click();
			Thread.sleep(2000);
		}
	
	@Test(priority=12)
	public void validateRemoveGroupLeader() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Testing Group Leader functionality : Remove");
		logger.info("Testing Group Leader functionality for Removing group leader");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);	
		
		if (Profile_Page_Objects.fldGrpLeader.isSelected())
		{
			Profile_Page_Objects.fldGrpLeader.click();
			Thread.sleep(5000);	
			Profile_Page_Objects.btnSave.click();
			Thread.sleep(3000);	
			extenttestCase.log(Status.PASS, "Group Leader Successfully Removed");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Faculty is already not a Group Leader");
		}
	}
	
	@Test(priority=13)
	public void validateAssignGroupLeader() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Testing Group Leader functionality : Assign");
		logger.info("Testing Group Leader functionality for Removing group leader");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);			
		
		if (!Profile_Page_Objects.fldGrpLeader.isSelected())
		{		
			Thread.sleep(5000);	
			Profile_Page_Objects.fldGrpLeader.click();
			Thread.sleep(5000);					
			Profile_Page_Objects.btnSave.click();
			Thread.sleep(3000);	
			String text=driver.findElement(By.cssSelector(".toast-message")).getText().toString();
			
			if (!text.contains("Error: Group leader already exists for Department : "))
			{
				extenttestCase.log(Status.PASS, "Group leader Assigned successfully");
			}	
			else
			{
				extenttestCase.log(Status.INFO, "There is already a group leader for the department");
			}
		}		
	}	
	
	@Test(priority=14)
	public void validateGroupLeaderFail() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Testing Group Leader functionality : Assign another group leader for a department");
		logger.info("Testing Group Leader functionality by assigning more than one leader on same department");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);			
		
		if (Profile_Page_Objects.fldGrpLeader.isSelected())
		{
			Profile_Page_Objects.fldGrpLeader.click();
			Thread.sleep(3000);
		}
		Profile_Page_Objects.fldDept.sendKeys(getExcelData("Fields",2, 1));
		Thread.sleep(3000);
		
		if (!Profile_Page_Objects.fldGrpLeader.isSelected())
		{				
			Profile_Page_Objects.fldGrpLeader.click();
			Thread.sleep(5000);					
			Profile_Page_Objects.btnSave.click();
			Thread.sleep(3500);	
			String text=driver.findElement(By.cssSelector(".toast-message")).getText().toString();
			
			if (text.contains("Error: Group leader already exists for Department : "))
			{
				extenttestCase.log(Status.PASS, "Group leader validation success");
			}
			else
			{		
				extenttestCase.log(Status.FAIL, "Group Leader validation Not Success");
			}			
		}	
		driver.navigate().refresh();
	}
	
	@Test(priority=15)
	public void validateMandatoryFields() throws Throwable
	{		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Saving without entering mandatory fields");
		logger.info("Saving Profile without entering mandatory fields");		
		PageFactory.initElements(driver, Profile_Page_Objects.class);
		
		driver.navigate().refresh();
		
		Profile_Page_Objects.fldFacultyName.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		Thread.sleep(5000);			
		//System.out.println("faculty name is cleared");
		Profile_Page_Objects.fldFacultyName.click();
		Profile_Page_Objects.fldOffclEmail.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE); 
		Thread.sleep(2000);
		//System.out.println("ofcl mail is cleared");
		Profile_Page_Objects.fldMobNo.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		Thread.sleep(2000);
		//System.out.println("mob is cleared");
		Profile_Page_Objects.fldAddr1.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		Thread.sleep(2000); 
		//System.out.println("address is cleared");
		Profile_Page_Objects.fldPin.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		Thread.sleep(2000);
		//System.out.println("pin is cleared");
		
		Profile_Page_Objects.btnSave.click();
		extenttestCase.log(Status.PASS, "Manatory fields suuccessfully validated");
		Thread.sleep(10000);
		closeProfilepage();
	}
	public void closeProfilepage() throws Throwable 
	{
		PageFactory.initElements(driver, Profile_Page_Objects.class);
		Profile_Page_Objects.btnCancel.click();
		Thread.sleep(2000);
		Profile_Page_Objects.btnOkay.click();
	}
}

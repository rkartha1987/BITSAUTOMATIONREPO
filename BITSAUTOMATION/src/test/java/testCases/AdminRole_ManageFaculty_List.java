package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
//import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;

//import pageObjects.Login_Page_Objects;
import pageObjects.ManageFaculty_List_Page_Objects;

public class AdminRole_ManageFaculty_List extends CommonFunctions{

	static Logger logger = Logger.getLogger(AdminRole_ManageFaculty_List.class);

	@Test(priority = 0)
	public void ManageFacultyMenu() throws InterruptedException, IOException, Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Manage Faculty List Page");
		PageFactory.initElements(driver, ManageFaculty_List_Page_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Manage Faculty List");
		ManageFaculty_List_Page_Objects.MFMenu.click();
		Thread.sleep(2000);		
		captureScreen("Admin Login-ManageFaculty.png");		
	}

	@Test(priority = 1)
	public void Verifysort() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Sorting Functionality in Manage Faculty List");

		ManageFaculty_List_Page_Objects.SortPSRN.click();
		Thread.sleep(1000);
		ManageFaculty_List_Page_Objects.SortFName.click();
		Thread.sleep(1000);
		ManageFaculty_List_Page_Objects.SortDpt.click();
		Thread.sleep(1000);
		ManageFaculty_List_Page_Objects.SortCampus.click();
		Thread.sleep(1000);
		ManageFaculty_List_Page_Objects.SortAreaSpclzn.click();
		Thread.sleep(1000);
		ManageFaculty_List_Page_Objects.SortStatus.click();
		Thread.sleep(1000);

	}

	@Test(priority = 2)
	public void VerifyInvalidSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Invalid Search in Manage Faculty List");

		ManageFaculty_List_Page_Objects.SearchField.sendKeys(getExcelData("MFacultyList", 1, 1));
		Thread.sleep(2000);

		String ListWarn =  ManageFaculty_List_Page_Objects.ListWarn.getText();
		//System.out.println("Invalid Search Term : " + ListWarn);
		Thread.sleep(2000);

		if(ListWarn.contains("Record(s) not found"))
		{
			extenttestCase.log(Status.PASS, "Invalid Search Validation Done Successfully");
			captureScreen("Admin Login-Invalid Faculty Search.png");	
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Invalid Search Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	@Test(priority = 3)
	public void VerifyValidSearchFaculty() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Faculty Name Search in Manage Faculty List");
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 1, 0));
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 2, 0));
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchField.sendKeys(getExcelData("MFacultyList", 2, 1));
		Thread.sleep(2000);

		String FacultyResult = ManageFaculty_List_Page_Objects.FacultyResult.getText();
		//System.out.println("The selected Faculty : " + FacultyResult);
		Thread.sleep(2000);
		if(FacultyResult.contentEquals(getExcelData("MFacultyList", 2, 1)))
		{
			extenttestCase.log(Status.PASS, "Faculty Name Search Validation Done Successfully");
			captureScreen("Admin Login-Valid Faculty Search.png");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Faculty Name Search Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	@Test(priority = 4)
	public void VerifyDepartment() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Department Search in Manage Faculty List");
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 1, 0));
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 3, 0));
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchField.sendKeys(getExcelData("MFacultyList", 3, 1));
		Thread.sleep(2000);

		String DepartmentResult = ManageFaculty_List_Page_Objects.DepartmentResult.getText();
		//System.out.println(DepartmentResult);
		Thread.sleep(2000);
		if(DepartmentResult.contentEquals(getExcelData("MFacultyList", 3, 1)))
		{
			extenttestCase.log(Status.PASS, "Department Search Validation Done Successfully");
			captureScreen("Admin Login-Department Search.png");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Department Search Validation Failed");
		}

		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	@Test(priority = 5)
	public void VerifyCampus() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Campus Search in Manage Faculty List");
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 1, 0));
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 4, 0));
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchField.sendKeys(getExcelData("MFacultyList", 4, 1));
		Thread.sleep(2000);

		String CampusResult = ManageFaculty_List_Page_Objects.CampusResult.getText();
		//System.out.println(CampusResult);
		Thread.sleep(2000);
		if(CampusResult.contentEquals(getExcelData("MFacultyList", 4, 1)))
		{
			extenttestCase.log(Status.PASS, "Campus Search Validation Done Successfully");
			captureScreen("Admin Login-Campus Search.png");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Campus Search Validation Failed");
		}

		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 1, 0));
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void UploadValidation() throws InterruptedException,Throwable
	{
		extenttestCase.log(Status.INFO,"Upload Faculty Validation");
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.UploadClick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.CancelUpload.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.UploadClick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.UploadFile.click();
		Thread.sleep(2000);

		String UploadWarn = ManageFaculty_List_Page_Objects.UploadWarn.getText();
		//System.out.println(UploadWarn);
		Thread.sleep(2000);
		if(UploadWarn.contains("Please select excel file"))
		{
			extenttestCase.log(Status.PASS, "Upload File Validation Done Successfully");
			captureScreen("Admin Login-UploadFileValidation.png");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Upload File Validation Failed");
		}		
	}

	@Test(priority = 7)
	public void UploadValidFaculty() throws InterruptedException, AWTException,Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Valid Faculty Upload");

		Actions act = new Actions(driver);
		act.moveToElement(ManageFaculty_List_Page_Objects.ChooseFile).click().perform();
		Thread.sleep(5000);

		String file = properties.getProperty("FacultyUploadFile");
		StringSelection selection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		ManageFaculty_List_Page_Objects.UploadFile.click();
		Thread.sleep(5000);
		captureScreen("Admin Login-UploadFile.png");
		ManageFaculty_List_Page_Objects.Refresh.click();
		Thread.sleep(5000);

		ManageFaculty_List_Page_Objects.Refresh.click();
		Thread.sleep(5000);

		ManageFaculty_List_Page_Objects.Refresh.click();
		Thread.sleep(5000);

		ManageFaculty_List_Page_Objects.Refresh.click();
		Thread.sleep(5000);

		ManageFaculty_List_Page_Objects.CancelUpload.click(); 
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);		
	}

	//@Test(priority = 8)
	public void CheckExpandList() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Expand and Collapse List");

		ManageFaculty_List_Page_Objects.ShowMore.click();
		Thread.sleep(2000);
		ManageFaculty_List_Page_Objects.ShowLess.click();
		Thread.sleep(2000);
		ManageFaculty_List_Page_Objects.ShowMore.click();
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void VerifyUploadedRecord() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Uploaded Faculty in List Grid");

		ManageFaculty_List_Page_Objects.SearchField.sendKeys(getExcelData("MFacultyList", 8, 1));
		Thread.sleep(2000);


		String FacultyResult = ManageFaculty_List_Page_Objects.FacultyResult.getText();
		//System.out.println(FacultyResult);
		Thread.sleep(2000);
		if(FacultyResult.contentEquals(getExcelData("MFacultyList", 8, 1)))
		{
			extenttestCase.log(Status.PASS, "Faculty Uploaded Successfully");
			captureScreen("Admin Login-Faculty Uploaded Successfully.png");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Faculty Upload Failed");
		}

	}

	@Test(priority = 10)
	public void ClickInactive() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Inactive Record");


		ManageFaculty_List_Page_Objects.MFMenu.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 1, 0));
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 2, 0));
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchField.sendKeys(getExcelData("MFacultyList", 2, 1));
		Thread.sleep(3000);

		ManageFaculty_List_Page_Objects.Checkbox.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.ActionClick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.Inactiveclick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.ClosePopup.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.ActionClick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.Inactiveclick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.OkPopup.click();
		Thread.sleep(2000);
		captureScreen("Admin Login-Faculty Made Inactive.png");

	}

	@Test(priority = 11)
	public void VerifyInactive() throws Throwable
	{

		ManageFaculty_List_Page_Objects.SearchField.clear();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchField.sendKeys(getExcelData("MFacultyList", 2, 1));
		Thread.sleep(2000);

		String StatusLabel = ManageFaculty_List_Page_Objects.StatusLabel.getText();
		//System.out.println(StatusLabel);
		Thread.sleep(2000);
		if(StatusLabel.contentEquals("InActive"))
		{
			extenttestCase.log(Status.PASS, "Faculty Inactivated Successfully");
			captureScreen("Admin Login-Faculty Inactive Verified.png");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Faculty Inactivation Failed");
		}
	}

	@Test(priority = 12)
	public void ClickActive() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Active Record");

		ManageFaculty_List_Page_Objects.SearchField.clear();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchField.sendKeys(getExcelData("MFacultyList", 2, 1));
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.Checkbox.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.ActionClick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.Activeclick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.ClosePopup.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.ActionClick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.Activeclick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.OkPopup.click();
		Thread.sleep(2000);
		captureScreen("Admin Login-Faculty Made Active.png");

	}

	@Test(priority = 13)
	public void VerifyActive() throws Throwable
	{

		ManageFaculty_List_Page_Objects.SearchField.clear();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchField.sendKeys(getExcelData("MFacultyList", 2, 1));
		Thread.sleep(2000);

		String StatusLabel = ManageFaculty_List_Page_Objects.StatusLabel.getText();
		//System.out.println(StatusLabel);
		Thread.sleep(2000);
		if(StatusLabel.contentEquals("Active"))
		{
			extenttestCase.log(Status.PASS, "Faculty Activated Successfully");
			captureScreen("Admin Login-Faculty Active verified.png");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Faculty Activation Failed");
		}
	}

	@Test(priority = 14)
	public void ClickDelete () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Delete Record");

		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 1, 0));
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 2, 0));
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchField.sendKeys(getExcelData("MFacultyList", 2, 2));
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.Checkbox.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.ActionClick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.Deleteclick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.ClosePopup.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.ActionClick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.Deleteclick.click();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.OkPopup.click();
		Thread.sleep(2000);

		captureScreen("Admin Login-Faculty Deleted.png");

	}

	@Test(priority = 15)
	public void VerifyDelete() throws Throwable
	{

		ManageFaculty_List_Page_Objects.SearchField.clear();
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.SearchField.sendKeys(getExcelData("MFacultyList", 2, 2));
		Thread.sleep(2000);

		String ListWarn =  ManageFaculty_List_Page_Objects.ListWarn.getText();
		//System.out.println(ListWarn);
		Thread.sleep(2000);

		if(ListWarn.contains("Record(s) not found"))
		{
			extenttestCase.log(Status.PASS, "Faculty Deleted Successfully");
			captureScreen("Admin Login-Faculty Delete verified.png");
		}
		else
		{
			extenttestCase.log(Status.FAIL, "Faculty Deletion Failed");
		}

		ManageFaculty_List_Page_Objects.SearchField.clear();
		Thread.sleep(2000);
	}

	@Test(priority = 16)
	public void VerifyExport() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Export Faculty");

		ManageFaculty_List_Page_Objects.SearchSelect.sendKeys(getExcelData("MFacultyList", 1, 0));
		Thread.sleep(2000);

		ManageFaculty_List_Page_Objects.ExportClick.click();
		Thread.sleep(2000);

		captureScreen("Admin Login-Faculty Exported.png");

		extenttestCase.log(Status.PASS, "Faculty Exported Successfully");
	}
}
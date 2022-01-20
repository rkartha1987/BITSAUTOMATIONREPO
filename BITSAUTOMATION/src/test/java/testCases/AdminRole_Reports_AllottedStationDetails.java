package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.Admin_Report_AllotStaDetails_Object;


public class AdminRole_Reports_AllottedStationDetails extends CommonFunctions
{

	static Logger logger = Logger.getLogger(Admin_Report_AllotStaDetails_Object.class);

	@Test(priority = 1	)
	public void VerifyActiveStation() throws InterruptedException, IOException, Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Login to Instructioncell Role");

		extenttestCase=extentReport.createTest("Verifying Allotted Station Report  Detail Page");
		PageFactory.initElements(driver, Admin_Report_AllotStaDetails_Object  .class);
		Admin_Report_AllotStaDetails_Object .Report.click();
		Thread.sleep(2000);

		PageFactory.initElements(driver, Admin_Report_AllotStaDetails_Object  .class);
		Admin_Report_AllotStaDetails_Object.AllottStationDetails.click();
		extenttestCase.log(Status.INFO,"Open a Report Allotted Station Report Details");
		Thread.sleep(2000);

		captureScreen("AllottedStationDetails.png");

		driver.navigate().refresh();
		Thread.sleep(2000);	
	}

	@Test(priority = 1)
	public void VerifyFilterByValidBatch() throws Throwable
	{

		extenttestCase=extentReport.createTest("Verifying Allotted Station Report By Valid Batch Filter Detail Page");
		Admin_Report_AllotStaDetails_Object .FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickBatch.click();
		Thread.sleep(2000);

		Select Batch=new Select(Admin_Report_AllotStaDetails_Object .SelectBatch);
		Batch.selectByVisibleText("2021-22");
		Thread.sleep(2000);

		//Admin_Report_AllotStaDetails_Page_Object .SelectBatch.sendKeys(getExcelData("PlanningReport", 2, 1));
		//Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickFilter.click();
		Thread.sleep(2000);

		String BatchFilter=Admin_Report_AllotStaDetails_Object .TableResult.getText();
		//System.out.println(BatchFilter);
		Thread.sleep(2000);

		if(BatchFilter.contentEquals(getExcelData("PlanningReport", 2, 1)))
		{
			extenttestCase.log(Status.PASS, "Valid Batch Filter Validation Done Successfully");

		}

		else
		{
			extenttestCase.log(Status.INFO, "Valid Batch Filter Validation Failed");
		}

		Thread.sleep(2000);
		Admin_Report_AllotStaDetails_Object .SelectBatch.clear();		
	}

	@Test(priority = 2)
	public void VerifyFilterByInValidBatch() throws Throwable
	{

		extenttestCase=extentReport.createTest("Verifying Allotted Station Report By Invalid Batch Filter Detail Page");
		Admin_Report_AllotStaDetails_Object .FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickBatch.click();
		Thread.sleep(2000);

		Select Batch=new Select(Admin_Report_AllotStaDetails_Object.SelectBatch);
		Batch.selectByVisibleText("2020-21");
		Thread.sleep(2000);

		//Admin_Report_AllotStaDetails_Page_Object .SelectBatch.sendKeys(getExcelData("PlanningReport", 2, 2));
		//Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickFilter.click();
		Thread.sleep(2000);

		String BatchFilter=Admin_Report_AllotStaDetails_Object.TableResult.getText();
		//System.out.println(BatchFilter);
		Thread.sleep(2000);

		if(BatchFilter.contentEquals(getExcelData("PlanningReport", 2, 2)))
		{
			extenttestCase.log(Status.PASS, "InValid Batch Filter Validation Done Successfully");				
		}

		else
		{
			extenttestCase.log(Status.INFO, "InValid Batch Filter Validation Failed");
		}		
	}

	@Test(priority = 3)
	public void VerifyFilterByPSTypeI() throws Throwable
	{		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Report By PSTypeI Filter Detail Page");
		Admin_Report_AllotStaDetails_Object .FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickPS.click();
		Thread.sleep(2000);

		Select PS1=new Select(Admin_Report_AllotStaDetails_Object .SelectPS);
		PS1.selectByVisibleText("PS I");
		Thread.sleep(2000);

		//Admin_Report_AllotStaDetails_Page_Object .SelectPS.sendKeys(getExcelData("PlanningReport", 3, 1));
		//Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickFilter.click();
		Thread.sleep(2000);

		String PSFilter=Admin_Report_AllotStaDetails_Object .TableResult.getText();
		//System.out.println(PSFilter);
		Thread.sleep(2000);

		if(PSFilter.contentEquals(getExcelData("PlanningReport", 3, 1)))
		{
			extenttestCase.log(Status.PASS, "PSTypeI Filter Validation Done Successfully");				
		}		
		else
		{
			extenttestCase.log(Status.INFO, " PSTypeI Filter Validation Failed");
		}		
	}	

	@Test(priority = 4)
	public void VerifyFilterByPSTypeII() throws Throwable
	{		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Report By PSTypeI Filter Detail Page");
		Admin_Report_AllotStaDetails_Object .FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickPS.click();
		Thread.sleep(2000);

		Select PS2=new Select(Admin_Report_AllotStaDetails_Object .SelectPS);
		PS2.selectByVisibleText("PS II");
		Thread.sleep(2000);

		//Admin_Report_AllotStaDetails_Page_Object .SelectPS.sendKeys(getExcelData("PlanningReport", 3, 2));
		//Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickSem.click();
		Thread.sleep(2000);

		Select Sem=new Select(Admin_Report_AllotStaDetails_Object .SelectSem);
		Sem.selectByIndex(2);
		Thread.sleep(2000);

		//Admin_Report_AllotStaDetails_Page_Object .SelectSem.sendKeys(getExcelData("PlanningReport",4, 2));
		//Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickFilter.click();
		Thread.sleep(2000);

		String PSFilter=Admin_Report_AllotStaDetails_Object .TableResult.getText();
		//System.out.println(PSFilter);
		Thread.sleep(2000);

		if(PSFilter.contentEquals(getExcelData("PlanningReport", 3, 1)))
		{
			extenttestCase.log(Status.PASS, "PSTypeII Filter Validation Done Successfully");

		}		
		else
		{
			extenttestCase.log(Status.INFO, " PSTypeII Filter Validation Failed");
		}		
	}

	@Test(priority = 5)
	public void VerifyFilterByStationName() throws Throwable
	{		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Report By Station Name Filter Detail Page");
		Admin_Report_AllotStaDetails_Object .FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickSN.click();
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .EnterSN.sendKeys(getExcelData("PlanningReport", 8, 1));
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickFilter.click();
		Thread.sleep(2000);

		String SN1=Admin_Report_AllotStaDetails_Object .TableResult.getText();
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .EnterSN.clear();

		Admin_Report_AllotStaDetails_Object .EnterSN.sendKeys(getExcelData("PlanningReport", 8, 2));
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickFilter.click();
		Thread.sleep(2000);

		String SN2=Admin_Report_AllotStaDetails_Object .TableResult.getText();
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .EnterSN.clear();

		Admin_Report_AllotStaDetails_Object .EnterSN.sendKeys(getExcelData("PlanningReport", 8, 3));
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickFilter.click();
		Thread.sleep(2000);

		String SN3=Admin_Report_AllotStaDetails_Object .TableResult.getText();
		Thread.sleep(2000);

		if(SN1.contentEquals(getExcelData("PlanningReport", 8, 1)) && SN2.contentEquals(getExcelData("PlanningReport", 8, 2)) && SN3.equals("Record(s) not found"))
		{
			extenttestCase.log(Status.PASS, "Station Name Filter Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Station Name Validation Failed");
		}

		Thread.sleep(2000);
		Admin_Report_AllotStaDetails_Object .EnterSN.clear();		
	}

	@Test(priority = 6)
	public void VerifyFilterByParentStation() throws Throwable
	{		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Report By Parent Station Name Filter Detail Page");
		Admin_Report_AllotStaDetails_Object .FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickPC.click();
		Thread.sleep(2000);

		Select ParentCompany1=new Select(Admin_Report_AllotStaDetails_Object .SelectPC);
		ParentCompany1.selectByVisibleText("Yashoda");
		Thread.sleep(2000);

		//Admin_Report_AllotStaDetails_Page_Object .SelectDiscipiline.sendKeys(getExcelData("PlanningReport",9,3));
		//Thread.sleep(2000);


		Admin_Report_AllotStaDetails_Object .ClickFilter.click();
		Thread.sleep(2000);

		String PC1=Admin_Report_AllotStaDetails_Object .TableResult.getText();
		Thread.sleep(2000);

		Select ParentCompany2=new Select(Admin_Report_AllotStaDetails_Object .SelectPC);
		ParentCompany2.selectByVisibleText("Mobius Group");
		Thread.sleep(2000);

		//Admin_Report_AllotStaDetails_Page_Object .SelectPC.sendKeys(getExcelData("PlanningReport",9,4));
		//Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickFilter.click();
		Thread.sleep(2000);

		//String PC2=Admin_Report_AllotStaDetails_Page_Object .TableResult.getText();
		Thread.sleep(2000);

		if(PC1.contentEquals(getExcelData("PlanningReport",9,3)) && PC1.contentEquals(getExcelData("PlanningReport",9,4)))
		{
			extenttestCase.log(Status.PASS, "Parent Station Name Filter Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Parent Station Name Filter Validation Failed");
		}   
	}

	@Test(priority = 7)
	public void VerifyFilterByBusinessDomain() throws Throwable
	{		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Report By Business Domain Filter Detail Page");
		Admin_Report_AllotStaDetails_Object .FilterMenu.click();
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickBD.click();
		Thread.sleep(2000);

		Select BusinessDomain1=new Select(Admin_Report_AllotStaDetails_Object .SelectBD);
		BusinessDomain1.selectByVisibleText("IT");
		Thread.sleep(2000);

		//Admin_Report_AllotStaDetails_Page_Object .SelectBD.sendKeys(getExcelData("PlanningReport",10,1));
		//Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickFilter.click();
		Thread.sleep(2000);

		String BD1=Admin_Report_AllotStaDetails_Object .TableResult.getText();
		Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickBD.click();
		Thread.sleep(2000);

		Select BusinessDomain2=new Select(Admin_Report_AllotStaDetails_Object .SelectBD);
		BusinessDomain2.selectByVisibleText("Insurance");
		Thread.sleep(2000);

		//Admin_Report_AllotStaDetails_Page_Object .SelectBD.sendKeys(getExcelData("PlanningReport",10,3));
		//Thread.sleep(2000);

		Admin_Report_AllotStaDetails_Object .ClickFilter.click();
		Thread.sleep(2000);

		String BD2=Admin_Report_AllotStaDetails_Object .TableResult.getText();
		Thread.sleep(2000);

		if(BD1.contentEquals(getExcelData("PlanningReport",10,1)) && BD2.contentEquals(getExcelData("PlanningReport",10,3)))
		{
			extenttestCase.log(Status.PASS, "Business Domain Filter Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Business Domain Filter Validation Failed");
		}		
	}	
}
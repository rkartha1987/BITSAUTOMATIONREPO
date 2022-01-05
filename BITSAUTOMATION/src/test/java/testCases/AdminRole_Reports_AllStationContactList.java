package testCases;
     
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.Admin_Report_AllStationContactList_Page_Objects;


public class AdminRole_Reports_AllStationContactList extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(Admin_Report_AllStationContactList_Page_Objects  .class);
	
	@Test(priority = 0)
	public void PBReportMenu() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Login to Instruction Cell Role");
		extenttestCase=extentReport.createTest("Verifying All Station Contact List Page");
		
		logger.info("Verifying Report Page");
        PageFactory.initElements(driver, Admin_Report_AllStationContactList_Page_Objects   .class);
		
        Admin_Report_AllStationContactList_Page_Objects.Report.click();
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.AllStaConList.click();
	    Thread.sleep(2000);
	    
	    String str=Admin_Report_AllStationContactList_Page_Objects.AllStaConListResult.getText();
	    System.out.println(str);
	    
		
	    if(str.contains("All Station Contact List Report"))
		{
			extenttestCase.log(Status.PASS, " Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, " Search Validation Failed");
		}
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}	
	
	@Test(priority =1)
	public void FilterByPSType() throws Throwable
	{
	
		extenttestCase=extentReport.createTest("Verifying All Station Contact List By PSType Filter Validation ");
		
		 Admin_Report_AllStationContactList_Page_Objects.Menu.click();
		 Thread.sleep(2000);
		 
		 Admin_Report_AllStationContactList_Page_Objects.ClickPSType.click();
		 Thread.sleep(2000);
		 
		//Select sel=new Select(Admin_Report_AllStationContactList_Page_Objects.SelectPSType);
			//sel.selectByIndex(1);
			
		 Admin_Report_AllStationContactList_Page_Objects.SelectPSType.sendKeys(getExcelData("PBReport", 3, 1));
			Thread.sleep(2000);
			
			String PSResult=Admin_Report_AllStationContactList_Page_Objects.Result.getText();
			System.out.println(PSResult);
			Thread.sleep(2000);
			
			//Select sel=new Select(Admin_Report_AllStationContactList_Page_Objects.SelectPSType);
			//sel.selectByIndex(2);
			
			Admin_Report_AllStationContactList_Page_Objects.SelectPSType.sendKeys(getExcelData("PBReport", 3, 2));
			Thread.sleep(2000);
			
			String PSResult1=Admin_Report_AllStationContactList_Page_Objects.Result.getText();
			System.out.println(PSResult1);
			Thread.sleep(2000);
			
			Admin_Report_AllStationContactList_Page_Objects.Filter.click();
			Thread.sleep(2000);
			
			
			if(PSResult.contentEquals(getExcelData("PBReport", 3, 1)) && PSResult1.contentEquals(getExcelData("PBReport", 3, 2)))
			{
				extenttestCase.log(Status.PASS, " PSPType Filter Validation Done Successfully");
			}
			
			else
			{
				extenttestCase.log(Status.INFO, " PSType Filter  Validation Failed");
			}
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
		
		}
		
		 
	
	@Test(priority = 2)
	public void FilterByStationName() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying All Station Contact List By StationName Filter Validation");
		
		Admin_Report_AllStationContactList_Page_Objects.Menu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.ClickStationName.click();
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.EnterStationName.sendKeys(getExcelData("PBReport", 4, 1));
		Thread.sleep(2000);
		
		String StationNameResult=Admin_Report_AllStationContactList_Page_Objects.Result.getText();
		System.out.println(StationNameResult);
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.EnterStationName.sendKeys(getExcelData("PBReport", 4, 2));
		Thread.sleep(2000);
	
		
		String StationNameResult1=Admin_Report_AllStationContactList_Page_Objects.Result.getText();
		System.out.println(StationNameResult1);
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.Filter.click();
		Thread.sleep(2000);
		
		if(StationNameResult.contentEquals(getExcelData("PBReport", 4, 1)) && StationNameResult1.contentEquals(getExcelData("PBReport", 4, 2)))
		{
			extenttestCase.log(Status.PASS, " StationName Filter Validation Done Successfully");
		}
		
		else
		{
			extenttestCase.log(Status.INFO, " StationName Filter  Validation Failed");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	
	}
	
	

	@Test(priority = 3)
	public void FilterByLocation() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying All Station Contact List By StationName Filter Validation");
		
		Admin_Report_AllStationContactList_Page_Objects.Menu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.ClickLocation.click();
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.EnterLocation.sendKeys(getExcelData("PBReport", 11,2));
		Thread.sleep(2000);
		
		String StationNameResult=Admin_Report_AllStationContactList_Page_Objects.Result.getText();
		System.out.println(StationNameResult);
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.Filter.click();
		Thread.sleep(2000);
		
		if(StationNameResult.contentEquals(getExcelData("PBReport",11,2)))
		{
			extenttestCase.log(Status.PASS, " StationName Filter Validation Done Successfully");
		}
		
		else
		{
			extenttestCase.log(Status.INFO, " StationName Filter  Validation Failed");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	
	}
	
	

	@Test(priority = 4)
	public void FilterByParentCompany() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Parent Company Filter Validation ");
		
		Admin_Report_AllStationContactList_Page_Objects.ClickPCompany.click();
		Thread.sleep(2000);
		
		//Select PS=new Select(driver.findElement(By.xpath("/html/body/app-root/app-layout/app-all-station-contact-list/div/div[2]/div/div/div[2]/div/div[2]/div[5]/div/div/div[2]/select")));
		//PS.selectByVisibleText("Yashoda");
		
		Admin_Report_AllStationContactList_Page_Objects.SelectPCompany.sendKeys(getExcelData("PBReport",12,2));
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.Filter.click();
		Thread.sleep(2000);
		
		String PCompanyResult=Admin_Report_AllStationContactList_Page_Objects.Result.getText();
		System.out.println(PCompanyResult);
		
		if(PCompanyResult.contentEquals(getExcelData("PBReport",12,2)))
		{
			extenttestCase.log(Status.PASS, " Filter By Parent Company Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Parent Company Validation Failed");
	    	}
	}
	
	@Test(priority = 5)
	public void FilterByContactName() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Contact Name Filter Validation ");
		
		Admin_Report_AllStationContactList_Page_Objects.ClickContactName.click();
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.EnterContactName.sendKeys(getExcelData("PBReport",14,1));
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.EnterContactName.sendKeys(getExcelData("PBReport",14,2));
		Thread.sleep(2000);
		
		
		Admin_Report_AllStationContactList_Page_Objects.Filter.click();
		Thread.sleep(2000);
		
		String ContactName=Admin_Report_AllStationContactList_Page_Objects.Result.getText();
		System.out.println(ContactName);
		
		if(ContactName.contentEquals(getExcelData("PBReport", 14, 1)) && ContactName.contentEquals(getExcelData("PBReport",14,2))) 
		{
			extenttestCase.log(Status.PASS, " Filter By Contact Name Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Contact Name Validation Failed");
	    	}
	}
	
	@Test(priority = 6)
	public void FilterByContactType() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Contact Type Filter Validation ");
		
		Admin_Report_AllStationContactList_Page_Objects.ClickContactType.click();
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.EnterContactType.sendKeys(getExcelData("PBReport",15,1));
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.EnterContactType.sendKeys(getExcelData("PBReport",15,2));
		Thread.sleep(2000);
		
		
		Admin_Report_AllStationContactList_Page_Objects.Filter.click();
		Thread.sleep(2000);
		
		String ContactTypeResult=Admin_Report_AllStationContactList_Page_Objects.Result.getText();
		System.out.println(ContactTypeResult);
		
		if(ContactTypeResult.contentEquals(getExcelData("PBReport", 15, 1)) && ContactTypeResult.contentEquals(getExcelData("PBReport",15,2))) 
		{
			extenttestCase.log(Status.PASS, " Filter By Contact Type Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Contact Type Validation Failed");
	    	}
	}
	
	@Test(priority = 7)
	public void FilterByAllottedInCurrentBatch() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Allotted In Current Batch Filter Validation ");
		
		Admin_Report_AllStationContactList_Page_Objects.ClickAllotCurrentBatch.click();
		Thread.sleep(2000);
		
		//Select PS=new Select(driver.findElement(By.xpath("//*[@id="allottedInCurrentBatch"]")));
		//PS.selectByVisibleText("Not Allotted");
		
		Admin_Report_AllStationContactList_Page_Objects.SelectAllotCurrentBatch.sendKeys(getExcelData("PBReport",16,1));
		Thread.sleep(2000);
		
		Admin_Report_AllStationContactList_Page_Objects.Result.click();
		Thread.sleep(2000);
		
		String CurrentBatch=Admin_Report_AllStationContactList_Page_Objects.Result.getText();
		System.out.println(CurrentBatch);
		
		if(CurrentBatch.contentEquals(getExcelData("PBReport", 15, 1)) && CurrentBatch.contentEquals(getExcelData("PBReport",15,2))) 
		{
			extenttestCase.log(Status.PASS, " Filter By Allotted In Current Batch Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Allotted In Current Batch Validation Failed");
	    	}
	}	
		
	@Test(priority =8)
	public void VerifyExport() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Export Validation ");
		
		Admin_Report_AllStationContactList_Page_Objects.Export.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.INFO, " Export Details Done Successfully");
		
	}
	
	
	
		 
	}
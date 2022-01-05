package testCases;

import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import CommonFunctions.CommonFunctions;
import pageObjects.Admin_Report_StationFacility_Object;
//import pageObjects.Admin_Report_StudentCourseList_Objects;

public class AdminRole_Report_StationFacility extends CommonFunctions
{
	
	static Logger logger = Logger.getLogger(Admin_Report_StationFacility_Object.class);
	
	@Test(priority = 0)
	public void VerifyStationFacility() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying StationFacility Detail Page");
		PageFactory.initElements(driver, Admin_Report_StationFacility_Object  .class);
		Admin_Report_StationFacility_Object.Report.click();
		Thread.sleep(2000);
		
		PageFactory.initElements(driver,Admin_Report_StationFacility_Object .class);
		Admin_Report_StationFacility_Object.StationFacility.click();
		extenttestCase.log(Status.INFO,"Open a StationFacility Details");
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("StationFacility.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("StationFacility.png");
		
	}
	

	@Test(priority = 1)
	public void VerifyFilterValidation() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying Filter Validation Page");
		
		 Admin_Report_StationFacility_Object.Menu.click();
		
		extenttestCase.log(Status.INFO,"Open a Filter Validation Page Details");
		Thread.sleep(2000);
		
	}
	
	///////////////////////////////Filter By/////////////////////////////////////////////////////////////////////////

	@Test(priority = 2)
	public void FilterByBatch() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Batch Wise Filter Detail Page");
		
		Admin_Report_StationFacility_Object.ClickBatch.click();
		
		//Select Batch=new Select(driver.findElement(By.xpath("/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/select")));
		//Batch.selectByVisibleText("2021-22");
		
		Admin_Report_StationFacility_Object.SelectBatch.sendKeys(getExcelData("PBReport", 2, 1));
		Thread.sleep(2000);
		
		Admin_Report_StationFacility_Object.ClickFilter.click();
		Thread.sleep(2000);
		
		String BatchResult=Admin_Report_StationFacility_Object.BatchResult.getText();
		System.out.println(BatchResult);
		
		if(BatchResult.contentEquals(getExcelData("PBReport", 2, 1)))
		{
			extenttestCase.log(Status.PASS, " Filter By Batch Wise Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Batch Wise  Validation Failed");
	    	}
		
	}
	
	@Test(priority = 3)
	public void FilterByPSType() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying PSType Wise Filter Detail Page");
		
		Admin_Report_StationFacility_Object.ClickPSType.click();
		
		//Select PSType=new Select(driver.findElement(By.xpath("/html/body/app-root/app-layout/app-station-facilites-list/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div/div/div[2]/select")));
		//PSType.selectByVisibleText("PS1");
		
		Admin_Report_StationFacility_Object.SelectPSType.sendKeys(getExcelData("PBReport",3, 1));
		Thread.sleep(2000);
		
		Admin_Report_StationFacility_Object.ClickFilter.click();
		Thread.sleep(2000);
		
		String PSTypeResult=Admin_Report_StationFacility_Object.PSTypeResult.getText();
		System.out.println(PSTypeResult);
		
		if(PSTypeResult.contentEquals(getExcelData("PBReport", 3, 1)))
		{
			extenttestCase.log(Status.PASS, " Filter By PSType Wise Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By PSType Wise  Validation Failed");
	    	}
		
	}
	
	@Test(priority = 4)
	public void FilterByStationName() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Station Name Filter Detail Page");
		
		Admin_Report_StationFacility_Object.ClickStationName.click();
		
		Admin_Report_StationFacility_Object.EnterStationName.sendKeys(getExcelData("PBReport",4,4));
		Thread.sleep(2000);
		
		Admin_Report_StationFacility_Object.ClickFilter.click();
		Thread.sleep(2000);
		
		String SNResult=Admin_Report_StationFacility_Object.SNResult.getText();
		System.out.println(SNResult);
		
		if(SNResult.contentEquals(getExcelData("PBReport", 4, 4)))
		{
			extenttestCase.log(Status.PASS, " Filter By Station Name Wise Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Station Name Wise  Validation Failed");
	    	}
		
	}
	
	@Test(priority = 5)
	public void FilterByProjectName() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Project Name Wise Filter Detail Page");
		
		Admin_Report_StationFacility_Object.ClickProjectName.click();
		
		Admin_Report_StationFacility_Object.EnterProjectName.sendKeys(getExcelData("PBReport",17,1));
		Thread.sleep(2000);
		
		Admin_Report_StationFacility_Object.ClickFilter.click();
		Thread.sleep(2000);
		
		String PNResult=Admin_Report_StationFacility_Object.PNResult.getText();
		System.out.println(PNResult);
		
		if(PNResult.contentEquals(getExcelData("PBReport",17,1)))
		{
			extenttestCase.log(Status.PASS, " Filter By Project Name Wise Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Project Name Wise  Validation Failed");
	    	}
		
	}
	
	@Test(priority = 6)
	public void FilterByParentCompany() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Parent Company Wise Filter Detail Page");
		
		Admin_Report_StationFacility_Object.ClickParentCompany.click();
		
		Admin_Report_StationFacility_Object.EnterParentCompany.sendKeys(getExcelData("PBReport",12,1));
		Thread.sleep(2000);
		
		Admin_Report_StationFacility_Object.ClickFilter.click();
		Thread.sleep(2000);
		
		String PCResult=Admin_Report_StationFacility_Object.PCResult.getText();
		System.out.println(PCResult);
		
		if(PCResult.contentEquals(getExcelData("PBReport",12,1)))
		{
			extenttestCase.log(Status.PASS, " Filter By Parent Company Wise Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Parent Company Wise  Validation Failed");
	    	}
		
	}
	
	@Test(priority = 7)
	public void FilterByAccomodation() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Accomodation Wise Filter Detail Page");
		
		Admin_Report_StationFacility_Object.Accomo.click();
		Thread.sleep(2000);
		
		Select Accomo=new Select(Admin_Report_StationFacility_Object.Accomo);
				//Accomo.selectByVisibleText("Yes");	
		          Accomo.selectByVisibleText("No");
		          Thread.sleep(2000);
		
		Admin_Report_StationFacility_Object.ClickFilter.click();
		Thread.sleep(2000);
		
		String AccomoResult=Admin_Report_StationFacility_Object.AccomoResult.getText();
		System.out.println(AccomoResult);
		
		if(AccomoResult.contentEquals(getExcelData("PBReport",12,2)))
		{
			extenttestCase.log(Status.PASS, " Filter By Accomodation Wise Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Accomodation Wise  Validation Failed");
	    	}
		
	}
	
	@Test(priority = 8)
	public void FilterByStipendGreaterThan() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Stipend Greater Than Filter Detail Page");
		
		Admin_Report_StationFacility_Object.StipendGT.click();
		Thread.sleep(2000);
		
		Admin_Report_StationFacility_Object.EnterStipendGT.sendKeys(getExcelData("PBReport",18,1));
		
		Admin_Report_StationFacility_Object.ClickFilter.click();
		Thread.sleep(2000);
		
		String SGTResult=Admin_Report_StationFacility_Object.SGTResult.getText();
		System.out.println(SGTResult);
		
		if(SGTResult.contentEquals(getExcelData("PBReport",18,1)))
		{
			extenttestCase.log(Status.PASS, " Filter By Stipend Greater Than Wise Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Stipend Greater Than Wise  Validation Failed");
	    	}
		
	}
	
	@Test(priority = 9)
	public void FilterByStipendLesserThan() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Stipend Lesser Than Filter Detail Page");
		
		Admin_Report_StationFacility_Object.StipendLT.click();
		Thread.sleep(2000);
		
		Admin_Report_StationFacility_Object.EnterScholarshipLT.sendKeys(getExcelData("PBReport",19,1));
		
		Admin_Report_StationFacility_Object.ClickFilter.click();
		Thread.sleep(2000);
		
		String SLTResult=Admin_Report_StationFacility_Object.SLTResult.getText();
		System.out.println(SLTResult);
		
		if(SLTResult.contentEquals(getExcelData("PBReport",19,1)))
		{
			extenttestCase.log(Status.PASS, " Filter By Stipend Lesser Than Wise Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Stipend Lesser Than Wise  Validation Failed");
	    	}
		
	}
	
	
	@Test(priority = 10)
	public void FilterByScholarshipGreaterThan() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Scholarship Greater Than Filter Detail Page");
		
		Admin_Report_StationFacility_Object.ScholarshipGT.click();
		Thread.sleep(2000);
		
		Admin_Report_StationFacility_Object.EnterScholarshipGT.sendKeys(getExcelData("PBReport",20,1));
		
		Admin_Report_StationFacility_Object.ClickFilter.click();
		Thread.sleep(2000);
		
		String SSGTResult=Admin_Report_StationFacility_Object.SSGTResult.getText();
		System.out.println(SSGTResult);
		
		if(SSGTResult.contentEquals(getExcelData("PBReport",20,1)))
		{
			extenttestCase.log(Status.PASS, " Filter By Scholarship Greater Than Wise Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Scholarship Greater Than Wise  Validation Failed");
	    	}
		
	}
	
	@Test(priority = 11)
	public void FilterByScholarshipLesserThan() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Scholarship Lesser Than Filter Detail Page");
		
		Admin_Report_StationFacility_Object.ScholarshipLT.click();
		Thread.sleep(2000);
		
		Admin_Report_StationFacility_Object.EnterScholarshipLT.sendKeys(getExcelData("PBReport",21,1));
		
		Admin_Report_StationFacility_Object.ClickFilter.click();
		Thread.sleep(2000);
		
		String SSLTResult=Admin_Report_StationFacility_Object.SSLTResult.getText();
		System.out.println(SSLTResult);
		
		if(SSLTResult.contentEquals(getExcelData("PBReport",21,1)))
		{
			extenttestCase.log(Status.PASS, " Filter By Scholarship Lesser Than Wise Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Scholarship Lesser Than Wise  Validation Failed");
	    	}
		
	}
	
	
	@Test(priority = 12)
	public void FilterByStipendPGGreaterThan() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Stipend For PG Greater Than Filter Detail Page");
		
		Admin_Report_StationFacility_Object.StipendForPGGT.click();
		Thread.sleep(2000);
		
		Admin_Report_StationFacility_Object.EnterStipendForPGGT.sendKeys(getExcelData("PBReport",18,2));
		
		Admin_Report_StationFacility_Object.ClickFilter.click();
		Thread.sleep(2000);
		
		String StipendForPGGTResult=Admin_Report_StationFacility_Object.StipendForPGGTResult.getText();
		System.out.println(StipendForPGGTResult);
		
		if(StipendForPGGTResult.contentEquals(getExcelData("PBReport",18,2)))
		{
			extenttestCase.log(Status.PASS, " Filter By Stipend For PG Greater Than Wise Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Stipend For PG Greater Than Wise  Validation Failed");
	    	}
		
	}
	
	@Test(priority = 13)
	public void FilterByStipendPGLesserThan() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Stipend For PG Lesser Than Filter Detail Page");
		
		Admin_Report_StationFacility_Object.StipendForPGLT.click();
		Thread.sleep(2000);
		
		Admin_Report_StationFacility_Object.EnterStipendForPGLT.sendKeys(getExcelData("PBReport",19,2));
		
		Admin_Report_StationFacility_Object.ClickFilter.click();
		Thread.sleep(2000);
		
		String StipendForPGGTResult=Admin_Report_StationFacility_Object.StipendForPGGTResult.getText();
		System.out.println(StipendForPGGTResult);
		
		if(StipendForPGGTResult.contentEquals(getExcelData("PBReport",19,2)))
		{
			extenttestCase.log(Status.PASS, " Filter By Stipend For PG Lesser Than Wise Validation Done Successfully");
		}

	     else
	    	{
	    		extenttestCase.log(Status.INFO, " Filter By Stipend For PG Lesser Than Wise  Validation Failed");
	    	}
		
	}
	
	@Test(priority = 14)
	public void VerifyExport() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Export  Detail Page");
		
		Admin_Report_StationFacility_Object.Export.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.INFO, " Export Details Validation Done Successfully");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
	}
		
}

package testCases;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import CommonFunctions.CommonFunctions;
import pageObjects.Admin_Report_StudentBioData_Objects;
import pageObjects.Admin_Report_StudentCourseList_Objects;

public class AdminRole_Report_StudentBioData extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(Admin_Report_StudentBioData_Objects.class);
	
	@Test(priority = 0)
	public void VerifyStudentBioDataReport() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Login to Instruction Cell Role");
		extenttestCase=extentReport.createTest("Verifying Student Bio Data Report Details Page");
		
		logger.info("Verifying Report Page");
        PageFactory.initElements(driver, Admin_Report_StudentBioData_Objects    .class);
		
        Admin_Report_StudentBioData_Objects .Report.click();
		Thread.sleep(2000);
		
		Admin_Report_StudentBioData_Objects.StudentBioData.click();
	    Thread.sleep(2000);
	    
	    String str=Admin_Report_StudentBioData_Objects .StudentBioDataResult.getText();
	    System.out.println(str);	    
		
	    if(str.contains("Student Bio Data Report"))
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
	
	@Test(priority = 1)
	public void VerifyByBatch() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Bio Data Report By Batch Filter Page");
		
		Admin_Report_StudentBioData_Objects.Menu.click();
		Thread.sleep(2000);
		
		Admin_Report_StudentBioData_Objects.ClickBatch.click();
		Thread.sleep(2000);
		
		//Select Bat=new Select(driver.findElement(By.xpath("//*[@id="batch"]/select")));
		//Bat.selectByVisibleText("2021-22");
		
		Admin_Report_StudentBioData_Objects.SelectBatch.sendKeys(getExcelData("StuCourseList", 1, 1));
		Thread.sleep(2000);
		
		Admin_Report_StudentBioData_Objects.ClickFilter.click();
		Thread.sleep(2000);
		
		String BatchResult=Admin_Report_StudentBioData_Objects.Result.getText();
		System.out.println(BatchResult);
		
		if(BatchResult.contentEquals(getExcelData("StuCourseList", 1, 1)))
		{
			extenttestCase.log(Status.PASS, " Batch Filter Validation Done Successfully");
		}
		
		else
		{
			extenttestCase.log(Status.INFO, " Batch Filter  Validation Failed");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);		
	}
	
	@Test(priority =2)
	public void FilterByPSType() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Bio Data Report By PSType Filter Page");
		
		Admin_Report_StudentBioData_Objects.Menu.click();
		Thread.sleep(2000);
		
		//Select PSType=new Select(driver.findElement(By.xpath("//*[@id=\"pstype\"]/select")));
		//PSType.selectByIndex(1);
		
		Admin_Report_StudentBioData_Objects.SelectPSType.sendKeys(getExcelData("StuCourseList",2, 1));
		Thread.sleep(2000);
		
		Admin_Report_StudentBioData_Objects.ClickFilter.click();
		Thread.sleep(2000);
		
		Admin_Report_StudentBioData_Objects.SelectPSType.sendKeys(getExcelData("StuCourseList",2, 2));
		Thread.sleep(2000);
		
		Admin_Report_StudentBioData_Objects.ClickFilter.click();
		Thread.sleep(2000);
		
		String PSTypeResult=Admin_Report_StudentBioData_Objects.Result.getText();
		System.out.println(PSTypeResult);
		
		if(PSTypeResult.contentEquals(getExcelData("StuCourseList", 2, 1)) && PSTypeResult.contentEquals(getExcelData("StuCourseList", 2, 2)))
		{
			extenttestCase.log(Status.PASS, " PSType Filter Validation Done Successfully");
		}
		
		else
		{
			extenttestCase.log(Status.INFO, " PSType Filter  Validation Failed");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);	
	}	
	
	@Test(priority = 3)
	public void VerifyByFirstName() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Bio Data Report By First Name Filter Page");
		
		Admin_Report_StudentBioData_Objects.Menu.click();
		Thread.sleep(2000);
		
		Admin_Report_StudentBioData_Objects.ClickFirstName.click();
		Thread.sleep(2000);
		
		Admin_Report_StudentBioData_Objects.EnterFirstName.sendKeys(getExcelData("StuCourseList", 13, 1));
		Thread.sleep(2000);
		
		Admin_Report_StudentBioData_Objects.ClickFilter.click();
		Thread.sleep(2000);
		
		String FirstNameResult=Admin_Report_StudentBioData_Objects.Result.getText();
		System.out.println(FirstNameResult);
		
		if(FirstNameResult.contentEquals(getExcelData("StuCourseList",13, 1)))
		{
			extenttestCase.log(Status.PASS, " Batch Filter Validation Done Successfully");
		}
		
		else
		{
			extenttestCase.log(Status.INFO, " Batch Filter  Validation Failed");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);		
	}
	
	@Test(priority =4)
	public void FilterByGender() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Bio Data Report By Gender Filter Page");
		
		Admin_Report_StudentBioData_Objects.Menu.click();
		Thread.sleep(2000);
		
		//Select gender=new Select(driver.findElement(By.id("gender")));
		//gender.selectByVisibleText("Male");
		
		Admin_Report_StudentBioData_Objects.SelectGender.sendKeys(getExcelData("StuCourseList",5, 1));
		Thread.sleep(2000);
		
		Admin_Report_StudentBioData_Objects.ClickFilter.click();
		Thread.sleep(2000);
		
		String GenderResult=Admin_Report_StudentBioData_Objects.Result.getText();
		System.out.println(GenderResult);
		
		if(GenderResult.contentEquals(getExcelData("StuCourseList",5, 1)))
		{
			extenttestCase.log(Status.PASS, " Gender Filter Validation Done Successfully");
		}
		
		else
		{
			extenttestCase.log(Status.INFO, " Gender Filter  Validation Failed");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	
	}
	
	@Test(priority =5)
	public void FilterByCGPAGT() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Course List Report Page By CGPA Greater Than Filter");
		
		Admin_Report_StudentBioData_Objects.Menu.click();
		Thread.sleep(2000);	
		
		Admin_Report_StudentBioData_Objects.ClickCGPAGT.click();
		Thread.sleep(2000);	
		
		Admin_Report_StudentBioData_Objects.EnterCGPAGT.sendKeys(getExcelData("StuCourseList",12,1));
		Thread.sleep(2000);	
		
		Admin_Report_StudentBioData_Objects.ClickFilter.click();
		Thread.sleep(2000);
		
		String GradeResult=Admin_Report_StudentCourseList_Objects.Result.getText();
		System.out.println(GradeResult);
		
		if(GradeResult.contentEquals(getExcelData("StuCourseList",12,1)))
		{
			extenttestCase.log(Status.PASS, "CGPA Greater Than Filter Validation Done Successfully");
		}
		
		else
		{
			extenttestCase.log(Status.INFO, "CGPA Greater Than Filter  Validation Failed");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);	
	}	
	
	@Test(priority =6)
	public void FilterByFillDetails() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Bio Data Report By Fill Details Filter Page");
		
		Admin_Report_StudentBioData_Objects.Menu.click();
		Thread.sleep(2000);
		
		Admin_Report_StudentBioData_Objects.ClickFillDetails.click();
		Thread.sleep(2000);
		
		//Select FillDetails=new Select(driver.findElement(By.id("fillDetails")));
		//FillDetails.selectByVisibleText("Not Filled");
		
		Admin_Report_StudentBioData_Objects.SelectFillDetails.sendKeys(getExcelData("StuCourseList",14,2));
		Thread.sleep(2000);
		
		Admin_Report_StudentBioData_Objects.ClickFilter.click();
		Thread.sleep(2000);
		
		String GenderResult=Admin_Report_StudentBioData_Objects.Result.getText();
		System.out.println(GenderResult);
		
		if(GenderResult.contentEquals(getExcelData("StuCourseList",14,2)))
		{
			extenttestCase.log(Status.PASS, " Fill Details Filter Validation Done Successfully");
		}
		
		else
		{
			extenttestCase.log(Status.INFO, " Fill Details  Validation Failed");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	
	}	

	@Test(priority =7)
	public void VerifyExport() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Student Bio Data Report By Fill Details Filter Page");
		
		Admin_Report_StudentBioData_Objects.Export.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.INFO, " Fill Details  Validation Done Successfully");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);	
	}
}
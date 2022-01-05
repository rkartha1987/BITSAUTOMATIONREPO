package testCases;
     
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.Admin_Report_AllotStatStuFacultyList_Object;
//import pageObjects.Dashboard_Common_Objects;

public class AdminRole_Reports_AllottedStationStudentFaculty extends CommonFunctions
{

	
	
static Logger logger = Logger.getLogger(Admin_Report_AllotStatStuFacultyList_Object.class);
	
	@Test(priority = 0)
	public void VerifyActiveStation() throws InterruptedException, IOException
	{
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Login to Dean Role");
		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Student Faculty Report  Detail Page");
		PageFactory.initElements(driver,Admin_Report_AllotStatStuFacultyList_Object .class);
		Admin_Report_AllotStatStuFacultyList_Object .Report.click();
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, Admin_Report_AllotStatStuFacultyList_Object .class);
		Admin_Report_AllotStatStuFacultyList_Object.AllotStaStuFaculty.click();
		extenttestCase.log(Status.INFO,"Open a Report AllotStaStuFacltReport Details");
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("AllotStaStuFacltReport.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("AllotStaStuFacltReport.png");

		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void VerifyFilterByValidBatch() throws Throwable
	{
		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Student Faculty Report By Valid Batch Filter Detail Page");
		Admin_Report_AllotStatStuFacultyList_Object.FilterMenu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickBatch.click();
		Thread.sleep(2000);
		
		Select Batch=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectBatch);
		Batch.selectByVisibleText("2021-22");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectBatch.sendKeys(getExcelData("PlanningReport", 2, 1));
		//Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String BatchFilter=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		System.out.println(BatchFilter);
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
		Admin_Report_AllotStatStuFacultyList_Object.SelectBatch.clear();
		
	}
	
	@Test(priority = 2)
	public void VerifyFilterByInValidBatch() throws Throwable
	{
		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Student Faculty Report By Invalid Batch Filter Detail Page");
		Admin_Report_AllotStatStuFacultyList_Object.FilterMenu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickBatch.click();
		Thread.sleep(2000);
		
		Select Batch=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectBatch);
		Batch.selectByVisibleText("2020-21");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectBatch.sendKeys(getExcelData("PlanningReport", 2, 2));
		//Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String BatchFilter=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		System.out.println(BatchFilter);
		Thread.sleep(2000);
		
		if(BatchFilter.contentEquals(getExcelData("PlanningReport", 2, 2)))
		{
			extenttestCase.log(Status.PASS, "InValid Batch Filter Validation Done Successfully");
				
		}
		
		else
		{
			extenttestCase.log(Status.INFO, "InValid Batch Filter Validation Failed");
		}
		
		Thread.sleep(2000);
		Admin_Report_AllotStatStuFacultyList_Object.SelectBatch.clear();
		
	}
	
	@Test(priority = 3)
	public void VerifyFilterByPSTypeI() throws Throwable
	{
		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Student Faculty Report By PSTypeI Filter Detail Page");
		Admin_Report_AllotStatStuFacultyList_Object.FilterMenu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickPS.click();
		Thread.sleep(2000);
		
		Select PS1=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectPS);
		PS1.selectByVisibleText("PS I");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectBatch.sendKeys(getExcelData("PlanningReport", 3, 1));
		//Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String PSFilter=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		System.out.println(PSFilter);
		Thread.sleep(2000);
		
		if(PSFilter.contentEquals(getExcelData("PlanningReport", 3, 1)))
		{
			extenttestCase.log(Status.PASS, "PSTypeI Filter Validation Done Successfully");
				
		}
		
		else
		{
			extenttestCase.log(Status.INFO, " PSTypeI Filter Validation Failed");
		}
		
		Thread.sleep(2000);
		Admin_Report_AllotStatStuFacultyList_Object.SelectPS.clear();
		
	}
	
	
	@Test(priority = 4)
	public void VerifyFilterByPSTypeII() throws Throwable
	{
		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Student Faculty Report By PSTypeI Filter Detail Page");
		Admin_Report_AllotStatStuFacultyList_Object.FilterMenu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickPS.click();
		Thread.sleep(2000);
		
		Select PS2=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectPS);
		PS2.selectByVisibleText("PS II");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectBatch.sendKeys(getExcelData("PlanningReport", 3, 2));
		//Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickSem.click();
		Thread.sleep(2000);
		
		Select Sem=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectSem);
		Sem.selectByIndex(2);
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectSem.sendKeys(getExcelData("PlanningReport",4, 2));
		//Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String PSFilter=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		System.out.println(PSFilter);
		Thread.sleep(2000);
		
		if(PSFilter.contentEquals(getExcelData("PlanningReport", 3, 1)))
		{
			extenttestCase.log(Status.PASS, "PSTypeII Filter Validation Done Successfully");
				
		}
		
		else
		{
			extenttestCase.log(Status.INFO, " PSTypeII Filter Validation Failed");
		}
		
		Thread.sleep(2000);
		Admin_Report_AllotStatStuFacultyList_Object.SelectPS.clear();
		
		Admin_Report_AllotStatStuFacultyList_Object.SelectSem.click();
		
	}
	
	
	@Test(priority = 5)
	public void VerifyFilterByStudentName() throws Throwable
	{
		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Student Faculty Report By Station Name Filter Detail Page");
		Admin_Report_AllotStatStuFacultyList_Object.FilterMenu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickSN.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.EnterSN.sendKeys(getExcelData("PlanningReport", 5, 1));
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String SN1=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.EnterSN.clear();
		
		Admin_Report_AllotStatStuFacultyList_Object.EnterSN.sendKeys(getExcelData("PlanningReport", 5, 2));
        Thread.sleep(2000);
		
        Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String SN2=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		if(SN1.contentEquals(getExcelData("PlanningReport", 5, 1)) && SN2.contentEquals(getExcelData("PlanningReport", 5, 2)))
		{
			extenttestCase.log(Status.PASS, "StudentName Filter Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, " StudentName Filter Validation Failed");
		}
		
		Thread.sleep(2000);
		Admin_Report_AllotStatStuFacultyList_Object.EnterSN.clear();
		
	}
	
	
	@Test(priority = 6)
	public void VerifyFilterByCampusName() throws Throwable
	{
		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Student Faculty Report By CampusName Filter Detail Page");
		Admin_Report_AllotStatStuFacultyList_Object.FilterMenu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickCN.click();
		Thread.sleep(2000);
		
		Select CampusName1=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectCN);
		CampusName1.selectByVisibleText("Pilani");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectCN.sendKeys(getExcelData("PlanningReport", 6,1));
		//Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String CN1=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.SelectCN.clear();
		
		Select CampusName2=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectCN);
		CampusName2.selectByVisibleText("Goa");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectCN.sendKeys(getExcelData("PlanningReport", 6,2));
		//Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String CN2=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		if(CN1.contentEquals(getExcelData("PlanningReport", 6,1)) && CN2.contentEquals(getExcelData("PlanningReport", 6,2)))
		{
			extenttestCase.log(Status.PASS, "CampusName Filter Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "CampusName Filter Validation Failed");
		}
		
		Thread.sleep(2000);
		Admin_Report_AllotStatStuFacultyList_Object.SelectCN.clear();
		
	}
	
	
	@Test(priority = 7)
	public void VerifyFilterByDiscipiline() throws Throwable
	{
		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Student Faculty Report By Discipiline Filter Detail Page");
		Admin_Report_AllotStatStuFacultyList_Object.FilterMenu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickDis.click();
		Thread.sleep(2000);
		
		Select Dis1=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectDis);
		Dis1.selectByVisibleText("A1");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectDis.sendKeys(getExcelData("PlanningReport",7,1));
		//Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String Disci1=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.SelectDis.clear();
		
		
		//Select Dis2=new Select(Admin_Report_AllotStatStuFacultyList_Page_Object.SelectDis);
		Dis1.selectByVisibleText("A7");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectDis.sendKeys(getExcelData("PlanningReport",7,2));
		//Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String Disci2=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		System.out.println(Disci2);
		
		if(Disci1.contentEquals(getExcelData("PlanningReport",7,1)) && Disci2.equals("Record(s) not found"))
        {
	            extenttestCase.log(Status.PASS, "Discipiline Filter Validation Done Successfully");
        }
       else
       {
	           extenttestCase.log(Status.INFO, "Discipiline Filter Validation Failed");
       }

   Thread.sleep(2000);
   Admin_Report_AllotStatStuFacultyList_Object.SelectDis.clear();
   
	}
	
	@Test(priority = 8)
	public void VerifyFilterByAllottedStation() throws Throwable
	{
		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Student Faculty Report By Allotted Station Filter Detail Page");
		Admin_Report_AllotStatStuFacultyList_Object.FilterMenu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickAllotSta.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.EnterAllotSta.sendKeys(getExcelData("PlanningReport", 8, 1));
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String SN1=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.EnterAllotSta.clear();
		
		Admin_Report_AllotStatStuFacultyList_Object.EnterAllotSta.sendKeys(getExcelData("PlanningReport", 8, 2));
        Thread.sleep(2000);
		
        Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String SN2=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.EnterAllotSta.clear();
		
		Admin_Report_AllotStatStuFacultyList_Object.EnterAllotSta.sendKeys(getExcelData("PlanningReport", 8, 3));
        Thread.sleep(2000);
		
        Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String SN3=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		if(SN1.contentEquals(getExcelData("PlanningReport", 8, 1)) && SN2.contentEquals(getExcelData("PlanningReport", 8, 2)) && SN3.equals("Record(s) not found"))
		{
			extenttestCase.log(Status.PASS, "Allotted Station Filter Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, " Allotted Station Validation Failed");
		}
		
		Thread.sleep(2000);
		Admin_Report_AllotStatStuFacultyList_Object.EnterAllotSta.clear();
		
	}
	
	@Test(priority = 9)
	public void VerifyFilterByParentCompany() throws Throwable
	{
		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Student Faculty Report By Parent Company Filter Detail Page");
		Admin_Report_AllotStatStuFacultyList_Object.FilterMenu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickPC.click();
		Thread.sleep(2000);
		
		Select ParentCompany1=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectPC);
		ParentCompany1.selectByVisibleText("test");
		Thread.sleep(2000);
		
		//Planning_Report_AllotStaStuFacultyReport_Page_Object.SelectPC.sendKeys(getExcelData("PlanningReport",8,1));
		//Thread.sleep(2000);
		

		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String PC1=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.SelectPC.clear();
		
		Select ParentCompany2=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectPC);
		ParentCompany2.selectByVisibleText("ABC");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectDiscipiline.sendKeys(getExcelData("PlanningReport",8,2));
		//Thread.sleep(2000);
		

		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		//String PC2=Admin_Report_AllotStatStuFacultyList_Page_Object.TableResult.getText();
		Thread.sleep(2000);
		
		if(PC1.contentEquals(getExcelData("PlanningReport",9,1)) && PC1.contentEquals(getExcelData("PlanningReport",9,2)))
        {
	            extenttestCase.log(Status.PASS, "Parent Company Filter Validation Done Successfully");
        }
       else
       {
	           extenttestCase.log(Status.INFO, "Parent Company Filter Validation Failed");
       }

   Thread.sleep(2000);
   Admin_Report_AllotStatStuFacultyList_Object.SelectPC.clear();
   
	}
	
	@Test(priority = 10)
	public void VerifyFilterByBusinessDomain() throws Throwable
	{
		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Student Faculty Report By Business Domain Filter Detail Page");
		Admin_Report_AllotStatStuFacultyList_Object.FilterMenu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickBD.click();
		Thread.sleep(2000);
		
		Select BusinessDomain1=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectBD);
		BusinessDomain1.selectByVisibleText("IT");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectBD.sendKeys(getExcelData("PlanningReport",10,1));
		//Thread.sleep(2000);
		

		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String BD1=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickBD.click();
		Thread.sleep(2000);
		
		Select BusinessDomain2=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectBD);
		BusinessDomain2.selectByVisibleText("Manufacturing");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectBD.sendKeys(getExcelData("PlanningReport",10,2));
		//Thread.sleep(2000);
		

		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String BD2=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		if(BD1.contentEquals(getExcelData("PlanningReport",10,1)) && BD2.contentEquals(getExcelData("PlanningReport",10,2)))
        {
	            extenttestCase.log(Status.PASS, "Business Domain Filter Validation Done Successfully");
        }
       else
       {
	           extenttestCase.log(Status.INFO, "Business Domain Filter Validation Failed");
       }

      Thread.sleep(2000);
      Admin_Report_AllotStatStuFacultyList_Object.SelectBD.clear();
		
	}
	
	
	@Test(priority = 11)
	public void VerifyFilterByProjectDomain() throws Throwable
	{
		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Student Faculty Report By Project Domain Filter Detail Page");
		Admin_Report_AllotStatStuFacultyList_Object.FilterMenu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickPD.click();
		Thread.sleep(2000);
		
		Select ProjectDomain1=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectPD);
		ProjectDomain1.selectByVisibleText("Software");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectPD.sendKeys(getExcelData("PlanningReport",11,1));
		//Thread.sleep(2000);
		

		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String PD1=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickPD.click();
		Thread.sleep(2000);
		
		Select ProjectDomain2=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectPD);
		ProjectDomain2.selectByVisibleText("Manufacturing");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectPD.sendKeys(getExcelData("PlanningReport",11,2));
		//Thread.sleep(2000);
		

		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String PD2=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		Select ProjectDomain3=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectPD);
		ProjectDomain3.selectByVisibleText("ComputerScience");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectPD.sendKeys(getExcelData("PlanningReport",11,3));
		//Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String PD3=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		if(PD1.contentEquals(getExcelData("PlanningReport",11,1)) && PD2.contentEquals(getExcelData("PlanningReport",11,2)) && PD3.equals("Record(s) not found"))
        {
	            extenttestCase.log(Status.PASS, "Project Domain Filter Validation Done Successfully");
        }
       else
       {
	           extenttestCase.log(Status.INFO, "Project Domain Filter Validation Failed");
       }

      Thread.sleep(2000);
      Admin_Report_AllotStatStuFacultyList_Object.SelectBD.clear();
		
	}

	@Test(priority = 12)
	public void VerifyFilterByAllottedFaculty() throws Throwable
	{
		
		extenttestCase=extentReport.createTest("Verifying Allotted Station Student Faculty Report By Allotted Faculty Filter Detail Page");
		Admin_Report_AllotStatStuFacultyList_Object.FilterMenu.click();
		Thread.sleep(2000);
		
		Admin_Report_AllotStatStuFacultyList_Object.ClickAllotFac.click();
		Thread.sleep(2000);
		
		Select SelectFacultyName1=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectAllotFac);
		SelectFacultyName1.selectByVisibleText("Pushpa");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectFacultyName.sendKeys(getExcelData("PlanningReport",12,1));
		//Thread.sleep(2000);
		

		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String Faculty1=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		Thread.sleep(2000);
		
		Select SelectFacultyName2=new Select(Admin_Report_AllotStatStuFacultyList_Object.SelectAllotFac);
		SelectFacultyName2.selectByVisibleText("Rokesh Gmail6");
		Thread.sleep(2000);
		
		//Admin_Report_AllotStatStuFacultyList_Page_Object.SelectFacultyName.sendKeys(getExcelData("PlanningReport",12,2));
		//Thread.sleep(2000);
		

		Admin_Report_AllotStatStuFacultyList_Object.FilterButton.click();
		Thread.sleep(2000);
		
		String Faculty2=Admin_Report_AllotStatStuFacultyList_Object.TableResult.getText();
		System.out.println(Faculty2);
		Thread.sleep(2000);
		
		
		if(Faculty1.contentEquals(getExcelData("PlanningReport",11,1))  && Faculty2.equals("Record(s) not found"))
        {
	            extenttestCase.log(Status.PASS, "Project Domain Filter Validation Done Successfully");
        }
       else
       {
	           extenttestCase.log(Status.INFO, "Project Domain Filter Validation Failed");
       }

      Thread.sleep(2000);
      Admin_Report_AllotStatStuFacultyList_Object.SelectAllotFac.clear();
		
	  }

}
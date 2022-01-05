package testCases;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.Dashboard_Common_Objects;
public class AdminRole_Dashboard extends CommonFunctions {

static Logger logger = Logger.getLogger(Dashboard_Common_Objects .class);
	
	@Test(priority = 0)
	public void ClickRecord() throws InterruptedException, IOException, Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Admin's Dashboard Page");
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, Dashboard_Common_Objects.class);
		Dashboard_Common_Objects.Home.click();
		extenttestCase.log(Status.INFO,"Landed in Admin's Dashboard Page");
		Thread.sleep(2000);
		
		CommonFunctions.captureScreen("Admin - Dashboard.png");		
	}
	
	@Test(priority = 1)
	public void VerifyDashboardpage() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Admin's Dashboard");
		Thread.sleep(2000);
		
		String LableName=Dashboard_Common_Objects.Dashboard.getText();
		//System.out.println(LableName);
		Thread.sleep(2000);
		
	    if (LableName.equals("Station Allotment Details"))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}  	
	    }
	
	@Test(priority = 2)
	public void VerifyPracticeSchool () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Practice School Details");
		Thread.sleep(2000);
		
		String PStype=Dashboard_Common_Objects.PSMenu.getText();
		//System.out.println(PStype);
		Thread.sleep(2000);
		
	    if (PStype.contentEquals(getExcelData("Dashboard",1,1)))
	    {
	    	extenttestCase.log(Status.PASS, "Practice School Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, PStype + " Validation Failed");
	    	}	      	
	    }
	
	@Test(priority = 3)
	public void VerifySemester () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Semester Details Of Students");
		Thread.sleep(2000);
		
		String Semtype=Dashboard_Common_Objects.Semester.getText();
		System.out.println("Sem Type = "+ Semtype);
		Thread.sleep(2000);
		
	    if (Semtype.contentEquals(getExcelData("Dashboard",2,1)))
	    {
	    	extenttestCase.log(Status.PASS, " Semester Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, Semtype+ " Validation Failed: " + getExcelData("Dashboard",2,1).toString());
	    	}	
	    }
	
	@Test(priority = 4)
	public void VerifyCurrentBatch () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Current Batch Details Of Students");
		Thread.sleep(2000);
		
		String Batchtype=Dashboard_Common_Objects.Currentbatch.getText();
		System.out.println("Currnt Batch = "+ Batchtype);
		Thread.sleep(2000);
		
	    if (Batchtype.contentEquals(getExcelData("Dashboard",3,1)))
	    {
	    	extenttestCase.log(Status.PASS, "Batch Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, Batchtype+ " Validation Failed" +getExcelData("Dashboard",3,1).toString() );
	    	} 	
	    }
	
	@Test(priority = 5)
	public void VerifyTotalStudents () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Total No.Of Students");
		Thread.sleep(2000);
		
		String TotalCount=Dashboard_Common_Objects.TotalStudentcount.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",4,1));
		System.out.println(TotalCount);
		Thread.sleep(2000);
		
	    if (TotalCount.trim().contentEquals(counter.trim()))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully ");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, "Validation Failed");
	    	}	
	    }

	@Test(priority = 7)
	public void VerifyAllottedStudents () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Allotted Students");
		Thread.sleep(2000);
		
		String AllottedStud=Dashboard_Common_Objects.AllottedStudent.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",5,1));
		//System.out.println(AllottedStud);
		Thread.sleep(2000);
		
	    if (AllottedStud.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, AllottedStud+ " Validation Failed: "+getExcelData("Dashboard",5,1).toString());
	    	}	
	    }
	
	@Test(priority = 8)
	public void VerifyAllottedOrganizations () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Allotted Organizations");
		Thread.sleep(2000);
		
		String AllottedOrgCount=Dashboard_Common_Objects.AllottedOrgcount.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",6,1));
		//System.out.println(AllottedOrgCount);
		Thread.sleep(2000);
		
	    if (AllottedOrgCount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, AllottedOrgCount+ " Validation Failed "+ getExcelData("Dashboard",6,1).toString());
	    	}	    	
	    }
	@Test(priority = 9)
	
	public void VerifyOrganizationsAnnounced () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Organizations Announced Details");
		Thread.sleep(2000);
		
		String OrgAnnouncedcount=Dashboard_Common_Objects.OrgAnnouncedcount.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",7,1));
		//System.out.println(OrgAnnouncedcount);
		Thread.sleep(2000);
		
	    if (OrgAnnouncedcount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	    	
	   }
	
	@Test(priority = 10)
	public void VerifyCoreDiscipline () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Allotted to Core Discipline Details");
		Thread.sleep(2000);
		
		String Corecount=Dashboard_Common_Objects.Corecount.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",8,1));
		//System.out.println(Corecount);
		Thread.sleep(2000);
		
	    if (Corecount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	
	@Test(priority = 11)
	public void VerifyNonCoreDiscipline () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Allotted to Non Core Discipline Details");
		Thread.sleep(2000);
		
		String NonCorecount=Dashboard_Common_Objects.NonCorecount.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",9,1));
		//System.out.println(NonCorecount);
		Thread.sleep(2000);
		
	    if (NonCorecount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }

	@Test(priority = 12)
	public void VerifyTop5Preferences () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Allotted with Top-5 Preferences Details");
		Thread.sleep(2000);
		
		String Prefercount=Dashboard_Common_Objects.Prefercount.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",10,1));
		//System.out.println(Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	@Test(priority = 13)
	public void VerifyStationsParticipated () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the count of Participated Stations");
		Thread.sleep(2000);
		
		String Prefercount=Dashboard_Common_Objects.StationsParticipated.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",11,1));
		System.out.println(Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	@Test(priority = 14)
	public void VerifyAnnouncedStations () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the count of Announced Stations");
		Thread.sleep(2000);
		
		String Prefercount=Dashboard_Common_Objects.StationAnnounced.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",12,1));
		System.out.println(Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	@Test(priority = 15)
	public void VerifyStationsAllotted () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the count of Allotted Stations");
		Thread.sleep(2000);
		
		String Prefercount=Dashboard_Common_Objects.StationAllotted.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",13,1));
		System.out.println(Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	@Test(priority = 16)
	public void VerifyTotalRequirements () throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the count of Total Requirements");
		Thread.sleep(2000);
		
		String Prefercount=Dashboard_Common_Objects.TotalRqmts.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",14,1));
		System.out.println(Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	@Test(priority = 17)
	public void VerifyTotalAllotted() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the count of Total Allotted");
		Thread.sleep(2000);
		
		String Prefercount=Dashboard_Common_Objects.TotalAllotted.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",15,1));
		System.out.println(Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	@Test(priority = 18)
	public void VerifyStipendHighest() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Stipend-Highest");
		Thread.sleep(2000);
		
		Dashboard_Common_Objects.StipendTab.click();
		Thread.sleep(2000);
		
		String Prefercount=Dashboard_Common_Objects.Highest.getText().toString();
		String counter=Integer.toString(getExcelData1("Dashboard",16,1));
		System.out.println(Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, Prefercount+ ": Validation Failed :"+ counter);
	    	}	
	    }
	
	@Test(priority = 19)	
	public void VerifyStipendAverage() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Stipend-Average");
		Thread.sleep(2000);
		
		String Prefercount=Dashboard_Common_Objects.Average.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",17,1));
		System.out.println(Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	
	@Test(priority = 19)	
	public void VerifyStipendMedian() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Stipend-Median");
		Thread.sleep(2000);
		
		String Prefercount=Dashboard_Common_Objects.Median.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",18,1));
		System.out.println(Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	
	@Test(priority = 20)	
	public void VerifyStipendLowest() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Stipend-Lowest");
		Thread.sleep(2000);
		
		String Prefercount=Dashboard_Common_Objects.Lowest.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",19,1));
		System.out.println(Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	
	@Test(priority = 21)	
	public void VerifyFacultyTotal() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Faculty-Total");
		Thread.sleep(2000);
		
		Dashboard_Common_Objects.FacultyTab.click();
		Thread.sleep(2000);
		
		String Prefercount=Dashboard_Common_Objects.FacultyTotal.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",20,1));
		System.out.println("Faculty Total: "+Prefercount);
		System.out.println("Excel Count: "+Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	
	@Test(priority = 22)	
	public void VerifyFacultyOnCampus() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Faculty-On Campus");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.FacultyOnCampus.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",21,1));
		System.out.println("Faculty Total: "+Prefercount);
		System.out.println("Excel Count: "+Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	
	@Test(priority = 23)	
	public void VerifyFacultyOffCampus() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Faculty-Off Campus");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.FacultyOffCampus.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",22,1));
		System.out.println("Faculty Total: "+Prefercount);
		System.out.println("Excel Count: "+Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	
	@Test(priority = 24)	
	public void VerifyFacultyAllotted() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Faculty-Allotted");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.FacultyAllotted.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",23,1));
		System.out.println("Faculty Total: "+Prefercount);
		System.out.println("Excel Count: "+Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
	
	@Test(priority = 25)	
	public void VerifyFacultyAvailable() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying the Faculty-Available");
		Thread.sleep(2000);

		String Prefercount=Dashboard_Common_Objects.FacultyAllotted.getText();
		String counter=Integer.toString(getExcelData1("Dashboard",23,1));
		System.out.println("Faculty Total: "+Prefercount);
		System.out.println("Excel Count: "+Prefercount);
		Thread.sleep(2000);
		
	    if (Prefercount.contentEquals(counter))
	    {
	    	extenttestCase.log(Status.PASS, " Validation Done Successfully");
	    }
	     else
	    	{
	    		extenttestCase.log(Status.FAIL, " Validation Failed");
	    	}	
	    }
}
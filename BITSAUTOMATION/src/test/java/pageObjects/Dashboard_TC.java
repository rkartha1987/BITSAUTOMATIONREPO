package testCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import CommonFunctions.CommonFunctions;
import pageObjects.Dashboard_Page_Objects;
import pageObjects.Faculty_StationOrFacultyWise_Allot_Page_Objects;

public class Dashboard_TC extends CommonFunctions {
	
@Test(priority=0)	
	public void Verify_LandingPage_Admin() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Verifying Landing Page of Admin team");
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		List<String> Expected=Arrays.asList("HOME", "STATION REFERAL", "MANAGE STUDENT","MANAGE FACULTY","REPORTS");
		List<WebElement> li=Dashboard_Page_Objects.MenuStrip;
		
		List<String> Actual=new ArrayList<String>();
		for(WebElement a:li) {
			
			Actual.add(a.getText());
		}
		if (Expected.equals(Actual) == true) {
            System.out.println(" Array List are equal");
    		extenttestCase.log(Status.INFO,"User successfully logged in as Admin Team member ");
		}
        else {
	        	   System.out.println(" Array List are not equal");    	
       		extenttestCase.log(Status.INFO,"User logged in is not from Admin team");
        }
	}

@Test(priority=1)	
public void Verify_LandingPage_PlanningTeam() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Verifying Landing Page of Planning team");
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		List<String> Expected=Arrays.asList("HOME", "MANAGE STATION", "PROBLEM BANK","SEMESTER ALLOTMENT","STATION ALLOTMENT","FACULTY ALLOTMENT","POST ALLOTMENT","ANNOUNCEMENT","REPORTS");
		List<WebElement> li=Dashboard_Page_Objects.MenuStrip;
		
		List<String> Actual=new ArrayList<String>();
		for(WebElement a:li) {
			
			Actual.add(a.getText());
		}
		
		if (Expected.equals(Actual) == true) {
            System.out.println(" Array List are equal");
    		extenttestCase.log(Status.INFO,"User successfully logged in as Planning Team member ");
		}
        else {
	        	   System.out.println(" Array List are not equal");    	
       		extenttestCase.log(Status.INFO,"User logged in is not from Planning team");
        }	
}

@Test(priority=2)	
	public void Verify_LandingPage_AllotTeam() throws Throwable {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			extenttestCase=extentReport.createTest("Verifying Landing Page of Allotment team");
			PageFactory.initElements(driver, Dashboard_Page_Objects.class);
			List<String> Expected=Arrays.asList("HOME", "STATION", "SEMESTER ALLOTMENT","STATION ALLOTMENT","POST ALLOTMENT","REPORTS");
			List<WebElement> li=Dashboard_Page_Objects.MenuStrip;
			
			List<String> Actual=new ArrayList<String>();
			for(WebElement a:li) {
				Actual.add(a.getText());
			}
			
			if (Expected.equals(Actual) == true) {
	            System.out.println(" Array List are equal");
	    		extenttestCase.log(Status.INFO,"User successfully logged in as Allotment Team member ");
			}
	        else {
		        System.out.println(" Array List are not equal");    	
	       		extenttestCase.log(Status.INFO,"User logged in is not from Allotment team");
	        }
}

@Test(priority=3)	
public void Verify_LandingPage_Dean() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Verifying Landing Page of Dean");
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		List<String> Expected=Arrays.asList("HOME", "REPORTS");
		List<WebElement> li=Dashboard_Page_Objects.MenuStrip;
		List<String> Actual=new ArrayList<String>();
		for(WebElement a:li) {
			Actual.add(a.getText());
		}
		
		if (Expected.equals(Actual) == true) {
            System.out.println(" Array List are equal");
    		extenttestCase.log(Status.INFO,"User successfully logged in as Dean ");
		}
        else {
	        System.out.println(" Array List are not equal");    	
       		extenttestCase.log(Status.INFO,"User logged in is not from Dean");
        }
}

@Test(priority=4)	
public void Verify_LandingPage_InstructionCell() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extenttestCase=extentReport.createTest("Verifying Landing Page of Instruction Cell team");
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		List<String> Expected=Arrays.asList("HOME", "STATION REFERAL","PROBLEM BANK","POST ALLOTMENT","FACULTY ALLOTMENT", "REPORTS");
		List<WebElement> li=Dashboard_Page_Objects.MenuStrip;
		List<String> Actual=new ArrayList<String>();
		for(WebElement a:li) {
			Actual.add(a.getText());
		}
		
		if (Expected.equals(Actual) == true) {
            System.out.println(" Array List are equal");
    		extenttestCase.log(Status.INFO,"User successfully logged in as Instruction Cell");
		}
        else {
	        System.out.println(" Array List are not equal");    	
       		extenttestCase.log(Status.INFO,"User logged in is not from Instruction Cell");
    }
	}
	}
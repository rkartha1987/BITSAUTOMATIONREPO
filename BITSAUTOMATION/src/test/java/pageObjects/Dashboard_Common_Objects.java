package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_Common_Objects {
	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/li[1]/a")
	public static WebElement Home;
	
	@FindBy(xpath="//h2[contains(text(),'Station Allotment Details')]")
	public static WebElement Dashboard;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-header/nav/div/div/div[2]/ul/li[2]/div/div/a/span")
	public static WebElement WelcomeMsg;
	
	//@FindBy(xpath="/html/body/app-root/app-layout/app-planning-dashboard/div/div[1]/div/div/div/nav/ul/li[1]")
	@FindBy(xpath="/html/body/app-root/app-layout/app-planning-dashboard/div/div[1]/div/div/div[1]/nav/ul/li[2]")
	public static WebElement PSType;
	
	//@FindBy(xpath="/html/body/app-root/app-layout/app-planning-dashboard/div/div[1]/div/div/div/nav/ul/li[2]")
	@FindBy(xpath="/html/body/app-root/app-layout/app-planning-dashboard/div/div[1]/div/div/div[1]/nav/ul/li[3]")
	public static WebElement Semester;
	
	//@FindBy(xpath="/html/body/app-root/app-layout/app-planning-dashboard/div/div[1]/div/div/div/nav/ul/li[3]")
	@FindBy(xpath="/html/body/app-root/app-layout/app-planning-dashboard/div/div[1]/div/div/div[1]/nav/ul/li[1]")
	public static WebElement Currentbatch;
	
	/////////////////////// Dash board ////////////////////////////////////////
	//@FindBy(xpath="//*[@id=\"studentscount\"]")
	@FindBy(xpath="//*[@id=\"studentscount\"]/strong")
	public static WebElement TotalStudentcount;	
	
	//@FindBy(xpath="/html/body/app-root/app-layout/app-planning-dashboard/div/div[2]/div/div[2]/div/div[2]/div")
	@FindBy(xpath="/html/body/app-root/app-layout/app-planning-dashboard/div/div[2]/div/div[2]/div/div[2]/div/strong")
	public static WebElement AllottedStudent;
	
	//@FindBy(xpath="//*[@id=\"organizationcount\"]")//*[@id="organizationcount"]/strong
	@FindBy(xpath="//*[@id=\"organizationcount\"]/strong")
	public static WebElement AllottedOrgcount;
	
	//@FindBy(xpath="//*[@id=\"announcedcount\"]")
	@FindBy(xpath="//*[@id=\"announcedcount\"]/strong")
	public static WebElement OrgAnnouncedcount ;
	
	//@FindBy(xpath="//*[@id=\"corecount\"]")
	@FindBy(xpath="//*[@id=\"corecount\"]/strong")
	public static WebElement Corecount ;
	
	//@FindBy(xpath="/html/body/app-root/app-layout/app-planning-dashboard/div/div[2]/div/div[2]/div/div[6]")
	@FindBy(xpath="/html/body/app-root/app-layout/app-planning-dashboard/div/div[2]/div/div[2]/div/div[6]/div/strong")
	public static WebElement NonCorecount ;
	
	//@FindBy(xpath="//*[@id=\"prefercount\"]")
	@FindBy(xpath="//*[@id=\"prefercount\"]/strong")
	public static WebElement Prefercount ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-planning-dashboard/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/ul/li[1]/a")
	public static WebElement StationTab ;
		
	//@FindBy(xpath="//*[@id=\"station\"]/div[1]/div[1]")//*[@id="station"]/div[1]/div[1]/strong
	@FindBy(xpath="//*[@id=\"station\"]/div[1]/div[1]/strong")
	public static WebElement StationsParticipated ;
	
	//@FindBy(xpath="//*[@id=\"station\"]/div[1]/div[2]")
	@FindBy(xpath="//*[@id=\"station\"]/div[1]/div[2]/strong")
	public static WebElement StationAnnounced ;
	
	//@FindBy(xpath="//*[@id=\"station\"]/div[1]/div[3]")
	@FindBy(xpath="//*[@id=\"station\"]/div[1]/div[3]/strong")
	public static WebElement StationAllotted ;
	
	//@FindBy(xpath="//*[@id=\"station\"]/div[1]/div[4]")
	@FindBy(xpath="//*[@id=\"station\"]/div[1]/div[4]/strong")//*[@id="station"]/div[1]/div[4]/strong
	public static WebElement TotalRqmts ;
	
//	@FindBy(xpath="//*[@id=\"station\"]/div[3]/div")
	@FindBy(xpath="//*[@id=\"station\"]/div[3]/div/strong")
	public static WebElement TotalAllotted ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-planning-dashboard/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/ul/li[2]/a")
	public static WebElement StipendTab ;
	
	//@FindBy(xpath="//*[@id=\"stipend\"]/div[1]/div[1]")
	@FindBy(xpath="//*[@id=\"stipend\"]/div[1]/div[1]/strong")
	public static WebElement Highest ;
	
	//@FindBy(xpath="//*[@id=\"stipend\"]/div[1]/div[2]")
	@FindBy(xpath="//*[@id=\"stipend\"]/div[1]/div[2]/strong")
	public static WebElement Average ;
	
	//@FindBy(xpath="//*[@id=\"stipend\"]/div[1]/div[3]")
	@FindBy(xpath="//*[@id=\"stipend\"]/div[1]/div[3]/strong")
	public static WebElement Median ;
	
	//@FindBy(xpath="//*[@id=\"stipend\"]/div[1]/div[4]")
	@FindBy(xpath="//*[@id=\"stipend\"]/div[1]/div[4]/strong")
	public static WebElement Lowest ;
	
	@FindBy(xpath="/html/body/app-root/app-layout/app-planning-dashboard/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/ul/li[3]/a")
	public static WebElement FacultyTab ;
	
	//@FindBy(xpath="//*[@id=\"faculty\"]/div[1]/div[1]")
	@FindBy(xpath="//*[@id=\"faculty\"]/div[1]/div[1]/strong")
	
	public static WebElement FacultyTotal ;
	
	//@FindBy(xpath="//*[@id=\"faculty\"]/div[1]/div[1]")
	@FindBy(xpath="//*[@id=\"faculty\"]/div[1]/div[2]/strong")
	public static WebElement FacultyOnCampus ;
	
	//@FindBy(xpath="//*[@id=\"faculty\"]/div[1]/div[1]")
	@FindBy(xpath="//*[@id=\"faculty\"]/div[1]/div[3]/strong")
	public static WebElement FacultyOffCampus;
	
	//@FindBy(xpath="//*[@id=\"faculty\"]/div[1]/div[1]")
	@FindBy(xpath="//*[@id=\"faculty\"]/div[1]/div[4]/strong")
	public static WebElement FacultyAllotted ;
	
	@FindBy(xpath="//*[@id=\"faculty\"]/div[3]/div[1]/strong")
	public static WebElement FacultyAvailable ;
	
	@FindBy(xpath="//*[@id=\"faculty\"]/div[3]/div[2]/strong")
	public static WebElement FacultyAvgStationAllotted ;	
}

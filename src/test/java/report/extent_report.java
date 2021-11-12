package report;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extent_report 
{
	
	
	     ExtentHtmlReporter htmlReporter;
	     ExtentReports extent;
	     ExtentTest test;
	    
	    @Parameters("browser")
	    @BeforeTest
	    public void m1()
	    {
	    	System.out.println("genrate report");
	    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    @BeforeMethod
	    public void startReport(String OS, String browser) 
	    {
	    	
	        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"\\test-output\\testReport.html");
	        
	        
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	         
	        
	        //extent.setSystemInfo("OS");
	       // extent.setSystemInfo("Browser", browser);
	        
	        
	        htmlReporter.config().setChartVisibilityOnOpen(true);
	        htmlReporter.config().setDocumentTitle("Extent Report Demo");
	        htmlReporter.config().setReportName("Test Report");
	        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	        htmlReporter.config().setTheme(Theme.STANDARD);
	       htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	    }
	     
	    @Test
	    public void testCase1() 
	    {
	        test = extent.createTest("Test Case 1", "PASSED test case");
	        Assert.assertTrue(true);
	    }
	    
	    @Test
	    public void testCase2() 
	    
	    {
	        test = extent.createTest("Test Case 2", "PASSED test case");
	        Assert.assertTrue(true);
	    }
	    
	    @Test
	    public void testCase3() 
	    {
	        test = extent.createTest("Test Case 3", "PASSED test case");
	        Assert.assertTrue(true);
	    }
	     
	    @Test
	    public void testCase4() 
	    {
	        test = extent.createTest("Test Case 4", "PASSED test case");
	        Assert.assertTrue(true);
	    }
	     
	    @Test
	    public void testCase5() 
	    {
	        test = extent.createTest("Test Case 5", "SKIPPED test case");
	        //throw new SkipException("Skipping this test with exception");
	    }
	    
	    @Test()
		public void testCase6()
	    {
				test = extent.createTest("Test Case 6", "I'm Not Ready, please don't execute me");
			}
	   
	    @AfterMethod
	    
	public void tearDown() {
	    	
	        extent.flush();
	    }
	    
	     
	    
	    
	

}

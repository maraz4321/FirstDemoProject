package Util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import demo_Project.test.TestBase;

public class TestNGListener extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		counter = result.getName();
		String time = new SimpleDateFormat(" ,EEE HH_mm_ss a").format(new Date());
		String pass ="screenshot/"+counter+time+".png";
		TakesScreenshot sc = (TakesScreenshot)driver;
		 File src = sc.getScreenshotAs(OutputType.FILE);
		 File dest = new File(pass);
		 try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Passed... "+counter);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		counter = result.getName();
		String time = new SimpleDateFormat(" ,EEE HH_mm_ss a").format(new Date());
		String fail ="screenshot/"+counter+time+".png";
		 TakesScreenshot sc = (TakesScreenshot)driver;
		 File src = sc.getScreenshotAs(OutputType.FILE);
		 File dest = new File(fail);
			try {
				FileUtils.copyFile(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		System.out.println("Failed... :"+counter);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This was skipped "+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.SUCCESS_PERCENTAGE_FAILURE);	
		
		//this not print why?
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test is started :"+context.getStartDate());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This Test had completed.  :"+context.getEndDate());
		
	}

}

package utility;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import Utilities.Base_test;

public class Listener implements ITestListener {

//	public void onTestStart(ITestResult result) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void onTestSuccess(ITestResult result) {
//		// TODO Auto-generated method stub
//		
//	}

	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot scrShot = (TakesScreenshot) Base_test.driver;

		//Call getScreenshotAs method to create image file

		
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        System.out.println(SrcFile);
        //Move image file to new destination
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String timeString = "./ScreenShot123/"+formatter.format(timestamp) +"_Failed.png";
        File DestFile = new File(timeString);
        System.out.println(DestFile);
        try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

//	public void onTestSkipped(ITestResult result) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void onTestFailedWithTimeout(ITestResult result) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//	
//	}
//
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//		
//	}

	}
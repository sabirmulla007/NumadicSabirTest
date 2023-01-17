package testCases;


import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import webPages.QAEnggWebPage;

public class TestCaseQAEnggPage {

	//WebDriverManager.chromedriver().setup();

		WebDriver driver;
		QAEnggWebPage qapage;
		
		
		@Test
		public void qaEngineerPageValidations() {
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			
			
			
			qapage =new QAEnggWebPage(driver);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			assertTrue(qapage.verifyPageTitleValidation(driver));
			qapage.clickOnImInterested();
			assertTrue(qapage.browseResumeFieldValidation());
			assertTrue(qapage.indeedLinkValidation());
			assertTrue(qapage.verifyFisrtNameFieldValidation());
			assertTrue(qapage.salutationValidation());
			assertTrue(qapage.lastNameFieldValidation());
			assertTrue(qapage.emailFieldValidation());
			assertTrue(qapage.mobileFieldValidation());
			assertTrue(qapage.streetFieldValidation());
			assertTrue(qapage.cityFieldValidation());
			assertTrue(qapage.stateFieldValidation());
			assertTrue(qapage.zipFieldValidation());
			assertTrue(qapage.countryFieldValidation());
			assertTrue(qapage.currentEmployerFieldValidation());
			assertTrue(qapage.currentJobTitleFieldValidation());
			assertTrue(qapage.skillSetFieldValidation());
			assertTrue(qapage.currentCTCFiledValidation());
			assertTrue(qapage.expectedCTCFieldValidation());
			assertTrue(qapage.noticePeriodFieldValidation());
			assertTrue(qapage.resonForChangeFieldValidation());
			assertTrue(qapage.whyJoinNumadicfieldValidation());
			assertTrue(qapage.addEduDetailFieldValidation());
			assertTrue(qapage.institueSchoolnameFieldValidation());
			assertTrue(qapage.majorDepartmentFieldValidation());
			assertTrue(qapage.degreeFieldValidation());
			assertTrue(qapage.fromMonthEduFieldValidation());
			assertTrue(qapage.toMonthEduFieldValidation());
			assertTrue(qapage.startyYarEduFieldValidation());
			assertTrue(qapage.endYeareduFieldValidation());
			assertTrue(qapage.currentlyPersuingCheckboxValidation());
			assertTrue(qapage.clearEduFieldValidation());
			assertTrue(qapage.deleteEduFieldValidation());
			assertTrue(qapage.addExpFieldValidation());
			assertTrue(qapage.occupationFieldValidation());
			assertTrue(qapage.companyFieldValidation());
			assertTrue(qapage.summaryFieldValidation());
			assertTrue(qapage.workStartMonthFieldValidation());
			assertTrue(qapage.workEndMonthFieldValidation());
			assertTrue(qapage.workStartYearFieldValidation());
			assertTrue(qapage.workEndYearFieldValidation());
			assertTrue(qapage.currentlyWorkHereCheckBoxValidation());
			assertTrue(qapage.addMoreExpFiledValidation());
			assertTrue(qapage.deleteExpFiledValidation());
			assertTrue(qapage.clearExpFiledValidation());
			assertTrue(qapage.linkedInFiledValidation());
			assertTrue(qapage.resumeFieldValidation());
			assertTrue(qapage.cancelButtonFiledValidation());
			assertTrue(qapage.submitButtonFieldValidation());
			
		}
		
		
		
	}



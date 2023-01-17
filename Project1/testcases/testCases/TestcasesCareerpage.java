package testCases;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import webPages.CareerWebPage;

public class TestcasesCareerpage  {
	
	static CareerWebPage cPage =null;
	static WebDriver driver;
	@Test
	public void verifyHeadertext()  {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		//FileInputStream fisFileInputStream = new FileInputStream("D:\\acceleration\\Workspace(2)\\Project1\\testData");
		//Workbook workbook = new XSSFWorkbook(fisFileInputStream);

		 cPage = new CareerWebPage(driver);
		driver.get("https://jobs.numadic.com/jobs/Careers");
		assertTrue(cPage.isHeaderTextDispalyed());
		cPage.selectQaEngineer();

	}

}

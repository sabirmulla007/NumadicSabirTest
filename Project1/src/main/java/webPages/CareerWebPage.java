package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerWebPage {
	WebDriver driver;

	public CareerWebPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='JOIN OUR CREW']")
	private WebElement careerPageTitle;

	@FindBy(css = ".dropdown")
	private WebElement filterByDropdown;

	@FindBy(id = "Lyte_Drop_Item_4")
	private WebElement engineering;

	@FindBy(css = "#cw-group-Engineering > div > ul > career-website-job-listing-layout1:nth-child(3) > li > h3 > a")
	WebElement qaEngineer;

	public boolean isHeaderTextDispalyed() {
		return (careerPageTitle.isDisplayed());
	}

	public void selectQaEngineer() {

		filterByDropdown.click();
		engineering.click();
		qaEngineer.click();

	}
}

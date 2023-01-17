package webPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QAEnggWebPage {

	WebDriver driver;

	public QAEnggWebPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(css ="lyte-button#detail-page-applybtn>button>lyte-yield")
	private WebElement iMInterested;

	@FindBy(xpath ="//a[text()='Upload your resume']")
	private WebElement uploadResume;

	@FindBy(id ="zr-detail-indeed-applybtn")
	private WebElement indeedApply;

	@FindBy(css =".crc-form-field.cnl-firstname-row div div:nth-child(2)>lyte-drop-button>.dropdown")
	private WebElement salutationDD;

	@FindBy(css =".cxBorderBottom")
	private WebElement firstName;

	@FindBy(css ="div:nth-of-type(1)>div:nth-child(2)>div:nth-child(2)>div>crux-text-component>.cxElementValue div>input.cxBorderBottom ")
	private WebElement lastName;

	@FindBy(css =" crux-email-component div>.cxBorderBottom ")
	private WebElement eMail;

	@FindBy(css ="crux-phone-component div>.cxBorderBottom ")
	private WebElement mobile;

	@FindBy(css ="div:nth-of-type(2)>div:nth-child(2)>div:nth-child(1)>div>crux-text-component>.cxElementValue div>input.cxBorderBottom")
	private WebElement street;

	@FindBy(css ="div.crc-form-row.crc-rec-form_53264000000003171  input#inputId")
	private WebElement city;

	@FindBy(css ="div.crc-form-row.crc-rec-form_53264000000003173  input#inputId")
	private WebElement stateProvince;

	@FindBy(css ="div.crc-form-row.crc-rec-form_53264000000003175  input#inputId")
	private WebElement zipPostalCode;

	@FindBy(css ="div.crc-form-field #rec-form_53264000000003177  input.cxBorderBottom ")
	private WebElement country;

	@FindBy(css = "#rec-form_53264000000003181 .cxBorderBottom ")
	private WebElement currentEmployer;

	@FindBy(css = "#rec-form_53264000000003183 lyte-icon.dropdown")
	private WebElement currentJobTitleDD;

	@FindBy(css = " #addSkills")
	private WebElement skillSet;

	@FindBy(css = " #rec-form_53264000000285107 input.cxBorderBottom ")
	private WebElement currentCtc;

	@FindBy(css = " #rec-form_53264000000285115 input.cxBorderBottom ")
	private WebElement expectedCtc;

	@FindBy(css = " #rec-form_53264000000279001 input.f15 ")
	private WebElement noticePeriod;

	@FindBy(css = " #rec-form_53264000000279009 input.cxBorderBottom ")
	private WebElement reasonForChange;

	@FindBy(css = " #rec-form_53264000000279013 input.cxBorderBottom  ")
	private WebElement whyNumadic;

	@FindBy(css = " .Educational_Details  .tabular-group-add")
	private WebElement addEducationDetails;

	@FindBy(css = " .Experience_Details  .tabular-group-add")
	private WebElement addWorkExpDetails;

	@FindBy(css = ".crc-form-tabularrow.crc-tabular-text.crc-rec-form_53264000000201044 .cxBorderBottom ")
	private WebElement instituteName;

	@FindBy(css = ".crc-form-tabularrow.crc-tabular-text.crc-rec-form_53264000000201046 .cxBorderBottom")
	private WebElement majorDept;

	@FindBy(css = ".crc-form-tabularrow.crc-tabular-text.crc-rec-form_53264000000201048 .cxBorderBottom")
	private WebElement deegree;

	@FindBy(css = "#cxd-53264000000201050_1_from_month>div span ")
	private WebElement fromMonth;

	@FindBy(css = "#cxdby-53264000000201050_1_from_month>lyte-drop-item")
	private List<WebElement> months;

	@FindBy(css = "#cxdby-53264000000201050_1_from_year>lyte-drop-item")
	private List<WebElement> startYears;

	@FindBy(xpath = "//lyte-dropdown[@id='cxd-53264000000201050_1_from_year']/div/lyte-drop-button/span[text()='Year']")
	private WebElement startYear;

	@FindBy(xpath = "//lyte-dropdown[@id='cxd-53264000000201050_1_to_year']/div/lyte-drop-button/span[text()='Year']")
	private WebElement endYear;

	@FindBy(css = "#cxdby-53264000000201050_1_to_year>lyte-drop-item")
	private List<WebElement> endYears;

	@FindBy(css = "#cxd-53264000000201050_1_to_month > div.lyteDummyEventContainer > lyte-drop-button > span")
	private WebElement toMonthEdu;

	@FindBy(css = "#cxdby-53264000000201050_1_to_month>lyte-drop-item")
	private List<WebElement> tomonthsEdu;

	@FindBy(css = ".tabular-delect-btn")
	private WebElement deleteEduInfo;

	@FindBy(css = "#\\35 3264000000201052_1_tab > label > span")
	private WebElement currentlyPersuingCheckBox;

	@FindBy(css = ".Educational_Details  a[lt-prop-title='Remove all tabular data of this section']")
	private WebElement clearEduDetails;

	@FindBy(css = ".Experience_Details  a[lt-prop-title='Remove all tabular data of this section']")
	private WebElement clearExpDetails;

	@FindBy(xpath = "//div[@class='crc-form-row Experience_Details crc-section-53264000000002559_53264000000201078 crc-form-sec ']//a[text()='Add']")
	private WebElement addExpDetails;

	@FindBy(css = ".crc-form-tabularrow.crc-tabular-text.crc-rec-form_53264000000201080 .cxBorderBottom ")
	private WebElement occupation;

	@FindBy(css = ".crc-form-tabularrow.crc-tabular-text.crc-rec-form_53264000000201082 .cxBorderBottom ")
	private WebElement company;

	@FindBy(css = "#\\35 3264000000201084_1_tab > div > textarea")
	private WebElement summary;

	@FindBy(css = "#cxd-53264000000201086_1_from_month>div.lyteDummyEventContainer>lyte-drop-button>span")
	private WebElement fromMonthExp;

	@FindBy(css = "#cxd-53264000000201086_1_from_year > div.lyteDummyEventContainer > lyte-drop-button > span")
	private WebElement fromYearExp;

	@FindBy(css = " lyte-drop-body#cxdby-53264000000201086_1_from_month>lyte-drop-item")
	private List<WebElement> fromMonthsExp;

	@FindBy(css = "lyte-drop-body#cxdby-53264000000201086_1_from_year>lyte-drop-item")
	private List<WebElement> fromYearsExp;

	@FindBy(css = "#cxd-53264000000201086_1_to_month > div.lyteDummyEventContainer > lyte-drop-button > span")
	private WebElement toMonthExp;

	@FindBy(css = "lyte-drop-body#cxdby-53264000000201086_1_to_month lyte-drop-item")
	private List<WebElement> toMonthsExp;

	@FindBy(css = "#cxd-53264000000201086_1_to_year > div.lyteDummyEventContainer > lyte-drop-button > span")
	private WebElement toyearExp;

	@FindBy(css = "#cxdby-53264000000201086_1_to_year>lyte-drop-item")
	private List<WebElement> toYearsExp;

	@FindBy(css = "#\\35 3264000000201088_1_tab > label > span")
	private WebElement expChechkBox;

	@FindBy(css = "#rec-form_53264000000002559_53264000000201078 > div > div.tabular-main-div.crc-tb-0 > a")
	private WebElement deleteExp;

	@FindBy(css = "#rec-form_53264000000002559_53264000000201078 > div > div.crc-tabular-add > a")
	private WebElement addMoreExp;

	@FindBy(css = "#rec-form_111222333445 > div > lyte-input > div > input")
	private WebElement linkedIn;

	@FindBy(css = "#rec-form_53264000000017197 > div > lyte-fileupload > div > lyte-yield > lyte-file-select-area > lyte-file-message")
	private WebElement browseResume;

	@FindBy(css = "#\\35 3264000000375218 > form > div > lyte-button:nth-child(1) > button > lyte-yield")
	private WebElement cancelButton;

	@FindBy(css = "#cw-submit-btn > button > lyte-yield")
	private WebElement submitButton;

	public void clickOnImInterested() {
		
		iMInterested.click();

	}

	public boolean verifyPageTitleValidation(WebDriver driver) {
		String expectedTitle = "Numadic Iot Pvt. Ltd. - QA Engineer in";
		driver.get("https://jobs.numadic.com/jobs/Careers/53264000000375218/QA-Engineer?source=CareerSite");
		String title = driver.getTitle();
		boolean flag = expectedTitle.equalsIgnoreCase(title);
		
		return flag;
	}

	public boolean browseResumeFieldValidation() {
		boolean b1 = uploadResume.isDisplayed();
		boolean b2 = uploadResume.isEnabled();
		return (b1 && b2);

	}

	public boolean indeedLinkValidation() {
		boolean b1 = indeedApply.isDisplayed();
		boolean b2 = indeedApply.isEnabled();
		return (b1 && b2);
	}

	public boolean verifyFisrtNameFieldValidation() {

		boolean b1 = firstName.isDisplayed();
		boolean b2 = firstName.isEnabled();
		return (b1 && b2);
	}

	public boolean salutationValidation() {

		boolean b1 = salutationDD.isDisplayed();
		boolean b2 = salutationDD.isEnabled();
		return (b1 && b2);
	}

	public boolean lastNameFieldValidation() {
		boolean b1 = lastName.isDisplayed();
		boolean b2 = lastName.isEnabled();
		return (b1 && b2);
	}

	public boolean emailFieldValidation() {
		boolean b1 = eMail.isDisplayed();
		boolean b2 = eMail.isEnabled();
		return (b1 && b2);

	}

	public boolean mobileFieldValidation() {

		boolean b1 = mobile.isDisplayed();
		boolean b2 = mobile.isEnabled();
		return (b1 && b2);
	}

	public boolean streetFieldValidation() {
		boolean b1 = street.isDisplayed();
		boolean b2 = street.isEnabled();
		return (b1 && b2);
	}

	public boolean cityFieldValidation() {

		boolean b1 = city.isDisplayed();
		boolean b2 = city.isEnabled();
		return (b1 && b2);

	}

	public boolean stateFieldValidation() {

		boolean b1 = stateProvince.isDisplayed();
		boolean b2 = stateProvince.isEnabled();
		return (b1 && b2);

	}

	public boolean zipFieldValidation() {
		boolean b1 = zipPostalCode.isDisplayed();
		boolean b2 = zipPostalCode.isEnabled();
		return (b1 && b2);

	}

	public boolean countryFieldValidation() {

		boolean b1 = country.isDisplayed();
		boolean b2 = country.isEnabled();
		return (b1 && b2);

	}

	public boolean currentEmployerFieldValidation() {
		boolean b1 = currentEmployer.isDisplayed();
		boolean b2 = currentEmployer.isEnabled();
		return (b1 && b2);

	}

	public boolean currentJobTitleFieldValidation() {

		boolean b1 = currentJobTitleDD.isDisplayed();
		boolean b2 = currentJobTitleDD.isEnabled();
		return (b1 && b2);
	}

	public boolean skillSetFieldValidation() {
		boolean b1 = skillSet.isDisplayed();
		boolean b2 = skillSet.isEnabled();
		return (b1 && b2);

	}

	public boolean currentCTCFiledValidation() {

		boolean b1 = currentCtc.isDisplayed();
		boolean b2 = currentCtc.isEnabled();
		return (b1 && b2);
	}

	public boolean expectedCTCFieldValidation() {
		boolean b1 = expectedCtc.isDisplayed();
		boolean b2 = expectedCtc.isEnabled();
		return (b1 && b2);
	}

	public boolean noticePeriodFieldValidation() {

		boolean b1 = noticePeriod.isDisplayed();
		boolean b2 = noticePeriod.isEnabled();
		return (b1 && b2);
	}

	public boolean resonForChangeFieldValidation() {

		boolean b1 = reasonForChange.isDisplayed();
		boolean b2 = reasonForChange.isEnabled();
		return (b1 && b2);
	}

	public boolean whyJoinNumadicfieldValidation() {
		boolean b1 = whyNumadic.isDisplayed();
		boolean b2 = whyNumadic.isEnabled();
		return (b1 && b2);
	}

	public boolean addEduDetailFieldValidation() {

		boolean b1 = addEducationDetails.isDisplayed();
		boolean b2 = addEducationDetails.isEnabled();
		addEducationDetails.click();
		return (b1 && b2);

	}

	public boolean institueSchoolnameFieldValidation() {
		boolean b1 = instituteName.isDisplayed();
		boolean b2 = instituteName.isEnabled();
		return (b1 && b2);

	}

	public boolean majorDepartmentFieldValidation() {

		boolean b1 = majorDept.isDisplayed();
		boolean b2 = majorDept.isEnabled();
		return (b1 && b2);

	}

	public boolean degreeFieldValidation() {

		boolean b1 = deegree.isDisplayed();
		boolean b2 = deegree.isEnabled();
		return (b1 && b2);
	}

	public boolean fromMonthEduFieldValidation() {
		boolean b1 = fromMonth.isDisplayed();
		boolean b2 = fromMonth.isEnabled();
		return (b1 && b2);
	}

	public boolean toMonthEduFieldValidation() {

		boolean b1 = toMonthEdu.isDisplayed();
		boolean b2 = toMonthEdu.isEnabled();
		return (b1 && b2);
	}

	public boolean startyYarEduFieldValidation() {
		boolean b1 = startYear.isDisplayed();
		boolean b2 = startYear.isEnabled();
		return (b1 && b2);
	}

	public boolean endYeareduFieldValidation() {

		boolean b1 = endYear.isDisplayed();
		boolean b2 = endYear.isEnabled();
		return (b1 && b2);

	}

	public boolean currentlyPersuingCheckboxValidation() {

		boolean b1 = currentlyPersuingCheckBox.isDisplayed();
		boolean b2 = currentlyPersuingCheckBox.isEnabled();
		return (b1 && b2);
	}

	public boolean clearEduFieldValidation() {

		boolean b1 = clearEduDetails.isDisplayed();
		boolean b2 = clearEduDetails.isEnabled();
		return (b1 && b2);
	}

	public boolean deleteEduFieldValidation() {

		boolean b1 = deleteEduInfo.isDisplayed();
		boolean b2 = deleteEduInfo.isEnabled();
		return (b1 && b2);
	}

	public boolean addExpFieldValidation() {

		boolean b1 = addExpDetails.isDisplayed();
		boolean b2 = addExpDetails.isEnabled();
		addExpDetails.click();
		return (b1 && b2);
	}

	public boolean occupationFieldValidation() {

		boolean b1 = occupation.isDisplayed();
		boolean b2 = occupation.isEnabled();

		return (b1 && b2);
	}

	public boolean companyFieldValidation() {

		boolean b1 = company.isDisplayed();
		boolean b2 = company.isEnabled();

		return (b1 && b2);
	}

	public boolean summaryFieldValidation() {

		boolean b1 = summary.isDisplayed();
		boolean b2 = summary.isEnabled();

		return (b1 && b2);
	}

	public boolean workStartMonthFieldValidation() {

		boolean b1 = fromMonthExp.isDisplayed();
		boolean b2 = fromMonthExp.isEnabled();

		return (b1 && b2);
	}

	public boolean workEndMonthFieldValidation() {

		boolean b1 = toMonthExp.isDisplayed();
		boolean b2 = toMonthExp.isEnabled();

		return (b1 && b2);
	}

	public boolean workStartYearFieldValidation() {

		boolean b1 = fromYearExp.isDisplayed();
		boolean b2 = fromYearExp.isEnabled();

		return (b1 && b2);
	}

	public boolean workEndYearFieldValidation() {

		boolean b1 = toyearExp.isDisplayed();
		boolean b2 = toyearExp.isEnabled();

		return (b1 && b2);
	}

	public boolean currentlyWorkHereCheckBoxValidation() {

		boolean b1 = expChechkBox.isDisplayed();
		boolean b2 = expChechkBox.isEnabled();

		return (b1 && b2);
	}

	public boolean addMoreExpFiledValidation() {

		boolean b1 = addMoreExp.isDisplayed();
		boolean b2 = addMoreExp.isEnabled();

		return (b1 && b2);

	}

	public boolean deleteExpFiledValidation() {

		boolean b1 = deleteExp.isDisplayed();
		boolean b2 = deleteExp.isEnabled();

		return (b1 && b2);

	}

	public boolean clearExpFiledValidation() {

		boolean b1 = clearExpDetails.isDisplayed();
		boolean b2 = clearExpDetails.isEnabled();

		return (b1 && b2);
	}

	public boolean linkedInFiledValidation() {

		boolean b1 = linkedIn.isDisplayed();
		boolean b2 = linkedIn.isEnabled();

		return (b1 && b2);

	}

	public boolean resumeFieldValidation() {

		boolean b1 = browseResume.isDisplayed();
		boolean b2 = browseResume.isEnabled();

		return (b1 && b2);

	}

	public boolean cancelButtonFiledValidation() {
		boolean b1 = cancelButton.isDisplayed();
		boolean b2 = cancelButton.isEnabled();

		return (b1 && b2);

	}

	public boolean submitButtonFieldValidation() {
		boolean b1 = submitButton.isDisplayed();
		boolean b2 = submitButton.isEnabled();

		return (b1 && b2);
	}

}
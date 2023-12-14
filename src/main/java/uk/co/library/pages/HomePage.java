package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utilities.Utility;

/**
 * Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin,
 * salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
 * Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance),
 * clickOnMoreSearchOptionLink(), enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary),
 * selectSalaryType(String sType), selectJobType(String jobType), clickOnFindJobsButton().
 */

public class HomePage extends Utility {
    //========================== Locators ============================//

    // Switch to frame
    @CacheLookup
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;

    //Accept All Button
    @CacheLookup
    @FindBy(xpath = "//span[@class='mat-button-wrapper']//span[text()='Accept All']")
    WebElement acceptAllBtn;
    //jobTitle
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;
    // location
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location1;
    // distanceDropDown
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    // moreSearchOptionsLink
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    // salaryMin
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    // salaryMax
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    // salaryTypeDropDown
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    // jobTypeDropDown
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    // findJobsBtn
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    //======================== Methods ================================//

    public void clickOnAcceptAllButton(){
        switchToIframe(iframe);
        clickOnElement(acceptAllBtn);
        driver.switchTo().defaultContent();
    }

    public void enterJobTitle(String job){
        sendTextToElement(jobTitle, job);
    }

    public void enterLocation(String location){
        sendTextToElement(location1, location);
    }
    public void selectDistance(String distance){
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionsLink);
    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin, minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax, maxSalary);
    }
    public void selectSalaryType(String sType){
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
    }
    public void selectJobType(String jobType){
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }
    public void clickOnFindJobsButton(){
        clickOnElement(findJobsBtn);
    }
}

package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {
    /**
     * verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin,
     * String salaryMax, String salaryType, String jobType, String result).
     * enter job title 'jobTitle'
     * enter Location 'location'
     * select distance 'distance'
     * click on moreSearchOptionsLink
     * enter salaryMin 'salaryMin'
     * enter salaryMax 'salaryMax'
     * select salaryType 'salaryType'
     * select jobType 'jobType'
     * click on 'Find Jobs' button
     * verify the result 'result'
     */
    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"}, dataProvider = "JobSearchData", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result) {
        //Click on Accept All Button
        homePage.clickOnAcceptAllButton();
        //enter job title 'jobTitle'
        homePage.enterJobTitle(jobTitle);
        //enter Location 'location'
        homePage.enterLocation(location);
        //select distance 'distance'
        homePage.selectDistance(distance);
        //click on moreSearchOptionsLink
        homePage.clickOnMoreSearchOptionLink();
        //enter salaryMin 'salaryMin'
        homePage.enterMinSalary(salaryMin);
        //enter salaryMax 'salaryMax'
        homePage.enterMaxSalary(salaryMax);
        //select salaryType 'salaryType'
        homePage.selectSalaryType(salaryType);
        //select jobType 'jobType'
        homePage.selectJobType(jobType);
        //click on 'Find Jobs' button
        homePage.clickOnFindJobsButton();
        //verify the result 'result'
        resultPage.verifyTheResulTextOnResultPage(result);
    }
}

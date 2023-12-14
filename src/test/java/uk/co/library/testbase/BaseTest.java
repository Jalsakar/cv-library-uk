package uk.co.library.testbase;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.library.propertyreader.PropertyReader;
import uk.co.library.utilities.Utility;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    public String randomEmail = randomEmail();
    By emailAddressOption = By.id("Email");

    public void enterEmailAddress() {
        sendTextToElement(emailAddressOption, randomEmail);
    }


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        closeBrowser();
    }
}

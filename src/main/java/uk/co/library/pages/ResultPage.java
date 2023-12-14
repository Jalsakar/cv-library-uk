package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utilities.Utility;

/**
 * Locators - resultText
 * Method - verifyTheResults(String expected)
 */

public class ResultPage extends Utility {

    //========================== Locators ============================//

    //verify the result 'result'
    @CacheLookup
    @FindBy(className = "search-header__title")
    WebElement resultText;

    //======================== Methods ================================//

    //verify the result 'result'
    public void verifyTheResulTextOnResultPage(String result) {
        verifyThatTextIsDisplayed(resultText, result);
        System.out.println(result);
    }
}

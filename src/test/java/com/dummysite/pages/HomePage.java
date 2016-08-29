
package com.dummysite.pages;

import com.dummysite.framework.BasePage;
import com.dummysite.html.ComponentIds;
import org.openqa.selenium.WebDriver;

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author jdoriya 09-Jul-2016
 *
 */
public class HomePage extends BasePage {

    /**
     * @param driver
     */
    public HomePage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public void navigateToProsperHomePage() {
        waitForXPathThenClick("Apply For A Loan", ComponentIds.HOMEPAGE.button_APPLY_FOR_A_LOAN);
    }
}


package com.functionaltests;

import com.dummysite.pages.HomePage;
import com.dummysite.pages.RegistrationPage;
import com.dummysite.test.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author jdoriya 09-Jul-2016
 *
 */
public class DummyTest extends TestBase {

    protected static final Logger LOG = Logger.getLogger(DummyTest.class);
    @Test
    void test() {
        LOG.info("Test Started Now");
        HomePage homePage = new HomePage(driver);
        homePage.navigateToProsperHomePage();

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.test();
    }

}

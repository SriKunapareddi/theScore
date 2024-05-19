package org.example;

import org.example.Pages.HomePage;
import org.example.Pages.LeaguePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * Unit test for theScore App.
 */

public class LeagueTest
    extends BaseTest
{
    @DataProvider(name = "leagues")
    public Object[][] createLeaguesData() {
     return new Object[][] {
            { "NFL", "Standings" },
            { "NBA", "Stats" }
    };
}

    @Test(dataProvider = "leagues")
    public void testLeaguePage(String leagueName, String subTab) {
        HomePage homePage = new HomePage(driver);
        homePage.openLeague(leagueName);

        LeaguePage leaguePage = new LeaguePage(driver);
        Assert.assertTrue(leaguePage.isCorrectPage(leagueName), "Incorrect league page opened.");

        leaguePage.openSubTab(subTab);
        Assert.assertTrue(leaguePage.isCorrectSubTab(subTab), "Incorrect sub-tab opened.");
        Assert.assertTrue(leaguePage.isDataDisplayedCorrectly(), "Data is not displayed correctly.");

        leaguePage.navigateBack();
        Assert.assertTrue(homePage.isCorrectPage(), "Did not navigate back to the home page.");
    }
}

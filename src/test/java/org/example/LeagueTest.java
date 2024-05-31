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
        };
    }

    @Test(dataProvider = "leagues")
    public void testLeaguePage(String leagueName, String subTab) {
        HomePage homePage = new HomePage(driver);
        homePage.waitForApptoLoad();
        homePage.getStarted_Click();
        homePage.sportSelection();
        homePage.continue_Button();
        homePage.mayBeLater_button();
        homePage.favTeamSelection();
        homePage.continue_Button();
        homePage.continue_Button();
        homePage.mayBeLater_button();
        homePage.Close_button();
        System.out.println(leagueName);
        LeaguePage leaguePage = new LeaguePage(driver);
        LeaguePage.getNFLText(leagueName);



        // Tap on a sub-tab and verify it opens correctly
        leaguePage.navtoLeagueSection();
        Assert.assertTrue(leaguePage.isStandingsTabDisplayed(), "League section did not open correctly");

        leaguePage.navTo_Standing_Tab();
        Assert.assertEquals(leaguePage.verifySelected_SubTab(),"AFC");
        //Assert.assertTrue(leaguePage.isDataDisplayedCorrectly(), "Data is not displayed correctly.");

        leaguePage.back_button_NAV();
        Assert.assertEquals(leaguePage.getNFLText("NFL"), "NFL");
    }
}

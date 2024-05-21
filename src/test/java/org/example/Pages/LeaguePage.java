package org.example.Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LeaguePage {
    private static AndroidDriver<MobileElement> driver;

    public LeaguePage(AndroidDriver<MobileElement> driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isLeaguePageDisplayed(String leagueName) {
        // Add appropriate locator to check if league page is displayed
        return driver.findElement(By.id("leaguePageElementId")).isDisplayed();
    }


    public void openStatsTab() {
        // Assuming there's a method to locate the stats tab
        MobileElement statsTabElement = driver.findElement(By.xpath("//android.widget.TextView[@text='Stats']"));
        statsTabElement.click();
    }


    public boolean isStatsTabDisplayed() {
        // Add appropriate locator to check if stats tab is displayed
        return driver.findElement(By.id("statsTabElementId")).isDisplayed();
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public boolean isCorrectPage(String leagueName) {
        return driver.getTitle().contains(leagueName);
    }

    public void openSubTab(String tabName) {
        driver.findElement(By.xpath("//a[contains(text(), '" + tabName + "')]")).click();
    }

    public boolean isCorrectSubTab(String tabName) {
        return driver.findElement(By.xpath("//a[contains(@class, 'active') and contains(text(), '" + tabName + "')]")) != null;
    }

    public void navtoLeagueSection() {
        MobileElement leagueSec = driver.findElement(By.xpath("//android.widget.TextView[@text='NFL']"));
        leagueSec.click();
    }

    public static String getNFLText(String leagueName) {
        MobileElement nflText = driver.findElement(By.xpath("//android.widget.TextView[@text='"+leagueName+"']"));
        return nflText.getText();
    }

    public String verifySelected_League() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
        MobileElement leagueslctd = driver.findElement(By.xpath("//android.widget.TextView[@text='NFL Football']"));
        return leagueslctd.getText();
    }

    public void navTo_Standing_Tab() {
        MobileElement StndTab = driver.findElement(By.xpath("//android.widget.TextView[@text='STANDINGS']"));
        StndTab.click();
    }

    public String verifySelected_SubTab() {
        MobileElement subTab = driver.findElement(By.xpath("//android.widget.TextView[@text='AFC']"));
        return subTab.getText();
    }

    public void back_button_NAV() {
        MobileElement backBtn = driver.findElement(By.className("android.widget.ImageButton"));
        backBtn.click();
    }


}

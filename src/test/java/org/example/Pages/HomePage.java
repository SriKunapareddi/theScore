package org.example.Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage {
    private AndroidDriver<MobileElement> driver;

    public HomePage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LeaguePage openLeague(String leagueName) {
        // Assuming there's a method to locate the league by name
        MobileElement leagueElement = driver.findElement(By.xpath("//android.widget.TextView[@text='" + leagueName + "']"));
        leagueElement.click();
        return new LeaguePage(driver);
    }

    public void getStarted_Click() {
        MobileElement getStarted = driver.findElement(By.xpath("//android.widget.TextView[@text='Get Started']"));
        getStarted.click();
    }

    public void waitForApptoLoad() {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    public boolean isHomePageDisplayed() {
        // Add appropriate locator to check if home page is displayed
        return driver.findElement(By.id("homePageElementId")).isDisplayed();
    }

    public void openLeagueBroswer(String leagueName) {
        driver.findElement(By.xpath("//a[contains(text(), '" + leagueName + "')]")).click();
    }

    public void openTeam(String teamName) {
        driver.findElement(By.xpath("//a[contains(text(), '" + teamName + "')]")).click();
    }

    public void openPlayer(String playerName) {
        driver.findElement(By.xpath("//a[contains(text(), '" + playerName + "')]")).click();
    }

    public boolean isCorrectPage() {
        driver.findElement(By.xpath("//a[contains(text(), '" + isCorrectPage() + "')]")).click();
        return false;
    }

    public void sportSelection() {
        MobileElement NFLFootball = driver.findElement(By.xpath("//android.widget.TextView[@text='NFL Football']"));
        NFLFootball.click();
    }

    public void continue_Button() {
        MobileElement continuebtn = driver.findElement(By.xpath("//*[@resource-id='com.fivemobile.thescore:id/btn_primary']"));
        continuebtn.click();
    }

    public void mayBeLater_button() {
        MobileElement mayBLaterbtn = driver.findElement(By.xpath("//android.widget.TextView[@text='Maybe Later']"));
        mayBLaterbtn.click();
    }

    public void favTeamSelection() {
        MobileElement tmlTeam = driver.findElement(By.xpath("//android.widget.TextView[@text='Toronto Maple Leafs']"));
        tmlTeam.click();

    }

    public void Done_button() {
        MobileElement donebtn = driver.findElement(By.xpath("//android.widget.TextView[@text='Done']"));
        donebtn.click();
    }

    public void Close_button() {
        MobileElement closebtn = driver.findElement(By.xpath("//*[@resource-id='com.fivemobile.thescore:id/dismiss_modal']"));
        closebtn.click();
        }

}


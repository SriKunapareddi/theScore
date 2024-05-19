package org.example.Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LeaguePage {
    private AndroidDriver<MobileElement> driver;

    public LeaguePage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
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

    public boolean isDataDisplayedCorrectly() {
        // Add checks for data validation
        return true;
    }

    public void navigateBack() {
        driver.navigate().back();
    }
}


package org.example.Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage {
    private AndroidDriver<MobileElement> driver;

    public HomePage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void openLeague(String leagueName) {
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
}


package com.autotrader.pages;


import com.autotrader.utilities.CommonMethods;
import com.autotrader.utilities.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AutoTraderPage extends CommonMethods {

    @FindBy(xpath = "//html//body//header//div//div//nav//ul//li//a[contains(text(),'Used Cars')]")
    public WebElement usedCars;


    public void clickOnUsedCars() {
        MyDriver.get().manage().deleteAllCookies();
        usedCars.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {
    private  static  final Logger log = LogManager.getLogger(HomePage.class);
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

     /*By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");*/

    public void clickOnLoginLink() {
        log.info("Clicking on login link..");
        clickOnElement(loginLink);
    }


    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

}

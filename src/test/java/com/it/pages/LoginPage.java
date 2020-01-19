package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(name = "login")
    private WebElement inputLogin;

    @FindBy(name = "pass")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@tabindex='5']")
    private WebElement btnLogin;

    public void login(String username, String password) {
        inputLogin.sendKeys(username);
        inputPassword.sendKeys(password);
        btnLogin.click();
    }
}

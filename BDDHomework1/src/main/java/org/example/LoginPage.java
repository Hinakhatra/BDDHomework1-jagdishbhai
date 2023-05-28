package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{
   // private By _loginButton =By.xpath("//a[contains(@class,'ico-login')]");
    private By _loginButton =By.cssSelector("a.ico-login");
    private By _emailAddress =By.xpath("//input[contains(@class,'email')]");
    private By _password =By.xpath("//input[contains(@class,'password')]");
    private By _LOGININButton =By.xpath("//button[starts-with(@class,'button-1 login-button')]");
LoadProp loadProp =new LoadProp();

    public void enterLoginDetails() {
        //click on login button
        clickOnElement(_loginButton);
        //Type  email address
        typeText((_emailAddress),loadProp.getProperty("emailAddressNew"));
        //Type password
        typeText((_password),loadProp.getProperty("password"));
        //click on LOG IN button
        clickOnElement(_LOGININButton);
    }
}

package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{
   // static String expectedRegistrationCompleteMsg = "Your registration completed";
    // Write result message xpath
    private By _getMessage =By.xpath("//div[@class='result']");
    LoadProp loadProp =new LoadProp();

    public void VerifyUserRegisterSuccessfully() {
      //  String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
       // Assert.assertEquals(actualMessage, expectedRegistrationCompleteMsg, "Registration is not working");

        Assert.assertEquals(getTextFromElement(_getMessage),loadProp.getProperty("expectedRegistrationCompleteMsg"));

    }
}

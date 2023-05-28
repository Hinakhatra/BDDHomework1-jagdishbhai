package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResultPage extends Utils{

  // Write xpath
   private By _userGetMessage = By.xpath("//div[@class='result']");
    LoadProp loadProp = new LoadProp();
    public void VerifyUserSendEmailFriendsSuccessfully(){
        // Get result message
        Assert.assertEquals(getTextFromElement(_userGetMessage),loadProp.getProperty("expectedReferProductMessage"));
    }
}

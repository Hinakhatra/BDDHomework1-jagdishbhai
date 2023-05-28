package org.example;

import org.openqa.selenium.By;

public class EmailAFriendPage extends Utils{
    private By _emailAFriend  = By.className("email-a-friend");
    private By _friendEmailAddress = By.className("friend-email");
   private By _writeMessage = By.id("PersonalMessage");

    private By _sendEmail = By.name("send-email");
    LoadProp loadProp =new LoadProp();

    public void enterSendFriendMailDetails(){
        //click on email a friend
        clickOnElement(_emailAFriend );
        //Enter friend email
        typeText(_friendEmailAddress,loadProp.getProperty("friendEmail"));
        //type a message
        typeText(_writeMessage,loadProp.getProperty("writeMessage"));
        //click on send email button
        clickOnElement(_sendEmail);
    }
}

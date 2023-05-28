package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Utils{
    private By _firstName  = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _emailAddress = By.name("Email");
    private By _Password = By.id("Password");
    private By _ConfirmPassword =By.id("ConfirmPassword") ;
    private By _registerButton =By.id("register-button");
    private By _dayOfBirth =By.xpath("//select[@name='DateOfBirthDay']");
    private By _monthOfBirth = By.xpath("//select[@name='DateOfBirthMonth']");
    private  By _yearOfBirth =By.xpath("//select[@name='DateOfBirthYear']");
    LoadProp loadProp =new LoadProp();


    public void enterRegistrationDetails(){
        //enter first name
        typeText(_firstName, loadProp.getProperty("firstName"));
        //enter last name
        typeText(_lastName,loadProp.getProperty("lastName"));
         //type date of birth
        selectDropDownElementByValue((_dayOfBirth),loadProp.getProperty("birthDate"));
        //type month of birth
        selectDropDownElementByIndex((_monthOfBirth),Integer.parseInt(loadProp.getProperty("birthMonth")));
        //type year of birth
        selectDropDownElementByText(_yearOfBirth,loadProp.getProperty("birthYear"));
        //type email address
        typeText(_emailAddress,loadProp.getProperty("emilAddress")+timestamp()+"@gmail.com");
        //type password
        typeText( _Password,loadProp.getProperty("password"));
        //type confirm password
        typeText(_ConfirmPassword,loadProp.getProperty("confirmPassword"));
        //click on register submit button
        clickOnElement(_registerButton);
    }
    public void enterRegistrationNewDetails(){
        //enter first name
        typeText(_firstName,loadProp.getProperty("firstName"));
        //enter last name
        typeText(_lastName,loadProp.getProperty("lastName"));
        //type date of birth
        selectDropDownElementByValue((_dayOfBirth),loadProp.getProperty("birthDate"));
        //type month of birth
        selectDropDownElementByIndex((_monthOfBirth),Integer.parseInt(loadProp.getProperty("birthMonth")));
        //type year of birth
        selectDropDownElementByText(_yearOfBirth,loadProp.getProperty("birthYear"));
        //type email address
        typeText(_emailAddress,loadProp.getProperty("emailAddressNew"));
        //type password
        typeText( _Password,loadProp.getProperty("password"));
        //type confirm password
        typeText(_ConfirmPassword,loadProp.getProperty("confirmPassword"));
        //click on register submit button
        clickOnElement(_registerButton);
    }
}

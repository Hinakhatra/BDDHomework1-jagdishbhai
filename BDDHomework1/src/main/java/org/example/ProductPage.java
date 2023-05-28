package org.example;

import org.openqa.selenium.By;

public class ProductPage extends Utils{
    //click on product

   // private By _Product =By.xpath("//div[contains(@class,'product-name')]//h1");
 //  private By _Product =By.xpath("//a[@ href=/apple-macbook-pro-13-inch]");
    private By _Product =By.linkText("Apple MacBook Pro 13-inch");
    public void VerifyUserSelectProductSuccessful(){
        clickOnElement( _Product);
    }

}

package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage extends BaseClass {
    @FindBy(xpath="//span[normalize-space()='I confirm my order']")
    WebElement confirmOrderBtn;

    public OrderSummaryPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public OrderConfirmationPage clickOnConfirmOrder() throws Throwable{
        Action.click(getDriver(),confirmOrderBtn);
        return new OrderConfirmationPage();
    }
}

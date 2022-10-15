package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebTablesPage extends BasePage{

/*
for log in
 */
    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    // for dropdown
    @FindBy(id = "month")
    public WebElement monthSelect;

    /*
    for order page
     */

    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderButton;

    @FindBy(css = "select[name='product']")
    public WebElement product;

    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(xpath = "//input[contains(@placeholder, 'Enter the price')]")
    public WebElement price;

    @FindBy(xpath = "//input[contains(@placeholder, 'Enter the discount')]")
    public WebElement discount;

    @FindBy(xpath = "//button[.='Calculate']/..//input")
    public WebElement total;

    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculate;

    @FindBy(css = "input[placeholder='Full name of the customer']")
    public WebElement customerName;

    @FindBy(css = "input[name='street']")
    public WebElement street;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "zip")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@type='radio' and @name='card']/..")
    public List<WebElement> cards;

    @FindBy(css = "input[placeholder='The number on the card']")
    public WebElement cardNumber;

    @FindBy(name = "cardExp")
    public WebElement expDate;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrder;

    @FindBy(xpath = "//table[@class='table is-fullwidth']//tbody//td")
    public WebElement customerInTable;










}

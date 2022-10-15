package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage extends BasePage{
//    public WikiPage() {
//        super();
//    }

    @FindBy(id = "searchInput")
    public WebElement searchBox;

    @FindBy(css = ".mw-page-title-main")
    public WebElement header;

    @FindBy(css = ".fn")
    public WebElement imageHeader;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

}

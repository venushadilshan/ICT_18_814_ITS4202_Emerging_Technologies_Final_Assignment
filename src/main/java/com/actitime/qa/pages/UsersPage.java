package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersPage extends TestBase  {
    @FindBy(xpath = "//div[text()='New User']")
    private WebElement newUserButton;

    @FindBy(xpath = "//input[@id='createUserPanel_firstNameField']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='createUserPanel_lastNameField']")
    private WebElement secondNameInput;

    @FindBy(xpath = "//input[@id='createUserPanel_emailField']")
    private WebElement emailInput;

    @FindBy(xpath = "//div[text()='Save & Send Invitation']")
    private WebElement submitButton;


    @FindBy(xpath = "//span[text()='Close']")
    private WebElement closeLink;






    public UsersPage() {
        PageFactory.initElements(driver, this);
    }


    public void clickOnNewUserButton() {

        newUserButton.click();
    }


    public void fillUserData (String fName, String lName, String email){

        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement fNameTextBox = wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
        WebElement sNameTexBox = wait.until(ExpectedConditions.elementToBeClickable(secondNameInput));
        WebElement emailTexBox = wait.until(ExpectedConditions.elementToBeClickable(emailInput));
        fNameTextBox.sendKeys(fName);
        sNameTexBox.sendKeys(lName);
        emailTexBox.sendKeys(email);



    }

    public void clickSubmitButton()
    {
       // WebDriverWait wait = new WebDriverWait(driver, 20); // wait for up to 10 seconds
      //  WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        //saveButton.click();
        submitButton.click();

    }

    public void closeModal()
    {
        WebDriverWait wait = new WebDriverWait(driver, 20); // wait for up to 10 seconds
          WebElement closeLinkButton = wait.until(ExpectedConditions.elementToBeClickable(closeLink));
        //saveButton.click();
        closeLinkButton.click();

    }



}

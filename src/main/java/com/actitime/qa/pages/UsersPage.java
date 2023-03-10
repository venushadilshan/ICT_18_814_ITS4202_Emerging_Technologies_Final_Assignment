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
        WebDriverWait wait = new WebDriverWait(driver, 15);
        firstNameInput = wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
        secondNameInput = wait.until(ExpectedConditions.elementToBeClickable(secondNameInput));
        emailInput = wait.until(ExpectedConditions.elementToBeClickable(emailInput));
    }


    public void fillUserData (String fName, String lName, String email){


        firstNameInput.sendKeys(fName);
        secondNameInput.sendKeys(lName);
        emailInput.sendKeys(email);
        //test



    }

    public void clickSubmitButton()
    {
       // WebDriverWait wait = new WebDriverWait(driver, 20); // wait for up to 10 seconds
      //  WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        //saveButton.click();
        submitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 20); // wait for up to 10 seconds
        closeLink = wait.until(ExpectedConditions.elementToBeClickable(closeLink));

    }

    public void closeModal()
    {

        //saveButton.click();
        closeLink.click();

    }



}

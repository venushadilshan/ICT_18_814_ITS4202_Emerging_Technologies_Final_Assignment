package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.entities.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersPage extends TestBase  {
    @FindBy(xpath = "//div[text()='New User']")
    private WebElement newUserButton;


    //create user input fields
    @FindBy(xpath = "//input[@id='createUserPanel_firstNameField']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='createUserPanel_lastNameField']")
    private WebElement secondNameInput;

    @FindBy(xpath = "//input[@id='createUserPanel_emailField']")
    private WebElement emailInput;


    //submit button
    @FindBy(xpath = "//div[text()='Save & Send Invitation']")
    private WebElement submitButton;

    //close side panel button
    @FindBy(xpath = "//span[text()='Close']")
    private WebElement closeLink;

    public UsersPage() {
        PageFactory.initElements(driver, this);
    }

    //click on create new user button
    public void clickOnNewUserButton() {
        newUserButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        firstNameInput = wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
        secondNameInput = wait.until(ExpectedConditions.elementToBeClickable(secondNameInput));
        emailInput = wait.until(ExpectedConditions.elementToBeClickable(emailInput));
    }

    //fill put user data to input fields
    public void fillUserData (UserData userData){
        firstNameInput.sendKeys(userData.getfName());
        secondNameInput.sendKeys(userData.getlName());
        emailInput.sendKeys(userData.getEmail());
    }

    //click on save and send invitation button
    public void clickSubmitButton()
    {
        submitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        closeLink = wait.until(ExpectedConditions.elementToBeClickable(closeLink));
    }

    public void closeModal()
    {
        closeLink.click();
    }



}

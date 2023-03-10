package com.actitime.qa.testcases;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.UsersPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateUserTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    UsersPage usersPage;

    public CreateUserTest() {
        super();
    }


    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
        usersPage = homePage.clickOnUsersLink();
    }


    @Test(priority = 1)
    public void clickOnNewUserButton() {
        this.usersPage.clickOnNewUserButton();
    }

   /* @Test(priority = 2)
    public void fillUserData() throws InterruptedException {
        this.usersPage.clickOnNewUserButton();
        WebDriverWait wait = new WebDriverWait(driver, 15); // wait for up to 10 seconds
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='createUserPanel_firstNameField']")));

        element.sendKeys("lalala lalala");
    }*/


    @Test(priority = 2)
    public void InsertUserData() throws InterruptedException {
        this.usersPage.clickOnNewUserButton();
        usersPage.fillUserData("venusha", "test", "test@test.com");
       usersPage.clickSubmitButton();
       usersPage.closeModal();

    }
/*

    @Test(priority = 3)
    public void saveUser() throws InterruptedException {
        this.usersPage.clickSubmitButton();


    }
*/

    @AfterMethod
    public void tearDown() {

   //driver.quit();
    }


}

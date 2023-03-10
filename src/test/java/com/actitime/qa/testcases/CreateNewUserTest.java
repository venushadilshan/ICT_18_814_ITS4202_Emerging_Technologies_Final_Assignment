package com.actitime.qa.testcases;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.entities.UserData;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.UsersPage;
import com.actitime.qa.util.ReadUserDataUtil;
import com.opencsv.exceptions.CsvValidationException;
import org.testng.annotations.*;

import java.io.IOException;


public class CreateNewUserTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    UsersPage usersPage;

    public CreateNewUserTest() {
        super();
    }


    @BeforeSuite
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
        usersPage = homePage.clickOnUsersLink();
    }

    //click on new create new user tab
    @Test(priority = 1)
    public void clickOnNewUserButton() {
        this.usersPage.clickOnNewUserButton();
    }

    //insert user data by reading the csv file
    @Test(priority = 2)
    public void InsertUserData() throws CsvValidationException, IOException {
        UserData userData = ReadUserDataUtil.getUserData();
        usersPage.fillUserData(userData);

    }
    //click on save and send invitation button
    @Test(priority = 3, dependsOnMethods = {"InsertUserData"})
    public void saveUser() {
        this.usersPage.clickSubmitButton();

    }

    //close the side panel
    @Test(priority = 4, dependsOnMethods = {"saveUser"})
    public void closePanel() {
        this.usersPage.closeModal();

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}

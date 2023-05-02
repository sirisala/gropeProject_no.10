package org.example;

import com.driver.DriverClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver d= DriverClass.setUpBrowser("chrome","https://www.tcl.com/in/en");

    @Test(priority = 1)
    public void VerifyProfileTest() throws InterruptedException {

        Profile p = PageFactory.initElements(d,Profile.class);
        p.testProfile();
    }
    @Test(priority = 2)
    public void pressLogin(){
        LoginButton lb=  PageFactory.initElements(d, LoginButton.class);
        try{
            lb.pressloginbtn();
        }catch (Exception e){
            System.out.println("Not entered any Credentails");
        }
    }

    @Test(priority = 3)
    public void selectProduct()  {
        Products pd = PageFactory.initElements(d,Products.class);
        try {
            pd.selectProduct();
        }
        catch (Exception e){
            System.out.println("Not able to select the product Dropdown module");
        }
    }
    @Test(priority = 4)
    public void close(){
        CloseWondow c = PageFactory.initElements(d,CloseWondow.class);
        try {
            c.closethewindow();
        }catch (Exception e){
            System.out.println("Window is not closed");
        }
    }
}

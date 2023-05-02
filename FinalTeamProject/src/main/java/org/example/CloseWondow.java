package org.example;

import org.openqa.selenium.WebDriver;

public class CloseWondow {
    WebDriver driver;


    public CloseWondow(WebDriver driver){
        this.driver=driver;
    }

    public void closethewindow(){
        driver.close();
    }
}

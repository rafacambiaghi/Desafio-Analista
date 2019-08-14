package Funcao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acesso {
    WebDriver driver;



    public Acesso(WebDriver driver){
        this.driver = driver;
    }


    public PageObjects acesso(String url) {


        driver.get(url);
        return new PageObjects(driver);

    }


}

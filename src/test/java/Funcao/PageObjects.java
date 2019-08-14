package Funcao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {

    WebDriver driver;
    By pesquisa = By.name("q");
    By btnPesquisar = By.name("btnK");
    By titleText =By.className("LC20lb");
    By login = By.name("btnLogin");
    By title =By.className("homepage push");


    public PageObjects(WebDriver driver){
        this.driver = driver;
    }

    public  PageObjects digitar(String strUserName) {
        WebElement searchBox = driver.findElement(pesquisa);
        searchBox.sendKeys(strUserName);
        searchBox.submit();
        return new PageObjects(driver);
    }

    public  PageObjects click()   {
        driver.findElement(titleText).click();
        return new PageObjects(driver);
    }

    public String getTitle(){
        System.out.println(driver.getTitle());
        return driver.getTitle();

    }
    public  PageObjects search(String name) throws InterruptedException   {

        this.digitar(name);
        this.click();
        return new PageObjects(driver);
    }


}

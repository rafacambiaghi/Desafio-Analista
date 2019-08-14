package Desafio;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Funcao.Acesso;
import Funcao.PageObjects;
//Aqui é  o pageobjects que abre o site seleniumHQ e lê o texto

public class SeleniumHq {
    static ChromeDriver driver;
    Acesso acesso;
    PageObjects page;

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterClass
    public static void tearDowProjeto_PesquisanTest(){
        driver.quit();
    }



    @Test
    public void testGoogleSearch() throws InterruptedException {
        acesso=new Acesso(driver);
        page=new PageObjects(driver);
        acesso.acesso("http://www.google.com");
        page.search("seleniumhq.org");
        String titulo = page.getTitle();
        Assert.assertEquals(titulo, "Selenium - Web Browser Automation");

    }

}

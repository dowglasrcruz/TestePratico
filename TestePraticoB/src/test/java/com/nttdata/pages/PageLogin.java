package com.nttdata.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;

public class PageLogin {

    // Constructor para este Page Object
    public PageLogin(WebDriver driver, int esperaPadraoEmSegundos) throws InterruptedException {
        // Obtendo a referência para o driver
        this.driver = driver;
        // Instanciando o objeto de espera WebDriverWait
        espera = new WebDriverWait(driver, Duration.ofSeconds(esperaPadraoEmSegundos));
        // Usado para instanciar os WebElements de acordo
        // com o localizador anotado com FindBy
        PageFactory.initElements(this.driver, this);
    }

    private WebDriver driver;
    private WebDriverWait espera;


    // Variável para a referência ao WebDriver

    @FindBy(xpath = "//html")
    public static WebElement pagina;



    //Instanciado para iniciar a navegação
    public void iniciaNavegacao(String url) throws InterruptedException {
        driver.navigate().to(url);



    }
}


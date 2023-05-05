package com.nttdata.pages;

import com.nttdata.Variables.Produto;
import com.nttdata.banco.PegaDadosBanco;
import com.nttdata.utils.CalculaValorTotaldeProdutos;
import com.nttdata.utils.SomenteDigitos;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLException;
import java.time.Duration;

public class PageOrderPayment {

    // Constructor para este Page Object
    public PageOrderPayment(WebDriver driver, int esperaPadraoEmSegundos) throws InterruptedException {
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

    @FindBy(xpath = "//*[@id='userCart']/div[2]/label[2]/span")
    public static WebElement campoTotal;



    //Instanciado para iniciar a navegação
    public void verificarValorTotal() throws InterruptedException {
        espera.until(ExpectedConditions.elementToBeClickable(campoTotal));
        Thread.sleep(3000);

        Produto produto = new Produto();
        double valorTotal = CalculaValorTotaldeProdutos.calculaValorTotal(produto);
        double valorTotalSite = Double.parseDouble(SomenteDigitos.somenteDigitos(campoTotal.getText()));

        Assertions.assertEquals(valorTotal,valorTotalSite);


    }


}


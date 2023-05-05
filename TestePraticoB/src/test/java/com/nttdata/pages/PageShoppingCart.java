package com.nttdata.pages;

import com.nttdata.banco.PegaDadosBanco;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLException;
import java.time.Duration;

public class PageShoppingCart {

    // Constructor para este Page Object
    public PageShoppingCart(WebDriver driver, int esperaPadraoEmSegundos) throws InterruptedException {
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

    @FindBy(xpath = "//*[@class='productColor']")
    public static WebElement corDoProduto;

    @FindBy(xpath = "//*[@id='checkOutButton']")
    public static WebElement botaoCheckOut;

    @FindBy(xpath = "//*[contains(text(),'REMOVE')]")
    public static WebElement opcaoRemove;

    @FindBy(xpath = "//*[@id='shoppingCart']/div/label")
    public static WebElement mensagemDeCarrinhoVazio;




    //Instanciado para iniciar a navegação


    public void verificarCorDoProduto() throws SQLException {
        espera.until(ExpectedConditions.visibilityOf(corDoProduto));
        String corDoProdutoBanco = PegaDadosBanco.corParaEcolha();
        System.out.println("Cor do produto: " + corDoProduto.getAttribute("title"));
        Assertions.assertEquals(corDoProdutoBanco, corDoProduto.getAttribute("title"));
    }

    public void clicaBotaoCheckOut() {
        espera.until(ExpectedConditions.visibilityOf(botaoCheckOut));
        botaoCheckOut.click();

    }

    public void removeProdutoDoCarrinho() {
        espera.until(ExpectedConditions.visibilityOf(opcaoRemove));
        opcaoRemove.click();

    }


    public void verificaMensagemDeCarrinhoVazio() {
        System.out.println(mensagemDeCarrinhoVazio.getText());
        Assertions.assertEquals("Your shopping cart is empty",mensagemDeCarrinhoVazio.getText());
    }
}


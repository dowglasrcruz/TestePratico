package com.nttdata.pages;

import com.nttdata.banco.PegaDadosBanco;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLException;
import java.time.Duration;

public class PageHome {

    // Constructor para este Page Object
    public PageHome(WebDriver driver, int esperaPadraoEmSegundos) throws InterruptedException {
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

    @FindBy(xpath = "//li[@class='nav-li-Links']//*[@translate='SPACIAL_OFFER']")
    public static WebElement opcaoSpecialOffer;

    @FindBy(xpath = "//*[@id='see_offer_btn']")
    public static WebElement botaoSeeOffer;

    @FindBy(xpath = "//*[@id='search']")
    public static WebElement opcaoLupa;

    @FindBy(xpath = "//*[@id='autoComplete']")
    public static WebElement campoPesquisa;

    @FindBy(xpath = "//*[@class='product ng-scope']")
    public static WebElement produtoPesquisado;




    //Instanciado para iniciar a navegação
    public void acessaSpecialOfer() throws InterruptedException {
        espera.until(ExpectedConditions.elementToBeClickable(opcaoSpecialOffer));
        Thread.sleep(3000);
        opcaoSpecialOffer.click();
        Thread.sleep(2000);

    }

    public void clicaNoBotaoSeeOffer() throws InterruptedException {
        espera.until(ExpectedConditions.elementToBeClickable(botaoSeeOffer));
        botaoSeeOffer.click();
        Thread.sleep(2000);


    }

    public void clicoNaLupa() throws InterruptedException {
        espera.until(ExpectedConditions.elementToBeClickable(opcaoLupa));
        Thread.sleep(5000);
        opcaoLupa.click();

    }
    public void digitaOProdutoDesejado() throws SQLException, InterruptedException {
        Thread.sleep(5000);
        String nomeDoProdutoBanco = PegaDadosBanco.nomeDoPoduto();
        campoPesquisa.sendKeys(nomeDoProdutoBanco);

    }


    public void selecionaOProdutoDaPesquisa() throws SQLException, InterruptedException {
        Thread.sleep(5000);
        produtoPesquisado.click();


    }
}


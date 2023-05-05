package com.nttdata.pages;

import com.nttdata.Variables.Produto;
import com.nttdata.banco.PegaDadosBanco;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLException;
import java.time.Duration;
import java.util.Locale;

public class PageProdutoHPPAVILION15ZTOUCHLAPTOP {

    // Constructor para este Page Object
    public PageProdutoHPPAVILION15ZTOUCHLAPTOP(WebDriver driver, int esperaPadraoEmSegundos) throws InterruptedException {
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

    @FindBy(xpath = "//div[@id='Description']/h1")
    public static WebElement descricaoDoProduto;

    @FindBy(xpath = "//*[text()='CUSTOMIZATION']//..//label[@class='value ng-binding']")
    public static WebElement customizationDoProduto;

    @FindBy(xpath = "//*[text()='DISPLAY']//..//label[@class='value ng-binding']")
    public static WebElement displayDoProduto;

    @FindBy(xpath = "//*[text()='DISPLAY RESOLUTION']//..//label[@class='value ng-binding']")
    public static WebElement displayResolutionDoProduto;

    @FindBy(xpath = "//*[text()='DISPLAY SIZE']//..//label[@class='value ng-binding']")
    public static WebElement displaySizeDoProduto;

    @FindBy(xpath = "//*[text()='MEMORY']//..//label[@class='value ng-binding']")
    public static WebElement memoryDoProduto;

    @FindBy(xpath = "//*[text()='OPERATING SYSTEM']//..//label[@class='value ng-binding']")
    public static WebElement operatingSystemDoProduto;

    @FindBy(xpath = "//*[text()='PROCESSOR']//..//label[@class='value ng-binding']")
    public static WebElement processadorDoProduto;

    @FindBy(xpath = "//*[text()='TOUCHSCREEN']//..//label[@class='value ng-binding']")
    public static WebElement touchscreenDoProduto;

    @FindBy(xpath = "//*[text()='WEIGHT']//..//label[@class='value ng-binding']")
    public static WebElement weightDoProduto;

    @FindBy(xpath = "//span[@title='GRAY'and @id='bunny']")
    public static WebElement opcaoDeCorGray;

    @FindBy(xpath = "//span[@title='BLACK'and @id='bunny']")
    public static WebElement opcaoDeCorBlack;

    @FindBy(xpath = "//*[@name='save_to_cart']")
    public static WebElement botaoAddToCard;

    @FindBy(xpath = "//*[@id='menuCart']")
    public static WebElement opcaoCarrinho;

    @FindBy(xpath = "//*[@name='quantity']")
    public static WebElement campoQuantidadeDoProduto;

    @FindBy(xpath = "//*[@id='Description']/h2")
    public static WebElement campoValorDoProduto;




    //Instanciado para iniciar a navegação

    public void verificaNomeDoProduto() throws InterruptedException, SQLException {
        String nomeDoProdutoBanco = PegaDadosBanco.nomeDoPoduto();
        Assertions.assertEquals(nomeDoProdutoBanco, descricaoDoProduto.getText());
    }

    public void verificaCustomizationDoProduto() throws InterruptedException, SQLException {
        String customizationDoProdutoBanco = PegaDadosBanco.customizationDoProduto();
        Assertions.assertEquals(customizationDoProdutoBanco, customizationDoProduto.getText());
    }


    public void verificaDisplayDoProduto() throws InterruptedException, SQLException {
        String displayDoProdutoBanco = PegaDadosBanco.displayDoProduto();
        System.out.println(displayDoProduto.getText());
        Assertions.assertEquals(displayDoProdutoBanco, displayDoProduto.getText());
    }

    public void verificaDisplayResolutionDoProduto() throws InterruptedException, SQLException {
        String displayResolutionDoProdutoBanco = PegaDadosBanco.displayResolutionDoProduto();
        Assertions.assertEquals(displayResolutionDoProdutoBanco, displayResolutionDoProduto.getText());
    }

    public void verificaDisplaySizeDoProduto() throws InterruptedException, SQLException {
        String displaySizeDoProdutoBanco = PegaDadosBanco.displaySizeDoProduto();
        Assertions.assertEquals(displaySizeDoProdutoBanco, displaySizeDoProduto.getText());
    }

    public void verificaMemoryDoProduto() throws InterruptedException, SQLException {
        String memoryDoProdutoBanco = PegaDadosBanco.memoryDoProduto();
        Assertions.assertEquals(memoryDoProdutoBanco, memoryDoProduto.getText());
    }

    public void verificaOperationSystemDoProduto() throws InterruptedException, SQLException {
        String operationSystemDoProdutoBanco = PegaDadosBanco.operatingSystemDoProduto();
        Assertions.assertEquals(operationSystemDoProdutoBanco, operatingSystemDoProduto.getText());
    }

    public void verificaProcessadorDoProduto() throws InterruptedException, SQLException {
        String processadorDoProdutoBanco = PegaDadosBanco.processadorDoProduto();
        Assertions.assertEquals(processadorDoProdutoBanco, processadorDoProduto.getText());
    }

    public void verificaTouchsreenDoProduto() throws InterruptedException, SQLException {
        String touchsreenDoProdutoBanco = PegaDadosBanco.touchscreenDoProduto();
        Assertions.assertEquals(touchsreenDoProdutoBanco, touchscreenDoProduto.getText());
    }

    public void verificaWeightDoProduto() throws InterruptedException, SQLException {
        String weightDoProdutoBanco = PegaDadosBanco.weightDoProduto();
        Assertions.assertEquals(weightDoProdutoBanco, weightDoProduto.getText());
    }


    public void alteraACorDoProduto() throws SQLException {
        String corDoProdutoBanco = PegaDadosBanco.corParaEcolha();
        switch (corDoProdutoBanco.toLowerCase(Locale.ROOT)) {
            case "gray":
                opcaoDeCorGray.click();
                break;

            case "black":
                opcaoDeCorBlack.click();
                break;

        }

    }

    public void clicaNoBotaoAddToCard() {
        botaoAddToCard.click();

    }

    public void clicaNoCarrinho() {
        opcaoCarrinho.click();

    }

    public void escolheACorDoProduto(String corDoProduto) throws InterruptedException {
        switch (corDoProduto.toLowerCase(Locale.ROOT)) {
            case "gray":
                opcaoDeCorGray.click();
                break;

            case "black":
                Thread.sleep(5000);
                opcaoDeCorBlack.click();
                break;

        }

    }

    public void alteraQuantidadeDeProdutos(String quantidadeDoProduto) {
        Produto produto = new Produto();
        produto.setValor(campoValorDoProduto.getText());
        produto.setQuantidade(quantidadeDoProduto);
        campoQuantidadeDoProduto.click();
        campoQuantidadeDoProduto.sendKeys(quantidadeDoProduto);

    }
}


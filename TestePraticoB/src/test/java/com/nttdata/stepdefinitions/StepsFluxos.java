//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.nttdata.stepdefinitions;

import com.nttdata.banco.PegaDadosBanco;
import com.nttdata.pages.*;
import com.nttdata.utils.ConfiguraData;
import com.nttdata.utils.GetScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLException;
import java.util.Locale;

public class StepsFluxos {
    private WebDriver driver;
    public static String path = ConfiguraData.dataHoraAtual();
    private PageLogin pageLoginbase;
    private PageHome pageHome;

    private PageProdutoHPPAVILION15ZTOUCHLAPTOP pageProdutoHPPAVILION15ZTOUCHLAPTOP;
    private PageShoppingCart pageShoppingCart;

    private PageOrderPayment pageOrderPayment;


    public StepsFluxos() {
    }

    @Before
    public void setup() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("user-data-dir=C:\\Users\\dowgl\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
        options.addArguments("profile-directory=Profile 1");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        pageLoginbase = new PageLogin(driver, 120);
        pageHome = new PageHome(driver, 120);
        pageProdutoHPPAVILION15ZTOUCHLAPTOP = new PageProdutoHPPAVILION15ZTOUCHLAPTOP(driver, 120);
        pageShoppingCart = new PageShoppingCart(driver, 120);
        pageOrderPayment = new PageOrderPayment(driver, 120);

    }

    @Dado("que eu Logo no o sistema pela URl")
    public void queEuAcessoOSistema() throws InterruptedException {
        String url = "https://advantageonlineshopping.com/#/";
        pageLoginbase.iniciaNavegacao(url);

    }

    @Quando("acesso a opção Special Offer")
    public void acessoAOpçãoSpecialOffer() throws InterruptedException {
        pageHome.acessaSpecialOfer();

    }

    @Quando("pesquiso o produto usando a lupa")
    public void pesquisoOProdutoUsandoALupa() throws SQLException, InterruptedException {
        pageHome.clicoNaLupa();
        pageHome.digitaOProdutoDesejado();

    }

    @E("clico no botão See Offer")
    public void clicoNoBotãoSeeOffer() throws InterruptedException {
        pageHome.clicaNoBotaoSeeOffer();
    }

    @E("altero a cor do produto")
    public void alteroACorDoProduto() throws SQLException {
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.alteraACorDoProduto();

    }

    @E("clico jo botão ADD to cart")
    public void clicoJoBotãoADDToCart() {
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.clicaNoBotaoAddToCard();

    }

    @E("seleciono o produto selecionado")
    public void selecionoOProdutoSelecionado() throws SQLException, InterruptedException {
        pageHome.selecionaOProdutoDaPesquisa();
    }

    @E("escolho a cor do produto{string}")
    public void escolhoACorDoProdutoCor(String corDoProduto) throws InterruptedException {
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.escolheACorDoProduto(corDoProduto);

    }

    @E("altero a quantidade do produto{string}")
    public void alteroAQuantidadeDoProdutoQuantidade(String quantidadeDoProduto) {
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.alteraQuantidadeDeProdutos(quantidadeDoProduto);
    }

    @E("acesso o carrinho")
    public void acessoOCarrinho() {
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.clicaNoCarrinho();
    }

    @E("clico no botao checkout")
    public void clicoNoBotaoCheckout() {
        pageShoppingCart.clicaBotaoCheckOut();
    }

    @Então("valido as informações do produto")
    public void validoAsInformaçõesDoProduto() throws SQLException, InterruptedException {
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.verificaNomeDoProduto();
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.verificaCustomizationDoProduto();
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.verificaDisplayDoProduto();
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.verificaDisplayResolutionDoProduto();
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.verificaDisplaySizeDoProduto();
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.verificaMemoryDoProduto();
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.verificaOperationSystemDoProduto();
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.verificaProcessadorDoProduto();
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.verificaTouchsreenDoProduto();
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.verificaWeightDoProduto();
    }

    @Então("valido a cor selecionada no carrinho")
    public void validoACorSelecionadaNoCarrinho() throws SQLException {
        pageProdutoHPPAVILION15ZTOUCHLAPTOP.clicaNoCarrinho();
        pageShoppingCart.verificarCorDoProduto();


    }

    @Então("realizo um update da cor no banco de dados{string}")
    public void realizoUmUpdateDaCorNoBancoDeDadosCor(String cor) throws SQLException {
        PegaDadosBanco.alteraCor(cor);
    }

    @E("valido a soma do preço dos produtos selecionados")
    public void validoASomaDoPreçoDosProdutosSelecionados() throws InterruptedException {
        pageOrderPayment.verificarValorTotal();

    }

    @E("removo o produto do carrinho de compras")
    public void removoOProdutoDoCarrinhoDeCompras() {
       pageShoppingCart.removeProdutoDoCarrinho();

    }

    @E("verifico mensagem de carrinho vazio")
    public void verificoMensagemDeCarrinhoVazio() {
        pageShoppingCart.verificaMensagemDeCarrinhoVazio();
    }


    @AfterStep
    public void takeScreenShots(Scenario scenario) throws InterruptedException {
        if (scenario.isFailed()) {
            GetScreenshot.takeScreenshot(driver, "falha");
            GetScreenshot.takeScreenshot(driver, path);
        }

    }

    @BeforeStep
    public void takeScreenShotsAntes(Scenario scenario) {
        GetScreenshot.takeScreenshot(driver, path);
    }

    @After
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }



}







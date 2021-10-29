package br.inatel.s206.test.step;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.spec.KeySpec;

public class TestWebStep {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {

        //fecha as abas do browser e finaliza as instancias
        driver.quit();
    }

    @Dado("que estou no site de compras")
    public void que_estou_no_site_de_compras() {
        driver.get("http://automationpractice.com/index.php");
        wait.until(ExpectedConditions.titleIs("My Store"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nav']//div[@class='row']")));
    }

    @Dado("que tenha um browser aberto")
    public void que_tenha_um_browser_aberto() {

    }

    @Dado("entrar no site de compras")
    public void entrar_no_site_de_compras() {

    }

    @Dado("cliquei no menu sign in")
    public void cliquei_no_menu_sign_in() {

    }

    @Quando("clicar em T-shirt")
    public void clicar_em_T_shirt() {
        WebElement element = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a"));
        element.click();
    }

    @Quando("clicar no botão para adicionar ao carrinho")
    public void clicar_no_botao_para_adicionar_ao_carrinho() {
        WebElement element = driver.findElement(By.xpath("//div[@class='product-image-container']//img[@class='replace-2x img-responsive']"));
        wait.until(ExpectedConditions.visibilityOf(element));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        WebElement buttom = driver.findElement(By.xpath("//a[@title='Add to cart']"));
        wait.until(ExpectedConditions.elementToBeClickable(buttom));
        buttom.click();
    }

    @Quando("buscar pelo produto {string}")
    public void buscar_pelo_produto(String produto) {
        WebElement element = driver.findElement(By.xpath("//input[@class='search_query form-control ac_input']"));
        element.click();
        element.sendKeys(produto, Keys.ENTER);
    }

    @Quando("clicar no botão contact us")
    public void clicar_no_botao_contact_us() {

    }

    @Quando("colocar usuario e senha")
    public void colocar_usuario_e_senha() {

    }

    @Quando("clicar no botão sign in")
    public void clicar_no_botao_sign_in() {

    }

    @Então("um modal de confirmação deverá abrir")
    public void um_modal_de_confirmacao_devera_abrir() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='icon-ok']")));
    }

    @Então("deverá exibir uma lista de produtos")
    public void devera_exibir_uma_lista_de_produtos() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='center_column col-xs-12 col-sm-9']//span[contains(., 'dress')]")));
    }

    @Então("deverá exibir uma mensagem de erro")
    public void devera_exibir_uma_mensagem_de_erro() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='alert alert-warning'][contains(., 'teste')]")));
    }

    @Então("deverá ser carregada a pagina inicial do site")
    public void devera_ser_carregada_a_pagina_inicial_do_site() {

    }

    @Então("deverá abrir a tela para envio de mensagem")
    public void devera_abrir_a_tela_para_envio_de_mensagem() {

    }

    @Então("deverá ser exibida a tela da minha conta")
    public void devera_ser_exibida_a_tela_da_minha_conta() {

    }
}

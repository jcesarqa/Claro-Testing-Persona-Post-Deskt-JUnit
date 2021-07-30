package pe.com.admequipo.stepdefinition.sp02;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pe.com.admequipo.stepdefinition.BaseStep;

public class PostpagoMaxTest extends BaseStep{
	
	private WebDriver driver;
	private String url="https://tiendaclaro.pe/";
	
	By homeregalo = By.xpath("//div[@id='content-wrap']/main/app-home/app-login/div[2]/div[2]");
	By submitdatos = By.xpath("//button[@type='submit']");
	By escridoc = By.id("field-doc");
	By escritelf = By.id("field-last");
	
	By celulares = By.xpath("(//a[@id='navbarDropdownMenuLink'])[2]");
	By postpago = By.linkText("Postpago");
	By portabilidad = By.linkText("Portabilidad");
	By productos = By.xpath("//div[@id='contentcatalog']/app-product/div/div/section/div[2]");
	
	By mibolsa = By.xpath("//button[@id='Equipo-añadir-bolsa']/span");
	
	By addaccesorio = By.xpath("//button[@class=\"bundle add\"]");
	By addservice =  By.xpath("//div[@id='content-wrap']/div/section/div[2]/div/div[2]/button");
	By accesorios = By.xpath("//button[@id='Mibolsa-comenzar-pago']");
	By siguiente = By.id("Mibolsa-comenzar-pago");
	
	By campodoc = By.id("field-doc");
	By campocel = By.id("field-cel");
	By camponom = By.id("field-name");
	By campoape = By.id("field-last");
	By campomail = By.id("field-mail");	
	By terminos = By.xpath("//div[@id='content-wrap']/div/section/form/div/div[3]/div[8]/ul/li/label/a");
	By aceptar = By.xpath("(//button[@type='button'])[6]");
	By dropdonwlist = By.xpath("//div[@id='content-wrap']/div/section/form/app-bolsa-envio-v2/div/section/div/div[3]/app-direccion/form/div/div/div/select");
	By direccion = By.xpath("(//input[@type='text'])[5]");
	By botonf = By.xpath("//button[@id='Info-comenzar']");
	
	By condpago = By.xpath("//label[@for='ckbTerms']");
	By acepcondpago = By.xpath("//button[@data-dismiss='modal']");
	By checkterm = By.xpath("//span[@for='ckbTerms3']");
	By confirmarpago = By.xpath("//span[contains(.,'Siguiente')]");
	
	By frame = By.xpath("//iframe[@id='visaNetJS']");
	By nmrtarjeta = By.id("number");
	By fecha = By.id("expiry");
	By cvc = By.id("cvc");
	By cuota = By.xpath("//select[@id='quota']");
	By pagar = By.xpath("//button[@type='submit']");
	
	By cancelar = By.xpath("//button[@class=\"pushcrew-chrome-style-notification-btn pushcrew-btn-close\"]");
	By confirm = By.xpath("//p");
	
	public PostpagoMaxTest() {
		driver = super.getDriver();
		driver.manage().window().maximize();
	}
		
	@Given("^estoy en la opcion principal de la tienda claro se abre el home Regalo y me registra$")
	public void homeopcion() throws InterruptedException {		
		driver.get(url);
		esperarSegundos(4);	
		click(cancelar);
		esperarSegundos(4);	
		mover(findElement(homeregalo));
		click(homeregalo);
		esperarSegundos(4);	
		type("77777777",escridoc);
		type("999999999",escritelf);		
		click(submitdatos);
		esperarSegundos(4);			
		
	}
	
	@When("^selecciono el celular postpago con portabilidad$")
	public void buscarCelular() throws InterruptedException {
					
		mover(findElement(celulares));
		mover(findElement(postpago));		
		click(portabilidad);
		esperarSegundos(4);		
		scroll(ubicacion(productos),"");
		esperarSegundos(4);	
		click(productos);
		
	}
	
	@When("^agrego a mi bolsa$")
	public void añadirMibolsa() throws InterruptedException {
		esperarSegundos(4);	
		scroll("(0,200)","");	
		esperarSegundos(4);	
		click(mibolsa);	
	}
	
	@When("^seleciono accesorios$")
	public void veraccesorios() throws InterruptedException {
		esperarSegundos(4);	
		try {
			List<WebElement> listaccesorios = findElements(addaccesorio);			
			WebElement add1 = listaccesorios.get(0);
			add1.click();
			WebElement add2 = listaccesorios.get(1);
			add2.click();	
			scrollfinal();
			esperarSegundos(4);	
			click(addservice);
			esperarSegundos(4);	
			click(accesorios);
			esperarSegundos(4);	
			scroll("(0,200)","");
			esperarSegundos(4);	
			click(siguiente);
		}catch (Exception e){
			esperarSegundos(4);			
			click(accesorios);
			esperarSegundos(4);	
			scroll("(0,200)","");
			esperarSegundos(4);			
			click(siguiente);
		}
						
	}
	@When("^completo el Formulario$")
	
	public void completarFormulario() throws InterruptedException {
		type("77777777",campodoc);
		type("999999999",campocel);
		clear(camponom);
		clear(campoape);
		clear(campomail);		
		type("prueba",camponom);
		type("prueba orueba",campoape);
		type("somosclaro@dddd.com",campomail);
		esperarSegundos(4);	
		scroll("(0,700)","");
		esperarSegundos(4);		
		click(terminos);
		esperarSegundos(4);	
		click(aceptar);		
		List<WebElement> paqueteopcio = findElements(dropdonwlist);		
		WebElement depart = paqueteopcio.get(0);
		selectList(depart,11);
		WebElement provinc = paqueteopcio.get(1);
		selectList(provinc,1);		
		WebElement dsitrito = paqueteopcio.get(2);
		selectList(dsitrito,1);
		clear(direccion);
		type("p, La Molina, Av. Javier Prado",direccion);	
		esperarSegundos(4);			
		scroll("(0,1500)","");
		esperarSegundos(4);
		click(botonf);
	}
	
	@When("^Finalizo la Compra$")
	public void finalizarCompra() throws InterruptedException {
		
		scroll("(0,200)","");		
		scroll("(0,600)","");
		esperarSegundos(4);		
		click(condpago);
		click(acepcondpago);
		click(checkterm);		
		scroll("(0,1000)","");
		esperarSegundos(4);
		click(confirmarpago);
		esperarSegundos(4);
		
	}
	
	@Then("^me registro en la pasarela de Pago$")
	public void pasarelaPago() {
		
		type("4547751138486006",nmrtarjeta);
		type("03/22",fecha);			
		type("740",cvc);		
		esperarSegundos(4);	
		click(pagar);
		esperarSegundos(4);		
	}
}

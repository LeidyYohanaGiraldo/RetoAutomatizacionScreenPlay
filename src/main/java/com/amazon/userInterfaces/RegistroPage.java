package com.amazon.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.amazon.com/-/es/")
public class RegistroPage extends PageObject {

    public static final Target BTN_IDENTIFICATE = Target.the("Clic boton hola, identificate").located(By.id("nav-link-accountList-nav-line-1"));
    public static final Target BTN_CREAR_CUENTA = Target.the("Clic boton crear cuenta").located(By.id("createAccountSubmit"));
    public static final Target TXT_NOMBRE = Target.the("Ingresar nombre completo").located(By.xpath("//input[@id='ap_customer_name']"));
    public static final Target TXT_EMAIL = Target.the("Ingresar correo electronico").located(By.xpath("//input[@id='ap_email']"));
    public static final Target TXT_CLAVE = Target.the("Ingresar clave").located(By.xpath("//input[@id='ap_password']"));
    public static final Target TXT_REPETIR_CLAVE = Target.the("Repetir clave").located(By.xpath("//input[@id='ap_password_check']"));
    public static final Target BTN_CONTINUAR = Target.the("Clic boton continuar").located(By.className("a-button-input"));

}

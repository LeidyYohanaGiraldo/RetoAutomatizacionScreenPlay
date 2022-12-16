package com.amazon.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmarProductosPage {
    public static final Target MSJ_SUBTOTAL = Target.the("Validacion productos adicionados al carrito de compras").located(By.xpath("(//h4[contains(text(),'Agregado al carrito')])[2]"));
}

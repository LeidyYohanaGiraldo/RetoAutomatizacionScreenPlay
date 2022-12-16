package com.amazon.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EliminarProductoPage {
    public static final Target IMGBTN_CARRITO = Target.the("Clic boton carrito de compras").located(By.xpath("//span[@id='attach-sidesheet-view-cart-button']"));
    public static final Target BTN_ELIMINAR = Target.the("Clic Eliminar producto ").located(By.xpath("(//input[@value='Eliminar'])"));

}

package com.amazon.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoVacioPage {
    public static final Target MSJ_CARRITO_VACIO = Target.the("Validacion carrito de compras vacio").located(By.id("sc-active-cart"));
}

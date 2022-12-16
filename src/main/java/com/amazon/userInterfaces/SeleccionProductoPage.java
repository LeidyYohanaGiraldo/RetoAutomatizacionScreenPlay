package com.amazon.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionProductoPage {
    public static final Target BTN_MENU = Target.the("Clic boton menu").located(By.xpath("//a[@id='nav-hamburger-menu']"));
    public static final Target BTN_COMPUTADORAS = Target.the("Clic boton categoria computadoras").located(By.xpath("//div[.='Computadoras']"));
    public static final Target BTN_COMPUTADORAS_TABLETS = Target.the("Clic boton subcategoria computadoras y tablets").located(By.xpath("//a[.='Computadoras y tablets']"));
    public static final Target BTN_PC_ACER = Target.the("Clic seleccion tablet Samsung").located(By.xpath("//div[@data-csa-c-item-id='amzn1.asin.1.B09R63Z5L7']"));
    public static final Target BTN_CANTIDAD = Target.the("Clic cantidad").located(By.xpath("//span[.='Cantidad:']"));
    public static final Target LST_CANTIDAD = Target.the("Seleccion cantidad productos").located(By.xpath("//a[@id='quantity_2']"));
    public static final Target BTN_AGREGAR_CARRITO = Target.the("Clic adicionar al carrito de compras").located(By.id("add-to-cart-button"));
    public static final Target BTN_MONITORES = Target.the("Clic subcategoria monitores").located(By.xpath("//a[text()='Monitores']"));
    public static final Target BTN_MONITOR = Target.the("Clic seleccion monitor Led").located(By.xpath("//div[@data-csa-c-item-id='amzn1.asin.1.B07H8P9QX2']"));


}

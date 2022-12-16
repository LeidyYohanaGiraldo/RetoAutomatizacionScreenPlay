package com.amazon.questions;

import com.amazon.userInterfaces.ConfirmarProductosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionProductos implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return ConfirmarProductosPage.MSJ_SUBTOTAL.resolveFor(actor).isDisplayed();
    }

    public static Question validarCarrito(){
        return new ValidacionProductos();
    }
}

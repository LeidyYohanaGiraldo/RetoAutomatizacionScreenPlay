package com.amazon.questions;

import com.amazon.userInterfaces.CarritoVacioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCarritoVacio implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return CarritoVacioPage.MSJ_CARRITO_VACIO.resolveFor(actor).isDisplayed();
    }

    public static Question validarCarritoVacio(){
        return new ValidacionCarritoVacio();
    }

}

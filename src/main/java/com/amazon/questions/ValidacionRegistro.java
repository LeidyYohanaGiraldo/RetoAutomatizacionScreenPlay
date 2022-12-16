package com.amazon.questions;

import com.amazon.userInterfaces.MensajeRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionRegistro implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeRegistroPage.MSJ_COMPROBACION.resolveFor(actor).isDisplayed();
    }

    public static Question validarRegistro(){

        return new ValidacionRegistro();
    }
}

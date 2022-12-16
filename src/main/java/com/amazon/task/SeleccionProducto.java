package com.amazon.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.amazon.userInterfaces.SeleccionProductoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    Click.on(BTN_MENU),
                    Click.on(BTN_COMPUTADORAS),
                    Click.on(BTN_COMPUTADORAS_TABLETS),
                    Scroll.to(BTN_PC_ACER),
                    Click.on(BTN_PC_ACER),
                    Click.on(BTN_CANTIDAD),
                    Click.on(LST_CANTIDAD),
                    Click.on(BTN_AGREGAR_CARRITO),
                    Click.on(BTN_MENU),
                    Click.on(BTN_COMPUTADORAS),
                    Click.on(BTN_MONITORES),
                    Scroll.to(BTN_MONITOR),
                    Click.on(BTN_MONITOR),
                    Click.on(BTN_AGREGAR_CARRITO)
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static SeleccionProducto dataSeleccion(){
        return instrumented(SeleccionProducto.class);
    }
}

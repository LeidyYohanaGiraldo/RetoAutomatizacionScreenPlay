package com.amazon.task;

import com.amazon.utils.DatosExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

import static com.amazon.userInterfaces.RegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registro implements Task {
    DatosExcel datosExcel = new DatosExcel();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    Click.on(BTN_IDENTIFICATE),
                    Click.on(BTN_CREAR_CUENTA),
                    Enter.theValue(datosExcel.leerDatosExcel("DataRetoAutomatizacionScreenPlay.xlsx", "DatosLogin",1,0)).into(TXT_NOMBRE),
                    Enter.theValue(datosExcel.leerDatosExcel("DataRetoAutomatizacionScreenPlay.xlsx", "DatosLogin",1,1)).into(TXT_EMAIL),
                    Enter.theValue(datosExcel.leerDatosExcel("DataRetoAutomatizacionScreenPlay.xlsx", "DatosLogin",1,2)).into(TXT_CLAVE),
                    Enter.theValue(datosExcel.leerDatosExcel("DataRetoAutomatizacionScreenPlay.xlsx", "DatosLogin",1,3)).into(TXT_REPETIR_CLAVE),
                    Click.on(BTN_CONTINUAR)
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Registro informacion(){
        return instrumented(Registro.class);
    }
}

package com.josepuntriano.tasks;

import com.josepuntriano.targets.SeleniumDevTargets;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarBusqueda implements Task {

    private final String termino;

    public RealizarBusqueda(String termino) {
        this.termino = termino;
    }

    @Step("{0} realiza una búsqueda con el término '{termino}'")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeleniumDevTargets.CAMPO_BUSQUEDA),
                Enter.theValue(termino)
                        .into(SeleniumDevTargets.INPUT_BUSQUEDA)
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        actor.attemptsTo(
                WaitUntil.the(SeleniumDevTargets.RESULTADOS_BUSQUEDA,
                        isVisible()).forNoMoreThan(15).seconds()
        );
    }

    public static RealizarBusqueda conElTermino(String termino) {
        return new RealizarBusqueda(termino);
    }
}
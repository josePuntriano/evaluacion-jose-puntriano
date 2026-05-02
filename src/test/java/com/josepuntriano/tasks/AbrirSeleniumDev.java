package com.josepuntriano.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.annotations.Step;

public class AbrirSeleniumDev implements Task {

    @Step("{0} abre la página de inicio de Selenium")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://selenium.dev")
        );
    }

    public static AbrirSeleniumDev enElNavegador() {
        return new AbrirSeleniumDev();
    }
}
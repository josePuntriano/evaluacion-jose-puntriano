package com.josepuntriano.tasks;

import com.josepuntriano.targets.SeleniumDevTargets;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.annotations.Step;

public class NavegarADocumentation implements Task {

    @Step("{0} navega a la sección de Documentation")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeleniumDevTargets.MENU_DOCUMENTATION)
        );
    }

    public static NavegarADocumentation enElMenu() {
        return new NavegarADocumentation();
    }
}
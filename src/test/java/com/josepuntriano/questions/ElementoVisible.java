package com.josepuntriano.questions;

import com.josepuntriano.targets.SeleniumDevTargets;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ElementoVisible implements Question<Boolean> {

    private final Target target;

    public ElementoVisible(Target target) {
        this.target = target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return target.resolveFor(actor).isVisible();
    }

    public static ElementoVisible en(Target target) {
        return new ElementoVisible(target);
    }
}
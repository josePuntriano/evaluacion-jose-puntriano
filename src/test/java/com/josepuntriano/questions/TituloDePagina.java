package com.josepuntriano.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TituloDePagina implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb
                .as(actor)
                .getDriver()
                .getTitle();
    }

    public static TituloDePagina actual() {
        return new TituloDePagina();
    }
}
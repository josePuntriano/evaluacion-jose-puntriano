package com.josepuntriano.targets;

import net.serenitybdd.screenplay.targets.Target;

public class SeleniumDevTargets {

    public static final Target TITULO_PAGINA =
            Target.the("título de la página de inicio")
                    .locatedBy("//h1[contains(@class,'hero__title')]");

    public static final Target MENU_DOCUMENTATION =
            Target.the("menú Documentation")
                    .locatedBy("//a[normalize-space()='Documentation']");

    public static final Target TITULO_DOCUMENTATION =
            Target.the("título de la página Documentation")
                    .locatedBy("//h1[contains(text(),'Selenium')]");

    public static final Target CAMPO_BUSQUEDA =
            Target.the("campo de búsqueda")
                    .locatedBy("//button[contains(@class,'DocSearch')]");

    public static final Target INPUT_BUSQUEDA =
            Target.the("input de búsqueda")
                    .locatedBy("//input[@id='docsearch-input']");

    public static final Target PRIMER_RESULTADO =
            Target.the("primer resultado de búsqueda")
                    .locatedBy("//*[@id='docsearch-list']/li[1]");

    public static final Target RESULTADOS_BUSQUEDA =
            Target.the("resultados de búsqueda")
                    .locatedBy("//*[@id='docsearch-list']");

}
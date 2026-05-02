package com.josepuntriano.stepdefinitions;

import com.josepuntriano.targets.ApiTargets;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class ApiReqresSteps {

    @Given("el cliente consume el endpoint de listado de usuarios")
    public void elClienteListaUsuarios() {
        SerenityRest
                .given()
                .baseUri(ApiTargets.BASE_URL)
                .header("x-api-key", "free_user_3D9KEptEOiqCVXrVp1oEOmQgFek")
                .queryParam("page", 2)
                .when()
                .get(ApiTargets.ENDPOINT_USERS);
    }

    @Then("la respuesta debe ser exitosa y contener usuarios")
    public void laRespuestaDebeContenerUsuarios() {
        restAssuredThat(response -> response
                .statusCode(200)
                .body("data", not(empty()))
                .body("data[0].id", notNullValue())
                .body("data[0].email", notNullValue()));
    }

    @Given("el cliente envía una solicitud para crear un usuario")
    public void elClienteCreaUnUsuario() {
        SerenityRest
                .given()
                .baseUri(ApiTargets.BASE_URL)
                .header("x-api-key", "free_user_3D9KEptEOiqCVXrVp1oEOmQgFek")
                .contentType("application/json")
                .body("{\"name\": \"Jose Puntriano\", \"job\": \"QA Automation Senior\"}")
                .when()
                .post(ApiTargets.ENDPOINT_USERS);
    }

    @Then("el usuario debe ser creado correctamente")
    public void elUsuarioDebeSerCreadoCorrectamente() {
        restAssuredThat(response -> response
                .statusCode(201)
                .body("name", equalTo("Jose Puntriano"))
                .body("job", equalTo("QA Automation Senior"))
                .body("id", notNullValue())
                .body("createdAt", notNullValue()));
    }

    @Given("el cliente envía una solicitud para actualizar un usuario")
    public void elClienteActualizaUnUsuario() {
        SerenityRest
                .given()
                .baseUri(ApiTargets.BASE_URL)
                .header("x-api-key", "free_user_3D9KEptEOiqCVXrVp1oEOmQgFek")
                .contentType("application/json")
                .body("{\"name\": \"Jose Puntriano\", \"job\": \"QA Automation Lead\"}")
                .when()
                .put(ApiTargets.ENDPOINT_USERS + "/2");
    }

    @Then("los datos del usuario deben actualizarse correctamente")
    public void losDatosDebenActualizarseCorrectamente() {
        restAssuredThat(response -> response
                .statusCode(200)
                .body("name", equalTo("Jose Puntriano"))
                .body("job", equalTo("QA Automation Lead"))
                .body("updatedAt", notNullValue()));
    }
}
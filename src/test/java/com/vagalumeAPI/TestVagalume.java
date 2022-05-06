package com.vagalumeAPI;

import org.junit.Test;

import io.restassured.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

public class TestVagalume {
    private String urlBase = "https://www.vagalume.com.br";

    @Test
    public void dadoVagalumeAPI_QuandoRealizarGetArtista_entaoDeveRetornarStatusCode200(){
        given()
            .log()
            .all()
            .pathParam("artista", "u2")
        .when()
            .get(urlBase+"/{artista}/index.js")
        .then()
            .log()
            .body()
            .statusCode(200);
    }
    
}

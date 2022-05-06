package com.vagalumeAPI;

import org.junit.Test;
import static io.restassured.RestAssured.given;

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

    //@Test //not
    public void dadoVagalumeAPI_QuandoRealizarGetELimit_entaoDeveRetornarStatusCode200(){
        given()
            .log()
            .all()
            .pathParam("pesquisa", "Skank")
            .pathParam("limite", "5")
        .when()
            .get(urlBase+"/search.art?q={pesquisa}&limit={limite}")
        .then()
            .log()
            .body()
            .statusCode(200);
    }
    



    //@Test 
    public void dadoVagalumeAPI_QuandoRealizarGetMusicaELimit_entaoDeveRetornarStatusCode200(){
        given()
            .log()
            .all()
            .pathParam("pesquisa", "vamos fugir")
            .pathParam("limite", "5")
        .when()
            .get(urlBase+"/search.excerpt?q={pesquisa}&limit={limite}")
        .then()
            .log()
            .body()
            .statusCode(200);
    }
    
}

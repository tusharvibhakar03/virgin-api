package com.virgingames.testsuite;

import com.virgingames.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class AssertTest extends TestBase {

    static ValidatableResponse response;

    @Test
    public void test001() {
        RestAssured.registerParser("text/plain", Parser.JSON);
        response = given().log().all()
                .when()
                .header("accept", "application/json")
                .get("")
                .then().statusCode(200);
        RestAssured.registerParser("text/plain", Parser.JSON);
         response.body("bingoLobbyInfoResource.streams[2].streamId", equalTo(309));

    }

    @Test
    public void test002() {
        RestAssured.registerParser("text/plain", Parser.JSON);
        response = given().log().all()
                .when()
                .header("accept", "application/json")
                .get("")
                .then().statusCode(200);
        RestAssured.registerParser("text/plain", Parser.JSON);
        response.body("bingoLobbyInfoResource.ventureId", equalTo(14));
    }

}

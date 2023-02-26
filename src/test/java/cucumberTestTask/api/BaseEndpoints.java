package cucumberTestTask.api;

import cucumberTestTask.tools.EnvConstants;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class BaseEndpoints {

    public Response response;
    Map<String, Object> parameters = new HashMap<>();

    public Response getSetup(String path) {
        RestAssured.reset();
        RestAssured.baseURI = EnvConstants.BASE_URL;
        return response = RestAssured.given()
                .contentType(EnvConstants.CONTENT_TYPE)
                .accept(EnvConstants.CONTENT_TYPE)
                .get(path);
    }

    public Response getSetupWithParams(String path, String param, String value) {
        RestAssured.reset();
        RestAssured.baseURI = EnvConstants.BASE_URL;
        return response = RestAssured.given()
                .contentType(EnvConstants.CONTENT_TYPE)
                .accept(EnvConstants.CONTENT_TYPE)
                .queryParam(param, value)
                .get(path);
    }
}

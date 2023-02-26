package cucumberTestTask.api;

import cucumberTestTask.requests.GetWeather;
import cucumberTestTask.tools.EnvConstants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseEndpoints {

    public Response response;
    public RequestSpecification requestSpecification;

    public Response getSetup(String path) {
        RestAssured.reset();
        RestAssured.baseURI = EnvConstants.BASE_URL;
        return response = RestAssured.given()
                .contentType(EnvConstants.CONTENT_TYPE)
                .accept(EnvConstants.CONTENT_TYPE)
                .get(path);
    }

    public RequestSpecification getSetupWithParams(String param, String... value) {
        RestAssured.baseURI = EnvConstants.BASE_URL;
        return requestSpecification = RestAssured.given()
                .param(param, value);
    }
    public RequestSpecification setKey() {
        return requestSpecification.param("access_key", EnvConstants.ACCESS_KEY);
    }

    public RequestSpecification setQuery() {
        return requestSpecification.param("query", GetWeather.getRandomCity());
    }

    public Response getRequest(String path) {
        return response = requestSpecification.get(path);
    }
}

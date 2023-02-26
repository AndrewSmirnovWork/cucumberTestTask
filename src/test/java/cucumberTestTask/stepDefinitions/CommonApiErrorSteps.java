package cucumberTestTask.stepDefinitions;

import cucumberTestTask.api.BaseApi;
import cucumberTestTask.message.ApiErrorsAndMessages;
import cucumberTestTask.requests.GetWeather;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;


public class CommonApiErrorSteps extends BaseApi {

    private static final Logger LOG = LogManager.getLogger(GetApiSteps.class);
    private GetWeather getWeather;

    @Then("status code is {int} and {string}")
    public void statusLineIs(Integer code, String info) {
        LOG.info("Verify the results data");
        Response request = getWeather.getRequest(getWeather.getSubdirectory());
        ApiErrorsAndMessages messages = request.as(ApiErrorsAndMessages.class);

        Assert.assertFalse("Wrong status code in response",
                messages.getSuccess());
        Assert.assertEquals("Wrong status line in response",
                messages.getError().getCode(), code);
        Assert.assertEquals("Wrong status info",
                messages.getError().getInfo(), info);
    }

    @Given("I send a request with parameter {string} and {string}")
    public void iSendARequestWithParameterAs(String param, String value) throws IllegalAccessException {
        getWeather = new GetWeather();
        getWeather.getSetupWithParams(param, value);
    }

    @And("Request with valid parameter query")
    public void requestWithValidParameterQuery() {
        getWeather.setQuery();
    }

    @And("Request with valid parameter access_key")
    public void requestWithValidParameterAccess_key() {
        getWeather.setKey();
    }
}

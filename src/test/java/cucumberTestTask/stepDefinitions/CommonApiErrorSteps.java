package cucumberTestTask.stepDefinitions;

import cucumberTestTask.api.BaseApi;
import cucumberTestTask.message.ApiErrorsAndMessages;
import cucumberTestTask.requests.GetWeather;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class CommonApiErrorSteps extends BaseApi {

    private static final Logger LOG = LogManager.getLogger(GetApiSteps.class);
    private GetWeather getWeather;

    @When("query is not in parameters")
    public void queryIsNotInParameters() throws IllegalAccessException {
        getWeather = new GetWeather();
        getWeather.access_key = null;
        getWeather.setPathWithQuery();
        Response setup = getWeather.getSetup(getWeather.pathWithQuery);
    }

    @When("access key is not in parameters")
    public void accessKeyIsNotInParameters() throws IllegalAccessException {
        getWeather = new GetWeather();
        getWeather.query = null;
        getWeather.setPathWithQuery();
        getWeather.getSetup(getWeather.pathWithQuery);
    }

    @When("wrong query in parameters")
    public void wrongQueryInParameters() throws IllegalAccessException {
        getWeather = new GetWeather();
        getWeather.query = RandomStringUtils.random(10, true, false);
        getWeather.setPathWithQuery();
        getWeather.getSetup(getWeather.pathWithQuery);
    }

    @When("wrong units in parameters")
    public void wrongUnitsInParameters() throws IllegalAccessException {
        getWeather = new GetWeather();
        getWeather.units = "asd";
        getWeather.setPathWithQuery();
        getWeather.getSetup(getWeather.pathWithQuery);
    }

    @Then("status code is {int} and {string}")
    public void statusLineIs(Integer code, String info) {
        LOG.info("Verify the results data");
        ApiErrorsAndMessages messages = getWeather.response.as(ApiErrorsAndMessages.class);

        Assert.assertFalse("Wrong status code in response",
                messages.getSuccess());
        Assert.assertEquals("Wrong status line in response",
                messages.getError().getCode(), code);
        Assert.assertEquals("Wrong status info",
                messages.getError().getInfo(), info);
    }
}

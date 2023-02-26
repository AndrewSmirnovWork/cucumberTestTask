package cucumberTestTask.stepDefinitions;

import cucumberTestTask.requests.GetWeather;
import cucumberTestTask.responce.Weather;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class GetApiSteps {

    private static final Logger LOG = LogManager.getLogger(GetApiSteps.class);
    private GetWeather getWeather;

    @Given("user want to get information about weather in {string}")
    public void userWantToGetInformationAboutWeatherInCity(String city) throws IllegalAccessException {
        getWeather = new GetWeather(city);
        getWeather.getSetup(getWeather.pathWithQuery);
    }

    @Then("Status code is {int}")
    public void statusCodeIs(int statusCode) {
        LOG.info("Check status code is {statuscode}");
        Assert.assertEquals("Response has status code different from expected", statusCode, getWeather.response.getStatusCode());
    }

    @And("the requested data about city is returned")
    public void theRequestedDataAboutCityIsReturned() {
        LOG.info("Check info about city weather");
        Weather weather = getWeather.response.as(Weather.class);

        Assert.assertTrue("Responce 'type' should be city",
                weather.getRequest().getType().equalsIgnoreCase("city"));
        Assert.assertTrue("Responce 'location' should be " + getWeather.query,
                weather.getLocation().name.equalsIgnoreCase(getWeather.query));
        Assert.assertTrue("Responce 'language' should be en",
                weather.getRequest().getLanguage().equalsIgnoreCase("en"));
    }

}

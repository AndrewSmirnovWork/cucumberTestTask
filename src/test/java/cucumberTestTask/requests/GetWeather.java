package cucumberTestTask.requests;

import cucumberTestTask.api.BaseApi;
import cucumberTestTask.tools.EnvConstants;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GetWeather extends BaseApi {

    public GetWeather() throws IllegalAccessException {
        this.setSubdirectory("/current");
    }

    public GetWeather(String city) throws IllegalAccessException {
        this.setSubdirectory("/current");
        this.query = city;
        this.access_key = EnvConstants.ACCESS_KEY;
        this.setPathWithQuery();
    }

    //parameters
    public Integer number;
    public String language;

    //m for Metric
    //s for Scientific
    //f for Fahrenheit
    public String units;

    public static String getRandomCity() {
        Random r = new Random();
        List<String> cities = Arrays.asList("New York", "Los Angeles", "Toronto", "San Francisco");
        int randomCity = r.nextInt(cities.size());
        return cities.get(randomCity).replaceAll("\\s+", "");
    }
}

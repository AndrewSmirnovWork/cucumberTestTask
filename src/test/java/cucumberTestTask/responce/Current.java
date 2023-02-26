package cucumberTestTask.responce;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Current {

    public String observationTime;
    public Integer temperature;
    public Integer weatherCode;
    public List<String> weather_Icons;
    public List<String> weather_Descriptions;
    public Integer wind_Speed;
    public Integer wind_Degree;
    public String wind_Dir;
    public Integer pressure;
    public Integer precip;
    public Integer humidity;
    public Integer cloudcover;
    public Integer feelslike;
    public Integer uv_Index;
    public Integer visibility;
    public String is_Day;

    public Current() {
    }

    public Current(String observationTime, Integer temperature, Integer weatherCode, List<String> weather_Icons, List<String> weather_Descriptions, Integer windSpeed, Integer wind_Degree, String wind_Dir, Integer pressure, Integer precip, Integer humidity, Integer cloudcover, Integer feelslike, Integer uv_Index, Integer visibility, String is_Day) {
        super();
        this.observationTime = observationTime;
        this.temperature = temperature;
        this.weatherCode = weatherCode;
        this.weather_Icons = weather_Icons;
        this.weather_Descriptions = weather_Descriptions;
        this.wind_Speed = windSpeed;
        this.wind_Degree = wind_Degree;
        this.wind_Dir = wind_Dir;
        this.pressure = pressure;
        this.precip = precip;
        this.humidity = humidity;
        this.cloudcover = cloudcover;
        this.feelslike = feelslike;
        this.uv_Index = uv_Index;
        this.visibility = visibility;
        this.is_Day = is_Day;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(Integer weatherCode) {
        this.weatherCode = weatherCode;
    }

    public List<String> getWeather_Icons() {
        return weather_Icons;
    }

    public void setWeather_Icons(List<String> weather_Icons) {
        this.weather_Icons = weather_Icons;
    }

    public List<String> getWeather_Descriptions() {
        return weather_Descriptions;
    }

    public void setWeather_Descriptions(List<String> weather_Descriptions) {
        this.weather_Descriptions = weather_Descriptions;
    }

    public Integer getWind_Speed() {
        return wind_Speed;
    }

    public void setWind_Speed(Integer wind_Speed) {
        this.wind_Speed = wind_Speed;
    }

    public Integer getWind_Degree() {
        return wind_Degree;
    }

    public void setWind_Degree(Integer wind_Degree) {
        this.wind_Degree = wind_Degree;
    }

    public String getWind_Dir() {
        return wind_Dir;
    }

    public void setWind_Dir(String wind_Dir) {
        this.wind_Dir = wind_Dir;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getPrecip() {
        return precip;
    }

    public void setPrecip(Integer precip) {
        this.precip = precip;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Integer cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Integer getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Integer feelslike) {
        this.feelslike = feelslike;
    }

    public Integer getUv_Index() {
        return uv_Index;
    }

    public void setUv_Index(Integer uv_Index) {
        this.uv_Index = uv_Index;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public String getIs_Day() {
        return is_Day;
    }

    public void setIs_Day(String is_Day) {
        this.is_Day = is_Day;
    }
}


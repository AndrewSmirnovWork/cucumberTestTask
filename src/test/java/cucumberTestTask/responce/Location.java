package cucumberTestTask.responce;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {

    public String name;
    public String country;
    public String region;
    public String lat;
    public String lon;
    public String timezone_Id;
    public String localtime;
    public String localtime_Epoch;
    public String utcOffset;

    public Location() {
    }

    public Location(String name, String country, String region, String lat, String lon, String timezone_Id, String localtime, String localtime_Epoch, String utcOffset) {
        super();
        this.name = name;
        this.country = country;
        this.region = region;
        this.lat = lat;
        this.lon = lon;
        this.timezone_Id = timezone_Id;
        this.localtime = localtime;
        this.localtime_Epoch = localtime_Epoch;
        this.utcOffset = utcOffset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getTimezone_Id() {
        return timezone_Id;
    }

    public void setTimezone_Id(String timezone_Id) {
        this.timezone_Id = timezone_Id;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    public String getLocaltime_Epoch() {
        return localtime_Epoch;
    }

    public void setLocaltime_Epoch(String localtime_Epoch) {
        this.localtime_Epoch = localtime_Epoch;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }
}

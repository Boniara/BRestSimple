package com.boniara.brestsimple.models.services.groupkt.com.country;

import com.boniara.brestsimple.models.AbstractModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country extends AbstractModel {

    @JsonProperty("name")
    private String name;
    @JsonProperty("alpha2_code")
    private String alpha2_code;
    @JsonProperty("alpha3_code")
    private String alpha3_code;

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlpha2_code() {
        return alpha2_code;
    }

    public void setAlpha2_code(String alpha2_code) {
        this.alpha2_code = alpha2_code;
    }

    public String getAlpha3_code() {
        return alpha3_code;
    }

    public void setAlpha3_code(String alpha3_code) {
        this.alpha3_code = alpha3_code;
    }

    @Override
    public String toString() {
        return "Country" +
                "name = " + name + " " +
                ", alpha2_code = " + alpha2_code + " " +
                ", alpha3_code = " + alpha3_code + "\n";
    }
}

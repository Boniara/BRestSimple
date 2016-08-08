package com.boniara.brestsimple.models.services.groupkt.com.country;

import com.boniara.brestsimple.models.AbstractModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"id"})
public class Source extends AbstractModel {

    @JsonProperty("RestResponse")
    private RestResponse restResponse;

    public Source() {
    }

    public RestResponse getRestResponse() {
        return restResponse;
    }

    public void setRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
    }

    @Override
    public String toString() {
        return "Source: " +
                "restResponse = " + restResponse.toString();
    }
}

package com.boniara.brestsimple.models.services.groupkt.com.country;

import com.boniara.brestsimple.models.AbstractModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties({"id"})
public class RestResponse extends AbstractModel {

    @JsonProperty("messages")
    private List<String> messages;
    @JsonProperty("result")
    private List<Country> countryList;

    public RestResponse() {
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }

    @Override
    public String toString() {
        return "RestResponse: " +
                "messages = " + messages.toString() +
                ", countryList = " + countryList.toString();
    }
}

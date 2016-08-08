package com.boniara.brestsimple.utils;

import com.boniara.brestsimple.models.stg.caronfly.com.login.AuthorizationModel;
import com.boniara.brestsimple.models.AbstractModel;
import com.boniara.brestsimple.models.services.groupkt.com.country.Source;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Converter<T extends AbstractModel> {

    private ObjectMapper mapper;
    private Class<T> t;

    public Converter(Class<T> t) {
        this.mapper = new ObjectMapper();
        this.t = t;
    }

    public String objectToJsonString(AuthorizationModel authorizationModel) {
        mapper = new ObjectMapper();
        String result = null;
        try {
            result = mapper.writeValueAsString(authorizationModel);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public T jsonStringToObject(String jsonString) {
        T object = null;
        try {
            object = mapper.readValue(jsonString, t);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }

    public T jsonStringToListObject(String jsonString) {
        List<T> tList = new ArrayList<T>();
        T tModel = null;
        Source restResponse = new Source();
        try {
            tModel = mapper.readValue(jsonString, t);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tModel;
    }
}

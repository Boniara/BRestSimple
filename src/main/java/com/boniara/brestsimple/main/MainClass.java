package com.boniara.brestsimple.main;

import com.boniara.brestsimple.http.ModelHttpClient;
import com.boniara.brestsimple.models.stg.caronfly.com.login.AuthorizationModel;
import com.boniara.brestsimple.models.stg.caronfly.com.login.Person;
import com.boniara.brestsimple.models.services.groupkt.com.country.Source;

import java.io.IOException;


public class MainClass {

    private static String POST_URL = "http://stg.caronfly.com:8080/ws/api/v1/login";
    private static final String GET_ALL_URL = "http://services.groupkt.com/country/get/all";
    private static final String GET_URL = "http://services.groupkt.com/country/search?text=Belarus";

    public static void main(String[] args) {

        AuthorizationModel model = new AuthorizationModel();
        model.setEmail("hursevich@gmail.com");
        model.setPassword("copper");
        model.setRole("DRIVER");
        model.setVersion(1.0);

        Person person = new Person();
        Source source = new Source();
        Source source1 = new Source();
        ModelHttpClient<Person> httpClient = null;
        ModelHttpClient<Source> countryModelHttpClient = null;
        ModelHttpClient<Source> oneCountryHttpClient = null;
        try {
            httpClient = new ModelHttpClient(POST_URL, Person.class);
            person = httpClient.post(model);

            countryModelHttpClient = new ModelHttpClient(GET_ALL_URL, Source.class);
            source = countryModelHttpClient.get();

            oneCountryHttpClient = new ModelHttpClient(GET_URL, Source.class);
            source1 = oneCountryHttpClient.get();


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("POST " + person.toString());
        System.out.println("GET " + source.toString());
        System.out.println("GET " + source1.toString());
    }
}

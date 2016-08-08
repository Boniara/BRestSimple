package com.boniara.brestsimple.io;

import com.boniara.brestsimple.models.AbstractModel;
import com.boniara.brestsimple.utils.Converter;
import org.apache.http.HttpResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ResponseReader<T extends AbstractModel> {

    private Converter<T> converter;
    private T outObject;

    public ResponseReader(HttpResponse response, Class<T> t) throws IOException {
        this.converter = new Converter<T>(t);
        this.outObject = null;
    }

    public ResponseReader(Class<T> t) throws IOException {
        this.converter = new Converter<T>(t);
        this.outObject = null;
    }

    public T read(HttpResponse response) {
        BufferedReader bufferedReader = null;
        String out = null;
        StringBuilder builder = new StringBuilder();
        T model = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            while((out = bufferedReader.readLine()) != null) {
                builder.append(out);
            }
            outObject = converter.jsonStringToListObject(builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outObject;
    }

    public T getOutObject() {
        return outObject;
    }
}

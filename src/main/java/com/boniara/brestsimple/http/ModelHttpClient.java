package com.boniara.brestsimple.http;

import com.boniara.brestsimple.io.ResponseReader;
import com.boniara.brestsimple.models.stg.caronfly.com.login.AuthorizationModel;
import com.boniara.brestsimple.models.AbstractModel;
import com.boniara.brestsimple.utils.Converter;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class ModelHttpClient<T extends AbstractModel> {

    private static String url;
    private HttpClient client;
    private Converter<T> converter;
    private StringEntity stringEntity;
    private ResponseReader<T> reader;

    public ModelHttpClient(String url, Class<T> t) throws IOException {
        this.url = url;
        this.client = HttpClientBuilder.create().build();
        this.converter = new Converter<T>(t);
        this.reader = new ResponseReader<T>(t);
    }

    public T post(AuthorizationModel authorizationModel) {
        HttpResponse response = null;
        HttpPost post = new HttpPost(url);
        initHeader(post);
        try {
            stringEntity = new StringEntity(converter.objectToJsonString(authorizationModel));
            post.setEntity(stringEntity);
            response = client.execute(post);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reader.read(response);
    }

    public T get() {
        HttpGet get = new HttpGet(url);
        initHeader(get);
        HttpResponse response = null;
        try {
            response = client.execute(get);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reader.read(response);
    }

    private void initHeader(HttpRequestBase httpRequestBase) {
        httpRequestBase.setHeader("Accept-Language", "en");
        httpRequestBase.setHeader("Content-Type", "application/json");
    }
}

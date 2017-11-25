package com.hdp.camel.processor;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import java.net.URI;

//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.mime.MultipartEntity;

/**
 * use apache httpclient4 .
 *
 * Created by admin on 2017/3/9.
 *
 * Need to import the server certificate to jdk trust store for run with url2/url3.
 *
 * url1 no need to import cert because it use a valid cert that issued by root CA
 * which embedded in jdk trust store.
 */
public class HTTP4sTest {

    static final String url1 = "https://github.com";
    static final String url2 = "https://dell:8443/myserver/be/myservice";
    static final String url3 = "https://mail.chinasofti.com/";

    public static void main(String[]  args) throws Exception {

        HttpClient client = new DefaultHttpClient();

        HttpGet request = new HttpGet();
        request.setURI(new URI(url1));
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        //--- --- ---
        //HttpResponse response = client.execute(request);
        //System.out.println(response.getStatusLine());

        String response = client.execute(request,responseHandler);
        System.out.println(response);

    }
}

package org.wenbin.console.http;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * Created by quwb on 2018/1/5.
 */
public class HttpUtil {

    public void run(HttpType httpType){
        switch (httpType){
            case Get:
                get();
                break;
        }
    }

    public void get(){
        CloseableHttpClient httpClient = HttpClients.createDefault();
    }
}

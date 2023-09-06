package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.httpreqs;

import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.client.ClientHttp;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.HttpRequestBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.IOException;

public class PutRequest implements Command {
    private HttpUriRequest request;
    private HttpRequestBuilder builder;
    private String userID;
    public PutRequest(String url, String userID) {
        HttpRequestBuilder builder = new HttpRequestBuilder();
        builder
                .setUrl(url)
                .setUserID(userID)
                .setPut();
        this.builder = builder;
        this.userID = userID;
    }

    @Override
    public CloseableHttpResponse execute(String data) {
        CloseableHttpClient httpClient = ClientHttp.createHttpClient();
        builder
                .requestBody(data);
        request = builder.build();
        try {
            return httpClient.execute(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getID() {
        return this.userID;
    }
}

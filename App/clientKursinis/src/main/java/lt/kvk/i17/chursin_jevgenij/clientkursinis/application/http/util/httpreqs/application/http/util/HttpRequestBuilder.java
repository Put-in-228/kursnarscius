package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util;

import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;

public class HttpRequestBuilder {

    private String userID;
    private String requestBody;
    private String url;
    private HttpUriRequest request = null;

    public HttpRequestBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public HttpRequestBuilder setUserID(String userID) {
        this.userID = userID;
        return this;
    }

    public HttpRequestBuilder requestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    public void setGet() {
        request = new HttpGet(url);
    }

    public void setPost() {
        request = new HttpPost(url);
    }

    public void setDelete() {
        request = new HttpDelete(url);
    }

    public void setPut() {
        request = new HttpPut(url);
    }

    public HttpUriRequest build() {
        if (userID != null) {
            request.setHeader("User-ID", userID);
        } else {
            request.setHeader("User-ID", "NULL");
        }

        request.setHeader("Content-Type", "application/json");

        if (requestBody != null && request instanceof HttpEntityEnclosingRequestBase) {
            ((HttpEntityEnclosingRequestBase) request).setEntity(new StringEntity(requestBody, "UTF-8"));
        }

        return request;
    }
}

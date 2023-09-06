package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.storage;

import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.HttpRequestBuilder;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.httpreqs.PostRequest;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.httpreqs.RequestInvoker;

public class HttpConfig {
    private static HttpConfig instance;



    private final String link = "http://192.168.0.153:8080";
    private final String loginUrl = "/login";
    private final String registerUrl = "/register";
    private final String forgotUrl = "/forgot";
    private final String newCar = "/new";

    private RequestInvoker requestInvoker;
    private String localUserID = null;

    private HttpRequestBuilder requestBuilder = null;

    public static HttpConfig getInstance() {
        if (HttpConfig.instance == null) {
            HttpConfig.instance = new HttpConfig();
        }

        return HttpConfig.instance;
    }

    public String getLocalUserID() {
        return localUserID;
    }

    public String getNewCar() {
        return getLink() + newCar;
    }

    public void setLocalUserID(String localUserID) {
        this.localUserID = localUserID;

        getRequestInvoker().addRequest("new", new PostRequest(getNewCar(), getLocalUserID()));
    }

    public RequestInvoker getRequestInvoker() {
        return requestInvoker;
    }

    public void setRequestInvoker(RequestInvoker requestInvoker) {
        this.requestInvoker = requestInvoker;
    }

    private String getLink() {
        return link;
    }

    public String getLoginUrl() {
        return getLink() + loginUrl;
    }

    public String getRegisterUrl() {
        return getLink() + registerUrl;
    }

    public String getForgotUrl() {
        return getLink() + forgotUrl;
    }
}

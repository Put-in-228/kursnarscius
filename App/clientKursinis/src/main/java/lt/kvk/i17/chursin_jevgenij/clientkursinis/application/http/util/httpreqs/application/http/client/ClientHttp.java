package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.client;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class ClientHttp {
    public static CloseableHttpClient createHttpClient() {
        return HttpClients.createDefault();
    }
}

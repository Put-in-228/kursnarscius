package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.httpreqs;

import org.apache.http.client.methods.CloseableHttpResponse;

public interface Command {
    CloseableHttpResponse execute(String data) throws Exception;
    String getID();
}

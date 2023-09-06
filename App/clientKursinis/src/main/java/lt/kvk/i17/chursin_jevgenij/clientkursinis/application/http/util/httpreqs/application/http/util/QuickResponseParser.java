package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class QuickResponseParser {

    public static String getResponse(CloseableHttpResponse response) {
        String responseText = "";

        try {
            HttpEntity entity = response.getEntity();
            if(entity != null) {
                responseText = EntityUtils.toString(entity);
            } else {
                System.out.println("response entity is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return responseText;
    }
}

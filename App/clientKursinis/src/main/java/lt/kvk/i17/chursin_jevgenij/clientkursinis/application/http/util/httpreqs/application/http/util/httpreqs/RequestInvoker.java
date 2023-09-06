package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.httpreqs;

import org.apache.http.client.methods.CloseableHttpResponse;

import java.util.HashMap;
import java.util.Map;

public class RequestInvoker {
    private Map<String, Command> requests;

    public RequestInvoker () {
        requests = new HashMap<>();
    }

    public void addRequest(String name, Command request) {
        if(requests.get(name) == null) {
            requests.put(name, request);
        } else {
            System.out.println("Such request name already exists!");
        }
    }

    public CloseableHttpResponse executeRequest(String name, String data) {
        CloseableHttpResponse response = null;
        try {
            response = requests.get(name).execute(data);
        } catch (Exception e) {
            System.out.println("Request with such name doesn't exist!");
            System.out.println(e);
        }

        if (response != null) {
            return response;
        }
        return null;
    }

    public Command getRequest(String name) {
        try {
            Command command = requests.get(name);
            return command;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return null;
        }
    }
}

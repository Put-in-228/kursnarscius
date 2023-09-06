package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs;

import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.httpreqs.Command;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.httpreqs.GetRequest;
import lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.httpreqs.RequestInvoker;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RequestInvokerTest {
    @Test
    public void testAddRequest() {
        RequestInvoker invoker = new RequestInvoker();
        Command request = new GetRequest("https://test.url", null);
        invoker.addRequest("TestRequest", request);
        assertNotNull(invoker.getRequest("TestRequest"));
    }

    @Test
    public void testAddRequestDuplicateName() {
        RequestInvoker invoker = new RequestInvoker();
        Command request1 = new GetRequest("https://test.url", null);
        Command request2 = new GetRequest("https://test.url", null);
        invoker.addRequest("TestRequest", request1);
        invoker.addRequest("TestRequest", request2);
        // Assert that the second addition fails
        assertNull(invoker.getRequest("TestRequest"));
    }

    @Test
    public void testEqualsRequestSetData() {
        RequestInvoker invoker = new RequestInvoker();
        Command request = new GetRequest("https://test.url", "test");
        invoker.addRequest("TestRequest", request);

        assertEquals("test", invoker.getRequest("TestRequest").getID());
    }
}

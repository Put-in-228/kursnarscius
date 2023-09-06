package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data;

public class UserForgotRequestFactory implements RequestDataFactory {
    private String email;

    public UserForgotRequestFactory(String email) {
        this.email = email;
    }
    @Override
    public RequestData createRequest() {
        return new UserForgotRequest(email);
    }
}

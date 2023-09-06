package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data;

public class UserLoginRequestFactory implements RequestDataFactory {
    private String username;
    private String password;

    public UserLoginRequestFactory(String username, String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public RequestData createRequest() {
        return new UserLoginRequest(username, password);
    }
}

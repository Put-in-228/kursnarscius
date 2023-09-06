package lt.kvk.i17.chursin_jevgenij.clientkursinis.application.http.util.httpreqs.application.http.util.data;

public class UserRegisterRequestFactory implements RequestDataFactory {
    private String username;
    private String email;
    private String password;
    private String name;
    private String surname;
    private String telephone;

    public UserRegisterRequestFactory(String username, String email, String password, String name, String surname, String telephone) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
    }
    @Override
    public RequestData createRequest() {
        return new UserRegisterRequest(username, email, password, name, surname, telephone);
    }
}

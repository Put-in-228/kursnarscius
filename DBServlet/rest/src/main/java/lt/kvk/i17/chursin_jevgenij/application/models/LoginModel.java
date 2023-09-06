package lt.kvk.i17.chursin_jevgenij.application.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginModel {
    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

package lt.kvk.i17.chursin_jevgenij.application.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForgotModel {
    @JsonProperty("email")
    private String email;

    public String getEmail() { return email; }
}

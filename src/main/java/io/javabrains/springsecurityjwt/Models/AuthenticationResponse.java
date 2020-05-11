package io.javabrains.springsecurityjwt.Models;
//Output Structure for Authentication Response
public class AuthenticationResponse {
    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}

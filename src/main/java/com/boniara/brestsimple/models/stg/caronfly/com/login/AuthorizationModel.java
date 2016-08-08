package com.boniara.brestsimple.models.stg.caronfly.com.login;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AuthorizationModel {

    private String email;
    private String password;
    private String role;
    private Double version;

    public AuthorizationModel() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }
}

package com.boniara.brestsimple.models.stg.caronfly.com.login;

import com.boniara.brestsimple.models.AbstractModel;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Person extends AbstractModel {

    @JsonProperty("modifiedAt")
    private long modifiedAt;
    @JsonProperty("createdAt")
    private long createdAt;
    @JsonProperty("userId")
    private long userId;
    @JsonProperty("token")
    private String token;
    @JsonProperty("role")
    private String role;
    @JsonProperty("jid")
    private String jid;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("cardPaymentEnabled")
    private boolean cardPaymentEnabled;
    @JsonProperty("paymentProvider")
    private String paymentProvider;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("companyId")
    private String companyId;

    public Person() {
    }

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public boolean isCardPaymentEnabled() {
        return cardPaymentEnabled;
    }

    public void setCardPaymentEnabled(boolean cardPaymentEnabled) {
        this.cardPaymentEnabled = cardPaymentEnabled;
    }

    public String getPaymentProvider() {
        return paymentProvider;
    }

    public void setPaymentProvider(String paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return super.getId() + " " + modifiedAt + " " + createdAt + " " + userId + " " + token + " " + role + " " + jid + " "
                + status + " " + locale + " " + cardPaymentEnabled + " " + paymentProvider + " " + unit + " "
                + companyId;
    }
}

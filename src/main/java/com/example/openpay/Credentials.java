package com.example.openpay;

public class Credentials {

    private final String apiKey;
    private final String merchantId;

    public Credentials() {
        this.apiKey = "";
        this.merchantId = "";
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getMerchantId() {
        return merchantId;
    }

}

package com.example.openpay;

public class Credentials {

    private final String apiPrivateKey;
    private final String apiPublicKey;
    private final String merchantId;

    public Credentials() {
        this.apiPrivateKey = "";
        this.apiPublicKey = "";
        this.merchantId = "";
    }

    public String getApiPrivateKey() {
        return apiPrivateKey;
    }

    public String getApiPublicKey() {
        return apiPublicKey;
    }

    public String getMerchantId() {
        return merchantId;
    }

}

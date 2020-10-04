package com.example.openpay;

public class Credentials {

    private final String apiPrivateKey;
    private final String apiPublicKey;
    private final String merchantId;

    public Credentials() {
        this.apiPrivateKey = "sk_8847d6e5e7e5426583a5103377bef069";
        this.apiPublicKey = "";
        this.merchantId = "mts4cy5asyfal85meelg";
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

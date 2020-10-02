package com.purchaseservice;

import mx.openpay.client.Customer;

import java.math.BigDecimal;

public class CustomerDTO {
    private BigDecimal amount;
    private Customer customer;
    private String description;
    private String deviceSessionId;
    private String tokenId;

    public Customer getCustomer() {
        return customer;
    }

    public String getTokenId() {
        return tokenId;
    }

    public String getDeviceSessionId() {
        return deviceSessionId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}

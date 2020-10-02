package com.purchaseservice;

import mx.openpay.client.core.requests.RequestBuilder;
import mx.openpay.client.core.requests.transactions.CreateCardChargeParams;

import java.math.BigDecimal;

public class ChargeDTO {

    private String cardId;
    private BigDecimal amount;
    private String description;
    private String deviceSessionId;
    private CustomerDTO customer;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeviceSessionId() {
        return deviceSessionId;
    }

    public void setDeviceSessionId(String deviceSessionId) {
        this.deviceSessionId = deviceSessionId;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }
}

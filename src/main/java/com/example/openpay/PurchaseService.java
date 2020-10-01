package com.example.openpay;

import mx.openpay.client.Charge;
import mx.openpay.client.core.OpenpayAPI;
import mx.openpay.client.core.requests.transactions.CreateCardChargeParams;
import mx.openpay.client.exceptions.OpenpayServiceException;
import mx.openpay.client.exceptions.ServiceUnavailableException;

public class PurchaseService {
    private OpenpayAPI api;

    PurchaseService() {
         api = new OpenpayAPI("https://sandbox-api.openpay.mx",
                "puto", "comes");
    }

    public Charge chargeCustomer(CustomerDTO customer, String token_id) throws OpenpayServiceException, ServiceUnavailableException {
        CreateCardChargeParams charge = new CreateCardChargeParams()
                .cardId(token_id)
                .amount(customer.getAmount())
                .description(customer.getDescription())
                .deviceSessionId(customer.getDeviceSessionId())
                .customer(customer.getCustomer());

        System.out.println(charge);
        return this.api.charges().create(charge);
    }
}

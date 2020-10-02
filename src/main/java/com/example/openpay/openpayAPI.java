package com.purchaseservice;

import com.purchaseservice.Exceptions.RequestException;
import mx.openpay.client.Charge;
import mx.openpay.client.core.OpenpayAPI;
import mx.openpay.client.core.requests.RequestBuilder;
import mx.openpay.client.core.requests.transactions.CreateCardChargeParams;
import mx.openpay.client.exceptions.OpenpayServiceException;
import mx.openpay.client.exceptions.ServiceUnavailableException;

public class openpayAPI implements APIService {

    @Override
    public ChargeDTO charge(CustomerDTO customer) throws RequestException {
        OpenpayAPI api = new OpenpayAPI("https://sandbox-api.openpay.mx", credentials.getApiKey(), credentials.getMerchantId());

        RequestBuilder request = new CreateCardChargeParams()
                .cardId(customer.getTokenId())
                .amount(customer.getAmount())
                .description(customer.getDescription())
                .deviceSessionId(customer.getDeviceSessionId())
                .customer(customer.getCustomer());

        try {
            Charge charge = api.charges().createCharge(request);
            System.out.println("Imprimiendo cargo...");
            System.out.println(charge);
            System.out.println("*Cargo impreso con éxito...");
        } catch (OpenpayServiceException | ServiceUnavailableException e) {
            throw new RequestException("");
        }

        return null;
    }
}

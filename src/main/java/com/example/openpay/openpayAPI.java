package com.example.openpay;

import com.example.openpay.Exceptions.ResourceNotFoundException;
import mx.openpay.client.Charge;
import mx.openpay.client.core.OpenpayAPI;
import mx.openpay.client.core.requests.RequestBuilder;
import mx.openpay.client.core.requests.transactions.CreateCardChargeParams;
import mx.openpay.client.exceptions.OpenpayServiceException;
import mx.openpay.client.exceptions.ServiceUnavailableException;

public class openpayAPI implements APIService {

    @Override
    public ChargeDTO createCharge(CustomerDTO customer) throws ResourceNotFoundException {
        OpenpayAPI api = new OpenpayAPI("https://sandbox-api.openpay.mx", credentials.getApiPrivateKey(), credentials.getMerchantId());

        RequestBuilder request = new CreateCardChargeParams()
                .cardId(customer.getTokenId())
                .amount(customer.getAmount())
                .description(customer.getDescription())
                .deviceSessionId(customer.getDeviceSessionId())
                .customer(customer.getCustomer());

        Charge charge;
        ChargeDTO chargeDTO = new ChargeDTO();
        try {
            charge = api.charges().createCharge(request);
            System.out.println("Imprimiendo CHARGE...");
            System.out.println(charge);
            System.out.println("*Cargo impreso con éxito...");
            chargeDTO.setAmount(charge.getAmount());
            chargeDTO.setId(charge.getId());
            chargeDTO.setCreationDate(charge.getCreationDate());
            chargeDTO.setOperationDate(charge.getOperationDate());
            chargeDTO.setStatus(charge.getStatus());
            chargeDTO.setDescription(charge.getDescription());
            chargeDTO.setCustomerId(charge.getCustomerId());
            chargeDTO.setMethod(charge.getMethod());
            chargeDTO.setAuthorization(charge.getAuthorization());
            chargeDTO.setCurrency(charge.getCurrency());
        } catch (OpenpayServiceException | ServiceUnavailableException e) {
            throw new ResourceNotFoundException("");
        }

        return chargeDTO;
    }
}

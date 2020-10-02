package com.purchaseservice;

import com.purchaseservice.Exceptions.RequestException;
import mx.openpay.client.Charge;

public interface APIService {

    final Credentials credentials = new Credentials();

    public ChargeDTO charge(CustomerDTO customer) throws RequestException;

}

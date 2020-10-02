package com.example.openpay;

import com.example.openpay.Exceptions.RequestException;
import mx.openpay.client.Charge;

public interface APIService {

    final Credentials credentials = new Credentials();

    public Charge charge(CustomerDTO customer) throws RequestException;

}

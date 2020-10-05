package com.example.openpay;

import com.example.openpay.Exceptions.ResourceNotFoundException;

public interface APIService {

    final Credentials credentials = new Credentials();

    public ChargeDTO createCharge(CustomerDTO customer) throws ResourceNotFoundException;

}

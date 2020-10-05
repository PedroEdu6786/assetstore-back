package com.example.openpay;

import org.springframework.beans.factory.annotation.Autowired;

public interface DBService {

    public ChargeDTO createCharge(ChargeDTO charge);

}

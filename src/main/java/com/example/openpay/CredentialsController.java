package com.example.openpay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CredentialsController {

    @GetMapping("/credentials")
    public Credentials credentials() {
        return new Credentials();
    }
}

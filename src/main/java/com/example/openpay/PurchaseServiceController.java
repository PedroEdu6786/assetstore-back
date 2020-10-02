package com.example.openpay;

import mx.openpay.client.Charge;
import mx.openpay.client.Customer;
import mx.openpay.client.core.OpenpayAPI;
import mx.openpay.client.core.requests.RequestBuilder;
import mx.openpay.client.core.requests.transactions.CreateCardChargeParams;
import mx.openpay.client.exceptions.OpenpayServiceException;
import mx.openpay.client.exceptions.ServiceUnavailableException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
public class PurchaseServiceController {
	@PostMapping("/charge")
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
	public Charge greetingPost(@RequestBody CustomerDTO customer) throws OpenpayServiceException, ServiceUnavailableException {
		System.out.println(customer.getTokenId());
		OpenpayAPI api = new OpenpayAPI("https://sandbox-api.openpay.mx",
				"", "");

		RequestBuilder request = new CreateCardChargeParams()
				.cardId(customer.getTokenId())
				.amount(customer.getAmount())
				.description(customer.getDescription())
				.deviceSessionId(customer.getDeviceSessionId())
				.customer(customer.getCustomer());

		System.out.println(request);

		Charge test = api.charges().createCharge(request);
		return test;
	}
}

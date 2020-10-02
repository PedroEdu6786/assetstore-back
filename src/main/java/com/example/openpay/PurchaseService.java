package com.example.openpay;

import com.example.openpay.Exceptions.RequestException;
import mx.openpay.client.Charge;
import org.springframework.web.bind.annotation.*;

@RestController
public class PurchaseService {

	private APIService api;
	@PostMapping("/charge")
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
	public Charge charge(@RequestBody CustomerDTO customer) throws RequestException {
		api = new openpayAPI();
		Charge charge = api.charge(customer);
		return charge;
	}
}

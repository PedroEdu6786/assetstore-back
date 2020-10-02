package com.purchaseservice;

import com.purchaseservice.Exceptions.RequestException;
import org.springframework.web.bind.annotation.*;

@RestController
public class PurchaseService {

	private APIService api;
	@PostMapping("/charge")
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
	public ChargeDTO charge(@RequestBody CustomerDTO customer) throws RequestException {
		api = new openpayAPI();
		ChargeDTO charge = api.charge(customer);
		return charge;
	}
}

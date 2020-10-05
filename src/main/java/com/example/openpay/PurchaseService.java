package com.example.openpay;

import com.example.openpay.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PurchaseService {

	@Autowired
	ChargeRepository chargeRepository;

	private final DBService db = new mysqlDB();
	private final APIService api = new openpayAPI();

	@PostMapping("/charge")
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
	public ChargeDTO createCharge(@RequestBody CustomerDTO customer) throws ResourceNotFoundException {

		ChargeDTO chargeDTO = api.createCharge(customer);

		System.out.println("Imprimiendo CHARGEDTO...");
		System.out.println(chargeDTO);
		System.out.println("*Cargo impreso con éxito...");

		//db.createCharge(chargeDTO);

		ChargeAS chargeAS = new ChargeAS();
		chargeAS.setAmount(chargeDTO.getAmount());
		chargeAS.setChargeId(chargeDTO.getId());
		chargeAS.setCreationDate(chargeDTO.getCreationDate());
		chargeAS.setOperationDate(chargeDTO.getOperationDate());
		chargeAS.setStatus(chargeDTO.getStatus());
		chargeAS.setDescription(chargeDTO.getDescription());
		chargeAS.setCustomerId(chargeDTO.getCustomerId());
		chargeAS.setMethod(chargeDTO.getMethod());
		chargeAS.setAuthorization(chargeDTO.getAuthorization());
		chargeAS.setCurrency(chargeDTO.getCurrency());
		System.out.println("Imprimiendo CHARGEAS...");
		System.out.println(chargeAS);
		System.out.println("*Cargo impreso con éxito...");
		chargeRepository.save(chargeAS);

		return chargeDTO;
	}
}

package com.cg.stockapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.stockapp.entities.BankAccount;
import com.cg.stockapp.service.BankAccountService;

@RestController
@RequestMapping("/bankAccount")
public class BankAccountController {
	
	@Autowired
	BankAccountService serv;
	
	@PostMapping
	public String addBankAccount(@RequestBody BankAccount acc) {
		if(serv.addBankAccount(acc))
			return "Bank Account not added";
		else
			return "Bank Account added successfully";
	}
	
}

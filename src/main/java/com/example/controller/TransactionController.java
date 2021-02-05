package com.example.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Transaction;
import com.example.service.ITransactionService;

@RestController
@RequestMapping("/api")
public class TransactionController {
	
	@Autowired
	ITransactionService transactionService;
	
	@PostMapping("transaction/add")
	public Transaction addTransaction(@RequestBody Transaction transaction) {
		return transactionService.addTransaction(transaction);
	}
	
	@GetMapping("transaction/{id}")
	public Transaction getTransaction(@PathVariable("id") Long transactionId) {
		return transactionService.getTransaction(transactionId);
	}
	
	@GetMapping("transaction/{startDate}/{endDate}")
	public List<Transaction> getAllTransactionsBetweenDates(@PathVariable Date startDate, @PathVariable Date endDate) {
		return transactionService.getAllTransactionsBetweenDates(startDate, endDate);
	}

}

package com.example.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Transaction;
import com.example.repository.ITransactionRepository;

@Service
public class TransactionServiceImpl implements ITransactionService{
	
	@Autowired
	ITransactionRepository transactionRepository;

	@Override
	public Transaction addTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	@Override
	public void deleteTransaction(Long transactionId) {
		transactionRepository.deleteById(transactionId);
	}

	@Override
	public Transaction getTransaction(Long transactionId) {
		return transactionRepository.findById(transactionId).get();
	}

	@Override
	public List<Transaction> getAllTransactions() {
		return transactionRepository.findAll();
	}

	@Override
	public Transaction updateTransaction(Transaction transaction) {
		return null;
	}

	@Override
	public List<Transaction> getAllTransactionsBetweenDates(Date startDate, Date endDate) {
		return transactionRepository.getAllTransactionsBetweenDates(startDate, endDate);
	}
}

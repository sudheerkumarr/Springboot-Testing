package com.example.service;

import java.sql.Date;
import java.util.List;

import com.example.model.Transaction;

public interface ITransactionService {
	
	public Transaction addTransaction(Transaction transaction);
	public void deleteTransaction(Long transactionId);
	public Transaction getTransaction(Long transactionId);
	public List<Transaction> getAllTransactions();
	public Transaction updateTransaction(Transaction transaction);
	public List<Transaction> getAllTransactionsBetweenDates(Date startDate, Date endDate);
}

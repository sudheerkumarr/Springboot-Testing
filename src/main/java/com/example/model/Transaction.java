package com.example.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue
	private Long trId;
	private Date trDate;
	private Double trAmount;
	
	public Transaction() {}
	
	public Transaction(Date trDate, Double trAmount) {
		super();
		this.trDate = trDate;
		this.trAmount = trAmount;
	}

	// Getters and Setters
	
	public Long getTrId() {
		return trId;
	}

	public void setTrId(Long trId) {
		this.trId = trId;
	}

	public Date getTrDate() {
		return trDate;
	}

	public void setTrDate(Date trDate) {
		this.trDate = trDate;
	}

	public Double getTrAmount() {
		return trAmount;
	}

	public void setTrAmount(Double trAmount) {
		this.trAmount = trAmount;
	}

	@Override
	public String toString() {
		return "Transaction [trId=" + trId + ", trDate=" + trDate + ", trAmount=" + trAmount + "]";
	}
}

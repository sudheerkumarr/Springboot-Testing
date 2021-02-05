package com.example.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Transaction;

@Repository
public interface ITransactionRepository extends JpaRepository<Transaction, Long> {
	@Query(value = "from Transaction t where trDate BETWEEN :startDate AND :endDate")
	public List<Transaction> getAllTransactionsBetweenDates(@Param("startDate")Date startDate,@Param("endDate")Date endDate);
}

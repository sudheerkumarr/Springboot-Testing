package com.example.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
	@Query(value = "from Event t where yourDate BETWEEN :startDate AND :endDate")
	public List<Event> getAllBetweenDates(@Param("startDate")Date startDate,@Param("endDate")Date endDate);
}

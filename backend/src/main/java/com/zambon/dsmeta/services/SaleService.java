	package com.zambon.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.zambon.dsmeta.entities.Sale;
import com.zambon.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public Page<Sale> findSales(String _minDate, String _maxDate, Pageable _pageable) {
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate minDate = _minDate.equals("") ? today.minusYears(1) : LocalDate.parse(_minDate);
		LocalDate maxDate = _maxDate.equals("") ? today : LocalDate.parse(_maxDate);
		
		return repository.findSales(minDate, maxDate, _pageable);
	}
}
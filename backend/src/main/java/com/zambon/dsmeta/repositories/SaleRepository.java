package com.zambon.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zambon.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
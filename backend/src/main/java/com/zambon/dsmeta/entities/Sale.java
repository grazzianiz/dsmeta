package com.zambon.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Integer visited, deals;
	private String sellerName;
	private Double amount;
	private LocalDate date;
	
	public Sale() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long _id) {
		id = _id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer _visited) {
		visited = _visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer _deals) {
		deals = _deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String _sellerName) {
		sellerName = _sellerName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double _amount) {
		amount = _amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate _date) {
		date = _date;
	}
	
	
}
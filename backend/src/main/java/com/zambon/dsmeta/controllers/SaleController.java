package com.zambon.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zambon.dsmeta.entities.Sale;
import com.zambon.dsmeta.services.SaleService;
import com.zambon.dsmeta.services.SmsService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	@Autowired
	private SmsService smsService;
	
	@GetMapping
	public Page<Sale> findSales(
			@RequestParam(value = "minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate,
			Pageable _pageable) {
		return saleService.findSales(minDate, maxDate, _pageable);
	}
	
	@GetMapping("/{_id}/notification")
	public void notifySms(@PathVariable Long _id) {
		smsService.sendSms(_id);
	}
}
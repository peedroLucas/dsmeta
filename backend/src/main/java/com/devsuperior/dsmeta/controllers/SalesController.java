package com.devsuperior.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entitties.Sale;
import com.devsuperior.dsmeta.servicies.SalesService;
import com.devsuperior.dsmeta.servicies.SmsService;

@RestController
@RequestMapping(value = "/sales")
public class SalesController {

	@Autowired
	private SalesService service;
	@Autowired
	private SmsService smsService;
	
    @GetMapping
    public Page<Sale> findBySales(
            @RequestParam(value = "minDate", defaultValue = "") String minDate,
            @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
            Pageable pageable) {
        return service.FindSales(minDate, maxDate, pageable);
    }	
    @GetMapping("{id}/notification")
    public void notifySms(@PathVariable Long id) {
    	smsService.sendSms(id);
    }
}

package com.devsuperior.dsmeta.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entitties.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service
public class SalesService {

	@Autowired
	private SaleRepository repository;

	public List<Sale> FindSales(){
		return repository.findAll();
	}
}

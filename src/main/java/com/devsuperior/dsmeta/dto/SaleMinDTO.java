package com.devsuperior.dsmeta.dto;

import java.time.LocalDate;

import com.devsuperior.dsmeta.entities.Sale;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SaleMinDTO {

	private Long id;
	private Double amount;
	private LocalDate date;
	
	public SaleMinDTO(
			@JsonProperty("id") Long id,
			@JsonProperty("amount") Double amount,
			@JsonProperty("date") LocalDate date) {
		this.id = id;
		this.amount = amount;
		this.date = date;
	}
	
	public SaleMinDTO(Sale entity) {
		id = entity.getId();
		amount = entity.getAmount();
		date = entity.getDate();
	}

	public Long getId() {
		return id;
	}

	public Double getAmount() {
		return amount;
	}

	public LocalDate getDate() {
		return date;
	}
}

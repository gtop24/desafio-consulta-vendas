package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.entities.Sale;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SaleSummaryDTO {

	private String sellerName;
	private Double amount;
	
	public SaleSummaryDTO(
			@JsonProperty("sellerName") String sellerName,
			@JsonProperty("amount") Double amount) {
		this.sellerName = sellerName;
		this.amount = amount;
	}
	
	public SaleSummaryDTO(Sale entity) {
		sellerName = entity.getSeller().getName();
		amount = entity.getAmount();
	}

	public String getSellerName() {
		return sellerName;
	}

	public Double getAmount() {
		return amount;
	}
}

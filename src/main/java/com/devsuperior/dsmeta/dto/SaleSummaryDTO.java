package com.devsuperior.dsmeta.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaleSummaryDTO {

	private String sellerName;
	private Double total;

	public SaleSummaryDTO(
			@JsonProperty("sellerName") String sellerName,
			@JsonProperty("total") Double total) {
		this.sellerName = sellerName;
		this.total = total;
	}

	public String getSellerName() {
		return sellerName;
	}

	public Double getTotal() {
		return total;
	}
}

package com.ttcs.model.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDTO {
	private int payId;
	private String payName;
	private List<BookTourDTO> listbooks;
}

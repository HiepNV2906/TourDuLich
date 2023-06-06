package com.ttcs.model.mapper;

import java.util.ArrayList;
import java.util.List;

import com.ttcs.domain.BookTour;
import com.ttcs.domain.Payment;
import com.ttcs.model.dto.BookTourDTO;
import com.ttcs.model.dto.PaymentDTO;

public class PaymentMapper {
	public static PaymentDTO toPaymentDTO(Payment payment) {
		PaymentDTO tmp = new PaymentDTO();
		List<BookTourDTO> list = new ArrayList<>();
		for(BookTour b : payment.getListbooks()) {
			list.add(BookTourMapper.toBookTourDTO(b));
		}
		tmp.setPayId(payment.getPayId());
		tmp.setPayName(payment.getPayName());
		tmp.setListbooks(list);
		return tmp;
	}
}

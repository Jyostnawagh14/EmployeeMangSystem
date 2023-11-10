package com.projectems.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class SalaryDTO {
	
	private Long id;
	 public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
    @NotNull
    private BigDecimal amount;
    
    @NotNull
    private Date paymentDate;
	public void setAmount(Object amount2) {
		// TODO Auto-generated method stub
		
	}

	public void setPaymentDate(Object paymentDate2) {
		// TODO Auto-generated method stub
		
	}

	public Object getAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPaymentDate() {
		// TODO Auto-generated method stub
		return null;
	}
}
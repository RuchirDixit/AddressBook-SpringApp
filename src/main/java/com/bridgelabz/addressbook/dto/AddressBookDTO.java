package com.bridgelabz.addressbook.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import lombok.Data;

public @Data class AddressBookDTO {
	@NotNull(message = "Address Book Name Cannot be Null")
	@NotBlank(message = "Address Book Name Cannot be blank")
	private String name;
	
	@NotNull(message = "Address Cannot be Null")
	@NotBlank(message = "Address Cannot be blank")
	private String address;
	
	
	//@Pattern(regexp = "^[0-9]{6,10}$",message = "Contact number should be between 6 to 10")
	private int contactNumber;
	
	public AddressBookDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public AddressBookDTO(String name, String address) {
		this.name = name;
		this.address = address;
	}
}


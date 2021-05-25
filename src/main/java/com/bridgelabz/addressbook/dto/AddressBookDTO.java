package com.bridgelabz.addressbook.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

public @Data class AddressBookDTO {
	@NotNull(message = "Address Book Name Cannot be Null")
	@NotBlank(message = "Address Book Name Cannot be blank")
	private String name;
	
	@NotNull(message = "Address Cannot be Null")
	@NotBlank(message = "Address Cannot be blank")
	private String address;
	
	public AddressBookDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public AddressBookDTO(String name, String address) {
		this.name = name;
		this.address = address;
	}
}


package com.bridgelabz.addressbook.dto;

import lombok.Data;

public @Data class AddressBookDTO {
	private String name;
	private String address;
	
	public AddressBookDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public AddressBookDTO(String name, String address) {
		this.name = name;
		this.address = address;
	}
}


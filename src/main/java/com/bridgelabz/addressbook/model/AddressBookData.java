package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.dto.AddressBookDTO;

import lombok.Data;

public @Data class AddressBookData {

	private int addressBookId;
	private String name;
	private String address;
	
	public AddressBookData() {}
	
	public AddressBookData(int addressBookId,AddressBookDTO addressBookDTO) {
		this.addressBookId = addressBookId;
		this.name = addressBookDTO.getName();
		this.address = addressBookDTO.getAddress();
	}
}

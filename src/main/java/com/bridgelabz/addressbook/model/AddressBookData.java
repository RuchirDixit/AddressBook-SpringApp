package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.dto.AddressBookDTO;

public class AddressBookData {

	private int addressBookId;
	private String name;
	private String address;
	
	public AddressBookData() {}
	
	public AddressBookData(int addressBookId,AddressBookDTO addressBookDTO) {
		this.addressBookId = addressBookId;
		this.name = addressBookDTO.getName();
		this.address = addressBookDTO.getAddress();
	}
	
	public void setAddressBookId(int addressBookId) {
		this.addressBookId = addressBookId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAddressBookId() {
		return addressBookId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
}

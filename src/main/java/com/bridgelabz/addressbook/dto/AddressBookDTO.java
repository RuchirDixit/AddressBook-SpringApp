package com.bridgelabz.addressbook.dto;

public class AddressBookDTO {
	private String name;
	private String address;
	
	public AddressBookDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public AddressBookDTO(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
}


package com.bridgelabz.addressbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import lombok.Data;

@Entity
@Table(name = "addressbook")
public @Data class AddressBookData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "adressbook_id")
	private int addressBookId;
	private String name;
	private String address;
	private int contactNumber;
	
	public AddressBookData() {}
	
	public AddressBookData(AddressBookDTO addressBookDTO) {
		this.updateAddressBookData(addressBookDTO);
	}
	
	public void updateAddressBookData(AddressBookDTO addressBookDTO) {
		this.name = addressBookDTO.getName();
		this.address = addressBookDTO.getAddress();
		this.contactNumber = addressBookDTO.getContactNumber();
	}
}

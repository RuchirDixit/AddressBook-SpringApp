package com.bridgelabz.addressbook.service;

import java.util.List;
import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;

public interface IAddressBookService {

	List<AddressBookData> getAddressBookData();
	
	AddressBookData getAddressBookDataById(int id);
	
	AddressBookData addAddressBook(AddressBookDTO dto);
	
	AddressBookData updateAddressBook(int addressId,AddressBookDTO dto);
	
	void deleteAddressBook(long id);
}

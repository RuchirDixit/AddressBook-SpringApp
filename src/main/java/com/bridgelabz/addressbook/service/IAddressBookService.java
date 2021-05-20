package com.bridgelabz.addressbook.service;

import java.util.List;
import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;

public interface IAddressBookService {

	List<AddressBookData> getAddressBookData();
	
	AddressBookData getAddressBookDataById(long id);
	
	AddressBookData addAddressBook(AddressBookDTO dto);
	
	AddressBookData updateAddressBook(AddressBookDTO dto);
	
	void deleteAddressBook(long id);
}
